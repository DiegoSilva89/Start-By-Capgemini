algoritmo "2.G - Tabela verdade"

var

i, j: inteiro

inicio

i <- 11
j <- 21

     // sim E  nao  = NAO
     // sim E  sim  = SIM
     // nao E  nao  = NAO
     // sim OU sim  = SIM
     // nao OU nao  = NAO
     // sim OU nao  = SIM

se (i = 10) E (j = 20) entao
   Escreval("Fazer algo")
senao
   Escreval("Não fazer nada")
fimse

fimalgoritmo
