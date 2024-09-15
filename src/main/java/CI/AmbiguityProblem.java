package CI;

public class AmbiguityProblem {
	
	private int a;
	private int b;
	
	public AmbiguityProblem(double a,double b) {
		System.out.println("this is double,double constructor");
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("value of A : " + this.a);
		System.out.println("valuenof B : "+ this.b);
		
	}
	
	public AmbiguityProblem(int a,int b){
		System.out.println("this is int,int constructor");
		 this.a = a;
		 this.b = b;
	}
	
	public AmbiguityProblem(String a,String b){
		System.out.println("this is String,String constructor");
		 this.a = Integer.parseInt(a);
		 this.b = Integer.parseInt(b);
	}
	
	
	public void Check() {
		System.out.println("Sum of A + B :" + (a+b));
	}

}
