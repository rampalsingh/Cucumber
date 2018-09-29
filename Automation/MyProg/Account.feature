Feature: Portal Login 

@RegTest	
Scenario: Home Page default login 
	Given User is on Netbanking landing page 
	When user login into application with "Sunny" and "Ahmed" 
	Then Home page is populated 
	And Cards displayed are "true" 