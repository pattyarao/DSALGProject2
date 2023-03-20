public class QueueDriver {
    public static void main(String[] args) {
        Queue q1 = new Queue(5);


        q1.enqueue("A");
        q1.enqueue("B");
        q1.enqueue("C");
        q1.enqueue("D");

        q1.displayQueue();
        System.out.println("HEAD: " + q1.getHeadNode().getData());
        System.out.println("TAIL: " + q1.getTailNode().getData());

        System.out.println();
        System.out.println("Dequeued Value: " + q1.dequeue());
        q1.displayQueue();
        System.out.println("HEAD: " + q1.getHeadNode().getData());
        System.out.println("TAIL: " + q1.getTailNode().getData());

        System.out.println();
        System.out.println("Dequeued Value: " + q1.dequeue());
        q1.displayQueue();
        System.out.println("HEAD: " + q1.getHeadNode().getData());
        System.out.println("TAIL: " + q1.getTailNode().getData());

        System.out.println();
        q1.enqueue("1");
        q1.displayQueue();
        System.out.println("HEAD: " + q1.getHeadNode().getData());
        System.out.println("TAIL: " + q1.getTailNode().getData());

        System.out.println();
        q1.enqueue("2");
        q1.displayQueue();
        System.out.println("HEAD: " + q1.getHeadNode().getData());
        System.out.println("TAIL: " + q1.getTailNode().getData());

        //ERROR HANDLING

        q1.enqueue("3");
        q1.enqueue("4");

        System.out.println();
        System.out.println("Dequeued Value: " + q1.dequeue());
        q1.displayQueue();
        System.out.println("HEAD: " + q1.getHeadNode().getData());
        System.out.println("TAIL: " + q1.getTailNode().getData());

        System.out.println();
        System.out.println("Dequeued Value: " + q1.dequeue());
        q1.displayQueue();
        System.out.println("HEAD: " + q1.getHeadNode().getData());
        System.out.println("TAIL: " + q1.getTailNode().getData());

        System.out.println();
        System.out.println("Dequeued Value: " + q1.dequeue());
        q1.displayQueue();
        System.out.println("HEAD: " + q1.getHeadNode().getData());
        System.out.println("TAIL: " + q1.getTailNode().getData());

        System.out.println();
        System.out.println("Dequeued Value: " + q1.dequeue());
        q1.displayQueue();

        System.out.println();
        q1.enqueue("1");
        q1.displayQueue();
        q1.enqueue("2");
        q1.displayQueue();

    }
}
