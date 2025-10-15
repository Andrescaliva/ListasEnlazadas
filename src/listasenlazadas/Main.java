package listasenlazadas;

public class Main {

	public static void main(String[] args) {
		ListaInt lista=new ListaInt();
		lista.imprimir();
		lista.agregarAdelante(0);
		lista.imprimir();
		lista.agregarAdelante(2);
		lista.imprimir();
		lista.agregarAdelante(15);
		lista.imprimir();
		lista.agregarAdelante(15);
		lista.imprimir();
		lista.agregarAdelante(15);
		lista.imprimir();
		lista.agregarAtras(15);
		lista.imprimir();
		lista.quitarTodos(15);
		lista.imprimir();

	}

}
