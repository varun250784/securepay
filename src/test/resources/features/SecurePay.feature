Feature: Open and Fill secure pay contact us page

@ui
Scenario: Open the secure pay home page via google

				Given I launch google
				When I search for key"securepay" 
				Then I click on desired link
				And I navigate to the contact us page
				Then I fill the contact us form