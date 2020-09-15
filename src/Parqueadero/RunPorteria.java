package Parqueadero;


import javax.swing.JOptionPane;
import javax.swing.JPasswordField;



public class RunPorteria {

	
	
	public static void main (String[]args) {
		
		MyIcon icon = new MyIcon();
        IconoMoto icon1=new IconoMoto();
        IconoCarro icon2=new IconoCarro();
		String image="[ ]",imagen="[x]";
		int estado,parqueaderoProfes=0,parqueaderoEstudiantes=0,parqueaderoMotos=0,parqueaderoProfes1=0,parqueaderoEstudiantes1=0,parqueaderoMotos1=0;
		String persona="",opcion,nombre,placas,marca,tipo="",clave="", usuario="",admin="admin",claveAdmin="admin";
		boolean ocupado=true;
		
		
	
		
		
		Carros car1=new Carros("","","","",false);		
		
		Motos mot1=new Motos ("","","","",false);
		
		
		
		
		Parqueo par1=new Parqueo();	
		
		Porteria p;
		
      for(int j=0;j<50;j++) {
    	  
			par1.AsignacionEstudiantes(car1);
			
			
		}
      
      for(int r=0;r<40;r++) {
    	  
			par1.AsignacionProfesores(car1);
			
			
		}
      

      for(int r=0;r<90;r++) {
    	  
			par1.AsignacionMot(mot1);
			
			
		}
      
      
      
      
      
      
      
      boolean  ciclo=true;
      
      while(ciclo) {
      
      
      //impresion parqueadero estudiantes
    	  System.out.println("PARQUEADERO ESTUDIANTES");
      
      for(int y=0;y<50;y++) {
			
			p=par1.imprimirEstudiantes(y);
    	  
    	  if (p.getOcupado()==false) {
				
				
				
				System.out.print(image);
				
			}
			
			else {
				
				
				System.out.print(imagen);
			}
      
      }//fin de  la impresion
      System.out.println(" ");
      
      
      //inicio impresion Profesores
      
 System.out.println("PARQUEADERO PROFESORES");
      
      for(int x=0;x<40;x++) {
			
			p=par1.imprimirProfesores(x);
    	  
    	  if (p.getOcupado()==false) {
				
				
				
				System.out.print(image);
				
			}
			
			else {
				
				 
				System.out.print(imagen);
			}
      
      }//fin de  la impresion
      
      
      
      System.out.println(" ");
      
      
      
System.out.println("PARQUEADERO MOTOCICLETAS");
      
      for(int j=0;j<90;j++) {
			
			p=par1.imprimirMotocicletas(j);
    	  
    	  if (p.getOcupado()==false) {
				
				
				
				System.out.print(image);
				
			}
			
			else {
				
				
				System.out.print(imagen);
			}
      
      }//fin de  la impresion
      
      
      
      
      
      
      JOptionPane.showMessageDialog(null," verificacion de espacio  en el parqueadero");
      String [] v= {"moto","carro"};		
		tipo=(String)JOptionPane.showInputDialog(null, "Seleccione el tipo de vehiculo","seleccion",JOptionPane.INFORMATION_MESSAGE,icon,v,v[0]);
		String [] personas= {"estudiante","profesor"};	
		persona=(String)JOptionPane.showInputDialog(null, "seleccione su rango", "rango", JOptionPane.INFORMATION_MESSAGE, null,personas, personas[0]);
    
    
    String espacio= par1.verificarEspacio(tipo,persona);
    
    JOptionPane.showMessageDialog(null," "+espacio);
      
		boolean one=true;
      
		while(one) {
			
			
			
try {
	 JPasswordField pass= new JPasswordField(10);
	 pass.setEchoChar('*');
			 usuario=JOptionPane.showInputDialog("ingrese  su nombre de usuario");
			 JOptionPane.showConfirmDialog(null, pass, "password",JOptionPane.DEFAULT_OPTION);
			
			clave= new String(pass.getPassword());
			
			 par1.verificacion(clave);
		           one=false;
                        }


catch(Excepcion e) {
	
	
	JOptionPane.showMessageDialog(null,"no se pudo registrar debido a que  el password es "+ e.getMessage());
	
}
		
		}//while verificacion de longitud
		
		
		
		String usuarioIntroducido="", claveIntroducida="";
		
		 
    String [] ingreso= {"ingreso","salida","cierre","buscar automovil"};
		
		
		opcion=(String)JOptionPane.showInputDialog(null, "Seleccione una opcion ","seleccion",JOptionPane.INFORMATION_MESSAGE,null,ingreso,ingreso[0]);
		
		
		
		switch(opcion) {
		
		
		case "ingreso":
			boolean repetir=true;
			
			
			
			while(repetir) {
				
				
				try {
					JPasswordField pass= new JPasswordField(10);
					pass.setEchoChar('*');
				
				usuarioIntroducido=JOptionPane.showInputDialog("ingrese  su nombre de usuario");
				
				
				JOptionPane.showConfirmDialog(null, pass, "ingrese su password",JOptionPane.DEFAULT_OPTION);
				
				claveIntroducida=new String(pass.getPassword());
				
				
				
				par1.autenticacion(clave,claveIntroducida,usuario,usuarioIntroducido);
				
				repetir=false;
				break;
				
				}
				
				
				catch(Excepcion u) {
					
					JOptionPane.showMessageDialog(null,"no pudo loguear debido a que: "+ u.getMessage());
					
					
					
					
					
				}
				
			}// autenticacion
			
		
			boolean verifi=true;
			
			while(verifi) {
			
			try {
		
		nombre=JOptionPane.showInputDialog("ingrese su nombre: ");
		placas=JOptionPane.showInputDialog("ingrese las plascas de su vehiculo: ");	
		marca=JOptionPane.showInputDialog("ingrese la marca de su vehiculo: ");
		
		String [] vehiculo= {"moto","carro"};		
		tipo=(String)JOptionPane.showInputDialog(null, "Seleccione el tipo de vehiculo","seleccion",JOptionPane.INFORMATION_MESSAGE,null,vehiculo,vehiculo[0]);
		String [] per= {"estudiante","profesor"};	
		persona=(String)JOptionPane.showInputDialog(null, "seleccione su rango", "rango", JOptionPane.INFORMATION_MESSAGE, null,per, per[0]);
		
		 par1.verificacionPlaca(placas, nombre, marca, tipo, persona);
		
			
			
			
		estado=JOptionPane.showConfirmDialog(null,"selecione si desea tomar el  parqueadero", "Tomar el parqueadero",JOptionPane.YES_NO_OPTION);
		
		
		if((estado==0 && tipo.equals("carro")&& persona.equals("profesor"))&&par1.verificarEspacio(tipo, persona).equals("si hay espacio")) {
			
			JOptionPane.showMessageDialog(null, "bienvenido  al parqueadero de carros profesores", "carros", JOptionPane.DEFAULT_OPTION, icon2);
			
			car1=new Carros(placas,nombre,marca,tipo,ocupado);
			
			par1.AsignacionProfesores(car1);
			
			parqueaderoProfes++;
			
			verifi=false;
			break;
			
			}
		
		
		
		
		if((estado==0 && tipo.equals("carro")&& persona.equals("estudiante"))&&par1.verificarEspacio(tipo, persona).equals("si hay espacio")) {
		

			JOptionPane.showMessageDialog(null, "bienvenido  al parqueadero de carros", "carros", JOptionPane.DEFAULT_OPTION, icon2);
			
		    car1=new Carros(placas,nombre,marca,tipo,ocupado);
			
			par1.AsignacionEstudiantes(car1);
			parqueaderoEstudiantes++;
			
			verifi=false;
			break;
		
		}
			
			
			if((estado==0 && tipo.equals("moto"))&& par1.verificarEspacio(tipo, persona).equals("si hay espacio")) {		
				
				
				JOptionPane.showMessageDialog(null, "bienvenido  al parqueadero de motos", "Motos", JOptionPane.DEFAULT_OPTION, icon1);

			
				
				mot1=new Motos(placas,nombre,marca,tipo,ocupado);
				
				par1.AsignacionMot(mot1);
				parqueaderoMotos++;
				verifi=false;
				break;
			  
				}
			
			else {
				JOptionPane.showMessageDialog(null,"no hay espacio: ");
				
			}
			
			
			
			}
			
			
			

			catch(Excepcion f) {
				JOptionPane.showMessageDialog(null,"no se pudo  asignar un parqueadero debido a  que : "+ f.getMessage());
				
				
			}
			
			
			}
			break;
		
		
		case "salida":
			boolean intento=true;
			
			
			
			while(intento) {
				
				
				try {
					JPasswordField pass= new JPasswordField(10);
					pass.setEchoChar('*');
				
				usuarioIntroducido=JOptionPane.showInputDialog("ingrese  su nombre de usuario");				
				
                JOptionPane.showConfirmDialog(null, pass, "ingrese su password",JOptionPane.DEFAULT_OPTION);
				
				claveIntroducida=new String(pass.getPassword());
				
				par1.autenticacion(clave,claveIntroducida,usuario,usuarioIntroducido);
				
				intento=false;
				break;
				
				}
				
				
				catch(Excepcion h) {
					
					JOptionPane.showMessageDialog(null,"no pudo loguear debido a que: "+ h.getMessage());
					
					
					
					
					
				}
				
			}// autenticacion
			
			
			String [] ocupacion= {"estudiante","profesor"};	
			persona=(String)JOptionPane.showInputDialog(null, "seleccione su rango", "rango", JOptionPane.INFORMATION_MESSAGE, null,ocupacion, ocupacion[0]);
			String [] vehicul= {"moto","carro"};
			
			
			tipo=(String)JOptionPane.showInputDialog(null, "Seleccione el tipo de vehiculo","seleccion",JOptionPane.INFORMATION_MESSAGE,null,vehicul,vehicul[0]);		
			placas=JOptionPane.showInputDialog("ingrese su placa: ");
			
		
			
			
			String salida=par1.busqueda(persona, tipo, placas);
			
			JOptionPane.showMessageDialog(null, "la salida  a  sido: "+salida);
			
			
			
			
			if(salida.equals("exitosa")&&ocupacion.equals("profesor")&&tipo.equals("carro")) {
				parqueaderoProfes1++;
			}
			if(salida.equals("exitosa")&&ocupacion.equals("estudiante")&&tipo.equals("carro")) {
				parqueaderoEstudiantes1++;
			}
			if(salida.equals("exitosa")&&tipo.equals("moto")) {
				parqueaderoMotos1++;
			}
			
			
			
			break;
		
		
		case "cierre":
		
			
			 boolean bucle=true;
			
			while(bucle) {
				
				
				try {
				
					JPasswordField pass= new JPasswordField(10);
					pass.setEchoChar('*');
					
				   usuarioIntroducido=JOptionPane.showInputDialog("ingrese  su nombre de usuario");
				 
				   JOptionPane.showConfirmDialog(null, pass, "ingrese su password",JOptionPane.DEFAULT_OPTION);
					
					claveIntroducida=new String(pass.getPassword());
				
				
				
				par1.autenticacionAdmin(claveAdmin, claveIntroducida,admin, usuarioIntroducido);
				
				bucle=false;
				break;
				
				}
				
				
				catch(Excepcion f) {
					
					JOptionPane.showMessageDialog(null,"no pudo loguear debido a que: "+ f.getMessage());
					
					
					
					
					
				}
				
			}//autenticacion admin
			
			
			
			String [] resultado= {"Parqueadero PROFES","Parqueadero ESTUDIANTES","MOTOS"};	
		int	dia=JOptionPane.showOptionDialog(null, "seleccione cual parqueadero desea revisar resultados", "final", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,resultado, resultado[0]);
			
			
			
		if (dia==0) {
			
			
			JOptionPane.showMessageDialog(null,"el numero de  carros  que ingreso en el parqueadero de  docentes fue : "+parqueaderoProfes);
			JOptionPane.showMessageDialog(null,"el numero de  carros  que salio del parqueadero de  docentes fue : "+parqueaderoProfes1);
			JOptionPane.showMessageDialog(null,"el numero de  carros  que quedo en el parqueadero de  docentes fue : "+(parqueaderoProfes-parqueaderoProfes1));
			
		}
		
		
    if (dia==1) {
			
			JOptionPane.showMessageDialog(null,"el numero de  carros  que ingreso en el parqueadero de  Estudiantes fue : "+parqueaderoEstudiantes);
			
			JOptionPane.showMessageDialog(null,"el numero de  carros  que salio del parqueadero de  Estudiantes fue : "+parqueaderoEstudiantes1);
			JOptionPane.showMessageDialog(null,"el numero de  carros  que quedo en el parqueadero de  Estudiantes fue : "+(parqueaderoEstudiantes-parqueaderoEstudiantes1));
		}
    
    if (dia==2) {
		
		JOptionPane.showMessageDialog(null,"el numero de  carros  que ingreso en el parqueadero de motocicletas fue : "+parqueaderoMotos);
		
		JOptionPane.showMessageDialog(null,"el numero de  carros  que salio del parqueadero de motocicletas fue : "+parqueaderoMotos1);
		JOptionPane.showMessageDialog(null,"el numero de  carros  que quedo en el parqueadero de  motocicletas  fue : "+(parqueaderoMotos-parqueaderoMotos1));
		
	}
		
		
    break;
    
    
		case "buscar automovil":
			

			String [] ocu= {"estudiante","profesor"};	
			persona=(String)JOptionPane.showInputDialog(null, "seleccione su rango", "rango", JOptionPane.INFORMATION_MESSAGE, null,ocu, ocu[0]);
			String [] movil= {"moto","carro"};
			
			
			tipo=(String)JOptionPane.showInputDialog(null, "Seleccione el tipo de vehiculo","seleccion",JOptionPane.INFORMATION_MESSAGE,null,movil,movil[0]);		
			placas=JOptionPane.showInputDialog("ingrese su placa: ");
			
		
			
			
			String s=par1.busquedaPlaca(persona,tipo, placas);
			
			JOptionPane.showMessageDialog(null,"el auto de  placas :"+placas+ " "+s);
			
			
			
			break;
			
			
			
			
		
		}//switch entrada  salida y cierre
		
		
		System.out.println(" ");
		
		
		
	
		
		
		
      }//ciclo while  fundamental
		
	}
}


//ponerle un contador y un cierre del parqueadero de cada parqueadero al final del  dia , investigar colecciones y calendar//buscar con la placa paa ver si se  fue  el auto o esta hay
