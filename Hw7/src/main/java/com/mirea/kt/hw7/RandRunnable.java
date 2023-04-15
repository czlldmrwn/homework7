/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.hw7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 *
 * @author НР
 */
public class RandRunnable implements Runnable{
    private Random random;
    private List<Integer> numbers;
    private Stream randNumbers;
    
    public Stream getRandNumbers() {
        return randNumbers;
    }
    
    @Override
    public void run() {
        synchronized (this.randNumbers){
        while (true) {
        random  = new Random();
        numbers = new ArrayList<>();
        for (int i = 0; i<=100; i++) {
            numbers.add(random.nextInt(1000));
        }    
        randNumbers = numbers.stream();
        }
        } 
    }
}
