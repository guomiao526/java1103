package com.pattern.decorator;

public class Olives extends SideDish{
    
    public Olives(Food food) {
        super(food);
        super.name = "橄欖"; // super 可以不寫
        super.price = 10; // super 可以不寫
    }
    
}
