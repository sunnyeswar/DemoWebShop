@DemoWebShop
Feature: DemoWebShop Web site
@TC01_Register
Scenario:
Register in the DemoWebShop
Given the user launch the chrome application
When the user open the DemoWebShop Register page 
Then the user register by filling all the necessary details
Then click on the register button user navigate to the next page

@TC02_InvalidRegister
Scenario:
Register in the DemoWebShop
Given user launch the chrome application
When user open the DemoWebShop Register page 
Then user register by filling all invalid details
Then click on the register button user should not navigate to the next page

@TC03_Login
Scenario:
Login to DemoWebShop
Given user launches the chrome application
When the user loggedin to the home page
Then the user login using emailid and password
Then click on the login button user navigate to the next page

@TC04_LoginInvalidEmailid
Scenario:
Login DemoWebShop
Given launching the chrome appy
When user login too home page
Then the user0 login using invalid emailid 
Then click on login button user1 should not navigate to the next page

@TC05_LoginInvalidPassword
Scenario Outline:
Login to the DemoWebShop
Given launching the chrome 
When user login to the home page
Then the user login using valid <emailid> 
And the user login using invalid <pass>
Then click on login button user should not navigate to the next page

Examples:
|emailid|pass|
|candychandu186@gmail.com|chandu12345|

@TC06_AccountInfo
Scenario:
user get the info
Given launching chrome application
When the user login to home page
Then the user get logged in 
Then user get the customer info

@TC07_AddToCart
Scenario:
Login and adding book to cart
Given launch the chrome application
When the user logged in to the home page
Then the user login using id and password
Then the user click the book and add to cart
Then the user does the checkout
Then the user fills the details in billing address

@TC08_RewardPoint
Scenario:
user get the reward points.
Given launch chrome app
When user get logged
Then user get reward point info
Then browser gets closed

@TC09_ForgotPassword
Scenario:
user regenerate forgot password
Given launch chrome browser
When user forgot password
Then user recover password
Then close the browser

@TC10_CountingLinks
Scenario:
counting the links
Given chrome browser
When demowebshop page 
Then counting the number of links
Then close browser

@TC11_ImageCount
Scenario:
counting the image
Given chromes browser
When demowebshop pages 
Then counting the number of images
Then closing browser

@TC12_Computer
Scenario:
Login and adding computer to cart
Given launch the chrome1 application
When the user1 logged in to the home page
Then the user1 login using id and password
Then the user1 click the computer and add to cart
Then the user1 does the checkout
Then the user1 fills the details in billing address


@TC13_CellPhone
Scenario:
Login and adding Electronics to cart
Given launch the chrome2 application
When the user2 logged in to the home page
Then the user2 login using id and password
Then the user2 click the cellPhone and add to cart
Then the user2 does the checkout
Then the user2 fills the details in billing address

@TC14_Apparel
Scenario:
Login and adding Apparel shoes to cart
Given launch the chrome3 application
When the user3 logged in to the home page
Then the user3 login using id and password
Then the user3 click the belt and add to cart
Then the user3 does the checkout
Then the user3 fills the details in billing address

@TC15_Digital
Scenario:
Login and adding Digital to cart
Given launch the chrome4 application
When the user4 logged in to the home page
Then the user4 login using id and password
Then the user4 click the album and add to cart
Then the user4 does the checkout
Then the user4 fills the details in billing address

@TC16_Jewelry
Scenario:
Login and adding Jewelry to cart
Given launch the chrome5 application
When the user5 logged in to the home page
Then the user5 login using id and password
Then the user5 click the chain and add to cart
Then the user5 does the checkout
Then the user5 fills the details in billing address

@TC17_GiftCard
Scenario:
Login and adding GiftCard to cart
Given launch the chrome6 application
When the user6 logged in to the home page
Then the user6 login using id and password
Then the user6 click the giftCard and add to cart
Then the user6 does the checkout

@TC18_ContactUs
Scenario Outline:
Login and writing enquiry
Given launch the chrome7 browser
When open the app page7
Then user7 login using email <emailid7>
And user7 login using password <password7>
Then user7 writes his <enquiry1>
Then user closes the chrome7 browser

Examples:
|emailid7|password7|enquiry1|
|eswar12@gmail.com|eswar186|Search is not working properly|

@TC19_NewsLetter
Scenario:
Given launch the chrome8 browser
When open the app page8
Then subscribe to newsletter
Then user closes the chrome8 browser

@TC20_Remove
Scenario:
Given launch the chrome9 browser
When open the app page9
Then user9 login in to the home page
Then user9 remove item from the cart
Then user9 closes the browser