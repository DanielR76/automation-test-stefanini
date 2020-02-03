Feature: Merccury Tours
  Yo como Usuario quisiera registrarme en la pagina

  @TestCaseRegister
  Scenario: Registro exitoso
    Given Me encuentro en la pagina mercury tours
    When Digilencio el formulario de registro
      | firtsName | lastName | phone  | email           | address | city         | stateProvince | postalCode | country   | userName | pass     | confirmPass |
      | Viviana   | Colon    | 746456 | vivis@gmail.com | cra 89a | Buenos Aires | imaginalandia |         65 | ARGENTINA | vivis45  | 12345678 |    12345678 |
    Then Se visualiza el estado del registro

  @TestCaseFlight
  Scenario Outline: Vuelo exitoso
    Given Me encuentro en la pagina mercury tours
    When Digilencio el formulario de registro
      | firtsName | lastName | phone | email | address | city | stateProvince | postalCode | country | userName | pass | confirmPass |
    And Realizo la busqueda y seleccion de vuelo
      | type | passengers | departingFrom | fromDate | arriving | returnDate | serviceClass | airline | depart | back |
    Then Se confirma la solicitud del vuelo

    Examples: 
      | Data |

  ##@externaldata@./src/test/resources/datadriven/defaultDataDriven.xlsx@Vuelo
  @Date
  
  Scenario: Reviso la fecha
    Given Me encuentro en la pagina mercury tours
    Then Se verifica la fecha
