package primerParcial;

public abstract class CalcularArea {
	protected int base;
	protected int altura;
	
	
	public CalcularArea() {
		
		// TODO Auto-generated constructor stub
	}

	public CalcularArea(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + altura;
		result = prime * result + base;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CalcularArea other = (CalcularArea) obj;
		if (altura != other.altura)
			return false;
		if (base != other.base)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Mesa [base=" + base + ", altura=" + altura + "]";
	}
	public int area(int base, int altura){
		return base*altura;
	}
	
	
}
