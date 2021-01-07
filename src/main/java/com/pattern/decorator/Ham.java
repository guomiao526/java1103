package com.pattern.decorator;

public class Ham extends SideDish{
    
    public Ham(Food food) {
        super(food);
        super.name = "火腿"; // super 可以不寫
        super.price = 30; // super 可以不寫
    }
    
}
