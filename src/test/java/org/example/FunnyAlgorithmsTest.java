package org.example;

import jdk.jshell.spi.ExecutionControl;
import org.junit.*;


import java.time.LocalTime;

import static org.junit.Assert.*;

public class FunnyAlgorithmsTest {
    private static FunnyAlgorithms funnyAlgorithms=null;
    int Time=0;
    int TimeEnd=0;
    @Before
    public void preTest(){
        Time=LocalTime.now().getNano();
    }
    @After
    public void postTest(){
        TimeEnd=LocalTime.now().getNano();
        int time=TimeEnd-Time;
        System.out.println("Time:"+String.valueOf(time)+"\n");
    }

    @BeforeClass
    public static void  preRunTest(){
        funnyAlgorithms=new FunnyAlgorithms();

    }
    @Test
    public void testStringToInt(){
        //Test 1
        assertEquals(10,funnyAlgorithms.stringToIntConverter("10"));
        //Test 2
        assertEquals(-3,funnyAlgorithms.stringToIntConverter("-3"));
        //Test 3
        assertThrows(UnsupportedOperationException.class,()->funnyAlgorithms.stringToIntConverter("AAAAA"));
        //Test 4
        assertThrows(UnsupportedOperationException.class,()->funnyAlgorithms.stringToIntConverter("10000000"));
    }

    @Test
    public void testSelectionSort(){
        int[] array={100,20,40,30,70,80,70};
        int [] arrayVerifica0={20,30,40,70,70,80,100}; //Ascending
        int [] arrayVerifica1={100,80,70,70,40,30,20}; //Descending
        //Test 1
        funnyAlgorithms.selectionSort(array,0);
        assertArrayEquals(arrayVerifica0,array);
        //Test 2
        funnyAlgorithms.selectionSort(array,1);
        assertArrayEquals(arrayVerifica1,array);
    }

    @Test
    public void testBinarySearch(){
        int[]array={10,20,30,40,50,60,70};
        int number=50;
        //Test 1
        assertEquals(4,funnyAlgorithms.binarySearch(array,number));
        //Test 2
        assertEquals(-1,funnyAlgorithms.binarySearch(array,1));
    }


}
