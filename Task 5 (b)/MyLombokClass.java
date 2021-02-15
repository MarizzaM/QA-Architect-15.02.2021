package com.example;

import lombok.Getter;
import lombok.Setter;

public class MyLombokClass {
    private @Getter @Setter int number;
}

/*
Advantages
Lombok can make your code cleaner

Disadvantages
Lombok configure default values and is not suitable
if you need to describe additional conditions
 */
