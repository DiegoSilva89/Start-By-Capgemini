algoritmo "2.H - Exercício - Tabela Verdade II"

var

lado1, lado2, lado3: real

inicio

Escreva("Lado 1: ")
Leia(lado1)
Escreva("Lado 2: ")
Leia(lado2)
Escreva("Lado 3: ")
Leia(lado3)

se (lado1 > lado2 + lado3) OU (lado2 > lado1 + lado3) OU (lado3 > lado1 + lado2) entao
     Escreval("Não é triângulo")
senao
     se (lado1 = lado2) E (lado2 = lado3) entao
        Escreval("Equilátero")
     senao
          se (lado1 = lado2) OU (lado2 = lado3) OU (lado1 = lado3) entao
             Escreval("Isóceles")
          senao
             Escreval("Escaleno")
          fimse
     fimse
fimse

fimalgoritmo
