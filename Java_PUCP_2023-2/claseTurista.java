import java.util.ArrayList;
import java.util.Scanner;
class claseTurista extends Pasajero{
	private Boolean valija;
	private Boolean almuerzo;
	private double tarifaExtra;
	
	public claseTurista(){
		tarifaExtra = 0.0;
	}
	
	public void setValija(Boolean valija){
		this.valija = valija;
	}
	public Boolean getValija(){
		return valija;
	}
	
	public void setAlmuerzo(Boolean almuerzo){
		this.almuerzo = almuerzo;
	}
	public Boolean getAlmuerzo(){
		return almuerzo;
	}
	
	public void setTarifaExtra(double tarifaExtra){
		this.tarifaExtra = tarifaExtra;
	}
	public double getTarifaExtra(){
		return tarifaExtra;
	}
	
	@Override
	public void leerDatos(Scanner arch){
		super.leerDatos(arch);
		String tipoVal;
		String tipoAlm;
		tipoVal = arch.next();
		tipoAlm = arch.next();
		if(tipoVal.compareTo("S")==0){
			valija = true;
			tarifaExtra += 85.5;
		}
		else{
			valija = false;
		}
		
		if(tipoAlm.compareTo("S")==0){
			almuerzo = true;
			tarifaExtra += 55.90;
		}
		else{
			almuerzo = false;
		}
	}
	
	@Override
	public String asignarBus(ArrayList<Omnibus>flota,String tipo){
		return super.asignarBus(flota,tipo);
	}
	
	@Override
	public void imprime(){
		System.out.println("  Tipo de clase: Clase Turista");
		super.imprime();
		if(valija){
			System.out.println("  Estado Valija: El pasajero lleva valija");
		}
		else{
			System.out.println("  Estado Valija: El pasajero no lleva valija");
		}
		
		if(almuerzo){
			System.out.println("  Estado Almuerzo: El pasajero lleva almuerzo");
		}
		else{
			System.out.println("  Estado Almuerzo: El pasajero no lleva almuerzo");
		}
		
		System.out.println("  Tarifa Extra: " + tarifaExtra);
		
		imprimeLinea('/',50);
	}
	
	public void imprimeLinea(char c,int n){
		for(int i=0;i<n;i++)System.out.print(c);
		System.out.println();
	}
}