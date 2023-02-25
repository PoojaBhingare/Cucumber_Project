package steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.Homepage;
import utils.BrowserManager;
import utils.QaProps;
import utils.TestDataReader;
import utils.WaitUtils;

import java.util.HashMap;


public class StepDefinitions {
    private WebDriver driver;
    Homepage homePage;
    HashMap<String,String>data;
    Scenario scenario;
    String url;

    public StepDefinitions(BrowserManager browserManager){
        this.driver = browserManager.getDriver();
    }
    @Before(order = 1)
    public void before(Scenario scenario){
        this.scenario = scenario;
    }


    @Given("the user navigate to home page")
    public void theUserNavigateToHomePage() {
        driver.get(QaProps.getValue("url"));
        url=QaProps.getValue("url");driver.get(url);
        homePage = new Homepage(driver);
        homePage.getClosed().sendKeys(Keys.ENTER);
        homePage.getSearchBar().sendKeys(Keys.ENTER);
        data = TestDataReader.getData(scenario.getName());

    }

    @When("the user enter the product name")
    public void theUserEnterTheProductName() {
        homePage = new Homepage(driver);
        homePage.getSearchBar().sendKeys(data.get("Input"));
        homePage.getSearchBar().sendKeys(Keys.ENTER);
    }

    @Then("The product result should be displayed")
    public void theProductResultShouldBeDisplayed() {
        String text = homePage.getSearchresult().getText();
        Assert.assertTrue(text.contains(data.get("Input")));
    }

    @When("the user should enter the invalid product name")
    public void theUserShouldEnterTheInvalidProductName() {
        homePage = new Homepage(driver);
        homePage.getSearch().sendKeys(data.get("Input"));
        homePage.getSearch().sendKeys(Keys.ENTER);
    }

    @Then("The product result should not be displayed")
    public void theProductResultShouldNotBeDisplayed() {
        WebElement error = homePage.getError();
        Assert.assertTrue(error.isDisplayed());

    }
    public Homepage getHomePage() {
        return homePage;
    }

    @When("the user enter incorrect product name")
    public void theUserEnterIncorrectProductName() {

//        homePage=new Homepage(driver);
//        homePage.getSearching().sendKeys(data.get("Input"));
//        homePage.getSearching().sendKeys(Keys.ENTER);
        homePage = new Homepage(driver);
        homePage.getSearchBar().sendKeys(data.get("Input"));
        homePage.getSearchBar().sendKeys(Keys.ENTER);


    }

    @Then("The product result should displayed for in product name")
    public void theProductResultShouldDisplayedForInProductName() {
        WaitUtils.waitTillVisible(driver,this.homePage.getSearchBar());
        WebElement search_info=homePage.getSearchBar();
        Assert.assertTrue(search_info.isDisplayed());

    }

    @When("the user enter product name with special character")
    public void theUserEnterProductNameWithSpecialCharacter() {


        homePage = new Homepage(driver);
        homePage.getSearchBar().sendKeys(data.get("Input"));
        homePage.getSearchBar().sendKeys(Keys.ENTER);

    }

    @Then("The product result should be displayed for special character name of product")
    public void theProductResultShouldBeDisplayedForSpecialCharacterNameOfProduct() {
        WaitUtils.waitTillVisible(driver,this.homePage.getSearchBar());
        WebElement search_info=homePage.getSearchBar();
        Assert.assertTrue(search_info.isDisplayed());

    }

    @When("the user enter the {string}")
    public void theUserEnterThe(String productDESCRIPTION) {
        WebElement product=homePage.getSearchBar();
        product.sendKeys(productDESCRIPTION);
        homePage.getSearchBar().sendKeys(Keys.ENTER);

    }

    @Then("The product result should be display for product with multiple words")
    public void theProductResultShouldBeDisplayForProductWithMultipleWords() {
        WebElement search_info =homePage.getSearchresult();
        WaitUtils.waitTillVisible(driver,this.homePage.getSearchresult());
        Assert.assertTrue(search_info.isDisplayed());

    }
}



