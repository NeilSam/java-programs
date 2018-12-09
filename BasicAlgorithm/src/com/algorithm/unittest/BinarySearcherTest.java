package com.algorithm.unittest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.algorithm.constants.SearchingType;
import com.algorithm.factory.search.SearchingFactory;
import com.algorithms.interfaces.ListSearcher;

public class BinarySearcherTest {

	@Test
	public void test() {
		int[] intList = {1,3,6,9,11,24,46,54,67,86,91,99};
		ListSearcher searcher = SearchingFactory.getSearcher(SearchingType.BINARY);
		int keyIndex = searcher.searchList(intList, 86);
		assertEquals(keyIndex, 9);
	}

}
