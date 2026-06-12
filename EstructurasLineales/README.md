# Práctica 3: Ejercicios de lógica con estructuras lineales: pilas y colas

**Nombre del estudiante:** [Escribe tu nombre aquí]  
**Asignatura:** Estructura de Datos - Segundo Interciclo  
**Versión del Release:** v2.0.2

---

## Descripción general del proyecto

[cite_start]Esta aplicación en Java resuelve tres problemas lógicos fundamentales utilizando estructuras de datos lineales (Pilas y Colas)[cite: 12, 13]. [cite_start]El objetivo principal es fortalecer el uso de operaciones propias de `Stack` (LIFO) y `Queue` (FIFO) [cite: 14][cite_start], respetando restricciones estrictas como no convertir los datos a arreglos o listas para su manipulación directa[cite: 37]. 

[cite_start]El proyecto está organizado en paquetes (`app` para la clase principal y `utils` para las clases lógicas) y estructurado para ejecutarse en Visual Studio Code[cite: 22, 23, 24, 25, 26].

---

## Explicación de los Ejercicios

### Ejercicio 01: Validación de Signos (`SignValidator.java`)
[cite_start]**Objetivo:** Determinar si un String que contiene los caracteres `()`, `{}`, `[]` es válido[cite: 93].
**Lógica aplicada:** Se utiliza un `Stack`. Al recorrer la cadena, cada símbolo de apertura se empuja (push) a la pila. Cuando se encuentra un símbolo de cierre, se saca (pop) el elemento del tope de la pila y se verifica que corresponda al mismo tipo. Si la pila termina vacía y no hubo discrepancias, la cadena es válida.

### Ejercicio 02: Ordenamiento de un Stack (`StackSorter.java`)
[cite_start]**Objetivo:** Ordenar un `Stack` de enteros para que los elementos más pequeños queden en el tope[cite: 111].
[cite_start]**Lógica aplicada:** Se resolvió utilizando exclusivamente una pila auxiliar y una variable temporal, respetando la regla de no usar arreglos u otras estructuras[cite: 116, 118]. Mediante bucles `while`, se extraen elementos de la pila original y se comparan con el tope de la auxiliar (`peek`), moviendo los números mayores de regreso temporalmente hasta encontrar la posición correcta del número actual.

### Ejercicio 03: Palíndromo usando Colas (`QueuePalindrome.java`)
[cite_start]**Objetivo:** Determinar si una palabra es palíndroma aprovechando el comportamiento de las colas[cite: 132].
[cite_start]**Lógica aplicada:** Para evitar comparar la cadena original con una versión invertida en un `String`[cite: 136], se combinaron dos estructuras: una `Queue` (FIFO) y un `Stack` (LIFO). Se guardan las letras iterativamente en ambas estructuras y luego se extraen una por una comparándolas simultáneamente. Esto garantiza la verificación letra por letra desde ambos extremos de la palabra.

---

## Evidencias de Ejecución

### Ejercicio 01
![alt text](Captura.PNG)
### Ejercicio 02

### Ejercicio 03