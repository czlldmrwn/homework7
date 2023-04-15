/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.hw7;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;


/**
 *
 * @author НР
 */
public class SortRunnable extends RandRunnable implements Runnable{

    private RandRunnable RandRunnable;
    private Stream randNumbers;
    private List<Integer> numbers;

    public SortRunnable() {
        this.randNumbers = RandRunnable.getRandNumbers();
    }
    
    @Override
    public void run() {
        randNumbers = numbers.stream();
        randNumbers.filter(x->x.toString().length()<4).sorted().forEach(x->System.out.println(x));
    }
}
