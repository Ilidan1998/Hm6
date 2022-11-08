import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Hmwork {
    @BeforeTest
    public void rtyui(){
        open("https://www.google.com/");

    }
    @Test
    public void asdafa(){
        SelenideElement ser = $(byName("q")),
                ber =$(byText("Ima"));
        ser.setValue("davit mamardashvili");
        Assert.assertFalse(ber.is(Condition.visible));
        Assert.assertEquals(ser.getValue(),"davit mamardashvili","mesiji");

    }


}
