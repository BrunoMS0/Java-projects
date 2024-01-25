import java.util.Scanner;
class Medico{
	private int codigo;
	private String nombre;
	private String especialidad;
	private double tarifa;
	private double tiempoTotal;
	private double ingresosTotales;
	private int cantidadDeConsultas;	
	
	public Medico(){
		tiempoTotal = 0.0;
		ingresosTotales = 0.0;
		cantidadDeConsultas = 0;
	}
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setEspecialidad(String especialidad){
		this.especialidad = especialidad;
	}
	
	public String getEspecialidad(){
		return especialidad;
	}
	
	public void setTarifa(double tarifa){
		this.tarifa = tarifa;
	}
	
	public double getTarifa(){
		return tarifa;
	}
	
	public void setTiempoTotal(double tiempoTotal){
		this.tiempoTotal = tiempoTotal;
	}
	
	public double getTiempoTotal(){
		return tiempoTotal;
	}
	
	public void setIngresosTotales(double ingresosTotales){
		this.ingresosTotales = ingresosTotales;
	}
	
	public double getIngresosTotales(){
		return ingresosTotales;
	}
	
	public void setCantidadDeConsultas(int cantidadDeConsultas){
		this.cantidadDeConsultas = cantidadDeConsultas;
	}
	
	public int getCantidadDeConsultas(){
		return cantidadDeConsultas;
	}
	
	public void leeMed(Scanner arch,int cod){
		codigo = cod;
		nombre = arch.next();
		especialidad = arch.next();
		tarifa = arch.nextDouble();
	}
	
	public double actualizarMedico(double horas){
		tiempoTotal += horas;
		ingresosTotales += horas*tarifa;
		cantidadDeConsultas++;
		return horas*tarifa;
	}
	
	public void imprimirDatos(){
		System.out.println(" Codigo: " + codigo);
		nombre = nombre.replace('_',' ');
		System.out.println(" Nombre: " + nombre);
		System.out.println(" Tarifa: " + tarifa);
		System.out.println(" Especialidad: " + especialidad);
		System.out.println(" Tiempo Total: " + tiempoTotal);
		System.out.println(" Ingresos Totales: " + "s/" + ingresosTotales);
		System.out.println(" Cantidad de consultas: " + cantidadDeConsultas);
	}
}