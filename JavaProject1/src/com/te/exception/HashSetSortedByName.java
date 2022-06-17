package com.te.exception;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;

public class HashSetSortedByName {

	public static void main(String[] args) {
		HashSet<Student> hashset = new HashSet<>();
		hashset.add(new Student("krishna"));
		hashset.add(new Student("zaish"));
		hashset.add(new Student("ajay"));
		System.out.println("unsorted names : " + hashset);
		for (Student student : hashset) {
			System.out.println(student);
		}
	Collections.sort(student);
	
	}

}
