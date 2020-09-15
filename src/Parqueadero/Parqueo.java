package Parqueadero;

import javax.swing.JPasswordField;

public class Parqueo implements Operaciones {
	int i=0 ,j=0,x=0;
	
	Carros estudiantes[]=new Carros[50];
	Carros profe[]=new Carros[40];
	
	 Motos mot[]=new Motos[90];
	 
	 
	 public Parqueo() {
		 
	 }
	 

	
	public void AsignacionEstudiantes(Carros c) {
	
			if( estudiantes[i]==null||estudiantes[i].getOcupado()==false) {
		
		estudiantes[i]=c;
		i++;
		
		if(i==50) {
			
			i=0;
		}
			
		}
	}
	
	
	
	
	public  void AsignacionProfesores(Carros p) {
		
		if( profe[x]==null||profe[x].getOcupado()==false) {
			
			profe[x]=p;
			x++;
			
			if(x==40) {
				
				x=0;
			}
				
			}
		
		
	}
	
	
	
	
	public void AsignacionMot(Motos m) {
		
	if( mot[j]==null||mot[j].getOcupado()==false) {
			
			mot[j]=m;
			j++;
			
			if(j==90) {
				
				j=0;
			}
				
			}
		
		
	}
	
	
	
	
	
	public String verificarEspacio(String tipo,String persona) {
		
		
		if (persona.equals("estudiante")&& tipo.equals("carro")) {
			
			
			
			
			for(int i=0;i<50;i++){
				 
				 if(estudiantes[i].getOcupado()==false) {
					 
					 
					 return "si hay espacio";
					 
				 }
				 
				 
			 }
		}
		
		
		
		 if( tipo.equals("moto")){
			 
		    for(int i=0;i<90;i++){
			 
			 if(mot[i].getOcupado()==false) { 
				 
				 return "si hay espacio";
				 
			 }
			 
			
			 
		 }
	}
		 
		 
		 
		 if (persona.equals("profesor")&& tipo.equals("carro")) {
			 
			 
			 for(int i=0;i<40;i++){
				 
				 if(profe[i].getOcupado()==false) {
					 
					 
					 return "si hay espacio";
					 
				 }
				 
				 
			 }
			 
		 }
		 	 
		 
		
		 
		
		 return "no hay espacio";
		
		
	}
	
	
	
	
	public Carros imprimirEstudiantes(int i) {
			
		
		
		return estudiantes[i];
		
	}
	
	
	
	
public Carros imprimirProfesores(int x) {
			
		
		
		return profe[x];
		
	}



public Motos imprimirMotocicletas(int j) {
	
	
	
	return mot[j];
	
}
	
	
	
	
public void verificacion(String clave) throws Excepcion {
		
	
	
		if(clave.length()<8) {
			
			throw new Excepcion(" demasiado corta\n debe ser mayor a  8 caracteres");			
			
			}
	
	}
	
	
	
	
	
	
	public  void autenticacion(String clave,String claveIntroducida,String usuario,String usuarioIntroducido)throws Excepcion {
		
		
		
		if (usuario.equals(usuarioIntroducido)==false) {		
			
			throw new Excepcion("el usuario es incorrecto");
		}
		
		if (claveIntroducida.equals(clave)==false) {
			
		throw new Excepcion("el password es incorrecto");
		}
		
	}
	
	
	
	
public  void autenticacionAdmin(String claveAdmin,String claveIntroducida,String admin,String usuarioIntroducido)throws Excepcion {
		
		
		
		if (admin.equals(usuarioIntroducido)==false) {		
			
			throw new Excepcion("el usuario es incorrecto");
		}
		
		if (claveIntroducida.equals(claveAdmin)==false) {
			
		throw new Excepcion("el password es incorrecto");
		}
		
	}
	
	
	
	
	
	public void verificacionPlaca(String placas,String nombre,String marca,String tipo,String persona)throws Excepcion {
		
           if(placas.length()<1) {
			
			throw new Excepcion("este espacio no puede quedar  vacio");			
			
			}
           
           if(nombre.length()<1) {
   			
   			throw new Excepcion("este espacio no puede quedar  vacio");			
   			
   			}
           
           
           if(marca.length()<1) {
      			
      			throw new Excepcion("este espacio no puede quedar  vacio");			
      			
      			}	
		
		
	if (persona.equals("estudiante")&& tipo.equals("carro")) {
			
			for(int i=0;i<50;i++) {
				
				if  (estudiantes[i].getPlacas().equals(placas)) {
                     
					throw new Excepcion("esa placa esta  repetida parqueadero estudiantes");		
					
				}		
				
			}		
			
		}
	
	
	   if (persona.equals("profesor")&& tipo.equals("carro")) {
				
				for(int i=0;i<40;i++) {
					
					if  (profe[i].getPlacas().equals(placas)) {
						  
						
						throw new Excepcion("esta placa esta repetida parquedero profes");						
					}				
					
				}			
		}
	   
	   
	   if( tipo.equals("moto")){
			
			 for(int i=0;i<90;i++){
				
				
				
				
				 if  ( mot[i].getPlacas().equals(placas)) {
					
					throw new Excepcion("esta  placa esta repetida parqueadero motos");
					
							
					}		
				}
			}
			 
	
	
	
	
		
		
		
	}
	
	
	


	
	public   String busqueda(String persona,String tipo,String placas ) {
		
	
		
	if (persona.equals("estudiante")&& tipo.equals("carro")) {
			
			for(int i=0;i<50;i++) {
				
				if  (estudiantes[i].getPlacas().equals(placas)) {
                     
					
					
					
					
					estudiantes[i].setNombre("");
					
					estudiantes[i].setPlacas("");
					estudiantes[i].setMarca("");
					estudiantes[i].setOcupado(false);
				
					 return "exitosa";				
					
				}
				
				
				
			}	
			
			
		}
		
		
   if (persona.equals("profesor")&& tipo.equals("carro")) {
			
			for(int i=0;i<40;i++) {
				
				if  (profe[i].getPlacas().equals(placas)) {
					
					profe[i].setNombre("");					
					profe[i].setPlacas("");
					profe[i].setMarca("");
					profe[i].setOcupado(false);
					
					
					
					return "exitosa";					
					
				}
				
				
			}	
			
			
	}

 if( tipo.equals("moto")){
	
	 for(int i=0;i<90;i++){
		
		
		
		
		 if  ( mot[i].getPlacas().equals(placas)) {
			
			
			
			mot[i].setNombre("");
			mot[i].setPlacas("");
			mot[i].setMarca("");
		    mot[i].setOcupado(false);
		    
		    
		        return"exitosa";
				
									
			}	
		 
		
		}
	 
	}
	 

	
	
   return "esa placa no  existe";
 

}
	
	
	
	
	public String busquedaPlaca(String persona,String tipo,String placas) {
		
if (persona.equals("estudiante")&& tipo.equals("carro")) {
			
			for(int i=0;i<50;i++) {
				
				if  (estudiantes[i].getPlacas().equals(placas)) {
                     
					
					
					
				
				
					 return "el auto se encuentra aun en el parqueadero";			
					
				}
				
				
				
			}	
			
			
		}
		
		
   if (persona.equals("profesor")&& tipo.equals("carro")) {
			
			for(int i=0;i<40;i++) {
				
				if  (profe[i].getPlacas().equals(placas)) {
					
					
					
					
					
					return "el auto se encuentra aun en el parqueadero";					
					
				}
				
				
			}	
			
			
	}

 if( tipo.equals("moto")){
	
	 for(int i=0;i<90;i++){
		
		
		
		
		 if  ( mot[i].getPlacas().equals(placas)) {
			
			
			
		    
		    
		        return"el auto se encuentra aun en el parqueadero";
				
									
			}	
		 
		
		}
	 
	}
	 

	
	
   return "ese auto ya salio";
 
		
		
	}
	
	
	
}
