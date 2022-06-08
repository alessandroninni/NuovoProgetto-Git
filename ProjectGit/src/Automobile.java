
public class Automobile extends Veicolo {
	private String targa;
	private String modello;

	public Automobile(String targa, String modello, String tipoVeicolo, int numTelaio) {
		super(tipoVeicolo, numTelaio);
		this.targa = targa;
		this.modello = modello;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	@Override
	public void stampaDatiVeicolo() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Automobile [targa =" + targa + ", modello =" + modello + ", Veicolo =" + tipoVeicolo + ", Telaio ="
				+ numTelaio + "]";

	}

}
