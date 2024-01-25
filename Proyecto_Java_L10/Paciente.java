import java.util.Scanner;
class Paciente{
	private int dni;
	private String nombre;
	private String distrito;
	private double tiempoTotal;
	private double gastosTotales;
	private int cantidadDeConsultas;	
	
	public Paciente(){
		tiempoTotal = 0.0;
		gastosTotales = 0.0;
		cantidadDeConsultas = 0;
	}
	
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
	
	public void setDistrito(String distrito){
		this.distrito = distrito;
	}
	
	public String getDistrito(){
		return distrito;
	}
	
	public void setTiempoTotal(double tiempoTotal){
		this.tiempoTotal = tiempoTotal;
	}
	
	public double getTiempoTotal(){
		return tiempoTotal;
	}
	
	public void setGastosTotales(double gastosTotales){
		this.gastosTotales = gastosTotales;
	}
	
	public double getGastosTotales(){
		return gastosTotales;
	}
	
	public void setCantidadDeConsultas(int cantidadDeConsultas){
		this.cantidadDeConsultas = cantidadDeConsultas;
	}
	
	public int getCantidadDeConsultas(){
		return cantidadDeConsultas;
	}
	
	public void leePac(Scanner arch,int dniPac){
		dni = dniPac;
		nombre = arch.next();
		distrito = arch.next();
	}
	
	public void actualizarPaciente(double horas,double monto){
		tiempoTotal += horas;
		gastosTotales += monto;
		cantidadDeConsultas++;
	}
	
	public void imprimirDatos(){
		System.out.println(" Dni: " + dni);
		nombre = nombre.replace('_',' ');
		System.out.println(" Nombre: " + nombre);
		distrito = distrito.replace('_',' ');
		System.out.println(" Distrito: " + distrito);
		System.out.println(" Tiempo Total de atencion(horas): " + tiempoTotal);
		System.out.println(" Gastos Totales que invirtio: " + "s/" + gastosTotales);
		System.out.println(" Cantidad de consultas: " + cantidadDeConsultas);
	}
}