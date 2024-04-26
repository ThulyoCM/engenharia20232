package engenharia20232;

public class Thulio {
	
	private Integer a;
	private Integer b;
	
	private Integer total;
	
	public Integer somar(Integer a, Integer b) {
		this.a = a;
		this.b = b;
		
		this.total = getA() + getB();
		
		return getTotal();
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}
	
	public Integer getTotal() {
		return total;
	}
	
	
	

}
