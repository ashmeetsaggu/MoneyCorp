# MoneyCorp
MoneyCorp Automation Framework

MoneyCorp Automation Framework is build with selenium and java.  It consist of page object model. 

MoneyCorp Automation Framework has files listed below :

baseclass.java - it initializes browser and quits the browser when operations are done performing.
TestFeatures.java - It consists of all the operations to be called out. 
HomepagePO.java - It contains functions to be performed on homepage. 
                  (it changes the language. it also clicks "Find out more" under foreign exchange grid.)
SearchPO.java - It contains functions to be performed on Foreign Exchange Solutions webpage. 
                (it validates if the webpage has landed on the correct webpage by validating url. it searches in the search bar for "international payments" )
ValidateLinksPO.java - It contains functions to be performed on Search MoneyCorp Webpage.
                       (It fetches all the href(url) from the grids that are displayed after searching for international payments. it validates if all the hrefs in the grid starts with )
TestCases.java - It calls the test case.

