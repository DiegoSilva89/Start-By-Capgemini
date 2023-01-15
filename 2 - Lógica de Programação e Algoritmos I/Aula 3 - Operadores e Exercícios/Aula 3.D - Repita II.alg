algoritmo "Aula 3.D - Repita II"

var

senha, resposta : literal
i : inteiro

inicio

i <- 0
Escreval("Informe a senha")
leia(senha)

limpatela

repita
      Escreval("Digite a senha para sair do programa")
      leia(resposta)
      
      i <- i + 1

ate (resposta = senha) OU (i = 5)
      

fimalgoritmo
