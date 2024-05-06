import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List <Integer> numerosInteirosLista = new ArrayList<>(); 

     public void adicionarNumero(int numero){
        numerosInteirosLista.add(numero);
    }

    public int calcularSoma(){
        int total = 0;
        if(!numerosInteirosLista.isEmpty()){
            for(int n: numerosInteirosLista){
                total+=n;
            }
        }
        return calcularSoma();
    }

    public void encontrarMenorNumero(){
        
    }
    public void encontrarMaiorNumero(){

    }
    public void exibirNumeros(){
        if(!numerosInteirosLista.isEmpty()){
            for(int n: numerosInteirosLista){
                System.out.println(n);
            }
        }
    }
}
