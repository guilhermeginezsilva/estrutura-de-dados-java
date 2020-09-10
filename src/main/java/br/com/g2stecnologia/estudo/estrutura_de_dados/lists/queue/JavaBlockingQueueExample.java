package br.com.g2stecnologia.estudo.estrutura_de_dados.lists.queue;

import br.com.g2stecnologia.estudo.estrutura_de_dados.array.util.TeamMembers;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class JavaBlockingQueueExample {

    private static LinkedBlockingQueue<String> names = new LinkedBlockingQueue<String>();

    public static void main(String[] args) throws InterruptedException {
        System.out.println(names.stream().collect(Collectors.joining("->")));
        names.add(TeamMembers.guilherme);
        names.add(TeamMembers.fabio);
        System.out.println(names.stream().collect(Collectors.joining("->")));
        System.out.println(names.poll());
        System.out.println(names.stream().collect(Collectors.joining("->")));
        names.add(TeamMembers.gustavo);
        names.add(TeamMembers.felipe);
        System.out.println(names.stream().collect(Collectors.joining("->")));
        System.out.println(names.poll());
        System.out.println(names.stream().collect(Collectors.joining("->")));
        System.out.println(names.poll());
        System.out.println(names.stream().collect(Collectors.joining("->")));
        System.out.println(names.poll());
        System.out.println(names.stream().collect(Collectors.joining("->")));
        System.out.println(names.poll());
        System.out.println(names.stream().collect(Collectors.joining("->")));

        runThreadsTake();
        Thread.sleep(1000);
        System.out.println("Vou adicionar um item!");
        names.add(TeamMembers.cleber);
        Thread.sleep(1000);
        runThreadsPoll();
        Thread.sleep(5000);
        names.add(TeamMembers.icaro);
    }

    public static void runThreadsTake() {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(() -> {
            try {
                System.out.println("Pego pela thread: " + names.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.shutdown();
    }

    public static void runThreadsPoll() {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(() -> {
            try {
                System.out.println("Pego pela thread: " + names.poll(3, TimeUnit.SECONDS));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.shutdown();
    }

}
