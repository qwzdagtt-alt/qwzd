package getCount;

public class getCount {
	public static int getCount(int[] numList, int target]) {
		//여기와
		int count = 0;
		//기준보다 큰 숫자의 개수를 저장할 변수 초기화
		for(int i =0; i<numList.length; 1++) {
			if(numList[i]>target) {
		//현재 값이 기준 숫자(target)보다 큰지 비교
			count++;
			//조건이 참이면 1씩 더한다
		}
		return count;
		}
	}
	public static void main(String[] args) {
		int[] numList = {1, 2, 3, 4};
		int target = 1;
		//테스트를 위한 숫자
		int result = getCount(numList, target);
		System.out.println();
		//여기는 AI도 써봤지만 도저히 이해가 가지 않습니다.
	}
	
}