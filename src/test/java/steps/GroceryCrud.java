package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import pages.GroceryCrudPage;

public class GroceryCrud {
    GroceryCrudPage page = new GroceryCrudPage();
    @Given("^the user is on the grocery crud page$")
    public void theUserIsOnTheGroceryCrudPage() {
        page.openPage();
    }

    @When("^the user fill the fields$")
    public void theUserFillTheFields() throws Exception{
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
        Thread.sleep(5000);
        page.validateMessageSuccess();
    }

    @Then("^the message is displayed$")
    public void theMessageIsDisplayed() {
        String value = page.validateMessageSuccess();
        Assert.assertThat(value, CoreMatchers.containsString("Your data has been successfully stored into the database."));
    }

    @And("^save the form$")
    public void saveTheForm() {
        page. clickSaveBtn();
    }
}
