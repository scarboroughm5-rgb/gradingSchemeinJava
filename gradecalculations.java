import java.util.Scanner;

public class gradecalculations {

	public static double calcE (double F, double M, double T,){
		return (0.4 * F + 0.2 * M + 0.1 * T) / 70;
}

	public static double CalculateG (double F, double M, double T, double A) {

	double E = calcE(double F, Double M, Double T,);


	if E < 60 {
		return E; 
	} else if  ( E >= 60 && E < 80) {
	
	double W = ( E - 60 / 20) x 0.3;
	return (1 - W) * E + W * A;

	} else {

	return 0.4 * F + 0.2 * M + 0.1 * T + 0.3 * A;
}


}
