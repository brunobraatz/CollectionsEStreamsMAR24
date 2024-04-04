import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main (String[] args){

        /*
        * Conceito de filas (Queue)
        * Métodos da Queue:
        *   - Poll
        *       Retorna o primeiro item da fila e o remove da fila
        *   - Peek
        *       Retorna o primeiro item da fila, mas o mantém na fila;
        *       Caso a fila esteja vazia, não retornará erro nem exceção, irá retornar "null e []"
        *   - Element
        *       Retorna uma exceção caso a fila esteja vazia
        * */

        Queue<String> filaBanco = new LinkedList<>();
        Queue<String> filaVazia = new LinkedList<>();
        filaBanco.add("Pâmela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll(); //Variável recebe o primeiro item da fila e o remove

        System.out.println(clienteASerAtendido); //Mostra primeiro item da fila
        System.out.println(filaBanco); //Mostra fila após remoção do primeiro

        String primeiroCliente = filaBanco.peek(); //Variável recebe o primeiro da fila, mas o mantém na /fila

        System.out.println(primeiroCliente); //Mostra o primeiro da fila
        System.out.println(filaBanco); //Mostra a fila ainda com o primeiro sem ser removido

        //filaBanco.clear(); Limpa a fila apenas para testar exceção ".element()"

        //Percorre fila e mostra itens na ordem
        for(String clientesFila : filaBanco){
            System.out.println(clientesFila);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()){
            System.out.println("----> "+ iteratorFilaBanco.next());
        }

        System.out.println("Quantidade de itens na fila: "+ filaBanco.size());
        System.out.println("A fila está vazia? "+ filaBanco.isEmpty());


        String primeiroClienteOuErro = filaVazia.element(); //Recebe o primeiro da fila ou retorna
        //uma exceção caso a fila esteja vazia;

        System.out.println(primeiroClienteOuErro); //Mostra o primeiro da fila ou a exceção do erro
        System.out.println(filaBanco); //Mostra itens da fila

    }
}
