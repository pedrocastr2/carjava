package carro;

public class pagina1 {
public static void main (String[] args) {
	carro car1 = new carro();
	car1.modelo ="fusca";
	car1.cor ="azul";
	car1.gasolina = 20;
	car1.colocarplaca();
	car1.tirarrodas();
	car1.colocarmotor();
	
	car1.status();
}
	
	
}
