import java.util.ArrayList;
import java.util.Scanner;
class ClinicaLP1{
	private ArrayList <Medico> medicos;
	private ArrayList <Paciente> pacientes;
	
	public ClinicaLP1(){
		medicos = new ArrayList<>();
		pacientes = new ArrayList<>();
	}
	
	public void leerMedicos(Scanner arch){
		Medico med;
		int stop;
		while(arch.hasNext()){
			stop = arch.nextInt();
			if(stop==0)break;
			med = new Medico();
			med.leeMed(arch,stop);
			medicos.add(med);
		}
	}
	
	public void leerPacientes(Scanner arch){
		Paciente pac;
		int stop;
		while(arch.hasNext()){
			stop = arch.nextInt();
			if(stop==0)break;
			pac = new Paciente();
			pac.leePac(arch,stop);
			pacientes.add(pac);
		}
	}
	
	public double calcularHoras(Scanner arch){
		double h1,h2,m1,m2,s1,s2;
		double horasInicio,horasFin,horaTotal;
		h1 = arch.nextDouble();
		m1 = arch.nextDouble();
		s1 = arch.nextDouble();
		h2 = arch.nextDouble();
		m2 = arch.nextDouble();
		s2 = arch.nextDouble();
		
		horasInicio = h1 + m1/60 + s1/3600;
		horasFin = h2 + m2/60 + s2/3600;
		horaTotal = horasFin - horasInicio;
		return horaTotal;
	}
	
	public void actualizarMonto(int codMedico,int dniPaciente,double horas){
		double monto=0.0;
		for(Medico med: medicos){
			if(med.getCodigo()==codMedico){
				monto = med.actualizarMedico(horas);
			}
		}
		for(Paciente pac: pacientes){
			if(pac.getDni()==dniPaciente){
				pac.actualizarPaciente(horas,monto);
			}
		}
	}
	
	public void leerConsultas(Scanner arch){
		int dniPaciente;
		int codMedico;
		double horas;
		Paciente paciente;
		Medico medico;
		while(arch.hasNext()){
			dniPaciente = arch.nextInt();
			codMedico = arch.nextInt();
			horas = calcularHoras(arch);
			actualizarMonto(codMedico,dniPaciente,horas);
		}
	}
	
	public void imprimeLinea(char c,int n){
		for(int i=0;i<n;i++)System.out.print(c);
		System.out.println();
	}
	
	public void imprimirReporte(){
		System.out.println();
		imprimeLinea('*',50);
		System.out.print("              ");
		System.out.println("Reporte de Pacientes ");
		imprimeLinea('*',50);
		imprimeLinea('=',50);
		for(Paciente pac: pacientes){
			pac.imprimirDatos();
			imprimeLinea('=',50);
			System.out.println();
		}
		
		System.out.println();
		imprimeLinea('*',50);
		System.out.print("              ");
		System.out.println("Reporte de Medicos ");
		imprimeLinea('*',50);
		imprimeLinea('=',50);
		for(Medico med: medicos){
			med.imprimirDatos();
			imprimeLinea('=',50);
			System.out.println();
		}
		
	}
}