import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExercicioLinkedHashSet {
    public static void main (String[] args){

        //Criado LinkedHashSet
        LinkedHashSet<Integer> linkedListaNumeros = new LinkedHashSet<>();

        //Passo 1 - Adicionar 5 números
        linkedListaNumeros.add(88);
        linkedListaNumeros.add(3);
        linkedListaNumeros.add(44);
        linkedListaNumeros.add(20);
        linkedListaNumeros.add(3);

        //Passo 2 - Exibir itens do Set
        System.out.println(linkedListaNumeros);

        //Passo 3 - Remover primeiro item do set
        linkedListaNumeros.remove(3);
        System.out.println(linkedListaNumeros);

        //Passo 4 - Adicionar número 23 no set
        linkedListaNumeros.add(23);
        System.out.println(linkedListaNumeros);

        //Passo 5 - Verificar tamanho do set
        System.out.println(linkedListaNumeros.size());

        //Passo 6 - Verificar se o set está vazio
        System.out.println(linkedListaNumeros.isEmpty());

        Iterator<Integer> iterator = linkedListaNumeros.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(" ");

        for(Integer numero : linkedListaNumeros){
            System.out.println(numero);
        }

    }
}
