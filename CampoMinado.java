import java.util.*;
/**
 * Programa que resolve o problema do campo minado
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
        Scanner in = new Scanner(System.in);
        //int tamTerrenov = in.next();
        //int tamTerrenoh = in.next();
        //int numMinas = in.next();
        int numMinas = 10; //valor de teste
        int tamTerrenov = 10; //valor de teste
        int tamTerrenoh = 10;//valor de teste
        if(tamTerrenov > tamTerrenoh){
            Mina[] vetor = new Mina[tamTerrenov];
        }
        else{
            Mina[] vetor = new Mina[tamTerrenoh];
        }
        //vetor.distribuirMinas(tamTerreno, vetor);
        //PARA TESTE APENAS:
        //vetor.printMinas();
        System.out.println("Para esta iteracao teremos "+numMinas+" minas no terreno");
        System.out.println("O terreno tem "+tamTerrenoh+" metros na horizontal");
        System.out.println("E "+tamTerrenov+" metros na vertical");
        
        /*
        System.out.println("A maior area retangular encontrada foi de "+area+" metros quadrados");
        System.out.println("Esta area fica entre as coordenadas: "+coordHormin+", "+coordHormax+" no eixo horizontal");
        System.out.println("E entre as coordenadas: "+coordVermin+", "+coordVermax+" no eixo vertical");
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
         * @param tamTerreno inteiro com o tamanho do terreno
         * @param vetor  vetor contendo todas as minas que estarão no campo
         */
        public void distribuirMinas(int tamTerrenoh, int tamTerrenov, Mina[] vetor){
            for(int k = 0; k < vetor.length; k++){
                int aux = (int) (Math.random()*tamTerrenoh);
                int auxb = (int) (Math.random()*tamTerrenov);
                //int aux = in.next();
                //int auxb = in.next();
                vetor[k].h = aux;
                vetor[k].v = auxb;
            }
        }
        /**
         * Método apenas para teste inicial, printa o vetor de minas com as suas  coordenadas
         * @param vetor vetor contendo todas as minas que estarão no campo
         */
        public void printMinas(Mina[] vetor){
            for(int k = 0; k < vetor.length; k++){
                System.out.println("Mina numero: "+k);
                System.out.println("Posicao hor: "+vetor[k].h+", Posicao ver: "+vetor[k].v);
            }
        }
    }
}

































