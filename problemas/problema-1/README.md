\# Problema 1: Distancia entre dos puntos



\## Descripción



Este programa permite calcular la distancia entre dos puntos en un plano cartesiano mediante sus coordenadas X y Y. Funciona desde la consola de Java.



\## Objetivo



Calcular la distancia entre dos puntos utilizando la fórmula de distancia euclidiana.



\## Solución



El programa solicita cuatro valores:



\- X1: Coordenada X del primer punto.

\- Y1: Coordenada Y del primer punto.

\- X2: Coordenada X del segundo punto.

\- Y2: Coordenada Y del segundo punto.



Después realiza los siguientes cálculos:



1\. Calcula el incremento de X: X2 - X1.

2\. Calcula el incremento de Y: Y2 - Y1.

3\. Aplica la fórmula de distancia euclidiana.

4\. Muestra los incrementos y la distancia final con dos decimales.



\## Ejemplo de ejecución



\*\*Datos de entrada:\*\*



\- X1 = 0

\- Y1 = 0

\- X2 = 3

\- Y2 = 4



\*\*Resultados:\*\*



\- Incremento de X: 3.00

\- Incremento de Y: 4.00

\- Distancia: 5.00



\## Tecnologías utilizadas



\- Lenguaje Java.

\- Clase Scanner para leer los datos.

\- Math.sqrt() y Math.pow() para las operaciones matemáticas.



\## Ejecución



Se necesita tener instalado el JDK de Java.



Desde la carpeta principal del repositorio, ejecutar:

git bash

mkdir -p compilado

javac -encoding UTF-8 -d compilado problemas/problema-1/src/Distancia.java

java -cp compilado com.mycompany.proyectointegrador.Distancia
