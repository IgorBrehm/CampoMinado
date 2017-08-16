import java.util.*;
/**
 * Classe principal
 * @author Igor Sgorla Brehm
 */
public class CampoMinado {

    /**
     * Classe main do programa
     */
    public static void main(String[] args) {
        System.out.println("Bem-vindo, este programa utiliza uma das formas "
        + "possiveis de se resolver o problema do campo de refugiados.");
        System.out.println("O problema consiste de que se esta tentando construir"
        + " um campo de refugiados em um terreno, porem este terreno possui minas"
        + " terrestres enterradas que limitam a area onde o campo pode ser construido. "
        + "O objetivo entao e calcular qual o local onde existe a maior area retangular "
        + "neste terreno para a construcao do campo.");
        System.out.println("");
        System.out.println("");
        int numMinas = 10; //valor de teste
        int tamTerreno = 50; //valor de teste
        Mina[] vetor = new Mina[tamTerreno];
        System.out.println("Para esta iteracao teremos "+numMinas+" minas no terreno");
        System.out.println("E o terreno tem "+tamTerreno+" metros quadrados");
        
        /*
        System.out.println("A maior area retangular encontrada foi de "+area+" metros quadrados");
        System.out.println("Esta area fica entre as coordenadas: "+coordHor+" no eixo horizontal");
        System.out.println("E entre as coordenadas: "+coordVer+" no eixo vertical");
        */
    }
    
    /**
    * Classe que especifica o objeto mina e seus métodos
    * 
    */
    public class Mina {
        public int v,h;
        public Mina (){
            v = -1;
            h = -1;
        }
        public Mina(int ver, int hor){
            v = ver;
            h = hor;
        }
        /**
         * Classe que distribui as minas pelo campo
         * TODO falta garantir que nenhuma mina vai estar no mesmo lugar de outra
         * @param tamTerreno inteiro com o tamanho do terreno
         * @param vetor  vetor contendo todas as minas que estarão no campo
         */
        public void distribuirMinas(int tamTerreno, Mina[] vetor){
            for(int k = 0; k < vetor.length; k++){
                int aux = (int) (Math.random()*tamTerreno);
                int auxb = (int) (Math.random()*tamTerreno);
                vetor[k].h = aux;
                vetor[k].v = auxb;
            }
        }
    }
}

































