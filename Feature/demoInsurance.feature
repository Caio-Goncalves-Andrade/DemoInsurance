Feature: Do a insurance demo

  Scenario: Fill ao fields in the insurance page
    Given Im in insurance page
    When  Fill all fields in Veicule Data and click in Next button
    And   Fill all fields in Insurant Data and click in Next button
    And   Fill all fields in Product Data and click in Next button
    And   Fill all fields in Price Option and click in Next button
    And   Fill all fields in Send Quote and click in Send button
    Then Check the successful message


