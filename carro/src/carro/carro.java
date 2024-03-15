package carro;

public class carro {

	public String modelo;
	public String cor;
	public int gasolina;
	private boolean placa;
	private boolean motor;
	private boolean rodas;

	public void status (){
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		System.out.println("o modelo do carro é  "+ this.modelo);	
		System.out.println("A cor do carro é  " +this.cor);
		System.out.println("A quantidade de gasolina do carro é  "+ this.gasolina);
		System.out.println("O carro possui placa   " + this.placa);
		System.out.println("O carro possui motor " + this.motor);
		System.out.println("O carro possui rodas " + this.rodas);
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
	}
	
	
	public void colocarplaca() {
		 this.placa = true;
		}
	
	public void tirarplaca() {
		this.placa=false;
		}
	
	 public void dirigir() {
	    if (this.motor ==true && this.rodas ==true) {
	        System.out.println("Pode dirigir");
	    } else {
	        System.out.println("Não pode dirigir");
	    }
	}

	public void colocarmotor() {
	 this.motor = true;
	}

	public void tirarmotor () {
	this.motor=false;
	}
	

	public void colocarodas() {
	 this.rodas = true;
	}

	public void tirarrodas () {
	this.rodas=false;
	}
	
	
	
}
