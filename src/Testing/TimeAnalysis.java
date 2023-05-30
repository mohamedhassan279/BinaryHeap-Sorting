package Testing;

import FileReader.Freader;
import Sorting.Sort_Array;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class TimeAnalysis {
    private final String test = "/home/exception/Heap/";
    private Sort_Array sorting;
    @Test
    public void countingSort()
    {
        sorting = new Sort_Array(test + "worst-10.txt");
        long start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        long end = System.nanoTime();
        System.out.println("worst-10 case counting sort: " + (((end-start)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "worst-100.txt");
        start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end = System.nanoTime();
        System.out.println("worst-100 case counting sort: " + (((end-start)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "worst-1000.txt");
        start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end = System.nanoTime();
        System.out.println("worst-1000 case counting sort: " + (((end-start)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "worst-10000.txt");
        start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end = System.nanoTime();
        System.out.println("worst-10000 case counting sort: " + (((end-start)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "worst-100000.txt");
        start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end = System.nanoTime();
        System.out.println("worst-100000 case counting sort: " + (((end-start)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "worst-1000000.txt");
        start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end = System.nanoTime();
        System.out.println("worst-1000000 case counting sort: " + (((end-start)/40)*0.001) + " ms");
        System.out.println();

        sorting = new Sort_Array(test + "avg-10.txt");
        long start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        long end2 = System.nanoTime();
        System.out.println("avg-10 case counting sort: " + (((end2-start2)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-100.txt");
        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-100 case counting sort: " + (((end2-start2)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-1000.txt");
        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-1000 case counting sort: " + (((end2-start2)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-10000.txt");
        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-10000 case counting sort: " + (((end2-start2)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-100000.txt");
        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-100000 case counting sort: " + (((end2-start2)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-1000000.txt");
        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-1000000 case counting sort: " + (((end2-start2)/40)*0.001) + " ms");
        System.out.println();

        sorting = new Sort_Array(test + "best-10.txt");
        long start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        long end3 = System.nanoTime();
        System.out.println("best-10 case counting sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "best-100.txt");
        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end3 = System.nanoTime();
        System.out.println("best-100 case counting sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "best-1000.txt");
        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end3 = System.nanoTime();
        System.out.println("best-1000 case counting sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "best-10000.txt");
        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end3 = System.nanoTime();
        System.out.println("best-10000 case counting sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "best-100000.txt");
        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end3 = System.nanoTime();
        System.out.println("best-100000 case counting sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "best-1000000.txt");
        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end3 = System.nanoTime();
        System.out.println("best-1000000 case counting sort: " + (((end3-start3)/40)*0.001) + " ms");
    }
    @Test
    public void Merge_Sort()
    {
        sorting = new Sort_Array(test + "worst-10.txt");
        long start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        long end = System.nanoTime();
        System.out.println("worst-10 case merge sort: " + (((end-start)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "worst-100.txt");
        start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        end = System.nanoTime();
        System.out.println("worst-100 case merge sort: " + (((end-start)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "worst-1000.txt");
        start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        end = System.nanoTime();
        System.out.println("worst-1000 case merge sort: " + (((end-start)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "worst-10000.txt");
        start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        end = System.nanoTime();
        System.out.println("worst-10000 case merge sort: " + (((end-start)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "worst-100000.txt");
        start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        end = System.nanoTime();
        System.out.println("worst-100000 case merge sort: " + (((end-start)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "worst-1000000.txt");
        start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        end = System.nanoTime();
        System.out.println("worst-1000000 case merge sort: " + (((end-start)/40)*0.001) + " ms");
        System.out.println();

        sorting = new Sort_Array(test + "avg-10.txt");
        long start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        long end2 = System.nanoTime();
        System.out.println("avg-10 case merge sort: " + (((end2-start2)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-100.txt");
        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-100 case merge sort: " + (((end2-start2)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-1000.txt");
        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-1000 case merge sort: " + (((end2-start2)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-10000.txt");
        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-10000 case merge sort: " + (((end2-start2)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-100000.txt");
        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-100000 case merge sort: " + (((end2-start2)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-1000000.txt");
        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-1000000 case merge sort: " + (((end2-start2)/40)*0.001) + " ms");
        System.out.println();

        sorting = new Sort_Array(test + "best-10.txt");
        long start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        long end3 = System.nanoTime();
        System.out.println("best-10 case merge sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "best-100.txt");
        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        end3 = System.nanoTime();
        System.out.println("best-100 case merge sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "best-1000.txt");
        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        end3 = System.nanoTime();
        System.out.println("best-1000 case merge sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "best-10000.txt");
        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        end3 = System.nanoTime();
        System.out.println("best-10000 case merge sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "best-100000.txt");
        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        end3 = System.nanoTime();
        System.out.println("best-100000 case merge sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "best-1000000.txt");
        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        end3 = System.nanoTime();
        System.out.println("best-1000000 case merge sort: " + (((end3-start3)/40)*0.001) + " ms");
    }
    @Test
    public void bubbleSort()
    {
        sorting = new Sort_Array(test + "worst-10.txt");
        long start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        long end = System.nanoTime();
        System.out.println("worst-10 case bubble sort: " + (((end-start)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "worst-100.txt");
        start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end = System.nanoTime();
        System.out.println("worst-100 case bubble sort: " + (((end-start)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "worst-1000.txt");
        start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end = System.nanoTime();
        System.out.println("worst-1000 case bubble sort: " + (((end-start)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "worst-10000.txt");
        start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end = System.nanoTime();
        System.out.println("worst-10000 case bubble sort: " + (((end-start)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "worst-100000.txt");
        start = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end = System.nanoTime();
        System.out.println("worst-100000 case bubble sort: " + (((end-start)/40)*0.001) + " ms");


        //Average
        sorting = new Sort_Array(test + "avg-10.txt");
        long start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        long end2 = System.nanoTime();
        System.out.println("avg-10 case bubble sort: " + (((end2-start2)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-100.txt");
        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-100 case bubble sort: " + (((end2-start2)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-1000.txt");
        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-1000 case bubble sort: " + (((end2-start2)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-10000.txt");
        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-10000 case bubble sort: " + (((end2-start2)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-100000.txt");
        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-100000 case bubble sort: " + (((end2-start2)/40)*0.001) + " ms");


//        System.out.println();
        //Best
        sorting = new Sort_Array(test + "best-10.txt");
        long start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        long end3 = System.nanoTime();
        System.out.println("best-10 case bubble sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "best-100.txt");
        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end3 = System.nanoTime();
        System.out.println("best-100 case bubble sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "best-1000.txt");
        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end3 = System.nanoTime();
        System.out.println("best-1000 case bubble sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "best-10000.txt");
        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end3 = System.nanoTime();
        System.out.println("best-10000 case bubble sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "best-100000.txt");
        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end3 = System.nanoTime();
        System.out.println("best-100000 case bubble sort: " + (((end3-start3)/40)*0.001) + " ms");

    }

    @Test
    public void test_10(){
        sorting = new Sort_Array(test + "avg-10.txt");
        long start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        long end1 = System.nanoTime();
        System.out.println("avg-10 case merge sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-10 case bubble sort: " + (((end1-start1)/40)*0.001) + " ms");


        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-10 case counting sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.heapSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-10 case heap sort: " + (((end1-start1)/40)*0.001) + " ms");
    }

    @Test
    public void test_100(){
        sorting = new Sort_Array(test + "avg-100.txt");
        long start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        long end1 = System.nanoTime();
        System.out.println("avg-100 case merge sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-100 case bubble sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-100 case counting sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.heapSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-100 case heap sort: " + (((end1-start1)/40)*0.001) + " ms");
    }

    @Test
    public void test_1000(){
        sorting = new Sort_Array(test + "avg-1000.txt");
        long start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        long end1 = System.nanoTime();
        System.out.println("avg-1000 case merge sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-1000 case bubble sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-1000 case counting sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.heapSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-1000 case heap sort: " + (((end1-start1)/40)*0.001) + " ms");
    }


    @Test
    public void test_10000(){
        sorting = new Sort_Array(test + "avg-10000.txt");
        long start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        long end1 = System.nanoTime();
        System.out.println("avg-10000 case merge sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-10000 case bubble sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-10000 case counting sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.heapSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-10000 case heap sort: " + (((end1-start1)/40)*0.001) + " ms");
    }

    @Test
    public void test_100000(){
        sorting = new Sort_Array(test + "avg-100000.txt");
        long start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        long end1 = System.nanoTime();
        System.out.println("avg-100000 case merge sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-100000 case bubble sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-100000 case counting sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.heapSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-100000 case heap sort: " + (((end1-start1)/40)*0.001) + " ms");
    }
    @Test
    public void test_1000000(){
        sorting = new Sort_Array(test + "avg-1000000.txt");
        long start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        long end1 = System.nanoTime();
        System.out.println("avg-1000000 case merge sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-1000000 case bubble sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-1000000 case counting sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.heapSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-1000000 case heap sort: " + (((end1-start1)/40)*0.001) + " ms");
    }

    @Test
    public void test_50000(){
        sorting = new Sort_Array(test + "avg-50000.txt");
        long start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        long end1 = System.nanoTime();
        System.out.println("avg-50000 case merge sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-50000 case bubble sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-50000 case counting sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.heapSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-50000 case heap sort: " + (((end1-start1)/40)*0.001) + " ms");
    }

    @Test
    public void test_500000(){
        sorting = new Sort_Array(test + "avg-500000.txt");
        long start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        long end1 = System.nanoTime();
        System.out.println("avg-500000 case merge sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-500000 case bubble sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-500000 case counting sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.heapSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-500000 case heap sort: " + (((end1-start1)/40)*0.001) + " ms");
    }

    @Test
    public void All()
    {
        sorting = new Sort_Array(test + "avg-10.txt");
        long start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        long end1 = System.nanoTime();
        System.out.println("avg-10 case merge sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-10 case bubble sort: " + (((end1-start1)/40)*0.001) + " ms");


        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-10 case counting sort: " + (((end1-start1)/40)*0.001) + " ms");

        start1 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.heapSort(true);
        end1 = System.nanoTime();
        System.out.println("avg-10 case heap sort: " + (((end1-start1)/40)*0.001) + " ms");



        sorting = new Sort_Array(test + "avg-100.txt");
        long start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        long end2 = System.nanoTime();
        System.out.println("avg-100 case merge sort: " + (((end2-start2)/40)*0.001) + " ms");

        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-100 case bubble sort: " + (((end2-start2)/40)*0.001) + " ms");


        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-100 case counting sort: " + (((end2-start2)/40)*0.001) + " ms");

        start2 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.heapSort(true);
        end2 = System.nanoTime();
        System.out.println("avg-100 case heap sort: " + (((end2-start2)/40)*0.001) + " ms");


        sorting = new Sort_Array(test + "avg-1000.txt");
        long start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        long end3 = System.nanoTime();
        System.out.println("avg-1000 case merge sort: " + (((end3-start3)/40)*0.001) + " ms");

        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end3 = System.nanoTime();
        System.out.println("avg-1000 case bubble sort: " + (((end3-start3)/40)*0.001) + " ms");

        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end3 = System.nanoTime();
        System.out.println("avg-1000 case counting sort: " + (((end3-start3)/40)*0.001) + " ms");

        start3 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.heapSort(true);
        end3 = System.nanoTime();
        System.out.println("avg-1000 case heap sort: " + (((end3-start3)/40)*0.001) + " ms");

        sorting = new Sort_Array(test + "avg-50000.txt");
        long start8 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        long end8 = System.nanoTime();
        System.out.println("avg-50000 case merge sort: " + (((end8-start8)/40)*0.001) + " ms");

        start8 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end8 = System.nanoTime();
        System.out.println("avg-50000 case bubble sort: " + (((end8-start8)/40)*0.001) + " ms");

        start8 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end8 = System.nanoTime();
        System.out.println("avg-50000 case counting sort: " + (((end8-start8)/40)*0.001) + " ms");

        start8 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.heapSort(true);
        end8 = System.nanoTime();
        System.out.println("avg-50000 case heap sort: " + (((end8-start8)/40)*0.001) + " ms");


        sorting = new Sort_Array(test + "avg-10000.txt");
        long start4 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        long end4 = System.nanoTime();
        System.out.println("avg-10000 case merge sort: " + (((end4-start4)/40)*0.001) + " ms");

        start4 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end4 = System.nanoTime();
        System.out.println("avg-10000 case bubble sort: " + (((end4-start4)/40)*0.001) + " ms");

        start4 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end4 = System.nanoTime();
        System.out.println("avg-10000 case counting sort: " + (((end4-start4)/40)*0.001) + " ms");

        start4 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.heapSort(true);
        end4 = System.nanoTime();
        System.out.println("avg-10000 case heap sort: " + (((end4-start4)/40)*0.001) + " ms");




        sorting = new Sort_Array(test + "avg-100000.txt");
        long start5 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        long end5 = System.nanoTime();
        System.out.println("avg-100000 case merge sort: " + (((end5-start5)/40)*0.001) + " ms");

        start5 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end5 = System.nanoTime();
        System.out.println("avg-100000 case bubble sort: " + (((end5-start5)/40)*0.001) + " ms");

        start5 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end5 = System.nanoTime();
        System.out.println("avg-100000 case counting sort: " + (((end5-start5)/40)*0.001) + " ms");

        start5 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.heapSort(true);
        end5 = System.nanoTime();
        System.out.println("avg-100000 case heap sort: " + (((end5-start5)/40)*0.001) + " ms");


        sorting = new Sort_Array(test + "avg-1000000.txt");
        long start6 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        long end6 = System.nanoTime();
        System.out.println("avg-1000000 case merge sort: " + (((end6-start6)/40)*0.001) + " ms");

//        start6 = System.nanoTime();
//        for(int i = 0; i < 40; i++)
//            sorting.simpleSort(true);
//        end6 = System.nanoTime();
//        System.out.println("avg-1000000 case bubble sort: " + (((end6-start6)/40)*0.001) + " ms");

        start6 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end6 = System.nanoTime();
        System.out.println("avg-1000000 case counting sort: " + (((end6-start6)/40)*0.001) + " ms");

        start6 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.heapSort(true);
        end6 = System.nanoTime();
        System.out.println("avg-1000000 case heap sort: " + (((end6-start6)/40)*0.001) + " ms");


        sorting = new Sort_Array(test + "avg-500000.txt");
        long start7 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.efficientSort(true);
        long end7 = System.nanoTime();
        System.out.println("avg-500000 case merge sort: " + (((end7-start7)/40)*0.001) + " ms");

        start7 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.simpleSort(true);
        end7 = System.nanoTime();
        System.out.println("avg-500000 case bubble sort: " + (((end7-start7)/40)*0.001) + " ms");

        start7 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.nonComparisonSort(true);
        end7 = System.nanoTime();
        System.out.println("avg-500000 case counting sort: " + (((end7-start7)/40)*0.001) + " ms");

        start7 = System.nanoTime();
        for(int i = 0; i < 40; i++)
            sorting.heapSort(true);
        end7 = System.nanoTime();
        System.out.println("avg-500000 case heap sort: " + (((end7-start7)/40)*0.001) + " ms");





    }
}