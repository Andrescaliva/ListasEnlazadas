package listasenlazadas;

public class Main {

	public static void main(String[] args) {
		ListaInt lista=new ListaInt();
		lista.agregarAtras(2);
		
		lista.agregarAtras(4);
		lista.agregarAtras(5);		
		lista.agregarAtras(8);
		lista.agregarAtras(10);	
		lista.agregarEntrePares(7);
		lista.imprimir();
		lista.swap(2, 4);
		lista.imprimir();
		lista.invertir();
		lista.imprimir();
		System.out.println(lista.largo());
		System.out.println(lista.suma());
		lista.acomodarRemoverDivisible();
		lista.imprimir();

	}

}
