## Описание
Это учебный проект, лабораторное задание по дисциплине Программирование на Java.

## Задание
1. Создать аннотацию @AutoInjectable.
2. Разобраться с классом Properties.
3. Создать класс Injector в котором был бы параметризированный метод inject, который принимал бы в качестве параметра объект любого класса и, используя механизмы рефлексии осуществлял
поиск полей, помеченных этой аннотацией (в качестве типа поля используется некоторый интерфейс), и осуществлял бы инициализацию этих полей экземплярами классов, которые указаны в качестве реализации
соответствующего интерфейса в некотором файле настроек (properites)
4. У нас есть несколько интерфейсов и несколько классов, реализующих эти интерфейсы. У нас есть класс SomeBean. Задача написать класс Injector, который бы осуществлял внедрение зависимостей в любой объект, который содержит поля, помеченные нашей аннотацией. Т.е. некоторый метод этого класса, принимал бы произвольный объект, исследовал бы существующие в нем поля, и смотрел, аннотированы ли они нужной аннотацией. Если да, то тогда он бы смотрел тип этого поля и искал бы реализацию в файле properties. После этого, он создавал бы экземпляр нужного класса и записывал ссылку на этот экземпляр в нужное поле.
5. Механизм рефлексии.

## Требования
- Качество кода
- Unit tests
- JavaDocs
- Maven project
- Работа с git (история коммитов + настройка gitignore)
