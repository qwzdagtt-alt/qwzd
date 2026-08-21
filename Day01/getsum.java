package getsum;

public class getsum {
	public static int getSum(int[] numList) {
		int sum = 0;
		for(int i =0; i<numList.length; i++) {			
			sum += numList[i];			
		}
		return sum;
		//반환한다
	}
    public static void main(String[] args) {
    	int[] numList = {1, 3, 2, 4};
    	System.out.println(getSum(numList));
    }
}