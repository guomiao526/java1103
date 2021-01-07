package ocp16;

import com.ocp16_exception.Power;
import org.junit.Assert;
import org.junit.Test;

public class Test_Power {

    @Test
    public void test1() {

        Power power = new Power();
        int w = 1000; // 1000瓦
        int a = 100; // 100安培
        int exp = 10; // 10電壓
        int act = power.getV(w, a);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test2() {
        Power power = new Power();
        int w = 1000;
        int v = 10;
        int exp = 100;
        int act = power.getV(w, v);
        Assert.assertEquals(exp, act);

    }
}
