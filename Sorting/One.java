import java.util.*;
import java.io.*;
class One{
	public static void main(String args[]) throws IOException {
		FileInputStream sc=null;
		sc=new FileInputStream("file.txt");
		
                   		
		InsertionSort i=new InsertionSort();
		SelectionSort s=new SelectionSort();
		BubbleSort b=new BubbleSort();
		int c;
		int j=0;
		int[] a=new int[100000];
		while ((c = sc.read()) != -1) {
			a[j]=c;
			j++;
            			}
		
		
		long startI = System.currentTimeMillis();
		i.sortarr(a);
		long endI = System.currentTimeMillis();
		System.out.println("Insertion sort took " + (endI - startI) + " milliseconds");

		long startS = System.currentTimeMillis();
		s.sortarr(a);
		long endS = System.currentTimeMillis();
		System.out.println("Selection sort took " + (endS - startS) + " milliseconds");

		long startB = System.currentTimeMillis();
		b.sortarr(a);
		long endB = System.currentTimeMillis();
		System.out.println("Bubble sort took " + (endB - startB) + " milliseconds");

		}
	}