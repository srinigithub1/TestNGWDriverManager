#updated today
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
@Functional_TestCases
Feature: verify Home page and login funtionality of uibank
  I want to use this template for my feature file

  @RegresssionTestCases
  Scenario: Validating Home page of Uibank
    Given App is opned in Chrome browser
    When I fresh the browser
    Then I validate App title
    And check Login button on Home page
    
  #@RegresssionTestCases
  #Scenario Outline: Login Functionality of Uibank
    #Given verify UserName in Loginpage
    #And Verify Password filed in Loginpage
    #When enter user name in Loginpage <Uname>
    #And enter password in Loginpage <Password>
    #And click Login in App
    #Then Check Logout text <status> in Ac summary page
    #And close Uibank Application

  @RegresssionTestCases
  Scenario Outline: Login Functionality of Uibank
    Given verify UserName in Loginpage
    And Verify Password filed in Loginpage
    When enter user name in Loginpage "<Uname>"
    And enter password in Loginpage "<Password>"
    And click Login in App
    Then Check Logout text "<status>" in Ac summary page
    And close Uibank Application

    Examples: 
      | Uname      | Password | status       |
      | name1      | ladfjlad |  login failed  |
      | name2      | aldjflad |  login failed  |
      | vaasu 		 | BinaryLo |  login failed  |
      | ctrlaisoft | Uibank@1234       | Logout       |
