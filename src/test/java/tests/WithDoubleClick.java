package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import testBase.TestBase;
import utilities.Driver;
import utilities.SleepMethod;

public class WithDoubleClick extends TestBase {

    @Test
    public void test1(){


        //I use moveToElement method for third step

        WebElement javaScriptTab = Driver.getDriver().findElement(By.xpath("//div[text()='JavaScript']"));
        javaScriptTab.click();
        SleepMethod.sleep(2);

        WebElement polymerLink = Driver.getDriver().findElement(By.xpath("//a[@href='examples/polymer/index.html']"));
        polymerLink.click();
        SleepMethod.sleep(2);


        WebElement newTodoInput = Driver.getDriver().findElement(By.xpath("//input[@id='new-todo']"));
        newTodoInput.sendKeys("First Item", Keys.ENTER);
        SleepMethod.sleep(2);

        newTodoInput.sendKeys("Second Item", Keys.ENTER);
        SleepMethod.sleep(2);

        //moveToElement Method
        Actions actions = new Actions(Driver.getDriver());

        WebElement secondItem = Driver.getDriver().findElement(By.xpath("//label[text()='Second Item']"));
        actions.moveToElement(secondItem).doubleClick().sendKeys(" Edit").perform();
        SleepMethod.sleep(2);



        //WebElement secondItemEdit = Driver.getDriver().findElement(By.xpath("( //input[@id='edit'])[2]"));

      /*  WebElement xButton = Driver.getDriver().findElement(By.xpath("(//button[@class='destroy style-scope td-item'])[2]"));
        actions.moveToElement(xButton).click().perform();
        SleepMethod.sleep(2);*/









    }

}
