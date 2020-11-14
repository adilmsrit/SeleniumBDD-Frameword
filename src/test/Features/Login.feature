Feature: Login

  Scenario: Successful login with valid credentials
    Given User launches chrome browser
    When User opens "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F" URL
    And User enters "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User clicks on logout link
    Then Page title should be "Your store. Login"
    And Close Browser


  Scenario Outline: Successful login with valid credentials
    Given User launches chrome browser
    When User opens "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F" URL
    And User enters "<username>" and password as "<password>"
    And Click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User clicks on logout link
    Then Page title should be "Your store. Login"
    And Close Browser
    Examples:
      | username             | password |
      | admin@yourstore.com  | admin    |
      | admin@yourstore.comm | adminn   |

