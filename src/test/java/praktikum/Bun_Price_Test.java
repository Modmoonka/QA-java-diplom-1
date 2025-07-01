package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static java.lang.Float.*;

@RunWith(Parameterized.class)
public class Bun_Price_Test {
    private final float bunPrice;

    public Bun_Price_Test(float bunPrice) {
        this.bunPrice = bunPrice;
    }

    @Parameterized.Parameters
    public static Object[][] getNameBunTests() {
        return new Object[][] {
                {null},
                {100},
                {0.1F},
                {NaN},
                {-60F},
                {0f}
        };
    }

    @Test
    public void checkPrice() {
        Bun bun = new Bun("black bun", bunPrice);
        float actualPrice = bun.getPrice();
        Assert.assertEquals(bunPrice, actualPrice, 0);
    }
}
