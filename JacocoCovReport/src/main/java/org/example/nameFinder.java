package org.example;

import java.util.List;

public class nameFinder {

    public boolean findName(List<String> names,String name){
       return names.stream().anyMatch(namelist->namelist.contains(name));
    }

    public 
}
