Feature: Buying vehicle insurance
	As a user
	I would like to buy insurance
	For vehicle protection
	
Scenario: Must display email message sent successfully
	Given I access the form
	When I fill out the form Enter Vehicle Data
	And I fill out the form Enter Insert data 
	And I fill out the form Enter Product Data
	And I fill out the form Select Price Option
	And I fill out the form Send Quote
	Then I should see "Sending e-mail success!"
	
