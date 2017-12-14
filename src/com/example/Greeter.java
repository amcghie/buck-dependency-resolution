package com.example;

import org.apache.commons.lang3.StringUtils;

public class Greeter {
    public static void main(String[] args) {
        if (args.length > 0 && StringUtils.isNotEmpty(args[0])) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello stranger");
        }
    }
}
