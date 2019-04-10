package primerParcial;

public final class CalcularCosto extends CalcularArea {
    private int costo;

	public CalcularCosto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CalcularCosto(int base, int altura) {
		super(base, altura);
	}
	public int costo(int base, int altura){
		return (base*altura)*100;
	}

}
