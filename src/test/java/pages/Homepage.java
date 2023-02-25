//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    private WebDriver driver;
    public Homepage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);}
    @FindBy(
            xpath = "//input[@class=\"_3704LK\"]"
    )
    @Getter
    WebElement SearchBar;
    @FindBy(
            xpath = "//span[@class=\"_10Ermr\"]"
    )
    @Getter
    WebElement Searchresult;
    @FindBy(
            xpath = "//input[@class=\"_3704LK\"]"
    )
    @Getter
    WebElement SearchField;
    @FindBy(
            xpath = "//input[@class=\"_3704LK\"]"
    )
    @Getter
    WebElement Search;
    @FindBy(
            xpath = "//div[@class=\"_36fx1h _6t1WkM _3HqJxg\"]"
    )
    @Getter
    WebElement Error;
    @FindBy(
            xpath = "//button[@class='_2KpZ6l _2doB4z']"
    )
    @Getter
    WebElement closed;


//    public WebElement getSearching() {
//        return Searching;
//    }
//
//    @FindBy(
//            xpath = "//input[@class=\"_3704LK\"]"
//    )
//    WebElement Searching;


    // public WebElement getDisplay() {
    //   return Display;
    // }

    // public Homepage(WebDriver driver) {
    //  this.driver = driver;
    //  PageFactory.initElements(driver, this);
    // }
    @FindBy(
            xpath = "//a[@class=\"YfzaL8\"]"
    )
    @Getter
    WebElement Display;

    //public WebElement getWrong() {
    //  return Wrong;
    // }


    @FindBy(
            xpath = "//input[@class=\"_3704LK\"]"
    )
    @Getter
    WebElement Wrong;
  }



  //  public WebElement getSearchBar() {
    //    return this.SearchBar;
   // }

//    public WebElement getSearchresult() {
//        return this.Searchresult;
//    }
//
//    public WebElement getSearchField() {
//        return this.SearchField;
//    }
//
//    public WebElement getSearch() {
//        return this.Search;
//    }
//
//    public WebElement getError() {
//        return this.Error;
//    }
//
//    public WebElement getClosed() {
//        return this.closed;
//    }
//}
