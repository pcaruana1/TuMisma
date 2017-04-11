package tgi.project;

public class ContratoPropietariaArticulo {

	private int n_referencia;
	private int n_contrato;
	private int precio_tasacion;
	private int precio_alquiler;

	
	public ContratoPropietariaArticulo(int n_referencia, int n_contrato,
			int precio_tasacion, int precio_alquiler) {
		super();
		this.n_referencia = n_referencia;
		this.n_contrato = n_contrato;
		this.precio_tasacion = precio_tasacion;
		this.precio_alquiler = precio_alquiler;
	}


	public ContratoPropietariaArticulo(int precio_tasacion) {
		super();
		this.precio_tasacion = precio_tasacion;
	}


	public int getN_referencia() {
		return n_referencia;
	}

	public void setN_referencia(int n_referencia) {
		this.n_referencia = n_referencia;
	}

	public int getN_contrato() {
		return n_contrato;
	}

	public void setN_contrato(int n_contrato) {
		this.n_contrato = n_contrato;
	}

	public int getPrecio_tasacion() {
		return precio_tasacion;
	}

	public void setPrecio_tasacion(int precio_tasacion) {
		this.precio_tasacion = precio_tasacion;
	}

	public int getPrecio_alquiler() {
		return precio_alquiler;
	}

	public void setPrecio_alquiler(int precio_alquiler) {
		this.precio_alquiler = precio_alquiler;
	}
	
	
}

