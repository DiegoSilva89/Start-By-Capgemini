algoritmo "Aula 1.F - Matrizes"

var

cinema: vetor[1..10, 1..10] de literal
i, j, fila, poltrona: inteiro
opcao: literal

inicio

para i de 1 ate 10 faca
para j de 1 ate 10 faca
     cinema[i,j] <- "0"
fimpara
fimpara

repita
      Escreval("1 - Resetvar")
      Escreval("2 - Layout do Cinema")
      Escreval("3 - Sair")
      leia(opcao)
      
      escolha opcao
      caso "1"
           Escreva("Fila: ")
           leia(fila)
           Escreva("Poltrona: ")
           leia(poltrona)
           
           se cinema[fila,poltrona] = "0" entao
              cinema[fila,poltrona] <- "X"
           senao
              Escreva("Poltrona já ocupada")
           fimse
      caso "2"
           para i de 1 ate 10 faca
                para j de 1 ate 10 faca
                     Escreva(" ",cinema[i,j]," ")
                fimpara
                     Escreval("")
           fimpara
      fimescolha
      
ate opcao = "3"

fimalgoritmo
