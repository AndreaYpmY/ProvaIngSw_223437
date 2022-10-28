package org.example;

import jdk.jshell.spi.ExecutionControl;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FunnyAlgorithmsTest {
    FunnyAlgorithms funnyAlgorithms=null;


    @BeforeClass
    public void preRunTest(){
        funnyAlgorithms=new FunnyAlgorithms();

    }
    @Test
    public void testStringToInt(){
        assertEquals(10,funnyAlgorithms.stringToIntConverter("10"));
        assertEquals(-3,funnyAlgorithms.stringToIntConverter("-3"));
        assertThrows(UnsupportedOperationException.class,funnyAlgorithms.stringToIntConverter("-AAAAA"))
    }

    @Test
    public void testSelectionSort(){
        int[] array={100,20,40,30,70,80,70};
        int [] arrayVerifica0={20,30,40,70,70,80,100};
        int [] arrayVerifica1={100,80,70,70,40,30,20};
        funnyAlgorithms.selectionSort(array,0);
        assertEquals(arrayVerifica0,array);
        funnyAlgorithms.selectionSort(array,1);
        assertEquals(arrayVerifica1,array);
    }

    @Test
    public void testBinarySearch(){
        int[]array={10,20,30,40,50,60,70};
        int number=50;
        assertEquals(4,funnyAlgorithms.binarySearch(array,number));
        assertEquals(-1,funnyAlgorithms.binarySearch(array,1));
    }


}
