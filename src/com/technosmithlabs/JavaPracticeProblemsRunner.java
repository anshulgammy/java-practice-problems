package com.technosmithlabs;

import java.util.*;

public class JavaPracticeProblemsRunner {

    public static void main(String[] args) {
        final Set<String> stringLinkedList = new HashSet<>();
        stringLinkedList.add("String 1");
        stringLinkedList.add("String 2");
        stringLinkedList.add("String 3");
        stringLinkedList.add("String 4");
        stringLinkedList.add("String 5");
        stringLinkedList.add("String 6");
        stringLinkedList.add("String 7");
        stringLinkedList.stream().filter(e-> {
            Integer num = Integer.parseInt(e.replace("String ", ""));
            return num % 2 == 0;
        }).map(e->e.replace("String ", "New String ")).forEach(e-> System.out.println(e));
    }
}
