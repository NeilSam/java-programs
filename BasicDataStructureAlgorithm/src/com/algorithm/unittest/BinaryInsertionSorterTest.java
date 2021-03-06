package com.algorithm.unittest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.algorithm.constants.SortingType;
import com.algorithm.factory.sort.SorterFactory;
import com.algorithms.interfaces.ListSorter;

public class BinaryInsertionSorterTest {

	@Test
	public void test() {
		int[] intList = { 5, 2, 4, 6, 1, 3 };
		int[] sortedIntList = { 1, 2, 3, 4, 5, 6 };
		ListSorter sorter = SorterFactory.getSorter(SortingType.BINARYINSERTION);
		sorter.sortList(intList);
		assertArrayEquals(intList, sortedIntList);
	}

}
