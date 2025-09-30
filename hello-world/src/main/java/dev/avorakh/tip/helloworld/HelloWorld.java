package dev.avorakh.tip.helloworld;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
