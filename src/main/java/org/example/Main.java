package org.example;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("JVM: " + System.getProperty("java.version") + " (" + System.getProperty("java.vendor") + ")");
        System.out.println("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ")");
        String reversedString = StringUtils.reverse("Java");
        System.out.println("Reversed (Commons Lang): " + reversedString);
        System.out.println("Привіт зі збірки!");
    }
}