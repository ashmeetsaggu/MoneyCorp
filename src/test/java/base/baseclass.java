package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseclass {

    public static WebDriver d ;

    @BeforeTest
    public void openBrowserWithUrl(){
        // to open the browser with url of the webpage
        System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe") ;
        String url = "https://www.moneycorp.com/en-gb/" ;
        d = new ChromeDriver() ;
        d.get(url) ;
        d.manage().window().maximize() ;
        System.out.println("BROWSER OPENED") ;
        System.out.println("DRIVER in BaseClass :: "+d) ;
    }


    @AfterTest
    public void closeBrowser(){
        // to close the initialized browser
        d.close() ;
        System.out.println("BROWSER CLOSED") ;
    }
}
