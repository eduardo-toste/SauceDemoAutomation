@loginTests
Feature: Login na Aplicação

  Background:
    Given que estou na tela de login da aplicação

  Scenario Outline: Login com sucesso
    When eu insiro o usuário "<usuario>" e a senha "<senha>"
    And clico no botão de login
    Then sou redirecionado para a tela principal
    Examples:
      | usuario       | senha        |
      | standard_user | secret_sauce |

  Scenario Outline: Login sem sucesso
    When eu insiro o usuário "<usuario>" e a senha "<senha>"
    And clico no botão de login
    Then é apresentada uma mensagem de erro
    Examples:
      | usuario       | senha        |
      | standard_user | 123456       |
      | eduardo123    | secret_sauce |
      | eduardo123    | 123456       |