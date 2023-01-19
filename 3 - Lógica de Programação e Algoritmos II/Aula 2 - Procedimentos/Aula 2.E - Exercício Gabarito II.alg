algoritmo "Aula 2.E - Exercício Gabarito"

var

   gabarito: vetor[1..5] de caractere
   total: inteiro
   tamanho_maiornome: inteiro
   aluno_n: inteiro
   nome: vetor[1..35] de caractere
   questao: inteiro
   Resposta: vetor[1..35, 1..5] de caractere
   Acerto: logico
   nota: vetor[1..35] de real
   SomaNotas, MediaTurma: real

procedimento CadastrarGabarito(var GAB: caractere)

inicio

   EscrevaL("----------------------------------")
   EscrevaL("  Passo 1 - Cadastro de Gabarito  ")
   EscrevaL("----------------------------------")

   Repita
      EscrevaL("Digite a resposta da ", questao:1 , "º questão: ")
      Leia(GAB)

      Se (compr(GAB) = 1) entao
         Se nao ((maiusc(GAB)>= "A") e (maiusc(GAB)<="E")) entao
            EscrevaL("Opção inválida!")
         Fimse
      Senao
         EscrevaL("Opção inválida!")
      Fimse
   Ate (maiusc(GAB)>="A") e (maiusc(GAB)<="E") e (compr(GAB)=1)
   LimpaTela

fimprocedimento

procedimento CadastrarQuantidadeAlunos(var total: inteiro)

var

   continuar : logico

inicio

   Repita
      continuar := falso
      Escreva("Digite a quantidade de alunos: ")
      Leia(total)
      Se (total > 35) ou (total < 1) entao
         EscrevaL("Quantidade de alunos inválida. [Mín: 1, Máx: 35]")
      Senao
         continuar := verdadeiro
      Fimse
   Ate continuar
   Limpatela

fimprocedimento

procedimento VerificarSeNome_eh_o_maior(nomealuno: caractere; var largura_maior_nome:inteiro )

inicio

   Se (compr(nomealuno) > largura_maior_nome) entao
      largura_maior_nome <- compr(nomealuno)
   Fimse

fimprocedimento

procedimento CadastraNomes(var nome: caractere)

var

   continuar, nomevalido : logico

Inicio

   EscrevaL("-------------------------------")
   EscrevaL("  Passo 2 - Cadastro de Nomes  ")
   EscrevaL("-------------------------------")
   Repita
      EscrevaL(" Aluno ", aluno_n:1)
      Escreva("Nome: ")
      nomevalido <- falso
      Leia(nome)
      Se ApenasEspacos_ou_EspacoVazio(nome) = verdadeiro entao
         EscrevaL("Entrada inválida! Nome em branco.")
      Senao
         Se (Conferir_setem_ApenasConsoante_e_Espaco(nome) = verdadeiro) entao
            nomevalido <- verdadeiro
            Se (Conferir_setem_EspacoInicio_ou_EspacoFim(nome) = verdadeiro) entao
               nome <- Retirar_EspacoInicio_e_ou_EspacoFim(nome)
            Fimse
            Se (Conferir_DoisEspacosConsecutivos(nome) = verdadeiro) entao
               nome <- Retirar_EspacoConsecutivo(nome)
            Fimse
         Senao
            EscrevaL("Nome inválido. Só são permitidos letras e espaços.")
         Fimse
      Fimse
   Ate nomevalido = verdadeiro
   LimpaTela

fimprocedimento

funcao ApenasEspacos_ou_EspacoVazio(nomealuno: caractere): logico

var

   i: inteiro
   apenas_espaco: logico
   Q_espacos: inteiro

inicio

   Q_espacos <- 0
   Para i de 1 ate compr(nomealuno) faca
      Se (copia(nomealuno,i,1) = " ") entao
         Q_espacos <- Q_espacos + 1
      Fimse
   FimPara
   Se (Q_espacos = compr(nomealuno)) entao
      apenas_espaco <- verdadeiro
   Fimse
   Retorne apenas_espaco

fimfuncao

funcao Conferir_setem_ApenasConsoante_e_Espaco(nomealuno: caractere): logico

var

   caracter_valido: inteiro
   i: inteiro
   nomevalido: logico

inicio

   nomevalido <- falso
   Para i <- 1 ate compr(nomealuno) faca
      //Vai verificar quantos caracteres são validos:
      Se (copia(maiusc(nomealuno),i,1) >= "A") e (copia(maiusc(nomealuno),i,1) <= "Z") entao
         caracter_valido <- caracter_valido + 1
      Fimse
      Se (copia(nomealuno,i,1) = " ") entao
         caracter_valido <- caracter_valido + 1
      Fimse
   Fimpara
   Se (caracter_valido = compr(nomealuno)) entao
      nomevalido <- verdadeiro
   Fimse
   Retorne nomevalido

fimfuncao

funcao Conferir_setem_EspacoInicio_ou_EspacoFim(nomealuno:caractere): logico

var

   precisa_retirar_espaco: logico

inicio

   precisa_retirar_espaco <- falso
   Se (Copia(nomealuno,1,1) = " ") entao //Verifica se tem espaço no início
      precisa_retirar_espaco <- verdadeiro
   Senao
      Se (Copia(nomealuno,compr(nomealuno),1) = " ") entao //Verifica se tem espaço
                                                          //no fim
         precisa_retirar_espaco <- verdadeiro
      Fimse
   Fimse
   Retorne precisa_retirar_espaco

fimfuncao

funcao Retirar_EspacoInicio_e_ou_EspacoFim(nomealuno:caractere): caractere

var

   nomecorrigido: caractere
   i: inteiro
   posicao_primeira_letra, posicao_ultima_letra: inteiro

inicio

   i <- 1
   posicao_primeira_letra <- 0
   posicao_ultima_letra <- 0
   Repita
      //Primeiro vai procurar onde está a primeira letra da direita para
      //esquerda.
      Se (copia(nomealuno,i,1) = " ") então  //Se a posição estiver vazia..
         i<-i+1      //...Vai procurar na próxima posição à direita
      Senao
          //Quando encontrar a primeira letra:
          posicao_primeira_letra <- i
      Fimse
   Ate (i> compr(nomealuno)) ou (posicao_primeira_letra <> 0)

   i<-compr(nomealuno)
   Repita
      //Por último vai procurar onde está a última letra, verificando
      //da esquerda para direita:
      Se (copia(nomealuno,i,1) = " ") então
         i<-i-1
      Senao
         posicao_ultima_letra <- i
      Fimse
   Ate (i<1) ou (posicao_ultima_letra <> 0)

   //Corrigindo nome:
   nomecorrigido <- copia(nomealuno, posicao_primeira_letra, posicao_ultima_letra)
   Retorne nomecorrigido

fimfuncao

funcao Conferir_DoisEspacosConsecutivos(nomealuno: caractere): logico

var

   i: inteiro
   precisa_tirar1espaco : logico

inicio

   i <- 1
   Repita
      Se Copia(nomealuno,i,1) = " " entao
         Se Copia(nomealuno,i+1,1) = " " então
            precisa_tirar1espaco <- verdadeiro
         Fimse
      Fimse
      i <- i + 1
   Ate (i>compr(nomealuno)) ou (precisa_tirar1espaco = verdadeiro)
   Retorne precisa_tirar1espaco

fimfuncao

funcao Retirar_EspacoConsecutivo(nomealuno:caractere):caractere

var

   nomecorrigido: caractere
   i: inteiro

inicio

   nomecorrigido <- ""
   i<-1
   Repita
      Se copia(nomealuno,i,1) = " " então
         Se (Copia(nomecorrigido, compr(nomecorrigido),1) <> "") e (Copia(nomecorrigido, compr(nomecorrigido),1) <> " ") então
            nomecorrigido <- nomecorrigido + copia(nomealuno,i,1)
         Fimse
      Senao
         nomecorrigido <- nomecorrigido + copia(nomealuno,i,1)
      Fimse
      i <- i + 1
   Ate i>compr(nomealuno)
   Retorne nomecorrigido

fimfuncao

procedimento RecebeResposta(var R: caractere)

Inicio

   EscrevaL("-----------------------------------")
   EscrevaL("  Passo 3 - Cadastro de Respostas  ")
   EscrevaL("-----------------------------------")

   Repita
      EscrevaL(" Aluno nº ", aluno_n:1, ": ", nome[aluno_n])
      Escreva (" Questão", questao, ": ")
      Leia(R)
      Se nao ((maiusc(R)>="A") e (maiusc(R)<= "E")) entao
         EscrevaL("Opção inválida! O gabarito vai de A até E.")
      Fimse
   Ate (maiusc(R)>="A") e (maiusc(R)<="E")
   LimpaTela

fimprocedimento

funcao ComparaResposta(RESP :caractere; GAB: caractere): logico

var

   AC: logico

inicio

   AC <- falso
   Se (maiusc(RESP) = maiusc(GAB)) entao
      AC <- verdadeiro
   Fimse
   Retorne AC

fimfuncao

procedimento AtribuirNota(var notaAluno: inteiro; AC: logico)

inicio

   Se (AC = verdadeiro) entao
      notaAluno <- notaAluno + 2
   FimSe

fimprocedimento

procedimento SomarNotaDosAlunos()

inicio

   Para aluno_n de 1 ate total faca
      SomaNotas := SomaNotas + nota[aluno_n]
   FimPara

fimprocedimento

procedimento FazerMediaDaTurma()

inicio

   MediaTurma := SomaNotas/total

fimprocedimento

procedimento MostraNotasDeCadaAluno()

inicio

   EscrevaL("----------------------")
   EscrevaL("     Notas Finais     ")
   EscrevaL("----------------------")
   Para aluno_n de 1 ate total faca
      EscrevaL("Nome: ", nome[aluno_n]:tamanho_maiornome+2, Nota[aluno_n]:3:2)
   FimPara

fimprocedimento

procedimento MostraMediaDaTurma()

inicio

   EscrevaL("------------------------")
   EscrevaL("  Média da turma: ", MediaTurma:3:2)
   EscrevaL("------------------------")

fimprocedimento

inicio

   //Tela 1:
   Para questao de 1 ate 5 faca
      CadastrarGabarito(gabarito[questao])
   Fimpara
   //Tela 2:
   CadastrarQuantidadeAlunos(total)
   //Tela 3:
   tamanho_maiornome <- 10 //Para alinhar as notas no final. Pelo menos vai ter 10 espaços.
   Para aluno_n de 1 ate total faca
      CadastraNomes(nome[aluno_n])
      VerificarSeNome_eh_o_maior(nome[aluno_n], tamanho_maiornome)
         //Vai ser utilizado para alinhar as notas no final
   Fimpara
   //Tela 4:
   Para aluno_n de 1 ate total faca
      Para questao de 1 ate 5 faca
         RecebeResposta(resposta[aluno_n, questao])
         Acerto <- ComparaResposta(resposta[aluno_n, questao], gabarito[questao])
         AtribuirNota(nota[aluno_n], Acerto)
     	     //Se Acerto for verdadeiro o aluno_n recebe dois pontos
      Fimpara
   FimPara
   SomarNotaDosAlunos()
   FazerMediaDaTurma()
   LimpaTela
   //TELA 5:
   MostraNotasDeCadaAluno()
   MostraMediaDaTurma()

fimalgoritmo
