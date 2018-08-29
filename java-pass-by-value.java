public class Pass {
	
	public static void badSwap(int var1, int var2) {
		int temp = var1;
		var1 = var2;
		var2 = temp; // this won't work. because they swap copied value. 
	}
	
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		
		badSwap(i,j);
		
		System.out.println("int i : " + i);
		System.out.println("int j : " + j);
	}

}


/* result 

int i : 10
int j : 20

*/