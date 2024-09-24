/****************
* NO MODIFICAR  *
****************/

// TDAPila.java
// Interfaz pública del Tipo de Dato Abstracto Pila
package miPrincipal;

public interface TDAPila<T> {
    public void push( T elemento );                 // Agregar un dato a la pila
    public T pop() throws PilaVaciaException;       // Sacar un dato de la pila
    public T peek() throws PilaVaciaException;      // Consulta el último valor de la pila
    public boolean isEmpty();                       // ¿La pila está vacía?
    public int size();                              // El total de elementos dentro de la pila
    public String toString();                       // Convertir el TDAPila a una representación de cadena
}