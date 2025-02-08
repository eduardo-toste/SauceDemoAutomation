# Projeto de Automação - Sauce Demo

Este repositório contém um projeto de automação de testes, desenvolvido para validar funcionalidades de uma aplicação. Os testes foram escritos utilizando **Java** e seguem as práticas de automação com **Cucumber** e **Selenium**, com relatórios gerados pelo **Allure Reports**.

## Tecnologias Utilizadas

As seguintes ferramentas e bibliotecas foram utilizadas no desenvolvimento deste projeto:

- **Java**: Linguagem principal do projeto.
- **Selenium WebDriver**: Para automação de interações no navegador.
- **Cucumber**: Framework de BDD para definição dos cenários.
- **Allure Reports**: Para geração de relatórios detalhados e interativos.
- **JUnit**: Framework de teste.
- **Maven**: Gerenciador de dependências e ciclo de vida do projeto.
- **IntelliJ IDEA**: IDE utilizada para o desenvolvimento do projeto.

## Estrutura do Projeto

```plaintext
DesafioTecnico
├── .allure/                     # Configurações do Allure Reports
├── .idea/                       # Configurações do IntelliJ IDEA
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── actions/         # Contém as ações realizadas nas páginas
│   │   │   │   ├── DetailedProductActions.java
│   │   │   │   ├── ItemPurchaseActions.java
│   │   │   │   ├── ItemSelectionRemovalActions.java
│   │   │   │   ├── LoginPageActions.java
│   │   │   │   └── PriceSortingPageActions.java
│   │   │   ├── pages/           # Representações das páginas
│   │   │   │   ├── DetailedProductPage.java
│   │   │   │   ├── ItemPurchasePage.java
│   │   │   │   ├── ItemSelectionRemovalPage.java
│   │   │   │   ├── LoginPage.java
│   │   │   │   └── PriceSortingPage.java
│   │   │   ├── utils/           # Utilitários para suporte ao projeto
│   │   │   │   ├── BasePage.java
│   │   │   │   ├── DriverFactory.java
│   │   │   │   ├── ScreenshotUtil.java
│   │   │   │   └── TestHooks.java
│   │   └── resources/           # Recursos do projeto
│   ├── test/
│   │   ├── java/
│   │   │   ├── runner/          # Runner para execução dos testes
│   │   │   │   └── TestRunner.java
│   │   │   ├── stepDefinitions/ # Definições dos passos do Cucumber
│   │   │       ├── DetailedProductSteps.java
│   │   │       ├── ItemPurchaseSteps.java
│   │   │       ├── ItemSelectionRemovalSteps.java
│   │   │       ├── LoginSteps.java
│   │   │       └── PriceSortingSteps.java
│   │   └── resources/           # Features e propriedades do Cucumber
│   │       ├── features/
│   │       │   ├── detailedProduct.feature
│   │       │   ├── itemPurchase.feature
│   │       │   ├── itemSelectionRemoval.feature
│   │       │   ├── loginTest.feature
│   │       │   └── priceSortingTest.feature
│   │       └── allure.properties
├── target/                      # Artefatos gerados após a execução
├── .gitignore                   # Arquivos ignorados pelo Git
├── pom.xml                      # Gerenciador de dependências Maven
└── README.md                    # Documentação do projeto
```

## Funcionalidades
- **Login**: Testa a autenticação de usuários.
- **Compra de Itens**: Valida a funcionalidade de compra de produtos.
- **Ordenação de Preços**: Verifica a ordenação de produtos por preço.
- **Remoção de Itens**: Testa a exclusão de itens do carrinho de compras.
- **Detalhamento de Produtos**: Garante que as informações do produto sejam exibidas corretamente.

## Pré-requisitos
- Java JDK 8+
- Maven
- Navegador compatível com WebDriver
- Allure CLI (para visualização dos relatórios)
