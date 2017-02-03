//Horribly inefficient code that calculates the
//probability of a measurement falling within
//n sigma of the mean.

//Adam Anthony 2/2/2017

public class GaussianSeries {
	
	//Calc the probability of being within n sigma of the 
	//mean with a Gaussian distribution.
	//Gives answer to a tolerance of eps
	double prob(double sigma, double eps)
	{
		double prevVal = 0;
		double val = 0;
		int n = 0;
		do {
			prevVal = val;
			val += c(n)*Math.pow(sigma, 2*n+1);
			//System.out.println(val);
			n++;
			
		}while(Math.abs(prevVal-val) > eps);
		System.out.println("Done in " + n + " iterations.");
		return val;
	}

	//Calculate the coefficient of the infinite series.
	private double c(long n)
	{
		double val = 0;
		val = Math.pow(-0.5, n);
		val *= Math.sqrt(2/Math.PI);
		val *= 1/(double)factorial(n);
		val *= 1/(double)(2*n+1);
		return val;
	}
	//Calculate a factorial
	private long factorial(long x)
	{
		return x <= 1 ? 1 : factorial(x - 1)*x;
	}
}
