package tech.meliora.academy.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target(ElementType.METHOD)
public @interface MelioraAnnotation {
    String name() default "";
    int id();
    int age() default 60;
}
