package group.estruturaescolha;

/*
 * @author Diego Silva
 */
public class EstruturaEscolha {

    public static void main(String[] args) {
        
        //======================================================================
        // ESTRUTURA SWITCH
        //======================================================================
        
        /* 
            A estrutura de seleção switch testa o valor contido em uma variável 
            e o compara com os valores fornecidos em cada caso, representados pela
            palavra reservada case. Podemos ter quantos casos forem necessários
            na estrutura, e quando um dos valores corresponder ao da variável de
            teste, todo o código que está dentro daquele bloco do caso será 
            executado.
        
            A váriavel que será utilizada no controle da estrutura pode ser dos
            tipos primitivos como: int, char, byte e também do tipo String (
            não são permitidos tipos como float, double pois estes trabalham
            com números com casas decimais)        
         */
        
        int codigoProduto = 1;
        
        switch (codigoProduto) {
            
            case 1:
                System.out.println("Produto 1");
                break;
            case 2:
                System.out.println("Produto 2");
                break;
            case 3:
                System.out.println("Produto 3");
                break;

            default:

        }
    }
}
