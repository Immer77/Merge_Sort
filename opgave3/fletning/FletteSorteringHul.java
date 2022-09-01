package opgave3.fletning;

import java.util.ArrayList;
import java.util.Arrays;

public class FletteSorteringHul {

	// den metode der saetter fletningen i gang
	public void fletteSort(int[] list) {
		mergesort(list);
	}

	// den rekursive metode der implementere del-loes og kombiner skabelonen
	private static void mergesort(int[] inputArray) {
		int inputLength = inputArray.length;
		if(inputLength < 2) {
			return;
		}

		int midIndex = inputLength / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];

		for (int i = 0; i < midIndex; i++) {
			leftHalf[i] = inputArray[i];

		}
		for (int i = midIndex; i < inputLength; i++) {
			rightHalf[i - midIndex] = inputArray[i];
		}

		mergesort(leftHalf);
		mergesort(rightHalf);

		merge(inputArray, leftHalf,rightHalf);

	}

	// kombiner er realiseret ved fletteskabelonen
	private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;

		int i1 = 0;
		int i2 = 0;
		int k = 0;

		while (i1 < leftSize && i2 < rightSize){
			if(leftHalf[i1] <= rightHalf[i2]){
				inputArray[k] = leftHalf[i1];
				i1++;
			}else{
				inputArray[k] = rightHalf[i2];
				i2++;
			}
			k++;
		}
		while(i1 < leftHalf.length){
			inputArray[k] = leftHalf[i1];
			i1++;
			k++;
		}
		while (i2 < rightHalf.length){
			inputArray[k] = rightHalf[i2];
			i2++;
			k++;
		}
		// TODO
	}

}
