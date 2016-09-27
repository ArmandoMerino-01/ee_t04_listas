package ee_t04_listas;
/**
 *
 * @author Armando1
 */
public class Lista<T extends Comparable<T>> {

    private Nodo<T> inicio;

    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }

    public Nodo<T> getInicio() {
        return inicio;
    }

    ////////////////////////////////////////////////////////////////
    //METODOS DE INSERTAR O AGREGAR

    public void InsertarInicio(T dato) {
        Nodo<T> nuevo = new Nodo<T>(dato);
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
    }

    public void InsertarFinal(T dato) {
        Nodo<T> temporal;
        temporal = inicio;
        if (inicio == null) {
            this.InsertarInicio(dato);
        } else {
            while (temporal.getSiguiente() != null) {
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(new Nodo(dato));
        }
    }

    public void InsertarAntesDe(T dato) {
        Nodo<T> temporal, nodoEncontrado = null, nuevo;
        boolean band = true;
        temporal = inicio;
        while (dato.compareTo(temporal.getDato()) == -1 && band) {
            if (temporal.getSiguiente() != null) {
                nodoEncontrado = temporal;
                temporal = temporal.getSiguiente();
            } else {
                band = false;
            }
        }
        if (band) {
            if (temporal == inicio) {
                InsertarInicio(dato);
            } else {
                nuevo = new Nodo(dato);
                nuevo.setSiguiente(temporal);
                nodoEncontrado.setSiguiente(nuevo);
            }
        } else {
            InsertarFinal(dato);
        }
    }
    
    public void InsertarDespuesDe(T dato, T referencia) {
        Nodo<T> temporal, nuevo;
        boolean band = true;
        temporal = inicio;
        while (temporal.getDato() != referencia && band) {
            if (temporal.getSiguiente() != null) {
                nuevo = temporal;
                temporal = temporal.getSiguiente();
            } else {
                band = false;
                System.out.println("no se encontro el DATO...\n");
            }
        }
        if (band) {
            if (temporal == inicio) {
            } else {
                nuevo = new Nodo(dato);
                nuevo.setSiguiente(temporal.getSiguiente());
                temporal.setSiguiente(nuevo);
            }
        }
    }
      public void insertaOrdenado(T d){
        Nodo<T>tempo,nodoencontrado=null,nuevo; 
        boolean band=true;
        tempo=inicio;

        if(inicio==null){
            InsertarInicio(d);
        }else{
            while(d.compareTo(tempo.getDato())==1 && band){
                if(tempo.getSiguiente()!=null){
                    nodoencontrado=tempo;
                    tempo=tempo.getSiguiente();
                }else{
                    band=false;
                }
            }
            if(band){
                if(tempo==inicio){
                    InsertarInicio(d);
                }else{
                    nuevo=new Nodo(d);
                    nuevo.setSiguiente(tempo);
                    nodoencontrado.setSiguiente(nuevo);
                }

            }else{
                InsertarFinal(d);
            }
        }
    }
/////////////////////////////////////////////////////////////////////
    //METODOS DE ELIMINAR

    public void EliminarPrimero() {
        Nodo<T> temporal = inicio;
        if (temporal.getSiguiente() != null) {
            inicio = temporal.getSiguiente();
        } else {
            inicio = null;
        }
    }

    public void EliminarUltimo() {
        Nodo<T> temporal, anterior = null;
        temporal = inicio;
        if (inicio.getSiguiente() == null) {
            inicio = null;
        } else {
            while (temporal.getSiguiente() != null) {
                anterior = temporal;
                temporal = temporal.getSiguiente();
            }
            anterior.setSiguiente(null);
        }
    }

   
    public void EliminarDespuesDe(T referencia) {
        Nodo<T> temporal, nuevo, anterior = null;
        boolean band = true;
        temporal = inicio;
        while (temporal.getDato() != referencia && band) {
            if (temporal.getSiguiente() != null) {
                nuevo = temporal;
                anterior = temporal;
                temporal = temporal.getSiguiente();
            } else {
                band = false;
                System.out.println("no se encontro el elemento...\n");
            }
        }
        if (band) {
            if (temporal == inicio) {
            } else {
                nuevo = new Nodo(referencia);
                anterior.setSiguiente(nuevo);
            }
        }
    }

   //METODOS PARA RECORRER
    public void recorreRecursivo(Nodo<T> aux){
		
if (aux != null){
		 
 System.out.println(aux.getDato());
		
  recorreRecursivo(aux.getSiguiente());
		
}
}

     public void RecorreIterativo(){
        Nodo<T> temporal=inicio;
        if(inicio==null){
            System.out.println("Lista vacia");
        }
        else{
            while(temporal!=null){
                System.out.print(temporal);
                temporal=temporal.getSiguiente();
            }
        }
        System.out.print(temporal);
        System.out.println();
    }
    
   /////////////////////////////////////////////////////////////////
   //METODOS DE BUSQUEDA
 public void busquedaDesordenada (T dato){
    Nodo tempo;
    tempo=inicio;
    while(tempo!=null && tempo.getDato()!=dato){
    tempo=tempo.getSiguiente();
    }
    if(tempo==null){
    System.out.println("El elemento no se encuentra en la lista");;
    
    }
    else{
    System.out.println("El elemento ha sido encontrado");
    tempo = inicio;
    }
    }
  
  public void busquedaRecursiva(T dato){
    Nodo tempo;
    tempo=inicio;
    if(tempo!=null){
   if(tempo.getDato()==dato){ 
    System.out.println("El elemento si se encuentra en la lista");
    }
   else{
    busquedaRecursiva(dato);
     tempo=tempo.getSiguiente();
    } 
   }
   else{
    System.out.println("El elemento no se encuentra en la lista");
    }
   }

    public String toString() {

        Nodo<T> temporal = inicio;
        String s = "";
        while (temporal != null) {
            s += "[" + temporal.getDato() + "]" + "--->";
            temporal = temporal.getSiguiente();
        }
        return s + "" + null;
    }

}
