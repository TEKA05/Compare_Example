package com.oop.sorting.comparable.program;

import com.utility.Util;
import com.utility.Util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main
{

	public static void main(String[] args) 
	{
		Student[] studentArr1 = new Student[5];
        studentArr1[0] = new Student(777226, "Sinem", "S�ylemez", 72);
        studentArr1[1] = new Student(777221, "Sinem", "Bilir", 72);
        studentArr1[2] = new Student(777224, "Hasan", "�al��kan", 72);
        studentArr1[3] = new Student(777225, "Faruk", "U�mak", 60);
        studentArr1[4] = new Student(777229, "Arif", "Gider", 78);

        List<Student> studentList1 = Arrays.asList(studentArr1);
        
        System.out.println("studentList1:");
        Util.showList(studentList1);
        
        /*
         * E�er ki List'i olu�turan elemanlar�n s�n�f� (varl�k s�n�f�)
         * bir Comparable implementasyonu de�ilse, derleme zaman� hatas� meydana gelir.
         */
        Collections.sort(studentList1);
        System.out.println("\nSorted studentList1:");
        Util.showList(studentList1);
	}

}
