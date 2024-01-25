import java.util.Scanner;
/*nombre: Luis Bruno Monzén Sullón
  codigo: 20213707
*/
class Principal{
	public static void main(String [] args){
		ClinicaLP1 clinica = new ClinicaLP1();
		Scanner arch = new Scanner(System.in);
		
		clinica.leerMedicos(arch);
		clinica.leerPacientes(arch);
		clinica.leerConsultas(arch);
		clinica.imprimirReporte();
	}
}