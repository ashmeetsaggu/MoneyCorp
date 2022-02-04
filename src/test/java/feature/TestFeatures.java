package feature;


import org.openqa.selenium.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
import pageobject.HomepagePO ;
import pageobject.SearchPO ;
import pageobject.ValidateLinksPO;

public class TestFeatures {

    WebDriver d = null;

    HomepagePO homepo = null ;
    SearchPO searchpo = null ;
    ValidateLinksPO linkspo = null ;


    public TestFeatures(WebDriver driver){
        this.d=driver;
        homepo = new HomepagePO(d) ;
        searchpo = new SearchPO(d) ;
        linkspo = new ValidateLinksPO(d) ;
    }


    public void performPositiveFlow(){
        String methodName = "A01_TestCase" ;
        //	po.openBrowserWithUrl() ;
        homepo.changeLanguage() ;
        homepo.clickFindOutMore() ;

        String validation = searchpo.validatePage() ;
        if(validation.equalsIgnoreCase("https://www.moneycorp.com/en-us/business/foreign-exchange-solutions/")){
            d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS) ;
            searchpo.searchInternationalPayment() ;

            String validation2 = searchpo.validatePage() ;
            if(validation2.equalsIgnoreCase("https://www.moneycorp.com/en-us/search/?q=international+payments")){
                List<WebElement> el1 = linkspo.findAllArticles() ;
                int size = el1.size() ;
                System.out.println("SIZE :: "+size) ;

                for(int i=0;i<size;i++){
                    String hrefs = el1.get(i).getAttribute("href") ;
                    System.out.println("HREF :: "+hrefs) ;
                    if(hrefs.startsWith("https://www.moneycorp.com/en-us/")){
                        System.out.println("Link contains mentioned link") ;
                    }else
                        System.out.println("Link doesn't contain mentioned link") ;
                }
                System.out.println("METHOD :: " +methodName+ " :: SUCCESS ") ;
            }
        }
        //	po.closeBrowser() ;
    }

}
