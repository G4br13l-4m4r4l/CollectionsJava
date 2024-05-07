package Map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavras;


    public Dicionario(){
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        palavras.put(palavra, definicao);
    }

    public boolean removerPalavra(String palavra){

        if(!palavras.isEmpty()){
            palavras.remove(palavra);
            return true;
        }else{
            return false;
        }
    }

    public void exibirPalavras(){
        if(!palavras.isEmpty()){
            System.out.println(palavras);
        }else{
            System.out.println("Nenhuma palavra se encontra no dicionario!");
        }
    }
    public String pesquisarPorPalavra(String palavra){
        String definicao = palavras.get(palavra);

        if( definicao != null){
            return definicao;
        }else {
            return "Não foi possivel encontrar a definicao!";
        }
    }
}
