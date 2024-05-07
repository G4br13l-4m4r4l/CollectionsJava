package Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidade(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadePorCodigoConvite(int codigoConvite){
        for(Convidado c:  convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoSet.remove(c);
                break;
            }
        }
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }
}
