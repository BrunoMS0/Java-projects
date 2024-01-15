import java.util.Scanner;
//Nombre: Luis Bruno Monzén Sullón
//Codigo: 20213707
class ProyectoFinal{
	public static void main(String [] args){
		Empresa empresa;
		
		empresa = new Empresa();
		Scanner arch = new Scanner(System.in);
		
		empresa.cargaOmnibus(arch);
		empresa.cargarPasajeros(arch);
		empresa.imprimirOmnibus();
	}
}