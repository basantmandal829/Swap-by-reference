public class Pass {
	
	public static void tricky(Ball b1, Ball b2) {
		
		b1.setColor("green"); 
		
		Ball temp = b1;
		b1 = b2;
		b2 = temp; 
		
	}
	
	public static void main(String[] args) {
		
		Ball b1 = new Ball("blue");
		Ball b2 = new Ball("red");
		
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


