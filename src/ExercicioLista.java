/*
*   Exercício:
*   Crie uma lista e execute ass seguintes operações:
*
* 1- Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
* 2- Navegue na lista exibindo cada nome no console
* 3- Substitua o nome Carlos por Roberto
* 4- Retorne o nome da posição 1
* 5- Remova o nome da posição 4
* 6 - Remova o nome João
* 7 - Retorne a quantidade de itens na lista
* 8- Verifique se o nome Juliano existe na lista
* 9- Crie uma nova lista com os nomes: Ismael e Rodrigo
* 10- Adicione todos os itens da nova lista na primeira lista criada.
* 11- Ordene os itens da lista por ordem alfabética.
* 12- Verifique se a lista está vazia.
*
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioLista {
    public static void main (String[] args){

        //Cria Lista
        List<String> listaNomes = new ArrayList<>();

        //Passo 1 - Adicionar 5 nomes na lista
        listaNomes.add("Juliana");
        listaNomes.add("Pedro");
        listaNomes.add("Carlos");
        listaNomes.add("Larissa");
        listaNomes.add("João");

        //Passo 2 - Navegar e exibir nomes da lista
        System.out.println(listaNomes);

        //Passo 3 - Substituir Carlos por Roberto
        listaNomes.set(2, "Roberto");
        System.out.println("Substituido Carlos por Roberto -> "+ listaNomes);

        //Passo 4 - Retornar nome da primeira posição
        System.out.println("Item 1: "+ listaNomes.get(0));

        //Passo 5 - Remover nome da quarta posição
        listaNomes.remove(3);
        System.out.println("Removido 4º nome da lista: "+ listaNomes);

        //Passo 6 - Remover o nome "João" da lista
        listaNomes.remove("João");
        System.out.println("Removido João da lista -> "+ listaNomes);

        //Passo 7 - Retornar quantidade de itens na lista
        int qtdItensLista;
        qtdItensLista = listaNomes.size();
        System.out.println("Qunatidade de itens na lista: "+ qtdItensLista);

        //Passo 8 - Verificar se existe o nome Juliano na lista
        boolean verificaExistencia;
        verificaExistencia = listaNomes.contains("Juliano");
        System.out.println("Existe o nome Juliano na lista? "+ verificaExistencia);

        //Passo 9 - Criar nova lista e incluir Ismael e Rodrigo nela
        List<String> listaDois = new ArrayList<>();
        listaDois.add("Ismael");
        listaDois.add("Rodrigo");
        System.out.println("Lista 2 -> "+ listaDois);

        //Passo 10 - Adicionar itens da lista 2 na primeira lista
        listaNomes.addAll(listaDois);
        System.out.println("Lista 2 incorporada na primeira -> "+ listaNomes);

        //Passo 11 - Ordenar por ordem alfabética
        Collections.sort(listaNomes);
        System.out.println("Lista de nomes ordenada -> "+ listaNomes);

        //Passo 12 - Verificar se lista está vazia
        boolean estaVazia;
        estaVazia = listaNomes.isEmpty();
        System.out.println("A lista de nomes está vazia? "+ estaVazia);


    }
}
