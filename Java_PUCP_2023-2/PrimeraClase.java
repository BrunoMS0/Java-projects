import java.util.ArrayList;
import java.util.Scanner;
class PrimeraClase extends Pasajero{
	private ArrayList<String>articulosSolicitados;
	
	public PrimeraClase(){
		articulosSolicitados = new ArrayList<>();
	}
	
	@Override
	public void leerDatos(Scanner arch){
		super.leerDatos(arch);
		int num = arch.nextInt();
		for(int i=0;i<num;i++){
			String articulos;
			articulos = arch.next();
			articulosSolicitados.add(articulos);
		}
	}
	
	@Override
	public String asignarBus(ArrayList<Omnibus>flota,String tipo){
		return super.asignarBus(flota,tipo);
	}
	
	@Override
	public void imprime(){
		System.out.println("  Tipo de clase: Primera Clase");
		super.imprime();
		System.out.print("  Articulos solicitados por el Cliente: ");
		for(String articulos: articulosSolicitados){
			System.out.print(" " + articulos);
		}
		System.out.println();
		imprimeLinea('/',50);
	}
	
	public void imprimeLinea(char c,int n){
		for(int i=0;i<n;i++)System.out.print(c);
		System.out.println();
	}
}