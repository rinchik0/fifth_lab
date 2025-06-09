package org.example;

import org.example.annotations.AutoInjectable;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Properties;
import java.lang.reflect.Constructor;

public class Injector {
    private final Properties properties;
    private final Object customParameter;
    public Injector(Object customParameter, String fileconfig) {
        properties = new Properties();
        this.customParameter = customParameter;
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(fileconfig)) {
            properties.load(input);
        } catch (IOException e) {
            System.out.println("Не найден файл конфигурации");
        }
    }
    public <T> T inject(T object) throws Exception {
        // Получаем класс переданного объекта
        Class<?> clas = object.getClass();

        // Перебираем все поля класса
        for (Field field : clas.getDeclaredFields()) {
            // Проверяем, есть ли у поля наша аннотация
            if (field.isAnnotationPresent(AutoInjectable.class)) {
                // Получаем тип поля (интерфейс)
                Class<?> fieldType = field.getType();
                // Ищем реализацию в properties-файле
                String implementationClassName = properties.getProperty(fieldType.getName());
                if (implementationClassName == null)
                    throw new RuntimeException("Не найдена реализация для поля " + fieldType.getName());

                // Создаём экземпляр класса-реализации
                Class<?> implementationClass = Class.forName(implementationClassName);
                Object implementationInstance = createInstance(implementationClass);

                // Делаем поле доступным (даже если оно private)
                field.setAccessible(true);

                // Устанавливаем значение поля
                field.set(object, implementationInstance);
            }
        }

        return object;
    }

    private Object createInstance(Class<?> clas) throws Exception {
        // Получаем первый конструктор
        Constructor<?> constructor = clas.getConstructors()[0];
        return constructor.newInstance(customParameter);
    }
}
