Feature: annotation 
#This is how background can be used to eliminate duplicate steps 

Background: 
   Given User navigates to Facebook
 
 @ValidCases  
Scenario Outline: 
   When I enters username "<username>"
   And I enters password "<password>" 
   And click for login
   Then should get result for "<username>" and "<password>" 
   
Examples:
	| username   | password |
    | 9968285308 | pankaj   | 
   
 @InvalidCases    
 Scenario Outline: 
   When I enters username "<username>"
   And I enters password "<password>" 
   And click for login
   Then should get result for "<username>" and "<password>" 
   
Examples:
	| username   | password |
    | testuser_1 | Test@153 |
    | testuser_2 | Test@153 |