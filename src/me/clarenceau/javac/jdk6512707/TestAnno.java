package me.clarenceau.javac.jdk6512707;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 * User: ClarenceAu
 * Date: 13-8-8
 * Time: 下午11:04
 * To change this template use File | Settings | File Templates.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.PARAMETER })
public @interface TestAnno {
    TestEnum value() default TestEnum.Enum1;
}
