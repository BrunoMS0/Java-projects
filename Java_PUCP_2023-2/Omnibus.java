import java.util.ArrayList;
import java.util.Scanner;
class Omnibus{
	private String placa;
	private String chofer;
	private ArrayList<String>ruta;
	private int asientosPC;
	private int asientosCT;
	private ArrayList<Pasajero>pasajeros;
	
	public Omnibus(){
		asientosCT = 0;
		asientosPC = 0;
		pasajeros = new ArrayList<>();
		ruta = new ArrayList<>();
	}
	
	public void setPlaca(String placa){
		this.placa = placa;
	}
	public String getPlaca(){
		return placa;
	}
	
	public void setChofer(String chofer){
		this.chofer = chofer;
	}
	public String getChofer(){
		return chofer;
	}
	
	public void setAsientosPC(int asientosPC){
		this.asientosPC = asientosPC;
	}
	public int getAsientosPC(){
		return asientosPC;
	}
	
	public void setAsientosCT(int asientosCT){
		this.asientosCT = asientosCT;
	}
	public int getAsientosCT(){
		return asientosCT;
	}
	
	public void cargarDatosOmnibus(String placaOmni,Scanner arch){
		placa = placaOmni;
		chofer = arch.next();
		while(!arch.hasNextInt()){
			String ciudad;
			ciudad = arch.next();
			ruta.add(ciudad);
		}
		asientosPC = arch.nextInt();
		asientosCT = arch.nextInt();
	}
	
	public void cargarDatosPasajero(ArrayList<Omnibus> flota,String tipo,Scanner arch){
		Pasajero pasaj;
		if(tipo.compareTo("P")==0){
			pasaj = new PrimeraClase();
		}
		else{
			pasaj = new claseTurista();
		}
		pasaj.leerDatos(arch);
		String placa = pasaj.asignarBus(flota,tipo);
		if(placa.compareTo("FIN")!=0){
			for(Omnibus omni: flota){
				if(omni.getPlaca().compareTo(placa)==0){
					omni.colocarPasajero(pasaj);
					break;
				}
			}
		}
	}
	
	public Boolean buscarCiudades(String destino,String tipo){
		for(String ciudad: ruta){
			if(ciudad.compareTo(destino)==0){
				if(tipo.compareTo("P")==0){
					if(asientosPC>0){
						asientosPC--;
						return true;
					}
					return false;
				}
				else{
					if(asientosCT>0){
						asientosCT--;
						return true;
					}
					return false;
				}
			}
		}
		return false;
	}
	
	public void colocarPasajero(Pasajero pasaj){
		pasajeros.add(pasaj);
	}
	
	public void imprimir(){
		imprimeLinea('=',50);
		System.out.println("Placa: " + placa);
		String nombres[] = chofer.split("/");
		//String soloNombre[] = nombres[2].split("-");
		System.out.println("Chofer: " + nombres[2] + " " + nombres[0] + " " + nombres[1]);
		System.out.println("Asiento Primera Clase: " + asientosPC);
		System.out.println("Asientos Clase Turista: " + asientosCT);
		imprimeLinea('-',50);
		
		System.out.print("Ruta: ");
		for(String ciudades: ruta){
			System.out.print("  " + ciudades);
		}
		System.out.println();
		imprimeLinea('-',50);
		System.out.println("Datos de los pasajeros que subieron al bus: ");
		imprimeLinea('-',50);
		for(Pasajero pasaj: pasajeros){
			pasaj.imprime();
		}
		System.out.println();
		System.out.println();
		imprimeLinea('=',50);
	}
	
	public void imprimeLinea(char c,int n){
		for(int i=0;i<n;i++)System.out.print(c);
		System.out.println();
	}
}
