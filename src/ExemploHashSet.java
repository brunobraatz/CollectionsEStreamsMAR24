/*
* HashSet | LinkedHashSet | TreeSet
*
* ---> HashSet <---
*    Utilizado quando não necessita de ordenação
*    Não é ordenado e permite valores repetidos
*    Por não repetir e não ser ordenado, é mais performática
*
* ---> LinkedHashSet <---
*    Utilizada quando necessita de ordenação
*    Mantém a ordem de inserção dos elementos mas não permite repetição de valores
*    É a implementação mais lenta devido à necessidade de manter ordenado
*
* ---> TreeSet <---
*    Utilizada quando é necessária alterar a ordem através do uso de comparators
*    Mantém a ordem e pode ser reordenado
*    É performático para leitura, para modificação tem necessidade de reordenar,
*       sendo mais lento que o LinkedHashSet
* */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class ExemploHashSet {
    public static void main (String[] args){

        Set<Double> notasAlunos = new HashSet<>();

        // Adiciona as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);
        //Não mantém a ordem

        System.out.println(notasAlunos);

        //Remove a nota do set
        notasAlunos.remove(3.8);
        System.out.println(notasAlunos);

        //Retorna a quantidade de itens do set
        System.out.println(notasAlunos.size());

        //Navega em todos os itens do iterator
        Iterator<Double> iterator = notasAlunos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("  ");

        for (Double nota : notasAlunos){
            System.out.println(nota);
        }

        System.out.println(notasAlunos.isEmpty());

        notasAlunos.clear();

        //Retorna se o ser está vazio ou não
        System.out.println(notasAlunos.isEmpty());
    }
}
