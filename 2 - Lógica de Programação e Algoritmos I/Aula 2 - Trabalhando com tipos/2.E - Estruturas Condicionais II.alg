algoritmo "2.E - Estruturas Condicionais II"

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

se media >= 7 entao
     Escreval("Você passou com a mádia: ", media)
senao
     se media < 5 entao
        Escreval("Você reprovou com a média: ", media)
     senao
        Escreval("Você está de recuparação com a média: ", media)
     fimse
fimse

fimalgoritmo
