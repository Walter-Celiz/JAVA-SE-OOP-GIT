## 1) Código (ejemplo práctico)

Ejemplo simple aplicando buenas prácticas:

```java
public class Jugador {

int vidaMaxima = 100; 
int vidaActual = 100;  
	void recibirDanio(int danio) {     
		vidaActual -= danio;     
			if (vidaActual < 0) {         
				vidaActual = 0;     
			} 
		}  
	void mostrarEstado() {     
		System.out.println("Vida actual: " + vidaActual); 
	}

}
```


Buenas prácticas aplicadas:
- Nombres claros
- Métodos con una sola responsabilidad
- Código ordenado y legible


## 2) Ejercicios

1. Renombrá variables mal nombradas en un código antiguo.
2. Reordená un código desordenado aplicando indentación correcta.
3. Detectá comentarios innecesarios y eliminarlos.
4. Separá un método largo en métodos más pequeños.
