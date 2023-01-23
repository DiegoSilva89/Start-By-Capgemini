Algoritmo "Aula 4.B - Orientação Objetos II"

tipo
cadastroCliente = registro
   nome, rg, idade: caractere
fimregistro

Var

clientes: vetor[1..3] de cadastroCliente
opcao, rgPesquisa: caractere
i : inteiro

Inicio

repita
   Escreval("1 - Cadastrar")
   Escreval("2 - Pesquisar")
   leia(opcao)

   se opcao = "1" entao
      para i de 1 ate 3 faca
         se clientes[i].nome = "" entao
            Escreval("Por favor informe o seu nome: ")
            leia(Clientes[i].nome)
            Escreval("Por favor informe o seu RG: ")
            leia(Clientes[i].rg)
            Escreval("Por favor informe a sua idade: ")
            leia(Clientes[i].idade)
            interrompa
            limpatela
         fimse
      fimpara
   senao
      se opcao = "2" entao
         Escreval("Digite o RG: ")
         leia(rgPesquisa)
         para i de 1 ate 3 faca
            se clientes[i].rg = rgPesquisa entao
               Escreval(clientes[i].nome, " Encontrado")
               interrompa
            fimse
         fimpara
      fimse
   fimse
ate opcao = "3"

Fimalgoritmo