import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args){

        LinkedHashSet<Integer> seqNumerica = new LinkedHashSet<>();

        //Adiciona os números no set
        seqNumerica.add(1);
        seqNumerica.add(16);
        seqNumerica.add(2);
        seqNumerica.add(8);
        seqNumerica.add(4);
        seqNumerica.add(32);
        //Mantém a ordem como foram adicionados, mas não permite repetição de valores

        System.out.println(seqNumerica);

        //Remove o número do set
        seqNumerica.remove(4);
        System.out.println(seqNumerica);

        //Retorna a quantidade de itens no set
        System.out.println(seqNumerica.size());

        System.out.println(" ");
        //Navega em todos os itens do iterator
        Iterator<Integer> iterator = seqNumerica.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(" ");

        for (Integer numero : seqNumerica){
            System.out.println(numero);
        }

        //Retorna se o set está vazio ou não
        System.out.println(seqNumerica.isEmpty());
    }
}
