/****************
* NO MODIFICAR  *
****************/

// PilaVaciaException.java
// Excepción personalizada para indicar que
// la pila está vacía
package miPrincipal;

public class PilaVaciaException extends Exception{
    public PilaVaciaException(String mensaje)
    {
        super( mensaje );
    }
}