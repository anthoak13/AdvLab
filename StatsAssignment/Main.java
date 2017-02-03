
public class Main {

	public static void main(String[] args) {

		//SqrtCalc calc = new SqrtCalc();
		//System.out.println(calc.sqrtCalc(2));
		GaussianSeries g = new GaussianSeries();
		System.out.println("1 sigma: " + g.prob(1,1E-6));
		System.out.println("2 sigma: " + g.prob(2,1E-6));
		System.out.println("3 sigma: " + g.prob(3,1E-6));
	}

}
