package com.pattern.decorator;

public class Letture extends SideDish{
    
    public Letture(Food food) {
        super(food);
        super.name = "生菜"; // super 可以不寫
        super.price = 15; // super 可以不寫
    }
    
}
