package com.algorithm.factory.sort;

import com.algorithm.constants.SortingType;
import com.algorithm.implementation.sort.BinaryInsertionSorter;
import com.algorithm.implementation.sort.BubbleSorter;
import com.algorithm.implementation.sort.InsertionSorter;
import com.algorithm.implementation.sort.MergeSorter;
import com.algorithm.implementation.sort.SelectionSorter;
import com.algorithms.interfaces.ListSorter;

public class SorterFactory {

	public static ListSorter getSorter(SortingType sortingType) {

		if (sortingType == SortingType.INSERTION) {
			return new InsertionSorter();
		}
		else if (sortingType == SortingType.BINARYINSERTION) {
			return new BinaryInsertionSorter();
		}
		else if (sortingType == SortingType.SELECTION) {
			return new SelectionSorter();
		}
		else if (sortingType == SortingType.BUBBLE) {
			return new BubbleSorter();
		}
		else if (sortingType == SortingType.MERGE) {
			return new MergeSorter();
		}
		return null;

	}

}
