package curso_java.entitys;

public class TriangleEntity {

	private int base;
	private int cat1;
	private int cat2;

	public TriangleEntity(int base, int cat1, int cat2) {
		this.setBase(base);
		this.setCat1(cat1);
		this.setCat2(cat2);
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getCat1() {
		return cat1;
	}

	public void setCat1(int cat1) {
		this.cat1 = cat1;
	}

	public int getCat2() {
		return cat2;
	}

	public void setCat2(int cat2) {
		this.cat2 = cat2;
	}
	
	public double calcularArea() {
		int p = this.getBase() + this.getCat1() + this.getCat2();
		return Math.sqrt(p*(p-this.getBase())*(p-this.getCat1())*(p-this.getCat2()));
	}
	
}
