# MoneyCorp
MoneyCorp Automation Framework
MoneyCorp Automation Framework is build with selenium and java.  It consist of page object model. 
It is a selenium based project, so project is dependent on testng, selenium, junit. everything is included in pom.xml file.
As per java, inheritance is followed in the project. 

---------------------------------------------------------------------------------------------------------


MoneyCorp Automation Framework has files listed below :
-------------------------------------------------------
baseclass.java - it initializes browser and quits the browser when operations are done performing.

TestFeatures.java - It consists of all the operations to be called out.

HomepagePO.java - It contains functions to be performed on homepage. 
                  (it changes the language. it also clicks "Find out more" under foreign exchange grid.)
                
SearchPO.java - It contains functions to be performed on Foreign Exchange Solutions webpage. 
                (it validates if the webpage has landed on the correct webpage by validating url. it searches in the search bar for "international payments" )
                
ValidateLinksPO.java - It contains functions to be performed on Search MoneyCorp Webpage.
                       (It fetches all the href(url) from the grids that are displayed after searching for international payments. it validates if all the hrefs in the grid starts with )
                       
TestCases.java - It calls the test case.

----------------------------------------------------------------


INSTRUCTIONS TO FOLLOW TO EXECUTE THE FRAMEWORK ::
1. Download chromedriver from https://chromedriver.chromium.org/downloads
2. Extract and Place the downloaded chromedriver in directory - "C:\drivers\"

3. Download IntelliJ and install.

4. Clone the project from github using -
    - Open https://github.com/ashmeetsaggu/MoneyCorp
    - click code -> download zip file
    
6. Open Intellij, and import the project
7. Right click on project name and click Build 
8. Execute the project -
    - open TestCases.java file 
    - click run

---------------------------------------------------------------

FURTHER ENHANCEMENTS CAND BE DONE :

1. Driver can be placed inside the framework itself.
2. Data like URL of the application can be stored in a Excel File and fetched from it.
3. Data can be mantained inside Excel file.
4. Same test cases can be performed on distinctive web browser like Firefox, Opera, Internet Explorer.
5. Reports can be added in the framework to view the final results in the form of Extent Report.
6. Mobile testing can be performed for the same set of instructions.
7. Database can be used to store data fetched from search.

-----------------------------------------------------------------
