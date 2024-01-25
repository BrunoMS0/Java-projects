import java.util.Scanner;
class NVehiculo{
	private Vehiculo unidad;

	public void asignarFurgon(){
		unidad = new Furgon();
	}
	
	public void asignarCamion(){
		unidad = new Camion();
	}
	
	public void lee(Scanner arch){
		unidad.lee(arch);
	}
	
	public void imprime(){
		unidad.imprime();
	}
	
	public int getCliente(){
		return unidad.getCliente();
	}
	
	public void cargadeposito(Scanner arch){
		unidad.cargadeposito(arch);
	}
	
}