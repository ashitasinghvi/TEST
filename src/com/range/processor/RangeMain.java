package com.range.processor;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class RangeMain {
	
	public static void main(String[] args) {

		RangeMain range = new RangeMain();
		range.output("[94133,94133] [94200,94299] [94226,94399]]");

	}

	public void output(String rangeData) {
		/*validation check */
		RangeValidation rangeValidation = new RangeValidation();
		List<Range> rangeList = rangeValidation.validateDataAndReturnList(rangeData);
		RangeProcessor rangeProcessor = new RangeProcessor();
		List<Range> sortedRangeList = rangeProcessor.sortRangeListWithLowerRange(rangeList);
		List<Range> outputRangeList = rangeProcessor.rangeOutput(sortedRangeList);
		for (Range range : outputRangeList) {
			System.out.println("[" + range.getLowerRange() + "," + range.getUpperRange() + "]");
		}

	}
}
