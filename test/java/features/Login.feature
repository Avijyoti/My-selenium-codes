Feature: Login into LeafTaps
Scenario Outline: Login into LeafTaps (positive)
And Enter the UserName as <userName>
And Enter the Password as <passWord>
And Click on login button
Then Verify the login is success
Examples:
|userName|passWord|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|










