// Author Peter Adamson

public class HeapSort{

	public static void main(String[] args){
		int[] A = {3, 6, 10, 18, 8, 7, 25, 40};
		sort(A);
		show(A);	//display the sorted result A
	}

	public static void sort(int[] A){
		int length = A.length - 1;
		buildheap(A, length);
		for(int i = length / 2; i > 0; i--){
			swap(A, 0, i);
			length = length - 1;
			maxheap(A, 0, length);	
		}
	}

	public static void show(int[] A){
		for(int i = A.length - 1; i>= 0; i--){
			System.out.println(A[i]);
		}
	}

	public static void buildheap(int[] A, int length){
		for(int i = length/2; i >= 0; i--){
			maxheap(A, i, length);
		}
	}

	public static void maxheap(int[] A, int i, int length){
		int largest;
		int left = 2 * i;
		int right = 2 * i + 1;
		if(left <= length && A[left] > A[i]){
			largest = left;
		}
		else{
			largest = i;
		}
		if(right <= length && A[right] > A[largest]){
			largest = right;
		}
		if(largest != i){
			swap(A, i, largest);
			maxheap(A, largest, length);
		}
	}

	public static void swap(int[] A, int i, int j){
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
