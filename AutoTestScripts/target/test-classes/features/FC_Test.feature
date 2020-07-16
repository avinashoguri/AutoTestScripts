Feature: Log-in functions


Scenario: Login with in-valid credentials
Given User is on Firecompass login page
When enter invalid username and password
Then enter login button
And application should display error promt


Scenario: Login with correct username and in-correct password
Given User is on Firecompass login page
When enter valid username and invalid password
Then enter login button
And application should display error promt

