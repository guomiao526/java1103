package com.ocp9;

//class Father extends Object{ // Java物件最後都會繼承object
class Father {

    public Father() {
        System.out.println("Father no money");
    }

    public Father(int money) {
        System.out.println("Father's money = " + money);
    }
}

class Son {

    public Son() {
        super();  // 如果沒有繼承東西, 呼叫super() 會繼承object
// 有繼承時super()可以不用寫
        // super(10000);
    }
}
public class Family {

    public static void main(String[] args) {
        Son son = new Son();
    }
}
