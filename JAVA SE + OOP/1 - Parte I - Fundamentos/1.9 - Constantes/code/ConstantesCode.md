
```java
public class Constantes {

	public static void main(String[] args) {      
		final int VIDA_MAXIMA = 100;     
		final int DANIO_ENEMIGO = 15;     
		final String ESTADO_VIVO = "ALIVE";      
		int vidaActual = VIDA_MAXIMA;      
		vidaActual = vidaActual - DANIO_ENEMIGO;      
		
		System.out.println("Vida máxima: " + VIDA_MAXIMA);
		System.out.println("Vida actual: " + vidaActual);
		System.out.println("Estado inicial: " + ESTADO_VIVO);      
	// VIDA_MAXIMA = 200; ERROR: no se puede modificar una constante }
}
```