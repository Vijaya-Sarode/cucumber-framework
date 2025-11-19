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
@tag
Feature: Login to facebook application
Scenario: Sucessfull login into facebook application

Given user navigates to facebook URL
When User enter valid username and passwords
Then click on login button


Scenario: Verify the title of the Facebook login page
Given user navigates to facebook URL
When the page is loaded completely
Then the title of the page should be"Log in to Facebook"