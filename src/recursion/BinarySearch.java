package recursion;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 2, 3 ,4 };
		int index, index2;
		index = binarySearch(numbers, 0, numbers.length - 1, 2);
		index2 = binarySearch(numbers, 0, numbers.length - 1, 5);
		
		System.out.println(index);
		System.out.println(index2);

	}
	
	static int binarySearch(int[] A, int loIndex, int hiIndex, int value){
		
		if(loIndex > hiIndex){
			return -1;
		}
		else{
			int middle = (loIndex + hiIndex) / 2;
			
			if(value == A[middle])
				return middle;
			else if(value < A[middle])
				return binarySearch(A, loIndex, middle - 1, value);
			else
				return binarySearch(A, middle + 1, hiIndex, value);
		}
	}

}
