package practice01;

//[7/6] 문제 3번
public class Game369 {

	public static void main(String[] args) {
		int clapcount = 0;
		int num = 1;
		while(num<100){
			String sNum = String.valueOf(num);
			if(sNum.length()==1){
				char c1 = sNum.charAt(0);
				if(c1%3==0){
					clapcount = clapcount+1;
				}
				num++;
			}
			else{
				char c1 = sNum.charAt(0);
				char c2 = sNum.charAt(1);
			}
		}
	}
}