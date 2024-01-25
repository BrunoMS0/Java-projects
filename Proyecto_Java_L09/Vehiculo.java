import java.util.Scanner;
abstract public class Vehiculo{
	private int cliente;
	private String placa;
	private double maxcarga;
	private double actcarga;
	
	public Vehiculo(){
		maxcarga = 0.0;
		actcarga = 0.0;
	}
	
	public void setCliente(int cliente){	
		this.cliente = cliente;
	}
	public int getCliente(){
		return cliente;
	}
	
	public void setPlaca(String placa){	
		this.placa = placa;
	}
	public String getPlaca(){
		return placa;
	}
	
	public void setMaxcarga(double maxcarga){	
		this.maxcarga = maxcarga;
	}
	public double getMaxcarga(){
		return maxcarga;
	}
	
	public void setActcarga(double actcarga){	
		this.actcarga = actcarga;
	}
	public double getActcarga(){
		return actcarga;
	}
	
	public void lee(Scanner arch){
		cliente = arch.nextInt();
		placa = arch.next();
		maxcarga = arch.nextDouble();
	}
	
	public void imprime(){
		System.out.println("Cliente: " + cliente);
		System.out.println("Placa: " + placa);
		System.out.println("Maxima Carga: " + maxcarga);
		System.out.println("Carga Actual: " + actcarga);
	}
	
	public abstract void cargadeposito(Scanner arch);
}