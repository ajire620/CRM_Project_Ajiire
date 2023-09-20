package com.cydeo.Step_Definition;

import com.cydeo.Page.EmployeePage;
import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Employee_StepDefinition {

    EmployeePage employeePage =new EmployeePage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("user enters hr username")
    public void user_enters_hr_username() {

        employeePage.inputUserName.sendKeys(ConfigurationReader.getProperty("hr.userName"));



    }
    @When("user enters hr password")
    public void user_enters_hr_password() {

        employeePage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

    }

    @When("user clicks login button")
    public void user_clicks_login_button() {

        employeePage.loginButton.click();

    }
    @When("user clicks the employees button")
    public void user_clicks_the_employees_button() {

        employeePage.employeesButton.click();

    }
    @When("user clicks the company structure button")
    public void user_clicks_the_company_structure_button() {

        employeePage.companyStructureButton.click();

    }
    @When("user should see the structure of the company")
    public void user_should_see_the_structure_of_the_company() {

        Assert.assertTrue(employeePage.companyStructureButtonPage.isDisplayed());



    }
    @When("user clicks the telephone directory button")
    public void user_clicks_the_telephone_directory_button() {

        employeePage.telephoneDirectoryButton.click();
    }
    @Then("user should see the telephone directory")
    public void user_should_see_the_telephone_directory() {

        Assert.assertTrue(employeePage.telephoneDirectoryPage.isDisplayed());



    }

    @When("user enters Helpdesk user username")
    public void userEntersHelpdeskUserUsername() {

        employeePage.inputUserName.sendKeys(ConfigurationReader.getProperty("helpDesk.userName"));

    }

    @And("user enters Helpdesk user password")
    public void userEntersHelpdeskUserPassword() {

        employeePage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

    }

    @When("user enters Marketing user username")
    public void userEntersMarketingUserUsername() {

        employeePage.inputUserName.sendKeys(ConfigurationReader.getProperty("marketing.userName"));

    }

    @And("user enters Marketing user password")
    public void userEntersMarketingUserPassword() {

        employeePage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
    }
}
