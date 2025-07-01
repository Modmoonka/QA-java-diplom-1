package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static java.lang.Float.NaN;

@RunWith(Parameterized.class)
public class Bun_Name_Test {
    private final String bunName;

    public Bun_Name_Test(String bunName) {
        this.bunName = bunName;
    }


    @Parameterized.Parameters
    public static Object[][] getNameBunTests() {
        return new Object[][] {
               {"black bun"},
                {" "},
                {""},
                {null},
                {"!1$<.>/?*()_-+`~"},
                {"черная булочка"}
        };
    }


    @Test
    public void checkBunName() {
        Bun bun = new Bun(bunName,30f);
        String actualName = bun.getName();
        Assert.assertEquals(bunName, actualName);
    }
}
