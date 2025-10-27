package listasenlazadas;

public class Main {

	public static void main(String[] args) {
		ListaInt lista=new ListaInt();
		lista.agregarAtras(1);
		lista.agregarAtras(2);
		lista.agregarAtras(3);
		lista.agregarAtras(4);		
		lista.agregarAtras(5);
		lista.agregarAtras(6);	
		lista.imprimir();
		//lista.extraerPares();
		
		/*lista.swap(2, 4);
		lista.imprimir();
		lista.invertir();
		lista.imprimir();
		System.out.println(lista.largo());
		System.out.println(lista.suma());
		lista.acomodarRemoverDivisible();*/
		System.out.println(lista.sumatoriaDesde(3));
		System.out.println(lista.duplicarDivisores(2));

	}

}
