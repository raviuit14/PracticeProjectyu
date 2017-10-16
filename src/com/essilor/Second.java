package com.essilor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Second {
    public static void main(String [] str){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(add(list,e->true));
        System.out.println(add(list,e->e%2==0));
        System.out.println(add(list,e->e%2!=0));
        System.out.println("-------------------------");
        System.out.println(add1(list,e->true));
        System.out.println(add1(list,e->e%2==0));
        System.out.println(add1(list,e->e%2!=0));
        System.out.println("------------------");
        System.out.println(add2(list,e->true));
        System.out.println(add2(list,e->e%2==0));
        System.out.println(add2(list,e->e%2!=0));


    }

    public static Integer add(List<Integer> list, Predicate<Integer> selector){
        return list.stream().filter(selector).mapToInt(e->e).sum();
    }

    public static Integer add1(List<Integer> list, Predicate<Integer> selector){
        return list.stream().filter(selector).reduce(0,(a,b)->a+b);
    }
    public static Integer add2(List<Integer> list, Predicate<Integer> selector){
        return list.stream().filter(selector).reduce(0,Integer::sum);
    }
}
