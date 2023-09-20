package com.cydeo.Utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    /*
   This method will accept int(in seconds) and execute Thread.sleep for given duration
    */
    public static void sleep(int second){
        second *= 1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }


    //TC #2: Create utility method
//1. Create a new class called BrowserUtils
//2. Create a method to make Task1 logic re-usable
//3. When method is called, it should switch window and verify title.

    //Method info:
    // Name: switchWindowAndVerify
    // Return type: void
    // Arg1: WebDriver
    // Arg2: String expectedInUrl
    // Arg3: String expectedTitle

    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle){
        Set<String> allWindowsHandles= Driver.getDriver().getWindowHandles();

        for (String each : allWindowsHandles) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL:"+Driver.getDriver().getCurrentUrl());

            if(Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }

        }

        //5.Asser: Title contains"expectedInTitle"
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }

    /*
    This method accepts a String "expectedTitle" and Asserts if it is true
     */
    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);
    }



    //Creating a utility method for ExplicitWait, so we don't have to repeat the lines

    public static void waitForInvisibilityOf(WebElement webElement){
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }


    public static void verifyURLContains(String expectedTitle){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedTitle));

    }



    public static List<String> dropdownOptionsAsString(WebElement dropdownElement){

        Select select = new Select(dropdownElement);
        List<WebElement> actualOptionsAsWebElement = select.getOptions();
        //create a list of string and pass all of the actual web element options' string into that new list

        List<String> actualOptionsAsString = new ArrayList<>();

        for(WebElement each : actualOptionsAsWebElement){
            actualOptionsAsString.add(each.getText());
        }

        return actualOptionsAsString;



    }


    public static void clickRadioButton(List<WebElement> radioButtons,String attributeValue){

        for (WebElement each : radioButtons){

            if(each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                each.click();
            }

        }
    }
}



