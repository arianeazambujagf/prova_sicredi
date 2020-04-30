package pages;

import elements.GroceryCrudElements;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import setup.ConfigBrowsers;

public class GroceryCrudPage extends GroceryCrudElements {
    public GroceryCrudPage(){
        PageFactory.initElements(ConfigBrowsers.getDriver(), this);
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

    public String validateMessageSuccess(){
        String value = messageSuccess.getText();
       return value;
    }

    @Test
    public void PrimeiroTeste() throws Exception{
        selectOption("Bootstrap V4 Theme");
        clickAddCustomer();
        fillName("Teste Sicredi");
        fillLastName("Teste");
        fillContactFirstName("Ariane");
        fillPhone("51 9999-9999");
        fillAddressLineOne("Av Assis Brasil, 3970");
        fillAddressLineTwo("Torre D");
        fillCity("Porto Alegre");
        fillState("RS");
        fillPostalCode("91000-000");
        fillCountry("Brasil");
        selectFromEmployeer("Fixter");
        fillCreditLimit("200");
        clickSaveBtn();
        Thread.sleep(5000);
        validateMessageSuccess();
    }


}
