@Clockify
Feature: Crear, editar y eliminar tiempos de clockify

  @GetTimeEntry
  Scenario Outline: Consulta las horas registradas del usuario
    Given tengo una cuenta y una api-key
    When I perform a 'GET' to 'ESPACIO_DE_TRABAJO' endpoint with the 'workspace/workspace' and ''
    And guardo el primer workspace
    When I perform a 'GET' to 'USERID' endpoint with the 'user/userId' and ''
    And obtengo el user
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtien los tiempos
    Examples:
      | operation | entity      | jsonName              | status |
      | GET       | GET_TIEMPOS | tiempo/obtenerTiempos | 200    |

  @TimeEntryDate
  Scenario Outline: Crear horas para el usuario
    Given tengo una cuenta y una api-key
    When I perform a 'GET' to 'ESPACIO_DE_TRABAJO' endpoint with the 'workspace/workspace' and ''
    And guardo el primer workspace
    When I perform a 'GET' to 'ID_PROYECTO' endpoint with the 'proyecto/proyectoID' and ''
    And obtengo en ID del proyecto
    And agrego un nombre '<nombre>', hora inicio '<horasInicio>' y hora de fin '<horasFin>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Examples:
      | operation | entity          | jsonName             | status | horasInicio | horasFin   | nombre              |
      | POST      | AGREGAR_TIEMPOS | tiempo/agregarTiempo | 201    | 2023-11-20  | 2023-11-27 | CrowdarAcademyCrear |

  @TimeEntryEdit
  Scenario Outline: Crear y editar la hora para el usuario
    Given tengo una cuenta y una api-key
    When I perform a 'GET' to 'ESPACIO_DE_TRABAJO' endpoint with the 'workspace/workspace' and ''
    And guardo el primer workspace
    When I perform a 'GET' to 'ID_PROYECTO' endpoint with the 'proyecto/proyectoID' and ''
    And obtengo en ID del proyecto
    And agrego un nombre '<nombre>', hora inicio '<horasInicio>' y hora de fin '<horasFin>'
    When I perform a 'POST' to 'AGREGAR_TIEMPOS' endpoint with the 'tiempo/agregarTIempo' and ''
    And guardo el ID del tiempo creado y lo cambio de nombre a '<nuevoNombre>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>
    Examples:
      | operation | entity        | jsonName            | status | horasInicio | horasFin   | nombre               | nuevoNombre         |
      | PUT       | EDITAR_TIEMPO | tiempo/editarTiempo | 200    | 2023-11-20  | 2023-11-27 | CrowdarAcademyEditar | NuevoCrowdarAcademy |

  @TimeEntryDelete
  Scenario Outline: Crear y elimina la hora para el usuario
    Given tengo una cuenta y una api-key
    When I perform a 'GET' to 'ESPACIO_DE_TRABAJO' endpoint with the 'workspace/workspace' and ''
    And guardo el primer workspace
    When I perform a 'GET' to 'ID_PROYECTO' endpoint with the 'proyecto/proyectoID' and ''
    And obtengo en ID del proyecto
    And agrego un nombre '<nombre>', hora inicio '<horasInicio>' y hora de fin '<horasFin>'
    When I perform a 'POST' to 'AGREGAR_TIEMPOS' endpoint with the 'tiempo/agregarTIempo' and ''
    And guardo el ID del tiempo creado para eliminarlo
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>
    Examples:
      | operation | entity          | jsonName              | status | horasInicio | horasFin   | nombre               |
      | DELETE    | ELIMINAR_TIEMPO | tiempo/eliminarTiempo | 204    | 2023-11-20  | 2023-11-27 | CrowdarAcademyBorrar |
