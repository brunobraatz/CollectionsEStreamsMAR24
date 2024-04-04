import java.util.Iterator;
import java.util.TreeSet;

public class ExercicioTreeSet {
    public static void main (String[] args){

        //Criado treeSet
        TreeSet<Integer> treeListaNumeros = new TreeSet<>();

        //Passo 1 - Adicionar 5 números
        treeListaNumeros.add(3);
        treeListaNumeros.add(88);
        treeListaNumeros.add(20);
        treeListaNumeros.add(44);
        treeListaNumeros.add(3);

        //Passo 2 - Exibir itens do Set
        System.out.println(treeListaNumeros);

        //Passo 3 - Remover primeiro item do set
        treeListaNumeros.remove(3);
        System.out.println(treeListaNumeros);

        //Passo 4 - Adicionar número 23 no set
        treeListaNumeros.add(23);
        System.out.println(treeListaNumeros);

        //Passo 5 - Verificar tamanho do set
        System.out.println(treeListaNumeros.size());

        //Passo 6 - Verificar se o set está vazio
        System.out.println(treeListaNumeros.isEmpty());

        Iterator<Integer> iterator = treeListaNumeros.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(" ");

        for(Integer numero : treeListaNumeros){
            System.out.println(numero);
        }

    }
}
