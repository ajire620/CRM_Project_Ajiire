package com.cydeo.Page;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {

    public EmployeePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@type='text']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    @FindBy(xpath= "//li[@id='bx_left_menu_menu_company']")
    public WebElement employeesButton;

    @FindBy(xpath = "//*[@id=\"top_menu_id_company_3271504278\"]/a/span[2]/span[2]")
    public WebElement companyStructureButton;

    @FindBy(xpath = "//*[@id=\"top_menu_id_company_2000783151\"]/a/span[2]/span[2]")
    public WebElement telephoneDirectoryButton;

    @FindBy(id="pagetitle")
    public WebElement telephoneDirectoryPage;

    @FindBy(id="pagetitle")
    public WebElement companyStructureButtonPage;



}
