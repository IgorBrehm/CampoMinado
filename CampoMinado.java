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
}

































