import java.util.ArrayList;
import java.util.Scanner;
class Camion extends Vehiculo{
	private int ejes;
	private int llantas;
	private ArrayList <NPedido> mdeposito;
	
	public Camion(){
		mdeposito = new ArrayList<>();
	}
	
	public void setEjes(int ejes){	
		this.ejes = ejes;
	}
	public int getEjes(){
		return ejes;
	}
	
	public void setLlantas(int llantas){	
		this.llantas = llantas;
	}
	public int getLlantas(){
		return llantas;
	}
	
	@Override
	public void lee(Scanner arch){
		super.lee(arch);
		ejes = arch.nextInt();
		llantas = arch.nextInt();
	}
	
	@Override
	public void imprime(){
		super.imprime();
		System.out.println("Ejes: " + ejes);
		System.out.println("Llantas: " + llantas);
		int i=1;
		for(NPedido nped: mdeposito){
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
			if(mdeposito.size()<5){
				super.setActcarga(pesoTotal);
				mdeposito.add(nped);
			}
		}
	}
}