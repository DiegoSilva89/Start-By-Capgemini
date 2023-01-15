algoritmo "2.I - Extra"

var

altura, peso, imc: real

inicio

Escreval("Informe sua altura, por favro: ")
leia(altura)
Escreval("Informe seu peso, por gentileza: ")
leia(peso)

imc <- peso / altura^2

se imc < 19 entao
   escreval("Abaixo do peso")
senao
     se imc < 24 entao
        escreval("peso ideal")
     senao
        escreval("Acima do peso")
     fimse
fimse

fimalgoritmo
