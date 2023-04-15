/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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
public class Hw7 {

    public static void main(String[] args) {
        System.out.println("Вариант 5, РИБО-04-21, Волженская Полина Александровна");
        Runnable rr = new RandRunnable();
        Runnable sr = new SortRunnable();
        Thread randGenerator = new Thread(rr);
        Thread sorter = new Thread(sr);
        randGenerator.start();
        sorter.start();
       // try {
            //randGenerator.join();
         //   sorter.join();
        //} catch (InterruptedException ex){
            
        }
}
}
