import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItems;

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItems.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> listaRemover = new ArrayList<>();

        for(Item i : listaItems){
            if(i.getNome().equalsIgnoreCase(nome)){
                listaRemover.add(i);
            }
        }
        listaItems.removeAll(listaRemover);
    }

    public double calcularValorTotal(){
        double total = 0;
        for(Item i : listaItems){
            total += i.getPreco();
        }
        return total;
    }
    public void exibirItens(){
        for(Item i: listaItems){
            System.out.println(i);
        }
    }


}
