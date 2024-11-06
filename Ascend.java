// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) 
	{
		int lim=Integer.parseInt(args[0]);
		double a = Math.random()*lim;
		double b =Math.random()*lim;
		double c =Math.random()*lim;
		System.err.println((int)a+" "+(int)b+" "+(int)c);
		double max,mid,min;
		max=Math.max(a, b);
		min=Math.min(a, b);
		max=Math.max(max,c);
		min=Math.min(min, c);
		mid=a+b+c-min-max;
		System.err.println((int)min+" "+(int)mid+" "+(int)max);


		



		// Replace this comment with your code
	}
}
