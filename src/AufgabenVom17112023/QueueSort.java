package AufgabenVom17112023;

public class QueueSort {
    public static void main(String[] args) {
        Queue<String> qA = new Queue<String>();
        qA.enqueue("h");
        qA.enqueue("y");
        qA.enqueue("u");
        qA.enqueue("l");
        qA.enqueue("m");
        qA.enqueue("a");
        qA.enqueue("o");
        qA.enqueue("s");
        qA.enqueue("g");
        qA.enqueue("a");
        print(qA);
        sort(qA);
        print(qA);
    }
    public static void sort(Queue<String> usQ){
        System.out.println("sort() Anfang");
        print(usQ);
        queueSort(usQ);
        System.out.println("sort() Ende");
    }
    private static void queueSort(Queue<String> usQ){
        System.out.println("queueSort() Anfang");
        if(usQ.isEmpty()) return;
        String pivot = usQ.front();
        //Merken pivot wird hier aus der Queue gelöscht
        usQ.dequeue();

        Queue<String> aQ = new Queue<String>();
        Queue<String> equalQ = new Queue<String>();
        Queue<String> bfQ = new Queue<String>();
        print(usQ);
        while(!usQ.isEmpty()) {
            if (pivot.compareTo(usQ.front()) < 0)
                aQ.enqueue(usQ.front());
            else if (pivot.compareTo(usQ.front()) == 0)
                equalQ.enqueue(usQ.front());
            else if (pivot.compareTo(usQ.front()) > 0)
                bfQ.enqueue(usQ.front());
            usQ.dequeue();
        }
        queueSort(bfQ);
        queueSort(aQ);
        merge(usQ, bfQ, pivot, equalQ, aQ);
        print(usQ);
        System.out.println("queueSort() Ende");
    }
    private static void merge(Queue<String> usQ, Queue<String> bfQ, String pivot, Queue<String> equalQ, Queue<String> aQ){
        System.out.println("merge() Anfang");
        while(!bfQ.isEmpty()) {
            usQ.enqueue(bfQ.front());
            bfQ.dequeue();
        }
        usQ.enqueue(pivot);
        while(!equalQ.isEmpty()) {
            usQ.enqueue(equalQ.front());
            equalQ.dequeue();
            System.out.println("von Tillmann ihr Säcke");
        }
        while(!aQ.isEmpty()) {
            usQ.enqueue(aQ.front());
            aQ.dequeue();
        }
        System.out.println("merge() Ende");
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
}
