import java.util.Scanner;
class NPedido{
	private String codigo;
	private int cantidad;
	private double peso;
	
	public NPedido(){
		peso = 0.0;
		cantidad = 0;
	}
	
	public void setCodigo(String codigo){	
		this.codigo = codigo;
	}
	public String getCodigo(){
		return codigo;
	}
	
	public void setCantidad(int cantidad){	
		this.cantidad = cantidad;
	}
	public int getCantidad(){
		return cantidad;
	}
	
	public void setPeso(double peso){	
		this.peso = peso;
	}
	public double getPeso(){
		return peso;
	}
	
	public void asignarDatos(Scanner arch){
		codigo = arch.next();
		cantidad = arch.nextInt();
		peso = arch.nextDouble();
	}
	
	public void imprime(int i){
		System.out.print(i);
		System.out.print("  Codigo: " + codigo);
		System.out.print("  Cantidad: " + cantidad);
		System.out.print("  Peso: " + peso);
		System.out.println();
	}
}