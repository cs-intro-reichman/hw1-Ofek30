// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args)
	{
		
		int money = Integer.parseInt(args[0]);
		double prc = Double.parseDouble(args[1]);
		int year = Integer.parseInt(args[2]);
		int i=0;
		double prof;
		
		prof=prc/100;
		prof=prof+1;
		double ans= prof*money;

		while(i<year-1)
		{
			ans= prof*ans;
			i++;
			
		}
		System.out.println("After " + year +" years, a $"+ money+ " saved at " + prc + "% will yield $" + (int)ans);
		//After 30 years, a $210 saved at 5.0%25 will yield $907%
	}
}