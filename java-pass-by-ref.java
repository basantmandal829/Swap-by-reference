public class Pass {
	
	public static void tricky(Ball b1, Ball b2) {

		b1.setColor("green"); // this will work. because Method Argument will copy the reference, and that copied reference still pointing to same object.
		
		Ball temp = b1;
		b1 = b2;
		b2 = temp; // this won't work. because they swap copied reference. 
	
	}
	
	public static void main(String[] args) {
		
		Ball b1 = new Ball("blue");
		Ball b2 = new Ball("red");

		tricky(b1,b2);
		
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
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


