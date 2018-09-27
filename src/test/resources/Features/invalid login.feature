
#@Ignore
#Feature:invalid login
#    Scenario Outline: As a user i want to see error message when i login incorrectly.
#      Given i am on the home page
#      And i see a logo banner
#      When i click on sign in
#      And i type user email "<email>" details
#      And i type user password "<password>" details
#      And i click on login button
#      Then i see an error "<ErrorMassage>" message details
#
#      Examples:
#      |email                   |password|ErrorMassage             |
#      |Maxtest964@gmail.com    |        |Password is required.     |
#      |                        |Monday2 |An email address required. |