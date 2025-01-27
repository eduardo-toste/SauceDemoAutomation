@detailedProduct
Feature: Acesso a detalhes do produto

  Scenario:  Acessar dados detalhados do produto
    Given que estou logado na aplicação
    And estou na página de listagem de produtos
    When eu clico no produto Sauce Labs Fleece Jacket
    Then os dados detalhados do produto são exibidos