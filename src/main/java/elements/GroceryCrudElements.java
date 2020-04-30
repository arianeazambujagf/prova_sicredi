package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setup.ConfigBrowsers;

public class GroceryCrudElements extends ConfigBrowsers {

    @FindBy(id ="switch-version-select")
    protected WebElement selectVersion;

    @FindBy(css= "#gcrud-search-form > div.header-tools > div.floatL.t5 > a")
    protected WebElement addCustomerBtn;

    @FindBy(id ="field-customerName")
    protected WebElement nameField;

    @FindBy(id ="field-contactLastName")
    protected WebElement lastNameField;

    @FindBy(id ="field-contactFirstName")
    protected WebElement contactFirstNameField;

    @FindBy(id ="field-phone")
    protected WebElement phoneField;

    @FindBy(id ="field-addressLine1")
    protected WebElement addressLineOneField;

    @FindBy(id ="field-addressLine2")
    protected WebElement addressLineTwoField;

    @FindBy(id ="field-city")
    protected WebElement cityField;

    @FindBy(id ="field-state")
    protected WebElement stateField;

    @FindBy(id ="field-postalCode")
    protected WebElement postalCodeField;

    @FindBy(id ="field-country")
    protected WebElement countryField;

    @FindBy(id ="field_salesRepEmployeeNumber_chosen")
    protected WebElement fromEmployeerField;

    @FindBy(id ="field-creditLimit")
    protected WebElement creditLimitField;

    @FindBy(id ="form-button-save")
    protected WebElement saveBtn;

    @FindBy(id ="report-success")
    protected WebElement messageSuccess;


}
