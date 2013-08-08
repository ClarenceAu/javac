package me.clarenceau.javac.jdk6512707;

import com.sun.tools.javac.Main;

/**
 * Created with IntelliJ IDEA.
 * User: ClarenceAu
 * Date: 13-8-8
 * Time: 下午11:06
 * To change this template use File | Settings | File Templates.
 */
public class JDK6512707 {

    public static void test(@TestAnno String str) {
        System.out.print(str);
    }

    public static void main(String[] args) {
        String[] classes = new String[1];
        classes[0] = "D:/workspace/javac/src/me/clarenceau/javac/jdk6512707/JDK6512707.java";
        int i = Main.compile(classes);
        System.out.println(i);
    }
}
