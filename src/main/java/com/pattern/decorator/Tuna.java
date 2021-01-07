package com.pattern.decorator;

public class Tuna extends SideDish{
    
    public Tuna(Food food) {
        super(food);
        super.name = "鮪魚"; // super 可以不寫
        super.price = 25; // super 可以不寫
    }
    
}
