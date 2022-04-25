package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String firstName = "Ivan";
        String midlleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + midlleName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.toUpperCase(Locale.ROOT));
        fullName = " Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println(fullName);
    }
}
