package interest;

public class interest {
	public double comp_interest(double principal,double rate,double time)
	{
		double intrst;
		intrst=principal*Math.pow((1+rate/100),time);
		return intrst;
	}
	public double simple_interest(double principal,double rate,double time)
	{
		double intrst;
		intrst=(principal*rate*time/100);
		return intrst;
	}
}