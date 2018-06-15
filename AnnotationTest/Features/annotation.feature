Feature: annotation 
#This is how background can be used to eliminate duplicate steps 

Background:  
   Open the Firefox and launch the Facebook 

Scenario: 
   Given User on Facebook login page
   When I enter username as "9971949716"
   And I enter password 
   Then Login should fail 