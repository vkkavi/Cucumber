
@tag
Feature: User test login page

  @tag1
  Scenario: User login the facebook page
    Given User launch the facebook application 
    When User enter username
     And User enter password
    And User click the login button
    Then USer check navigate to correct url or not
    And User close the browser
    