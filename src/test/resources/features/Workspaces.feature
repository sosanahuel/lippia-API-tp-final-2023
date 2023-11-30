Feature: Workspaces

  @GETWORKSPACES
  Scenario Outline: Consulta los workspaces
    Given tengo una cuenta y una api-key
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then obtengo el response
    Examples:
      | operation | entity    | jsonName            | status |
      | GET       | WORKSPACE | workspace/workspace | 200    |
