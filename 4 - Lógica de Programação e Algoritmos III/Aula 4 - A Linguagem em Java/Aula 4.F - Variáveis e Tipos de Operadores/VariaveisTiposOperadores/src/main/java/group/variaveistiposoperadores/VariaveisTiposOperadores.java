/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package group.variaveistiposoperadores;

/**
 *
 * @author Diego Silva
 */
public class VariaveisTiposOperadores {

    public static void main(String[] args) {
        
         int idade = 33;
        float cotacaoDolar = 5.0f;
        double cotacaoEuro = 6.0d;
        char genero = 'M';
        byte placar = 0; 
        boolean estaCadastrado = false;
        
        String nome = "Esse é um texto de uma variável String";
        
        
        /*  
            Tipos, tamanhos e valores default das variáveis primitivas:
        
            Tipo 	Tamanho (bits) 	Faixa                                                           Valor Padrão
            byte 	8               -128 a 127                                                      0
            short 	16              -32.768 a 32.767                                                0
            int 	32              -231 a 231 – 1                                                  0
            long 	64              -263 a 263 -1                                                   0L
            float 	32              IEEE 754 ±1,40129846432481707e-45 a 3,40282346638528860e+38 	0.0f
            double 	64              IEEE 754 ±4,94065645841246544e-324 a 1,79769313486231570e+308   0.0d
        */
        
        //OPERADORES
        //======================================================================
        /*
            Java conta com 5 operadores aritméticos:
        
            Soma            (+)
            Subtração       (-)
            Multiplicação   (*)
            Divisão         (/)
            Resto           (%)
        */
        
        
        int pontosEquipeA = 10;
        int pontosEquipeB = 20;
        
        //Exemplo de utilização do operador da ADIÇÃO
        int totalSoma = pontosEquipeA + pontosEquipeB;
        //Exemplo de utilização do operador da SUBTRAÇÃO
        int totalSubtracao = pontosEquipeA - pontosEquipeB;
        //Exemplo de utilização do operador da MULTIPLICAÇÃO
        int totalMultiplicacao = pontosEquipeA * pontosEquipeB;
        //Exemplo de utilização do operador da DIVISÃO
        int totalDivisao = pontosEquipeA / pontosEquipeB;
        //Exemplo de utilização do operador de RESTO  
        int totalResto = pontosEquipeA % pontosEquipeB;
        
        System.out.println(idade);
        System.out.println(cotacaoDolar);
        System.out.println(cotacaoEuro);
        System.out.println(genero);
        System.out.println(placar);
        System.out.println(estaCadastrado);
        System.out.println(nome);
        System.out.println(totalSoma);
        System.out.println(totalSubtracao);
        System.out.println(totalMultiplicacao);
        System.out.println(totalDivisao);
        System.out.println(totalResto);

        //======================================================================
    }
}
