package AufgabenVom17112023;

class QueueTest {
  
  Queue<String> qA, qB, qC, qD;
  
  public QueueTest() {
    qA = new Queue<String>();
    qB = new Queue<String>();
    qC = new Queue<String>();
    qD = new Queue<String>();
  }

  public static void main(String[] args) {
    QueueTest tescht = new QueueTest();
    tescht.testen();
  }

  
  private void umschichten() {
    qB.enqueue(qA.front());
    qB.enqueue(qB.front());
    qA.dequeue();
    qA.enqueue(qD.front());
    qA.enqueue(qC.front());
    qC.dequeue();
    qC.enqueue(qC.front());
    qC.dequeue();
    qC.dequeue();
    qC.enqueue(qB.front());
    qB.dequeue();
    qD.dequeue();
    qC.enqueue(qD.front());
    qD.dequeue();
  }

  
  public void testen() {
    fuellen();
    umschichten();
    ausgeben();
  }
  
  private void fuellen() {
    leeren(qA);
    qA.enqueue("17");
    qA.enqueue("18");
    qA.enqueue("19");
    
    leeren(qB);
    qB.enqueue("16");
    qB.enqueue("20");
    
    leeren(qC);
    qC.enqueue("21");
    qC.enqueue("15");
    qC.enqueue("10");
    
    leeren(qD);
    qD.enqueue("11");
    qD.enqueue("13");
    qD.enqueue("12");
    qD.enqueue("14");
  }
  
  private void ausgeben() {
    System.out.println("qA");
    while (!qA.isEmpty()) { 
      System.out.println(qA.front());
      qA.dequeue();
    } // end of while
    
    System.out.println();
    System.out.println("qB");
    while (!qB.isEmpty()) { 
      System.out.println(qB.front());
      qB.dequeue();
    } // end of while
    
    System.out.println();
    System.out.println("qC");
    while (!qC.isEmpty()) { 
      System.out.println(qC.front());
      qC.dequeue();
    } // end of while
    
    System.out.println();
    System.out.println("qD");
    while (!qD.isEmpty()) { 
      System.out.println(qD.front());
      qD.dequeue();
    } // end of while
    
    
  }
  
  private void leeren(Queue<String> pQueue) {
    while (!pQueue.isEmpty()) { 
      pQueue.dequeue();
    }
  }
}