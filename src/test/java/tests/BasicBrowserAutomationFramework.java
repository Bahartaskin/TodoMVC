package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.TestBase;
import utilities.Driver;
import utilities.SleepMethod;

public class BasicBrowserAutomationFramework extends TestBase {

    @Test
    public void test1(){


        WebElement javaScriptTab = Driver.getDriver().findElement(By.xpath("//div[text()='JavaScript']"));
        javaScriptTab.click();
        SleepMethod.sleep(2);

        WebElement polymerLink = Driver.getDriver().findElement(By.xpath("//a[@href='examples/polymer/index.html']"));
        polymerLink.click();
        SleepMethod.sleep(2);


        WebElement newTodoInput = Driver.getDriver().findElement(By.xpath("//input[@id='new-todo']"));
        newTodoInput.sendKeys("First Item",Keys.ENTER);
        SleepMethod.sleep(2);

        newTodoInput.sendKeys("Second Item", Keys.ENTER);
        SleepMethod.sleep(2);

        WebElement secondItemCheckBox = Driver.getDriver().findElement(By.xpath("(//input[@class='toggle style-scope td-item'])[2]"));
        secondItemCheckBox.click();
        SleepMethod.sleep(2);

        WebElement clearCompletedButton = Driver.getDriver().findElement(By.xpath("//button[@class='clear-completed style-scope td-todos']"));
        clearCompletedButton.click();
        SleepMethod.sleep(2);

        newTodoInput.sendKeys("Second Item Edit", Keys.ENTER);
        SleepMethod.sleep(2);





    }

}
