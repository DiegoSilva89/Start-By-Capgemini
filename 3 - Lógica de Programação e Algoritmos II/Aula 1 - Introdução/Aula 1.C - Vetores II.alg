algoritmo "Aula 1.C - Vetores II"

var

nomes: vetor[1..5] de literal
i: inteiro
pesquisa: literal
encontrado: logico

inicio

para i de 1 ate 5 faca
     Escreval("informe o nome a cadastrar")
     leia(nomes[i])
fimpara
limpatela

Escreval("Informe um nome a pesquisar")
leia (pesquisa)

para i de 1 ate 5 faca
     se nomes[i] = pesquisa entao
        encontrado <- verdadeiro
     fimse
fimpara

se encontrado = verdadeiro entao
   EscrevaL(Encontrado)
senao
   Escreval("Não encontrado")
fimse

fimalgoritmo
