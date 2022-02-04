package pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPO {

    WebDriver d = null;

    public SearchPO(WebDriver d) {
        this.d = d;
        PageFactory.initElements(d, this);
    }

    @FindBy( xpath = ".//button[@class='navigation-search icon']" )
    WebElement searchButton ;

    @FindBy( xpath = "//input[@id='nav_search']" )
    WebElement searchInputField ;


    public String validatePage(){
        // to fetch the current url of the webpage
        String validatePage = d.getCurrentUrl();
        System.out.println("VALIDATE PAGEFE :: "+validatePage) ;
        System.out.println("VALIDATION OF PAGE") ;
        return validatePage ;
    }

    public void searchInternationalPayment(){
        //to search with a string in search box
        //d.findElement(By.xpath(".//button[@class='navigation-search icon']")).click() ;
        searchButton.click() ;
        searchInputField.sendKeys("international payments"+ Keys.RETURN ) ;
        System.out.println("INTERNATIONAL PAYMENTS SEARCHED") ;
    }
}
