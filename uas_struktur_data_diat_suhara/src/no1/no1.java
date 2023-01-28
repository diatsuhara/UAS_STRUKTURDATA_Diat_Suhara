package no1;

import Model.Mahasiswa;

public class no1 {
    public static void getNo1() {
        StackQueue stack = new StackQueue(10);
        stack.push(new Mahasiswa("diat", "22552011285", "TIF RM 22 A "));
        stack.push(new Mahasiswa("suhara", "22552011111", "TIF RM 22 B "));
        stack.push(new Mahasiswa("at", "22552011100", "TIF RM 22 C "));

        stack.print();
        stack.peek();
        stack.pop();
        stack.print();
        stack.clear();
        stack.print();

        StackQueue queue = new StackQueue(10);
        queue.enqueue(new Mahasiswa("diat", "22552011106", "TIF RM 22 A "));
        queue.enqueue(new Mahasiswa("suhara", "22552011111", "TIF RM 22 B "));
        queue.enqueue(new Mahasiswa("at", "22552011100", "TIF RM 22 C "));

        queue.printQueue();
        queue.peekFront();
        queue.peekRear();
        queue.dequeue();
        queue.printQueue();
    }
}
