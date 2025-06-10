package org.example.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Аннотация, дающая классу Injector понять, что свойство класса надо определить
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoInjectable { }
