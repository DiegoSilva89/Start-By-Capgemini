algoritmo "Aula 3.B - Enquanto II"

var

i : inteiro

inicio

i <- 0
escreval("Início")

enquanto i <= 100 faca
         escreval(i)
         i <- i + 1
         
         se i = 50 entao
            escreval("O i vale 50")
            interrompa //comando que procura o enquanto para interrompe-lo, mesmo antes da sua condição ser alcançada
         fimse
fimenquanto

escreval("Fim")

fimalgoritmo
