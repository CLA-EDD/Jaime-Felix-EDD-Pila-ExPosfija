/****************
* NO MODIFICAR  *
****************/

// PilaArreglo.java
// Implementación del TDAPila usando arreglos
package miPrincipal;

public class PilaArreglo<T> implements TDAPila<T> {
    // Atributos
    private T[] pila;                           // Arreglo donde se almacenan los elementos de la pila
    private int tope;                           // Ubicación de la posición donde se guarda el siguiente elemento
                                                // Total de elementos guardados en la pila
    private static final int CAPACIDAD_INICIAL = 100;  // Tamaño inicial de la pila

    // Constructores
    @SuppressWarnings("unchecked")
    public PilaArreglo( int capacidadInicial )
    {
        // Validar el argumento
        if ( capacidadInicial < 1 )
            throw new IllegalArgumentException("Error. El tamaño de la pila debe ser positivo");

        // pila = new T[capacidadInicial];
        pila = (T[]) new Object[ capacidadInicial ];
        tope = 0;
    }

    public PilaArreglo()
    {
        this( CAPACIDAD_INICIAL );
    }

    public void push( T elemento )
    {
        // Validar si la pila esta llena
        // De ser así, duplicar su tamaño
        if ( size() == pila.length )
            extenderCapacidad();

        // Hay espacio disponible en la pila
        // Guardar elemento
        pila[ tope ] = elemento;
        tope ++;        // Apuntar a la siguiente posición
    }

    public T pop() throws PilaVaciaException
    {
        // Validar que la pila no esté vacía
        if ( isEmpty() )
            throw new PilaVaciaException("Error. No hay datos en la pila");

        // Hay datos. Regresar el último dato
        tope --;
        T resultado = pila[ tope ];
        pila[ tope ] = null;

        return resultado;
    }

    public T peek() throws PilaVaciaException
    {
        // Validar que la pila no esté vacía
        if ( isEmpty() )
            throw new PilaVaciaException("Error. No hay datos en la pila");

        // Hay datos. Regresar el último dato
        T resultado = pila[ tope - 1 ];

        return resultado;
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public int size()
    {
        return tope;
    }

    public String toString()
    {
        String resultado = "";

        // Recorrer la pila desde tope hasta el inicio
        for ( int i = tope - 1; i >= 0; i -- )
            resultado = resultado + pila[ i ] + "\n";

        return resultado;
    }

    // Método auxiliar expanderCapacidad()
    private void extenderCapacidad()
    {
        // Crear un nuevo arreglo del doble del tamaño de la pila
        @SuppressWarnings("unchecked")
        T[] aux = (T[]) new Object[ pila.length * 2 ];

        // Copiar contenido de la pila original al arreglo auxiiar
        for ( int i = 0; i < pila.length; i++ )
            aux[ i ] = pila[ i ];

        // Hacer pila igual al arreglo aux
        pila = aux;
    }
}