/*
 *  Exercício Set
 *  Crie um Set e execute as seguintes operações:
 *
 * 1- Adicione 5 números inteiros: 3, 88, 20, 44, 3
 * 2- Navegue no Set exibindo cada número no console
 * 3- Remova o primeiro item do Set
 * 4- Adicione um novo número no Set: 23
 * 5- Verifique o tamanho do Set
 * 6- Verifique se o Set está vazio
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExercicioSet {
    public static void main (String[] args){

        //Criado Set
        Set<Integer> setListaNumeros = new HashSet<>();

        //Passo 1 - Adicionar 5 números
        setListaNumeros.add(3);
        setListaNumeros.add(20);
        setListaNumeros.add(44);
        setListaNumeros.add(88);
        setListaNumeros.add(3);

        //Passo 2 - Exibir itens do Set
        System.out.println(setListaNumeros);

        //Passo 3 - Remover primeiro item do set
        setListaNumeros.remove(3);
        System.out.println(setListaNumeros);

        //Passo 4 - Adicionar número 23 no set
        setListaNumeros.add(23);
        System.out.println(setListaNumeros);

        //Passo 5 - Verificar tamanho do set
        System.out.println(setListaNumeros.size());

        //Passo 6 - Verificar se o set está vazio
        System.out.println(setListaNumeros.isEmpty());

        Iterator<Integer> iterator = setListaNumeros.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(" ");

        for(Integer numero : setListaNumeros){
            System.out.println(numero);
        }

    }
}
