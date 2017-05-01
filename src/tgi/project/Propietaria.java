package tgi.project;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


/**
 * Write a description of class Propietaria here.
 * 
 * @author Patricia Caruana 
 * @version 01/05/2017
 */
@Entity
@Table
public class Propietaria implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 7721015232004528879L;
	
	@Id
	@GeneratedValue(generator="id")
	@TableGenerator(name="Propietaria", table="sqlite_sequence",
	    pkColumnName="name", valueColumnName="seq", pkColumnValue="departments")
	private Integer id;
	private String name;
	private String address;
    private int id_propietaria;
    private String DNI_propietaria;
    private String nombre_propietaria;
    private String apellidos_propietaria;
    private String domicilio_propietaria;
    private int codigopostal_propietaria ;
    private int telefono_propietaria;
    private String email_propietaria;
    private LocalDate fecha_de_nacimiento_propietaria;
    private String ncuenta_propietaria;
	@OneToMany(mappedBy="id")
    private ArrayList<ContratoPropietaria> lista_contratos = new ArrayList<ContratoPropietaria>();
	@OneToMany(mappedBy="id")
    private ArrayList<PagosPropietaria> lista_pagos= new ArrayList<PagosPropietaria>();

    /**
     * Constructor for objects of class Propietaria
     */
   
	public Propietaria(String dNI_propietaria,
			String nombre_propietaria, String apellidos_propietaria,
			String domicilio_propietaria, int cp, int telefono_propietaria,
			String email_propietaria,
			LocalDate fecha_de_nacimiento_propietaria,
			String ncuenta_propietaria) {
		this.id_propietaria = 0;
		this.DNI_propietaria = dNI_propietaria;
		this.nombre_propietaria = nombre_propietaria;
		this.apellidos_propietaria = apellidos_propietaria;
		this.domicilio_propietaria = domicilio_propietaria;
		this.codigopostal_propietaria  = cp;
		this.telefono_propietaria = telefono_propietaria;
		this.email_propietaria = email_propietaria;
		this.fecha_de_nacimiento_propietaria = fecha_de_nacimiento_propietaria;
		this.ncuenta_propietaria = ncuenta_propietaria;
	}
	
	
	
	public Propietaria(int id_propietaria, String dNI_propietaria,
			String nombre_propietaria, String apellidos_propietaria,
			String domicilio_propietaria, int codigopostal_propietaria,
			int telefono_propietaria, String email_propietaria,
			String ncuenta_propietaria) {
		super();
		this.id_propietaria = id_propietaria;
		DNI_propietaria = dNI_propietaria;
		this.nombre_propietaria = nombre_propietaria;
		this.apellidos_propietaria = apellidos_propietaria;
		this.domicilio_propietaria = domicilio_propietaria;
		this.codigopostal_propietaria = codigopostal_propietaria;
		this.telefono_propietaria = telefono_propietaria;
		this.email_propietaria = email_propietaria;
		this.ncuenta_propietaria = ncuenta_propietaria;
	}

	// Hashcode uses primary keys, since they are unique
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}

		// Equals uses primary keys, since they are unique
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Propietaria other = (Propietaria) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}

	public Propietaria(int id_propietaria) {
		super();
		this.id_propietaria = id_propietaria;
	}

	public Propietaria() {
		// TODO Auto-generated constructor stub
	}

	public int getId_propietaria() {
		return id_propietaria;
	}

	public void setId_propietaria(int id_propietaria) {
		this.id_propietaria = id_propietaria;
	}

	public String getDNI_propietaria() {
		return DNI_propietaria;
	}

	public void setDNI_propietaria(String dNI_propietaria) {
		DNI_propietaria = dNI_propietaria;
	}

	public String getNombre_propietaria() {
		return nombre_propietaria;
	}

	public void setNombre_propietaria(String nombre_propietaria) {
		this.nombre_propietaria = nombre_propietaria;
	}

	public String getApellidos_propietaria() {
		return apellidos_propietaria;
	}

	public void setApellidos_propietaria(String apellidos_propietaria) {
		this.apellidos_propietaria = apellidos_propietaria;
	}

	public String getDomicilio_propietaria() {
		return domicilio_propietaria;
	}

	public void setDomicilio_propietaria(String domicilio_propietaria) {
		this.domicilio_propietaria = domicilio_propietaria;
	}

		
	public int getCodigopostal_propietaria() {
		return codigopostal_propietaria ;
	}

	public void setCodigopostal_propietaria(int cp) {
		this.codigopostal_propietaria  = cp;
	}

	public int getTelefono_propietaria() {
		return telefono_propietaria;
	}

	public void setTelefono_propietaria(int telefono_propietaria) {
		this.telefono_propietaria = telefono_propietaria;
	}

	public String getEmail_propietaria() {
		return email_propietaria;
	}

	public void setEmail_propietaria(String email_propietaria) {
		this.email_propietaria = email_propietaria;
	}

	public LocalDate getFecha_de_nacimiento_propietaria() {
		return fecha_de_nacimiento_propietaria;
	}

	public void setFecha_de_nacimiento_propietaria(
			LocalDate fecha_de_nacimiento_propietaria) {
		this.fecha_de_nacimiento_propietaria = fecha_de_nacimiento_propietaria;
	}

	public String getNcuenta_propietaria() {
		return ncuenta_propietaria;
	}

	public void setNcuenta_propietaria(String ncuenta_propietaria) {
		this.ncuenta_propietaria = ncuenta_propietaria;
	}

	public ArrayList<ContratoPropietaria> getLista_contratos() {
		return lista_contratos;
	}

	public void setLista_contratos(ArrayList<ContratoPropietaria> lista_contratos) {
		this.lista_contratos = lista_contratos;
	}

	public ArrayList<PagosPropietaria> getLista_pagos() {
		return lista_pagos;
	}

	public void setLista_pagos(ArrayList<PagosPropietaria> lista_pagos) {
		this.lista_pagos = lista_pagos;
	}
	
	
	
}