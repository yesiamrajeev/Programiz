package CSW.CSW2;

public class factorial {

	static int fact(int n) {
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(fact(5));

	}

}