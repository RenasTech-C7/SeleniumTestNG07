# Selenium Locators

Selenium WebDriver- Locating Strategies
Just like Selenium IDE, WebDriver uses the same set of locating strategies for specifying location of a particular web element.

Since, we are using WebDriver with java; each locating strategy has its own command in Java to locate the web elements.
Following are the types of locators supported by Selenium Webdriver:



### 1. ID       
driver.findElement(By.id(<Element ID>))
### 2. Name
driver.findElement(By.name(<Element name>))
### 3. Class Name
driver.findElement(By.className(<ElementClass>))
### 4. TagName
driver.findElement(By.Tagname(<htmltagname>))
### 5. LinkText 
driver.findElement(By.partialLinkText(<linktext>))
### 6. PartialLinkText
driver.findElement(By.id(<ElementID>))
### 8. CSS Selector
driver.findElement(By.cssSelector(<cssSelector>))
### 9. Xpath
//tagname[@attribute='value']
driver.findElement(By.xpath(<xpath>))

Contains method in xpath:
Contains() is a method used in XPath expression. It is used when the value of any attribute changes dynamically, for example, login information.

The contain feature has an ability to find the element with partial text as shown in below XPath example.

In this example, we tried to identify the element by just using partial text value of the attribute. In the below XPath expression partial value ‘sub’ is used in place of submit button. It can be observed that the element is found successfully.

Complete value of ‘Type’ is ‘submit’ but using only partial value ‘sub’.

Xpath=//*[contains(@type,'sub')]
Complete value of ‘name’ is ‘btnLogin’ but using only partial value ‘btn’.

Xpath=//*[contains(@name,'btn')]