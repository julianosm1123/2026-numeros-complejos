/*
 * # Clase Complejo - Ejercicio

## Descripción

Se pide crear una clase llamada `Complejo` que represente un número complejo.

## Requisitos

1. **Atributos privados**: La clase debe tener dos atributos privados:
   - `reale`: parte real del número complejo
   - `imaginario`: parte imaginaria del número complejo

2. **Método para mostrar**: Implementar una función que retorne el número complejo en formato:
   ```
   (real, imaginario)
   ```

3. **Ejemplo de uso**

```python
c = Complejo(3, 4)
print(c.mostrar())  # Salida: (3, 4)
```     

 */
package org.example

class Complejo{
    private var real:Int=0
    private var imaginario:Int=0

    fun mostrarcomplejo(real:Int, imaginario:Int) {
        this.real=real
        this.imaginario=imaginario
        println("El número es: (${real}, ${imaginario})")

    }

}
fun main() {
    val complejo:Complejo
    complejo=Complejo()
    complejo.mostrarcomplejo(2, 5)
}
