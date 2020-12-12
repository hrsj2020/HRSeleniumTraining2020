Feature: To check the CucumberOrangHRM login functionality
Scenario Outline: To verify login funcitonality of CucumberOrangHRM

Given To launch the Application on the browser
When Enter username and password and click on loginbutton
Then Close the browser

Examples:
|user|pass|
|Admin|admin123|
