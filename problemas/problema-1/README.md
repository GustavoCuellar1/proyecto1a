
# Problema 1: Distancia entre dos puntos

## Descripción

Este programa permite calcular la distancia entre dos puntos en un plano cartesiano mediante sus coordenadas X y Y. Cuenta con una interfaz gráfica desarrollada en Java Swing.

## Objetivo

Calcular la distancia entre dos puntos utilizando sus coordenadas y la fórmula de distancia euclidiana.

## Solución

El programa solicita cuatro valores:

- X1: Coordenada X del primer punto.
- Y1: Coordenada Y del primer punto.
- X2: Coordenada X del segundo punto.
- Y2: Coordenada Y del segundo punto.

Después realiza los siguientes cálculos:

1. Calcula el incremento de X: X2 - X1.
2. Calcula el incremento de Y: Y2 - Y1.
3. Aplica la fórmula:

   d = √((X2 - X1)² + (Y2 - Y1)²)

4. Muestra los incrementos y la distancia final con dos decimales.

## Ejemplo de ejecución

**Datos de entrada:**

- X1 = 0
- Y1 = 0
- X2 = 3
- Y2 = 4

**Resultados:**

- Incremento de X: 3.00
- Incremento de Y: 4.00
- Distancia: 5.00

## Tecnologías utilizadas

- Lenguaje Java.
- Java Swing para la interfaz gráfica.
- Math.sqrt() y Math.pow() para las operaciones matemáticas.

## Ejecución

Para ejecutar el programa se necesita:

- Tener instalado el JDK de Java.
- Contar con Apache NetBeans.

Pasos:

1. Abrir Apache NetBeans.
2. Abrir el proyecto Java.
3. Buscar la clase Inicio.java.
4. Ejecutar el proyecto.
5. En la ventana principal, seleccionar Programa 1.
6. Ingresar las coordenadas de los dos puntos.
7. Presionar el botón Calcular para obtener los resultados.
