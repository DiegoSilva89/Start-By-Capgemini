algoritmo "Aula 3.C - Enquanto III"

var

maisNovo, maisVelho, qtdEntrevistados, idadeInformada : Inteiro
porcentagemMenorIdade, mediaIdade, qtdMenorIdade, somaIdade : real

inicio

maisNovo <- 999
maisVelho <- 0
qtdEntrevistados <- 0
qtdMenorIdade <- 0

enquanto qtdEntrevistados < 5 faca
         escreval("Favor, informe sua idade")
         leia(idadeInformada)
         
         se idadeInformada >= maisVelho entao
            maisVelho <- idadeInformada
         fimse
         se idadeInformada <= maisNovo entao
             maisNovo <- idadeInformada
         fimse
         se idadeInformada < 18 entao
            qtdMenorIdade <- qtdMenorIdade + 1
         fimse

         somaIdade <- somaidade + idadeInformada
         qtdEntrevistados <- qtdEntrevistados + 1
fimenquanto

escreval("Mais novo: ", maisNovo)
escreval("Mais velho: ", maisVelho)
porcentagemMenorIdade <- (qtdMenorIdade / 5) * 100
escreval("Porcentagem menor idade: ", porcentagemMenorIdade, "%")
mediaIdade <- (somaIdade / 5)
escreval("Média de idade: ", mediaIdade)

fimalgoritmo
