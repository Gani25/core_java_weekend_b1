package day9.generics;

public class Calculator<I> {
	
	private I result;

	public Calculator(I result) {
		
		this.result = result;
	}
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public I getResult() {
		return result;
	}

	public void setResult(I result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Calculator [result=" + result + "]";
	}
	
	

}
