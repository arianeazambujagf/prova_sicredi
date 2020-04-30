package pages;

import elements.GroceryCrudElements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import setup.BaseTests;

public class GroceryCrudPage extends GroceryCrudElements {

    public GroceryCrudPage(){
        driver = BaseTests.getDriver();
        PageFactory.initElements(BaseTests.getDriver(), this);
    }

    public void openPage(){
        driver.get("https://www.grocerycrud.com/demo/bootstrap_theme");
    }

    public void selectOption(String value) {
        Select dropdown = new Select(selectVersion);
        dropdown.selectByVisibleText(value);
    }

    public void clickAddCustomer(){
        addCustomerBtn.click();
    }

    public void selectFromEmployeer(String value) {
        fromEmployeerField.click();
    }

    public void fillName(String name){
        nameField.sendKeys(name);
    }

    public void fillLastName(String lastName){
        lastNameField.sendKeys(lastName);
    }
    public void fillContactFirstName(String contactFirstName){
        contactFirstNameField.sendKeys(contactFirstName);
    }

    public void fillPhone(String phone){
        phoneField.sendKeys(phone);
    }

    public void fillAddressLineOne(String addresLineOne){
        addressLineOneField.sendKeys(addresLineOne);
    }

    public void fillAddressLineTwo(String addresLineTwo){
        addressLineTwoField.sendKeys(addresLineTwo);
    }

    public void fillCity(String city){
        cityField.sendKeys(city);
    }

    public void fillState(String state){
        stateField.sendKeys(state);
    }

    public void fillPostalCode(String postalCode){
        postalCodeField.sendKeys(postalCode);
    }

    public void fillCountry(String country){
        countryField.sendKeys(country);
    }

    public void fillFromEmployeer(String fromEmployeer){
        fromEmployeerField.sendKeys(fromEmployeer);
    }

    public void fillCreditLimit(String creditLimit){
        creditLimitField.sendKeys(creditLimit);
    }

    public void clickSaveBtn(){
        saveBtn.click();
    }

    public void clickOnBackToList(){
        goBackToListBtn.click();
    }

    public String validateMessageSuccess(){
        String value = messageSuccess.getText();
       return value;
    }

    public void searchValue(String value){
        searchField.sendKeys(value);
    }

    public void cilckOnSelectAllCheckBox(){
        selectAllCheckBox.click();
    }

    public void cilckOnDeleteButton(){
        deleteBtn.click();
    }

    public void confirmDeleteOption() throws Exception{
        confirmDeleteBtn.click();
        Thread.sleep(8000);
    }

    public String validateDelete(){

        String value = messageToastDelete.getText();
        return value;
    }

}
