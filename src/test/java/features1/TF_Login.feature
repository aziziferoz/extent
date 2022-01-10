Feature: TechFios login functionality validation 

@shit
Scenario: User should be able to login with valid credentials 
	Given User is on the Techfios login page  
	When User enters username as "demo@techfios.com"                      
	When User enters password as "abc123"             
	And User clicks on signin button       
	

	