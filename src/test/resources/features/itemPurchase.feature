@itemPurchase
Feature: Efetuar compra

  Scenario: Efetuar a compra do produto
    Given que estou logado na aplicação
    And o produto Sauce Labs Bolt T-Shirt foi adicionado ao carrinho
    When acesso o carrinho e clico em Checkout
    And forneço os dados "Eduardo", "Toste", "18120-000"
    And clico em Continue
    And finalizo a compra clicando em Finish
    Then a compra é concluída com sucesso