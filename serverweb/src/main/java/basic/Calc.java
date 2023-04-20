package basic;

public class Calc {
	public double calc(double num1 , double num2, String method) {
		double result = 0;
		
		switch(method) {
			case "+":{
				result = num1+num2;
				break;
			}
			case "-":{
				result = num1-num2;
				break;
			}
			case "*":{
				result = num1*num2;
				break;
			}
			case "/":{
				result = num1/num2;
				break;
			}
			default:
		}
		
		return result;
	}
}
