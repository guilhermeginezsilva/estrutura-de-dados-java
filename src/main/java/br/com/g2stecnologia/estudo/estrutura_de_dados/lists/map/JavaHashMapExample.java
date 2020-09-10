package br.com.g2stecnologia.estudo.estrutura_de_dados.lists.map;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Random;

public class JavaHashMapExample {

    private static HashMap<String, Integer> datadog = new HashMap<String, Integer>();

    private static final String saveKey = "dd_key_save";
    private static final String removeKey = "dd_key_remove";

    public static void main(String[] args) throws InterruptedException {
        save();
        save();
        save();
        remove();
        save();
        remove();
        remove();
        save();
        datadog.keySet().stream().forEach(datadogKey -> System.out.println("{\"" + datadogKey + "\": \"" + datadog.get(datadogKey) + "\"}"));
    }

    public static void save() {
        // salva alguma coisa
        incrementCounter(saveKey);
    }

    public static void remove() {
        // remove alguma coisa
        incrementCounter(removeKey);
    }

    public static void incrementCounter(String key) {
        if(!datadog.containsKey(key)) {
            datadog.put(key, 1);
        } else {
            datadog.put(key, datadog.get(key)+1);
        }
    }
}
