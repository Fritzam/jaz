package com.pjatk.micfri;

import org.springframework.stereotype.Service;

@Service
public class ExeClass {

    ExeClass(TestClass testClass, Credentials credentials) {
        System.out.println(testClass.getLoginUrl());
        System.out.println(credentials.getUser());
        System.out.println(credentials.getPassword());
        System.out.println();
    }
}
