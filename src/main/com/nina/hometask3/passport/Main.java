package com.nina.hometask3.passport;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Passport,Citizen> map = new HashMap<>();
        Passport passport1 = new Passport("MU", "123456789");
        Passport passport2 = new Passport("OP", "098765432");
        Citizen citizen1 = new Citizen("Name1", "Surname1");
        Citizen citizen2 = new Citizen("Name2", "Surname2");
        map.put(passport1, citizen1);
        map.put(passport2, citizen2);
        System.out.println(map.get(passport1));
    }
}
