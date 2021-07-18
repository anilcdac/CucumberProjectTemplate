@Flow1 @Regression @APPN-1973
Feature: Login Flow

  Scenario: Setup chrome
  //  Given I setup CHROME browser
    Given I open url "http://www.google.com"
#    And I verify text "Google" is present
#    And I verify text "Google" is present
@FlowSc2
#    Scenario: Create Query
#      Given I click on button "Create Query"
#      And I wait for "2" second
#      And I verify text "Fill form" is present
#      When I verify link "" is present
#      Then I click on link ""

  Scenario:Fill the form
  Given I populate field "Name" with value "Anil"
  And I wait for progress bar  // wait- Explicit, Implicit, fluent
#  And I wait for "5" seconds
  And I populate dropdown field "Country" with value "India"
  And I populate picker field "Code" with value "123"


  Scenario Outline:Fill the form
    Given I populate field "Name" with value "<Name>"
    And I wait for progress bar  // wait- Explicit, Implicit, fluent
#  And I wait for "5" seconds
    And I populate dropdown field "Country" with value "<Country>"
    And I populate picker field "Code" with value "123"
    Examples:
    |Scenario| Name | Country|
    |First   | Anil  |India  |
    |Second  | Rahul | UK    |

  Scenario: Logoff and Quit/ Close the browser

