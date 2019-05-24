
@tag
Feature: User test the login functionality
  @tag1
  Scenario: User login the facebook page
    Given User launch the faceb application
    When User enter uname
    |kavitha|kavi|
    |kavvino|kalai|
    |Greens|Technology|
    |vkkavi|kavi|
    And User enter passwd 
    |kavi|kv|
    |vk|vinokavi|
    |Greens|Tech|
    |ivak|kalai|
    And User click login
    Then User navigate the correct url
    And User quit the browser

 