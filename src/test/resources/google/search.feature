Feature: Google search feature

  @browser
  Scenario Outline: Search for specific content related posts
    Given I am on the google search page
    When I search for "<content>"
    Then I see a list of related posts
  Examples:
    | content            |
    | cucumber_jvm       |
    | Essence of Testing |