package com.ocp8;

public class Main3 {

    public static void main(String[] args) {
        int n = 2;
        Class[] classes = {Car.class, Bicycle.class, Airplane.class};
      int [] nn = {2,5,3};
      
        RentalCompany rc = new RentalCompany();
        for (Class clazz : classes) {
            boolean success = rc.rentTransportation(clazz, 2);
            System.out.printf("租 %s %d 台 %s\n",
                    clazz.getSimpleName(), n, success ? "成功" : "失敗");
        }
        rc.print();
    }

}
