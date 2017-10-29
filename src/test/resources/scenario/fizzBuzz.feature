Feature: Getting the correct string from any given number

  Scenario: Just one number
    Given the number 1
    When I ask for the string
    Then The string should be empty

  Scenario: Any number
    Given the number 3
    When I ask for the string
    Then The string should be Fizz

  Scenario Outline:
    Given a number <Number>
    When I ask for the string
    Then the string should be <Expected>

    Examples:
      | Number | Expected |
      | 3      | Fizz     |
      | 4      |          |
      | 5      | Buzz     |
      | 15     | FizzBuzz |
