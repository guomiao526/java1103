package com.pattern.decorator;

public class Tomato extends SideDish{
    
    public Tomato(Food food) {
        super(food);
        super.name = "番茄"; // super 可以不寫
        super.price = 15; // super 可以不寫
    }
    
}
