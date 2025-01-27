@itemSelectionRemoval
Feature: Seleção e remoção de produtos no carrinho

  Scenario: Selecionar e remover o produto do carrinho
    Given que estou logado na aplicação
    And o produto Sauce Labs Bolt T-Shirt foi adicionado ao carrinho
    When acesso o carrinho de compras
    And clico no botão Remove para remover o produto
    Then o carrinho de compras deve aparecer vazio