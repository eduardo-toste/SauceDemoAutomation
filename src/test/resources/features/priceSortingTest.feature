@priceSortingTests
Feature: Ordenação por preço

  Background:
    Given que estou logado na aplicação
    And estou na página de listagem de produtos

  Scenario: Exibir produtos em ordem crescente de preço
    When eu seleciono a opção Price (low to high) no menu de ordenação
    Then os produtos devem ser exibidos em ordem crescente de preço

  Scenario: Exibir produtos em ordem decrescente de preço
    When eu seleciono a opção Price (high to low) no menu de ordenação
    Then os produtos devem ser exibidos em ordem decrescente de preço