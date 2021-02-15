package com.forest;

import com.creatures.Animal;
import com.creatures.Bear;
import com.creatures.Monkey;
import com.creatures.Tiger;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Bear bear = new Bear();
        Monkey monkey = new Monkey();
        Tiger tiger = new Tiger();

        bear.sucking_paw();
        tiger.hunting();
        monkey.eating_banana();
    }
}
