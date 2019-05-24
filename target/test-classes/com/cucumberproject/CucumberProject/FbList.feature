
@tag
Feature: User login the facebook functionality
  @tag1
  Scenario: User login facebook page
    Given User launch the fbook url
    When User enter name
    |kavitha|kavi|
    And User enter pword
    |kv|kavivino|
    And User click the log button
    Then User check navigate to crct url or not
    And User close the brows

  
