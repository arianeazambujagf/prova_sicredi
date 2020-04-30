package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import pages.GroceryCrudPage;

public class GroceryCrudSteps {

    GroceryCrudPage page = new GroceryCrudPage();

    @Given("^the user is on the grocery crud page$")
    public void theUserIsOnTheGroceryCrudPage() {
        page.openPage();
    }

    @When("^the user fill the fields$")
    public void theUserFillTheFields() {
        page.selectOption("Bootstrap V4 Theme");
        page.clickAddCustomer();
        page.fillName("Teste Sicredi");
        page.fillLastName("Teste");
        page.fillContactFirstName("Ariane");
        page.fillPhone("51 9999-9999");
        page.fillAddressLineOne("Av Assis Brasil, 3970");
        page.fillAddressLineTwo("Torre D");
        page.fillCity("Porto Alegre");
        page.fillState("RS");
        page.fillPostalCode("91000-000");
        page.fillCountry("Brasil");
        page.selectFromEmployeer("Fixter");
        page.fillCreditLimit("200");
    }

    @Then("^the message is displayed$")
    public void theMessageIsDisplayed() {
        String value = page.validateMessageSuccess();
        Assert.assertThat(value, CoreMatchers.containsString("Your data has been successfully stored into the database."));

    }

    @And("^save the form$")
    public void saveTheForm() throws Exception{
        page.clickSaveBtn();
        Thread.sleep(5000);
    }

    @And("^the user clicks on Go back to list$")
    public void theUserClicksOnGoBackToList() throws Exception{
        page.clickOnBackToList();
    }

    @And("^the user search the value \"([^\"]*)\"$")
    public void theUserSearchTheValue(String value) throws Throwable {
        Thread.sleep(5000);
        page.searchValue(value);
    }

    @And("^the user clicks on the checkbox$")
    public void theUserClicksOnTheCheckbox() throws Throwable{
        Thread.sleep(3000);
        page.cilckOnSelectAllCheckBox();
    }

    @And("^the user clicks on delete button$")
    public void theUserClicksOnDeleteButton() {
        page.cilckOnDeleteButton();
    }

    @And("^the user confirm the delete option$")
    public void theUserConfirmTheDeleteOption()  throws Exception{
        page.confirmDeleteOption();
    }

    @Then("^the delete message will be displayed$")
    public void theDeleteMessageWillBeDisplayed() {
        String value = page.validateDelete();
        Assert.assertThat(value, CoreMatchers.containsString("Your data has been successfully deleted from the database."));
    }
}
