package de.bht.pr2.lab02.part2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    int[] myTestArray = {0,1,54,21,32,56,88,24,65};

    @Test
    void testBubbleSort(){

        BubbleSort bubbleSort = new BubbleSort();               // Arrange

        int[] actualArray = bubbleSort.sort(myTestArray);      // Act

        assertArrayEquals(myTestArray,actualArray);           // Assert



    }
    @Test
    void testInsertionSort(){
        InsertionSort insertionSort = new InsertionSort();

        int[] actualArray = insertionSort.sort(myTestArray);

        assertArrayEquals(myTestArray,actualArray);
    }

    @Test
    void testQuickSort(){
        QuickSort quickSort = new QuickSort();

    }


}