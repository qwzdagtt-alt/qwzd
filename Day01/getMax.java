package getMax;

public class getMax {
	public static int getMax(int[] numList) {
		int max = numList[0];
		for(int i = 1; i<numList.length; i++) {
			if(numList[i]>max)
		    //if를 붙여서 더 큰 숫자를 발견할 시를 위하여
			max = numList[i];
		}
		return max;
	}
	public static void main(String[] args) {
		int[] numList = {1, 2, 3, 4};
		System.out.println(getMax(numList));
	}
}
