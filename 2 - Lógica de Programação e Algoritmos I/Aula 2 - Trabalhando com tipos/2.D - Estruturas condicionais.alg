algoritmo "Estruturas condicionais"

var

nota1, nota2, nota3, media: real

inicio
Escreval("Informe as nota 1: ")
leia(nota1)
Escreval("Informe as nota 2: ")
leia(nota2)
Escreval("Informe as nota 3: ")
leia(nota3)

media <- (nota1 + nota2 + nota3)/3

se media < 7 entao
     Escreval("Você está de recuperação")
senao
     Escreval("Você passou!")

fimalgoritmo
