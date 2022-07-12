Feature: add new new Customer and update
    
  @smaoke @Regression @XTP-12345 @XTP-76866
  Scenario: Create new customer
    Given I launch Katalon Shop Katalon Ecommerce website
    When I add four Random items to my cart
    And I view my cart
    Then I find total four items listed in my cart  
    When I am able to remove the lowest price item from my cart
    Then I am able to verfiy three items in my cart