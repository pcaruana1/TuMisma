package tgi.project;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Write a description of class Propietaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Propietaria
{
    // instance variables - replace the example below with your own
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
    private ArrayList<ContratoPropietaria> lista_contratos;
    private ArrayList<PagosPropietaria> lista_pagos;

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