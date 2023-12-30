package org.example.test;

import org.example.Main;
import org.example.TestJacoco;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {


    @Test
    public void MainTest(){

        TestJacoco testJacoco=new TestJacoco();

        List<String> names=new ArrayList<>();
        names.add("Mia");
        names.add("Lio");
        names.add("Roger");
        names.add("Axel");
        names.add("Mia");

        Assert.assertEquals(2,testJacoco.countofNames(names));
        Assert.assertEquals(true,testJacoco.nameFinder(names,"Lio"));
    }
}
