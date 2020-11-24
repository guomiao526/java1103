package com.ocp7.zoo;

public class zoo5 {

    public static void main(String[] args) {
        Animal[] animals = {
            new Bird("鸚鵡", 2),
            new Lion("美洲獅", 4),
            new Ostrich("大鴕鳥", 2)
        };

//        System.out.println(animals);
//        System.out.println(animals[0]);
//        System.out.println(animals[1]);
//        System.out.println(animals[2]);
        
        int sum=0;
        for (Animal animal : animals) {
            System.out.println(animal);
            sum+= animal.getFoot();
        }
        System.out.println("總共有 "+sum+" 隻腳");

    }
}
