package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ValidateLinksPO {

    @FindAll(@FindBy( xpath = "//a[@class='title']") )
    List<WebElement> element ;

    WebDriver d = null;

    public ValidateLinksPO(WebDriver d) {
        this.d = d;
        PageFactory.initElements(d, this);
    }

    public List<WebElement> findAllArticles(){
        //to check if all the hrefs starts with moneycorp url
        try{
            Thread.sleep(5000) ;
        }catch(Exception ex){
            System.out.println("Exception caught") ;
        }
        List<WebElement> elements = element ;
        //List<WebElement> elements = d.findElements(By.xpath("//a[@class='title']")) ;
        System.out.println("ALL ARTICLES HREF FETCHED") ;
        return elements ;
    }
}
