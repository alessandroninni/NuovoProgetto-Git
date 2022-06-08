
public abstract class Veicolo {
	protected String tipoVeicolo;
	protected int numTelaio;

	public Veicolo(String tipoVeicolo, int numTelaio) {
		super();
		this.tipoVeicolo = tipoVeicolo;
		this.numTelaio = numTelaio;

	}

	public String getTipoVeicolo() {
		return tipoVeicolo;
	}

	public void setTipoVeicolo(String tipoVeicolo) {
		this.tipoVeicolo = tipoVeicolo;
	}

	public int getNumTelaio() {
		return numTelaio;
	}

	public void setNumTelaio(int numTelaio) {
		this.numTelaio = numTelaio;
	}

	public abstract void stampaDatiVeicolo();

}
