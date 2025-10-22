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
		
		if (this.primero == null){
			this.primero = nuevo;
		}
		else {
			NodoInt actual = this.primero;
			while (actual.siguiente != null) {
				actual = actual.siguiente;
			}
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
	
	public int suma() {
		int sumaNodo=0;
		NodoInt actual=this.primero;
		while(actual!=null) {
			sumaNodo=sumaNodo+actual.elemento;
			actual=actual.siguiente;
		}
		return sumaNodo;
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
	
	public void agregarEntrePares(int e) {
		NodoInt actual=this.primero;
		while(actual!=null&&actual.siguiente!=null) {
			if(actual.elemento%2==0&&actual.siguiente.elemento%2==0) {
				NodoInt nuevo=new NodoInt(e);
				nuevo.siguiente=actual.siguiente;
				actual.siguiente=nuevo;
				actual=actual.siguiente.siguiente;
			}else {
				actual=actual.siguiente;
			}
		}
	}
	
	public void swap(int i, int j) {
		int posicion=0;
		NodoInt nodoI=null;
		NodoInt nodoJ=null;
		NodoInt actual=this.primero;
		while(actual!=null) {
			if(posicion==i) {
				nodoI=actual;
			}
			if(posicion==j) {
				nodoJ=actual;
			}
			posicion++;
			actual=actual.siguiente;
		}
		if(nodoI!=null&&nodoJ!=null) {
			int aux=nodoI.elemento;
			nodoI.elemento=nodoJ.elemento;
			nodoJ.elemento=aux;
		}
	}
	
	public void invertir() {
	      NodoInt actual = this.primero;
	      while (actual != null&&actual.siguiente!=null){
	    	 this.agregarAdelante(actual.siguiente.elemento);
	    	 actual.siguiente=actual.siguiente.siguiente;
	      }
	}
	
	public void acomodarRemoverDivisible() {
		while(primero!=null&&primero.elemento%7==0) { //O(1)
			primero=primero.siguiente;
		}
		NodoInt actual=this.primero;
		while(actual!=null&&actual.siguiente!=null) { // O(n)
			if(actual.siguiente.elemento%5==0) {
				agregarAdelante(actual.siguiente.elemento);
				actual.siguiente=actual.siguiente.siguiente;
			}
			else if(actual.siguiente.elemento%7==0) {
				actual.siguiente=actual.siguiente.siguiente;
			}
			else {
				actual=actual.siguiente;
			}
		}
	}

}
