algoritmo "Aula 1.E - Vetores V"

//vetor que organiza números digitados em ordem crescente

var

numeros: vetor[1..5] de inteiro
i, j, aux: inteiro

inicio

para i de 1 ate 5 faca
     Escreva("Numero",i,": ")
     leia(numeros[i])
fimpara

para i de 1 ate 5 faca
     para j de 1 ate 5 faca
          se numeros[j] > numeros[i] entao
             aux <- numeros[i]
             numeros[i] <- numeros[j]
             numeros[j] <- aux
          fimse
     fimpara
fimpara

fimalgoritmo
