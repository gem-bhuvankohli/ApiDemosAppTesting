@ApiDemos
Feature: ApiDemo App Actions

  Scenario: Opening ApiDemo Application
    Given the ApiDemo application is open

  Scenario: Scrolling and SetWallpaper Action
    Given the user performs a scroll action and updates wallpaper

  Scenario: Drag and Drop Elements
    When the user performs a drag and drop action
    Then the user drags and drops elements successfully

  Scenario: Double Tap Action
    When the user performs a double tap action
    Then the user experiences a double tap effect

  Scenario: Scroll Up to Find Events Button
    When the user performs a scroll up action
    Then the user scrolls up to find the Events button

  Scenario: Swipe Right to Explore Content
    When the user performs a swipe right action
    Then the swipe action is successful

  Scenario: Swipe Left to Navigate Back
    When the user performs a swipe left action
    Then the swipe action is successful
