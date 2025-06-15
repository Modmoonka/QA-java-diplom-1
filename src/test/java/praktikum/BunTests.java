package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BunTests {
    private final String bunName;
    private final float bunPrice;

    public BunTests(String bunName, float bunPrice) {
        this.bunName = bunName;
        this.bunPrice = bunPrice;
    }

    @Parameterized.Parameters
    public static Object[][] getParametersForTests() {
        return new Object[][] {
               {"black bun", null},
                {" ", 100},
                {"",0.1F},
                {null},
                {"!1$<.>/?*()_-+`~", -60F},
                {"black bun", 500},
                {"white bun", 200.005F},
        };
    }

    @Test
    public void checkBunName() {
        Bun bun = new Bun(bunName,bunPrice);
        String actualName = bun.getName();
        Assert.assertEquals(bunName, actualName);
    }

    @Test
    public void checkPrice() {
        Bun bun = new Bun(bunName, bunPrice);
        float actualPrice = bun.getPrice();
        Assert.assertEquals(bunPrice, actualPrice, 0);
    }
}
