package me.matheus_moraes.contador.services;

public class CounterService {
    public void count(int target){
        int counter = 0;

        while (counter <= target){
            System.out.println("Contador: " + counter);
            counter++;

        }
    }
}
