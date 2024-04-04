import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args){
        List<String> vetEsportes = new Vector<>();
        int indice = 1;

        //Adiciona esportes no vetor
        vetEsportes.add("Futebol");
        vetEsportes.add("Basquetebol");
        vetEsportes.add("Tênis de Mesa");
        vetEsportes.add("Handebol");
        vetEsportes.add("Rugby");
        vetEsportes.add("Tênis");
        vetEsportes.add("Futsal");
        vetEsportes.add("Vôlei");
        vetEsportes.add("Corrida");

        //Printa na tela o vetor criado
        System.out.println("Vetor Original -> "+ vetEsportes);

        //Altera o valor da posição 2 do vetor
        vetEsportes.set(1, "Ping Pong");
        System.out.println("Alterada segunda posição do vetor de Basquete para Ping Pong -> "+ vetEsportes);

        //Remove o esporte da posição 2
        vetEsportes.remove(1);
        System.out.println("Removida segunda posição do vetor -> "+ vetEsportes);

        //Remove o esporte Handebol do vetor
        vetEsportes.remove("Handebol");
        System.out.println("Removido Handebol do vetor -> "+ vetEsportes);

        //Retorna o primeiro item do vetor
        System.out.println("Primeiro item do vetor: "+ vetEsportes.get(0));

        //Navega nos esportes
        for(String varEsporte: vetEsportes){
            System.out.println(indice + "-" + varEsporte);
            indice++;
        }

    }
}
