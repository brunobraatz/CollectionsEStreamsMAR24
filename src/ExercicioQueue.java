/*
*   Exercício Queue
*   Crie uma fila de nomes e execute as seguintes operações:
*
* 1- Adicione 5 nomes: Juliana, Pedro, Carlos, |Larissa e João
* 2- Navegue na fila exibindo cada nome no console
* 3- Retorne o primeiro item da fila, sem removê-lo
* 4- Retonre o primeiro item da fila, removendo o mesmo
* 5- Adicione um novo nome: Daniel e verifique a posição que o mesmo assumiu na fila
* 6- Retorne o tamanho da fila
* 7- Verifique se a fila está vazia
* 8- Verifique se o nome Carlos está na fila
* */

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {
    public static void main (String[] args){

        //Criada uma fila com nomes
        Queue<String> filaNomes = new LinkedList<>();

        //Passo 1 - Adicionar nomes na fila
        filaNomes.add("Juliana");
        filaNomes.add("Pedro");
        filaNomes.add("Carlos");
        filaNomes.add("Larissa");
        filaNomes.add("João");

        //Passo 2 - Navegue e exiba itens da fila
        System.out.println("Itens da fila: "+ filaNomes);
        for(String itens : filaNomes){
            System.out.println(itens);
        }

        //Passo 3 - Retornar primeiro item da fila
        System.out.println("Primeiro da fila: "+ filaNomes.peek());

        //Passo 4 - Retorna o primeiro da fila e removê-lo
        System.out.println("Primeiro da fila e já retirado: "+ filaNomes.poll());
        System.out.println("Verificando se o primeiro da fila realmente saiu -> "+ filaNomes);

        //Passo 5 - Adiciona um novo nome na fila
        filaNomes.add("Daniel");
        System.out.println("Adicionado Daniel na fila -> "+ filaNomes);

        //Passo 6 -Retornar tamanho da fila
        System.out.println("Quantidade de itens na fila: "+ filaNomes.size());

        //Passo 7 - Verificar se a fila está vazia
        System.out.println("Fila está vazia? "+ filaNomes.isEmpty());

        //Passo 8 - Verificar se Carlos consta na lista

        //Utilizando variável para armazenar valor boolean
        boolean verificaExistencia;
        verificaExistencia = filaNomes.contains("Carlos");
        System.out.println("O nome Carlos consta na lista? "+ verificaExistencia);

        //Sem utilizar variável
        System.out.println("A fila contém o nome Bruno? "+ filaNomes.contains("Bruno"));

        //CONTINUAÇÃO PASSO 7, utilizando element()

        filaNomes.clear();
        System.out.println("A fila está vazia? "+ filaNomes.element());

    }
}
