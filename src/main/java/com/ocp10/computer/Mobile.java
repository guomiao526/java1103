package com.ocp10.computer;

import java.math.BigInteger;

public abstract class Mobile implements Computer {

    @Override
    public int add(int x, int y) {//Bigteger(運算整數) BigDecimal(運算小數)
        // 數字超過long 使用BigInteger(無限大的數字)，使用於大數據的運算
        BigInteger b1 = new BigInteger(x + "");
        BigInteger b2 = new BigInteger(y + "");
        BigInteger sum = b1.add(b2);
      return sum.intValue();
        
    }

    

}
