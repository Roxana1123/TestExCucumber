Feature: Testing aritmetic operations for a simple calculator

  Scenario: Aa a student, I want to execute sum operations on numbers, so I can see the correct results.
    Given I have a calculator
    When I sum up 7 and 8
    Then I expect the result to be 15


  Scenario: Aa a student, I want to execute substract operations on numbers, so I can see the correct results.
    Given I have a calculator
    When I substract 20 and 10
    Then I expect the result to be 10


  Scenario: Aa a student, I want to execute division operations on numbers, so I can see the correct results.
    Given I have a calculator
    When I divide 21 and 7
    Then I expect the result to be 3


  Scenario: Aa a student, I want to execute multiplication operations on numbers, so I can see the correct results.
    Given I have a calculator
    When I multiply 10 and 20
    Then I expect the result to be 200
