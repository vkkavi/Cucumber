
@tag
Feature: User test the login functionality
  @tag1
  Scenario: User login the facebook page
    Given User launch the fb url
    When User enter userid
    |username|password|
    |kavitha|kavi|
    |kavivino|kavik|
    |vkkavi|kv|
    And User enter passid
    |username|password|
    |kavivino|vk|
    |kavivk|vkkavi|
    |kavithak|vino|
    
    And User click login btn
    Then User check to navigate crct url or not
    And User close the browse

  
