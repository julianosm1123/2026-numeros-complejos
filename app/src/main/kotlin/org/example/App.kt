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

class Complejo(private var real: Int=0,private var imag: Int=0) {

    fun inicializar(real:Int, imag:Int){
        this.real=real
        this.imag=imag
    }
    fun mostrar(){
        println(this.toString())
    }
    override fun toString() : String {
        return " (${real}, ${imag})"
    }

    fun sumar(otro:Complejo): Complejo {
        return Complejo(real + otro.real,imag + otro.imag)

    }
    fun restar(otro:Complejo): Complejo {
        return Complejo(real-otro.real,imag-otro.imag)
    }

}



fun main() {
    var complejo: Complejo
    complejo = Complejo()
    complejo.inicializar(3,4)
    complejo.mostrar()
    println(" Mi numero complejo es ${complejo.toString()}")
    var c2:Complejo= Complejo(1,2)
    var c3:Complejo
    c3=complejo.sumar(c2)
    c3.mostrar()
    c3=complejo.restar(c2)
    c3.mostrar()
}