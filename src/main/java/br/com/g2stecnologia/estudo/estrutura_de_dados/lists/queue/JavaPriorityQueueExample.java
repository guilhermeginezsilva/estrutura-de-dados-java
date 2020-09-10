package br.com.g2stecnologia.estudo.estrutura_de_dados.lists.queue;

import br.com.g2stecnologia.estudo.estrutura_de_dados.array.util.TeamMembers;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class JavaPriorityQueueExample {

    private static PriorityQueue<Integer> minList = new PriorityQueue<Integer>(Collections.reverseOrder());
    private static PriorityQueue<Integer> maxList = new PriorityQueue<Integer>();

    public static void main(String[] args) throws InterruptedException {
        for(int i=0; i<10; i++) {
            int number = new Random().nextInt();
            minList.add(number);
            maxList.add(number);
        }
        System.out.println("Min List:");
        while(minList.size() > 0) {
            System.out.print(minList.poll()+" -> ");
        }
        System.out.println("Max List:");
        while(maxList.size() > 0) {
            System.out.print(maxList.poll()+" -> ");
        }
    }
}
