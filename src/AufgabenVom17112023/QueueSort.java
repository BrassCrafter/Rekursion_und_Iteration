package AufgabenVom17112023;

public class QueueSort {
    public static void main(String[] args) {
        Queue<String> qA = new Queue<String>();
        System.out.println(qA.length());
        qA.enqueue("h");
        qA.enqueue("1");
        qA.enqueue("y");
        qA.enqueue("u");
        qA.enqueue("l");
        qA.enqueue("m");
        qA.enqueue("a");
        qA.enqueue("o");
        qA.enqueue("s");
        qA.enqueue("g");
        qA.enqueue("a");
        qA.enqueue("OOO");
        qA.enqueue("a");
        qA.enqueue("a");
        qA.enqueue("A");
        qA.enqueue("a");
        qA.enqueue("a");
        System.out.println(qA.length());
        sort(qA);
        betterToString(qA,  qA.length());
        System.out.print("\n");
        betterToString(qA,  qA.length());

    }
    public static void sort(Queue<String> usQ){
        quickSort(usQ);
    }
    private static void quickSort(Queue<String> usQ){

        if(usQ.isEmpty()) return;
        String pivot = usQ.front();
        //Merken pivot wird hier aus der Queue gelöscht
        usQ.dequeue();

        Queue<String> aQ = new Queue<String>();
        Queue<String> equalQ = new Queue<String>();
        Queue<String> bfQ = new Queue<String>();

        while(!usQ.isEmpty()) {
            if (pivot.compareTo(usQ.front()) < 0)
                aQ.enqueue(usQ.front());
            else if (pivot.compareTo(usQ.front()) == 0)
                equalQ.enqueue(usQ.front());
            else if (pivot.compareTo(usQ.front()) > 0)
                bfQ.enqueue(usQ.front());
            usQ.dequeue();
        }
        quickSort(bfQ);
        quickSort(aQ);
        merge(usQ, bfQ, pivot, equalQ, aQ);


    }
    private static void merge(Queue<String> usQ, Queue<String> bfQ, String pivot, Queue<String> equalQ, Queue<String> aQ){

        while(!bfQ.isEmpty()) {
            usQ.enqueue(bfQ.front());
            bfQ.dequeue();
        }
        usQ.enqueue(pivot);
        while(!equalQ.isEmpty()) {
            usQ.enqueue(equalQ.front());
            equalQ.dequeue();

        }
        while(!aQ.isEmpty()) {
            usQ.enqueue(aQ.front());
            aQ.dequeue();
        }

    }
    public static void print(Queue<String> pQueue) {
        Queue<String> tempQueue = new Queue<String>();
        StringBuilder qString = new StringBuilder();
        while (!pQueue.isEmpty()) {
            String element = pQueue.front();
            qString.append(" ").append("'").append(element).append("'");
            tempQueue.enqueue(element);
            pQueue.dequeue();
        }
        while (!tempQueue.isEmpty()) {
            pQueue.enqueue(tempQueue.front());
            tempQueue.dequeue();
        }
        System.out.println("Queue to String:" + qString);
    }
    public static void betterToString(Queue<String> pQueue, int length){
        System.out.print(requeue(pQueue));
        if(length > 1)
            betterToString(pQueue, length-1);
        return ;
    }
    public static String requeue(Queue<String> pQueue){
        String front = pQueue.front();
        pQueue.dequeue();
        pQueue.enqueue(front);
        return front;
    }
}
