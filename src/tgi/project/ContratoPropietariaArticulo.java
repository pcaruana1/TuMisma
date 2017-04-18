package tgi.project;

public class ContratoPropietariaArticulo {

	private Articulo articulo;
	private ContratoPropietaria contrato;
	private int precio_tasacion;
	private int precio_alquiler;
	
	
	public ContratoPropietariaArticulo(Articulo articulo, int precio_tasacion) {
		super();
		this.articulo = articulo;
		this.precio_tasacion = precio_tasacion;
	}


	public ContratoPropietariaArticulo(Articulo articulo,
			ContratoPropietaria contrato, int precio_tasacion) {
		super();
		this.articulo = articulo;
		this.contrato = contrato;
		this.precio_tasacion = precio_tasacion;
	}


	public ContratoPropietariaArticulo(Articulo articulo,
			ContratoPropietaria contrato, int precio_tasacion, int precio_alquiler) {
		super();
		this.articulo = articulo;
		this.contrato = contrato;
		this.precio_tasacion = precio_tasacion;
		this.precio_alquiler = precio_alquiler;
	}


	public ContratoPropietariaArticulo() {
		// TODO Auto-generated constructor stub
	}


	public Articulo getArticulo() {
		return articulo;
	}


	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}


	public ContratoPropietaria getContrato() {
		return contrato;
	}


	public void setContrato(ContratoPropietaria contrato) {
		this.contrato = contrato;
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