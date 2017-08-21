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