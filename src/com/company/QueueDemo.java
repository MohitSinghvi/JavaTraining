package com.company;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
//        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
//        queue.add(6);
//        System.out.println(queue.peek());
//
//        queue.add(4);
//        System.out.println(queue.peek());
//
//        queue.add(5);
//        System.out.println(queue.peek());
//
//        queue.add(1);
//        System.out.println(queue.peek());

//        queue.add(2);
//        System.out.println(queue.peek());
//
//        queue.add(3);
//        System.out.println(queue.peek());
//
//        queue.add(7);
//        System.out.println(queue.peek());



//        System.out.println(queue);
        BlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        queue.put(3);
        queue.put(2);
        queue.put(1);
        System.out.println();




    }



}
