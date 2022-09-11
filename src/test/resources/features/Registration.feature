#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Registration page validation
  I want to use this template for my feature file
@data
  Scenario Outline: Filling the Registration page details using postive test data
    Given Addatin homepage loaded sucessfully
    And click on the New user registration link
    When input username with "<username>"
    And input password with "<password>"
    And input confirmpassword with "<confirm password>"
    And input fullname with "<full name>"
    And input emailid with "<email id>"
    Then confirm user has been registered sucessfully
    
    Examples:
		|username|password|confirm password|full name|email id|
		|dinesh009|test1234|test1234|Dinesh Kumar M|dinesh@gmail.com|
		|vidhya123|test345|test345|Vidhya R|vidhya@gmail.com|
		
		Scenario: Filling the Registration page data
    Given Addatin homepage loaded sucessfully
    And click on the New user registration link
    When input username with "siva12"
    And input password with "Test678"
    And input confirmpassword with "Test678"
    And input fullname with "Siva"
    And input emailid with "siva@gmail.com"
    Then confirm user has been registered sucessfully
   