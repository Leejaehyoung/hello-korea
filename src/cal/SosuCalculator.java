package cal;

public class SosuCalculator {
	
	public static int sosux(int x) {
		int i;
		if(x==2) return 1;
		else if(x%2==0) return 0;
		for(i=3;i*i<=x;i+=2) {
			if(x%i==0) return 0;
		}
		return 1;
		
	}

	public static int sosuo(int x) {
		int i;
		int count=0;
		for(i=1;i<=x;i++) {
			if(x%i==0) count++;
		}
		if(count==2) return 1;
		else return 0;
		
	}

	public static void main(String[] arg) {
		int a=99;
		
		if(sosuo(a)==1) System.out.println("소수");
		else System.out.println("소수 아닙니다.");
	}

}
