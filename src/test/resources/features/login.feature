#language:pt

  Funcionalidade: Login

    Cenario: Realizar login válido
      Dado que esteja na página de login
      Quando for realizado login com os seguintes dados
        |email| teste@chronosacademy.com.br|
        |senha| 123456                     |
      Então valido que exibe a tela produtos