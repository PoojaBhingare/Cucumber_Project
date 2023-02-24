
Feature:Search bar feature


#  Background: User has to login--> background will execute before every scenario
#    Given User is logged in

  Scenario:verify that user can able to search a product
  Given  the user navigate to home page
  When  the user enter the product name
  Then The product result should be displayed



  Scenario:verify that user can get the content while entering invalid text
  Given the user navigate to home page
  When the user should enter the invalid product name
  Then The product result should not be displayed



  Scenario:verify that user can able to search correct product with incorrect spelling of product
  Given the user navigate to home page
  When the user enter incorrect product name
  Then The product result should displayed for in product name


  Scenario:Search product name with special character
    Given  the user navigate to home page
    When  the user enter product name with special character
    Then The product result should be displayed for special character name of product


#  Scenario: Search product name with multiple words
#  Given the user navigate to home page
#  When the user enter multiple product name
#  Then The product result should be displayed

@smoke
Scenario Outline: Verify that user is able to search for a product with multiple words
  Given  the user navigate to home page
  When  the user enter the "<productDESCRIPTION>"
  Then The product result should be display for product with multiple words
  Examples:
            |productDESCRIPTION |
            |women              |
            |women watch        |
            |adult sports shoes |






