public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	public int multiple(int a, int b) {
		return a * b;
	}
	public int devide(int a, int b) {
		if (b==0) {
			throw new IllegalArgumentException("Error message!");
		}
		return a / b;
		
	}
	public boolean boundary (int a, int b) {
		if ((9999> a) && (a<0) && (b<0)){
			return true;
			
		}else {
			return false;
		}
	}

}
