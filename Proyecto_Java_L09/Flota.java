import java.util.ArrayList;
import java.util.Scanner;
class Flota{
	private ArrayList<NVehiculo>vflota;
	
	public Flota(){
		vflota = new ArrayList<>();
	}
	
	public void cargaflota(Scanner arch){
		String tipo;
		NVehiculo nv;
		while(arch.hasNext()){
			nv = new NVehiculo();
			tipo = arch.next();
			if(tipo.compareTo("X")==0)break;
			if(tipo.compareTo("F")==0){
				nv.asignarFurgon();
			}
			if(tipo.compareTo("C")==0){
				nv.asignarCamion();
			}
			nv.lee(arch);
			vflota.add(nv);
		}
	}
	
	public void muestracarga(){
		for(NVehiculo nv: vflota){
			nv.imprime();
			System.out.println();
		}
	}
	
	public void cargarpedidos(Scanner arch){
		int cliente;
		while(arch.hasNext()){
			cliente = arch.nextInt();
			for(NVehiculo nv: vflota){
				if(cliente==nv.getCliente()){
					nv.cargadeposito(arch);
				}
			}
		}
	}
}