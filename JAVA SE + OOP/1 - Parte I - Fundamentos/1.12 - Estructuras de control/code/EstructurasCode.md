```java
package code;

public class EstructurasControl {  
	public static void main(String[] args) {
		int vida = 80;  
		int opcion = 1;  
  
		// IF - ELSE  
		if (vida > 50) {  
			System.out.println("El personaje está fuerte");  
			} else {  
			System.out.println("El personaje está débil");  
		}  
  
		// SWITCH  
		switch (opcion) {  
			case 1:  
			System.out.println("Atacar");  
			break;  
			case 2:  
			System.out.println("Defender");  
			break;  
			default:  
			System.out.println("Acción desconocida");  
		}  
  
		// WHILE  
		int energia = 3;  
		while (energia > 0) {  
			System.out.println("Atacando...");  
			energia--;  
		}  
  
		// FOR  
		for (int i = 1; i <= 3; i++) {  
			System.out.println("Turno " + i);  
		} 

	}
}
```
