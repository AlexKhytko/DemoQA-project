Feature: Book Store Application

  Scenario: Search for a book
    Given user is on the Book Store Application home page
    When user searches for "Life of Great Genius - Alex Khytko"
    Then book "Life of Great Genius - Alex Khytko" should be displayed