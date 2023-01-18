algoritmo "Aula 2.C - Exercícios Função/Procedimento"

var

lado1, lado2, lado3: inteiro

procedimento lerDados()
inicio

      Escreva("Lado 1: ")
      leia(lado1)
      Escreva("Lado 2: ")
      leia(lado2)
      Escreva("Lado 3: ")
      leia(lado3)
      
fimprocedimento

funcao verificarTriangulo(): logico
inicio

      se (lado1 > lado2 + lado3) ou (lado2 > lado1 + lado3) ou (lado3 > lado1 + lado2) entao
         retorne falso
      senao
         retorne verdadeiro
      fimse

fimfuncao


funcao verificarTipoTriangulo(): literal
inicio
       se (lado1 = lado2) E (lado2 = lado3) entao
          retorne "Equilátero"
       senao
          se (lado1 = lado2) OU (lado2 = lado3) OU (lado1 = lado3) entao
             retorne "Isósceles"
          senao
             retorne "Escaleno"
          fimse
       fimse
       
fimfuncao
       


inicio

      lerDados()
      se verificarTriangulo() entao
         escreval(verificarTipoTriangulo())
      senao
         escreval("Não é triangulo!")
      fimse

fimalgoritmo
