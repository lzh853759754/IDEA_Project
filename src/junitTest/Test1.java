package junitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test1 {


    @Test
    public void eat(){
        System.out.println("eat");
    }

    @Before
    public void drink(){
        System.out.println("drink");

    }

    @After
    public void pass(){
        System.out.println("pass");
    }


}
