package Parqueadero;

public class Porteria {
	
	
	String placas,nombre,marca;
	boolean ocupado=false;
	
	
	
	public Porteria(String placas,String nombre,String marca,boolean ocupado) {
		
		
		this.placas=placas;
		this.nombre=nombre;
		this.marca=marca;
		this.ocupado=ocupado;
		
		
	}


        
	public String getPlacas() {
		return placas;
	}



	public void setPlacas(String placas) {
		this.placas = placas;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public boolean getOcupado() {
		return ocupado;
	}



	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	
	
	

}
