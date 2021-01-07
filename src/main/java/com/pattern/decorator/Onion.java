package com.pattern.decorator;

public class Onion extends SideDish{
    
    public Onion(Food food) {
        super(food);
        super.name = "洋蔥"; // super 可以不寫
        super.price = 12; // super 可以不寫
    }
    
}
