import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        /*
        *********************************************************************************************************************************
        ************************************************* Utilizando ArrayList **********************************************************
        *********************************************************************************************************************************
        */
        List <String> nomes = new ArrayList<>();
        String recebeValor;
        int tamanho;
        int posicao;
        boolean verificaExistencia;
        boolean verificaNulidade;

        nomes.add("Zico");
        nomes.add("Carlos");
        nomes.add("Rafael");
        nomes.add("Fábio");
        nomes.add("Rubens");
        nomes.add("Jorge");
        nomes.add("Bruno");
        nomes.add("Ricardo");

        nomes.set(4, "Cavalheiro"); //Troca valor na posição informada

        System.out.println(nomes);

        nomes.remove(1); //Faz a remoção de um valor dando um Inteiro
        nomes.remove("Ricardo"); //Faz a remoção de um valor dando um Objeto

        Collections.sort(nomes); //Classifica por ordem alfabética
        recebeValor = nomes.get(2);
        tamanho = nomes.size();
        verificaExistencia = nomes.contains("Rogério");
        verificaNulidade = nomes.isEmpty();
        posicao = nomes.indexOf("Rafael"); //Retorna posição do valor indicado, se o valor não existir, retorna -1

        System.out.println(nomes);
        System.out.println(recebeValor);
        System.out.println(tamanho);
        System.out.println(verificaExistencia);
        System.out.println(verificaNulidade);
        System.out.println(posicao);

        for(String nomesLista: nomes){
            System.out.println("----> "+ nomesLista);
        }

        Iterator<String> iterator = nomes.iterator();

        System.out.println(iterator.hasNext()); //Informa se há algo mais na lista, aqui deve aparecer "true"

        while (iterator.hasNext()){
            System.out.println("--------->"+ iterator.next());
        }

        System.out.println(iterator.hasNext()); //Informa se há algo mais na lista, aqui deve aparecer "false"

        nomes.clear();
        verificaNulidade = nomes.isEmpty();
        System.out.println(verificaNulidade);

    }

}