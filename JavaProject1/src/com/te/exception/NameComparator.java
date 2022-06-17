package com.te.exception;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return o1.hashCode()-o2.hashCode();
	}

}
