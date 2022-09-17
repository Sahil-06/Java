package Entities;

public class Data {
	private double num1;
	private double num2;
	private double addition;
	private double subtraction;
	private double division;
	private double multiplication;
	
	public Data(double num1, double num2) {
		this.num1=num1;
		this.num2=num2;
		
	}

	public double getAddition() {
		return addition;
	}

	public void setAddition(double addition) {
		this.addition = addition;
	}

	public double getSubtraction() {
		return subtraction;
	}

	public void setSubtraction(double subtraction) {
		this.subtraction = subtraction;
	}

	public double getDivision() {
		return division;
	}

	public void setDivision(double division) {
		this.division = division;
		if(this.num2==0) {
			this.num2=1;
		}else {
			this.division=this.num1/this.num2;
		}
		
		
	}

	public double getMultiplication() {
		return multiplication;
	}

	public void setMultiplication(double multiplication) {
		this.multiplication = multiplication;
	}
	
	
	

}
