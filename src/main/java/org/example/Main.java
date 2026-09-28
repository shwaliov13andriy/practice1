package org.example;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        // Виведення версії JVM
        System.out.println("JVM: " + System.getProperty("java.version") + " (" + System.getProperty("java.vendor") + ")");

        // Виведення назви ОС
        System.out.println("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ")");

        // Використання методу з підключеної залежності Apache Commons Lang
        // StringUtils.reverse перевертає рядок задом наперед
        String reversedString = StringUtils.reverse("Java");
        System.out.println("Reversed (Commons Lang): " + reversedString);

        // Окремий рядок українською мовою
        System.out.println("Привіт зі збірки!");
    }
}