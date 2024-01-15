import java.util.ArrayList;
import java.util.Scanner;
class Empresa{
	private ArrayList<Omnibus>flota;
	
	public Empresa(){
		flota = new ArrayList<>();
	}
	
	public void cargaOmnibus(Scanner arch){
		Omnibus omni;
		String placa;
		while(arch.hasNext()){
			placa = arch.next();
			if(placa.compareTo("FIN")==0)break;
			omni = new Omnibus();
			omni.cargarDatosOmnibus(placa,arch);
			flota.add(omni);
		}
	}
	
	public void cargarPasajeros(Scanner arch){
		String tipo;
		Omnibus omni;
		while(arch.hasNext()){
			tipo = arch.next();
			omni = new Omnibus();
			omni.cargarDatosPasajero(flota,tipo,arch);	
		}
	}
	
	public void imprimirOmnibus(){
		imprimeLinea('=',50);
		System.out.println("      Reporte de Buses de la empresa");
		for(Omnibus omni: flota){
			omni.imprimir();
		}
	}
	
	public void imprimeLinea(char c,int n){
		for(int i=0;i<n;i++)System.out.print(c);
		System.out.println();
	}
}