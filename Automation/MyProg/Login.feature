Feature: Application Login 

Background:
Given validate the browser
When Browser is triggred
Then check if browser is started


@RegTest
Scenario: Home Page default login 
	Given User is on Netbanking landing page 
	When user login into application with "rampal" and "singh" 
	Then Home page is populated 
	And Cards displayed are "false" 
@SmokeTest	
Scenario: Home Page default login 
	Given User is on Netbanking landing page 
	When user login into application with "Sunny" and "Ahmed" 
	Then Home page is populated 
	And Cards displayed are "true" 

@RegTest	
Scenario: Home Page default login 
	Given User is on Netbanking landing page 
	When user sign up with following details 
		| Shanky | Bajaj | Shanky@gmail.com | India | 987765587| 
	Then Home page is populated 
	And Cards displayed are "true" 
	
@SmokeTest	
Scenario Outline: Home Page default login 
	Given User is on Netbanking landing page 
	When user login in to application <username> and <password> 
	Then Home page is populated 
	And Cards displayed are "true" 
	
	Examples: 
		| username | password |
		| user1    | pass1    |
		| user2	   | pass2    |
		| user3	   | pass3    |
		| user4	   | pass4    |
		
		
