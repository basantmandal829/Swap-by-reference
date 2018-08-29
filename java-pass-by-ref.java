public class Pass {
	
	public static void tricky(Ball b1, Ball b2) {
		
		/* 	
			let's assume blue ball's location is #00b1 , red ball's location is #00b2.
			then argument b1's location would be #00a1, b2 would be #00a2. 
			#00a1 pointing to blue ball. 
			#00a2 pointing to red ball.
		*/

		b1.setColor("green"); 
		// this will work. because Method Argument will copy the reference, and that copied reference still pointing to same object.
		// #00a1(#00b1)'s color changed - green. 
		
		Ball temp = b1;
		b1 = b2;
		b2 = temp; 
		
		// this won't work. because they swap copied references each other. not original one.
			
		/* 	
			#00a1 : red ball. 
			#00a2 : green ball
			
			but still. 
			#00b1 : green ball
			#00b2 : red ball.
		*/
		
	}
	
	public static void main(String[] args) {
		
		Ball b1 = new Ball("blue");
		Ball b2 = new Ball("red");
		
		/* 	
			let's assume blue ball's location is #00b1 , red ball's location is #00b2.
		*/
		
		tricky(b1,b2);
		
		System.out.println("b1 : " + b1); // #00b1 - green. 
		System.out.println("b2 : " + b2); // #00b2 - red.
	}
}


public class Ball {
	
	String color = "";

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Ball (String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Ball [color=" + color + "]";
	}

}


/* 
b1 : Ball [color=green]
b2 : Ball [color=red]
*/


