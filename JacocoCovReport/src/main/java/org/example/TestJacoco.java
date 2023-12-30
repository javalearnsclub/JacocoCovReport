package org.example;

import java.util.List;

public class TestJacoco {

    public long countofNames(List<String> names){
        return names.stream().filter(name->name.startsWith("M")).count();
    }

    public boolean nameFinder(List<String> names,String value){
        return names.stream().anyMatch(name->name.contains(value));
    }
}