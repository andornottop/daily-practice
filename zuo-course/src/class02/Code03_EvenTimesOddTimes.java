package class02;

public class Code03_EvenTimesOddTimes {

	// arr�У�ֻ��һ����������������
	public static void printOddTimesNum1(int[] arr) {
		int eor = 0;
		for (int i = 0; i < arr.length; i++) {
			eor ^= arr[i];
		}
		System.out.println(eor);
	}

	// arr�У���������������������
	public static void printOddTimesNum2(int[] arr) {
		int eor = 0;
		for (int i = 0; i < arr.length; i++) {
			eor ^= arr[i];
		}
		// a �� b��������
		// eor != 0
		// eor���Ҳ��1����ȡ����
		// eor :     00110010110111000
		// rightOne :00000000000001000
		int rightOne = eor & (-eor); // ��ȡ�����ҵ�1
		
		
		int onlyOne = 0; // eor'
		for (int i = 0 ; i < arr.length;i++) {
			//  arr[1] =  111100011110000
			// rightOne=  000000000010000
			if ((arr[i] & rightOne) != 0) {
				onlyOne ^= arr[i];
			}
		}
		System.out.println(onlyOne + " " + (eor ^ onlyOne));
	}

	
	public static int bit1counts(int N) {
		int count = 0;
		
		//   011011010000
		//   000000010000     1
		
		//   011011000000
		// 
		
		
		
		while(N != 0) {
			int rightOne = N & ((~N) + 1);
			count++;
			N ^= rightOne;
			// N -= rightOne
		}
		
		
		return count;
		
	}
	
	
	public static void main(String[] args) {

		int[] arr1 = { 3, 3, 2, 3, 1, 1, 1, 3, 1, 1, 1 };
		//printOddTimesNum1(arr1);

		int[] arr2 = { 4, 3, 4, 2, 2, 2, 4, 1, 1, 1, 3, 3, 1, 1, 1, 4, 2, 2 };
		printOddTimesNum2(arr2);

		//System.out.println(bit1counts(56));
		//System.out.println(~1);

	}

}