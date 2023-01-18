algoritmo "Aula 1.D - Vetores IV"
var

numeros1, numeros2: vetor[1..5] de inteiro
i, opcao: inteiro

inicio

para i de 1 ate 5 faca
     Escreva("1 - Números",i,": ")
     leia(numeros1[i])
fimpara

para i de 1 ate 5 faca
     Escreva("2 - Números",i,": ")
     leia(numeros2[i])
fimpara

enquanto (opcao <= 0) ou (opcao >= 3) faca
     Escreval("1 - Soma")
     Escreval("2 - Subtração")
     leia(opcao)
fimenquanto

se opcao = 1 entao
   para i de 1 ate 5 faca
        escreval(numeros1[i] + numeros2[i])
   fimpara
senao
     se opcao = 2 entao
        para i de 1 ate 5 faca
             escreval(numeros1[i] - numeros2[i])
        fimpara
     fimse
fimse


fimalgoritmo
