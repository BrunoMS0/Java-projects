import java.util.ArrayList;
import java.util.Scanner;
class Furgon extends Vehiculo{
	private int filas;
	private int puertas;
	private ArrayList<NPedido>pdeposito;
	
	public Furgon(){
		pdeposito = new ArrayList<>();
	}
	
	public void setFilas(int filas){	
		this.filas = filas;
	}
	public int getFilas(){
		return filas;
	}
	
	public void setPuertas(int puertas){	
		this.puertas = puertas;
	}
	public int getPuertas(){
		return puertas;
	}
	
	@Override
	public void lee(Scanner arch){
		super.lee(arch);
		filas = arch.nextInt();
		puertas = arch.nextInt();
	}
	
	@Override
	public void imprime(){
		super.imprime();
		System.out.println("Filas: " + filas);
		System.out.println("Puertas: " + puertas);
		int i=1;
		for(NPedido nped: pdeposito){
			nped.imprime(i);
			i++;
		}
	}
	
	@Override
	public int getCliente(){
		return super.getCliente();
	}
	
	@Override
	public void cargadeposito(Scanner arch){
		NPedido nped = new NPedido();
		nped.asignarDatos(arch);
		double cargaActual = super.getActcarga();
		double maximaCarga = super.getMaxcarga();
		double pesoTotal = cargaActual + nped.getPeso();
		if(pesoTotal<=maximaCarga){
			if(pdeposito.size()<5){
				super.setActcarga(pesoTotal);
				pdeposito.add(nped);
			}
		}
	}
}