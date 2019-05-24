
@tag
Feature: User test the facebook functionality
  @tag1
  Scenario: User login facebook page
    Given User launch the facebook url
    When User enter username "kavitha"
    And User enter password "kavi"
    And User click login button
    Then User check navigate to correct url or not  
    And User close the browser

  