import java.util.Scanner;
class ProyectoFinal{
	public static void main(String [] args){
		Flota flota = new Flota();
		Scanner arch = new Scanner(System.in);
		
		flota.cargaflota(arch);
		flota.cargarpedidos(arch);
		flota.muestracarga();
	}
}