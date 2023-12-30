package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TestJacoco test=new TestJacoco();
        List<String> names=new ArrayList<>();
        names.add("Mia");
        names.add("Lio");
        names.add("Roger");
        names.add("Axel");
        names.add("Mia");

        System.out.println("Printing Count::"+test.countofNames(names));
        System.out.println("Printing Name Found::"+test.nameFinder(names,"Mia"));
    }
}
