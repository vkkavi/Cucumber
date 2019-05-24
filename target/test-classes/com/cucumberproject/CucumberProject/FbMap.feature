
@tag
Feature: User test login functiionality

  @tag1
  Scenario: User login the facebook page
    Given User launch the fb app
    When User enter usname
    |username|kavitha|
    And User enter uspwd
    |password|kavivino|
    And User click log btn
    Then User chect navigate crt url or nt
    And User clse the brwser

  