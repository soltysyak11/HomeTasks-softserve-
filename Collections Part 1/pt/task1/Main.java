package com.softserve.edu09.pt.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(12, "TVset"));
        list.add(new HeavyBox(3, "Tablet"));
        list.add(new HeavyBox(5, "Chair"));

        for(var el: list){
            System.out.println(el);
        }
        list.get(0).setWeight(1);
        list.remove(list.size() - 1);
        System.out.println("=".repeat(20));

        for(var el: list){
            System.out.println(el);
        }



    }
}
