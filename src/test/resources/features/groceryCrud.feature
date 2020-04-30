Feature:

  Scenario: desafio um
    Given the user is on the grocery crud page
    When the user fill the fields
    And save the form
    Then the message is displayed

  Scenario: desafio dois
    Given the user is on the grocery crud page
    When the user fill the fields
    And the user clicks on Go back to list
    And the user search the value "teste sicredi"
    And the user clicks on the checkbox
    And the user clicks on delete button
    And the user confirm the delete option
    Then the delete message will be displayed



