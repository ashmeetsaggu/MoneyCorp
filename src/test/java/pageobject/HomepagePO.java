package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomepagePO {

    JavascriptExecutor exec = null ;
    WebDriver d = null;

    public HomepagePO(WebDriver d) {
        this.d = d;
        PageFactory.initElements(d, this);
    }

    public void changeLanguage(){
        //to change the language from gb to english us
        exec = (JavascriptExecutor)d ;
        exec.executeScript("document.getElementById('language-dropdown-flag').click();") ;
        exec.executeScript("arguments[0].click();", d.findElement(By.xpath(".//a[@aria-label='USA English']")));
        System.out.println("LANGUAGE CHANGED") ;
    }

    public void clickFindOutMore(){
        //to click the find out more button present under foreign exchange tab
        exec.executeScript("arguments[0].click();",d.findElement(By.xpath("//h3[contains(text(),'Foreign exchange solutions')]//parent::div//a//span"))) ;
        System.out.println("CLICK FIND OUT MORE") ;
    }

}
