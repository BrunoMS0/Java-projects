import java.util.ArrayList;
import java.util.Scanner;
abstract public class Pasajero{
	private int dni;
	private String nombre;
	private String destino;
	
	public void setDni(int dni){
		this.dni = dni;
	}
	public int getDni(){
		return dni;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	
	public void setDestino(String destino){
		this.destino = destino;
	}
	public String getDestino(){
		return destino;
	}
	
	public void leerDatos(Scanner arch){
		dni = arch.nextInt();
		nombre = arch.next();
		destino = arch.next();
	}
	
	public String asignarBus(ArrayList<Omnibus> flota,String tipo){
		for(Omnibus omni: flota){
			Boolean encontrado = omni.buscarCiudades(destino,tipo);
			if(encontrado)return omni.getPlaca();
		}
		return "FIN";
	}
	
	public void imprime(){
		System.out.println("  DNI: " + dni);
		String nombres[] = nombre.split("/");
		System.out.println("  Nombre: " + nombres[2] + " " + nombres[0] + " " + nombres[1]);
		System.out.println("  Destino: " + destino);
	}
}