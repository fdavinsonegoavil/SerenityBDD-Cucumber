Feature: Login
  Como usuario, quiero poder ingresar a la aplicación de SauceDemo usando diferentes credenciales.

  Scenario Outline: Verificacion de login con diferentes tipos de usuarios
    Given abro el browser en la pagina de SauceDemo
    When ingreso las credenciales de "<strUserName>" y "<strPassword>"
    Then deberia ser redirigido a la URL "<urlPagina>"

    Examples:
      | strUserName            | strPassword  | urlPagina                                      |
      | standard_user          | secret_sauce | https://www.saucedemo.com/inventory.html       |
      | locked_out_user        | secret_sauce | https://www.saucedemo.com/                     |
      | problem_user           | secret_sauce | https://www.saucedemo.com/inventory.html       |
      | performance_glitch_user| secret_sauce | https://www.saucedemo.com/inventory.html       |

  Scenario Outline: Verificacion de error inline al ingresar credenciales invalidas
    Given abro el browser en la pagina de SauceDemo
    When ingreso las credenciales de "<strUserName>" y "<strPassword>"
    Then deberia ver el mensaje de error "<mensajeError>"

    Examples:
      | strUserName     | strPassword     |  mensajeError                                                            |
      | usuario_invalido| secret_sauce    | Epic sadface: Username and password do not match any user in this service|
      | standard_user   | contra_erronea  | Epic sadface: Username and password do not match any user in this service|