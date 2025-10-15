package listasenlazadas;

public class ListaInt {
	private NodoInt primero;
	
	public ListaInt() {
		this.primero=null;
	}
	
	
	public void imprimir(){
	      System.out.print("[");
	      NodoInt actual = this.primero;
	      while(actual != null){
	         System.out.print(actual.elemento + " ");
	         actual = actual.siguiente;
	      }
	      System.out.println("]");
	 }
	
	public void agregarAdelante(int n){

	       NodoInt nuevo = new NodoInt(n);
	       nuevo.siguiente = this.primero;
	       this.primero = nuevo;

	}
	
	public void agregarAtras(int n){
		NodoInt nuevo = new NodoInt(n);
		
		if (this.primero == null)
			this.primero = nuevo;

		else {
			NodoInt actual = this.primero;
			while (actual.siguiente != null)
				actual = actual.siguiente;

			actual.siguiente = nuevo;
		}
	 }

	
	public int largo(){
	      int cantidad = 0;
	      NodoInt actual = this.primero;
	      while (actual != null){
	          cantidad++;
	          actual = actual.siguiente;
	      }
	      return cantidad;
	  }
	
	public void quitar(int n){     

		   if (this.primero != null && this.primero.elemento == n) {
		       this.primero = this.primero.siguiente;
		   }  
		   else {
		     NodoInt actual = this.primero;

		     while(actual.siguiente != null && actual.siguiente.elemento != n) {
		           actual = actual.siguiente;
		      }
		     if (actual.siguiente != null) {
		         actual.siguiente = actual.siguiente.siguiente;
		     }   
		   }
		}
	
	public void quitarTodos(int n) {
		while(this.primero!=null&&this.primero.elemento==n) {
			this.primero=this.primero.siguiente;
		}
		
		NodoInt actual=this.primero;
		while(actual!=null&&actual.siguiente!=null) {
			if(actual.siguiente.elemento==n) {
				actual.siguiente=actual.siguiente.siguiente;
			}
			else {
				actual=actual.siguiente;
			}	
		}
	}



	public boolean pertenece(int e) {
		NodoInt actual=this.primero;
		while(actual!=null) {
			if(actual.elemento==e) {
				return true;
			}
			actual=actual.siguiente;
		}
		return false;
	}

}
