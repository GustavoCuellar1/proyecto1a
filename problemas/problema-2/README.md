# Problema 2: Programa Financiero

## Descripción

El problema consiste en desarrollar un programa que determine el impuesto aplicado a la compra de un equipo, dependiendo de si el comprador es un estudiante acreditado y si el equipo pertenece al catálogo educativo.

Para resolver el problema se utilizan las operaciones de lógica proposicional AND y XOR.

## Objetivo

Implementar una solución en Java que permita aplicar operaciones lógicas para determinar el porcentaje de impuesto, calcular su importe y obtener el precio final que debe pagar el comprador.

## Proposiciones lógicas

- p: El comprador es un estudiante acreditado.
- q: El equipo pertenece al catálogo educativo.

Cada proposición puede tener dos valores:

- 1: Verdadero.
- 0: Falso.

## Políticas fiscales

- Si ambas proposiciones son verdaderas (AND), se aplica una exención total de impuesto del 0%.
- Si solamente una proposición es verdadera (XOR), se aplica un impuesto reducido del 8%.
- Si ambas proposiciones son falsas, se aplica un impuesto general del 16%.

## Tabla de verdad

| p | q | AND | XOR | Impuesto |
|---|---|-----|-----|----------|
| 1 | 1 | 1   | 0   | 0%       |
| 1 | 0 | 0   | 1   | 8%       |
| 0 | 1 | 0   | 1   | 8%       |
| 0 | 0 | 0   | 0   | 16%      |

## Datos de entrada

- Precio base del equipo.
- Condición de estudiante acreditado (1 o 0).
- Pertenencia del equipo al catálogo educativo (1 o 0).

## Solución

La solución fue desarrollada en Java y funciona desde la consola.

El programa utiliza estructuras condicionales para determinar la tasa de impuesto correspondiente.

```java
if (p && q) {
    porcentajeImpuesto = 0.00;
} else if (p ^ q) {
    porcentajeImpuesto = 0.08;
} else {
    porcentajeImpuesto = 0.16;
}
```

## Fórmulas utilizadas

Monto del impuesto:

    Impuesto = Precio base * Tasa de impuesto

Total a pagar:

    Total = Precio base + Impuesto

## Ejemplo de ejecución

Datos de entrada:

- Precio base: $1,000.00
- Estudiante acreditado: Verdadero (1).
- Equipo educativo: Falso (0).

Como solamente una proposición es verdadera, se aplica una tasa de impuesto del 8%.

Cálculo:

    Impuesto = 1000 * 0.08
    Impuesto = 80.00

    Total = 1000 + 80
    Total = 1080.00

Resultado:

- Política fiscal: Impuesto reducido del 8%.
- Monto del impuesto: $80.00
- Total final a pagar: $1,080.00

## Resultados esperados

Para un precio base de $10,000.00:

| Estudiante | Educativo | Impuesto | Monto | Total |
|------------|-----------|----------|-------|-------|
| Sí | Sí | 0% | $0.00 | $10,000.00 |
| Sí | No | 8% | $800.00 | $10,800.00 |
| No | Sí | 8% | $800.00 | $10,800.00 |
| No | No | 16% | $1,600.00 | $11,600.00 |

## Requisitos

- Java JDK instalado.
- Terminal Git Bash.
- Archivos fuente del proyecto.

## Compilación y ejecución

Abrir una terminal Git Bash desde la carpeta raíz del repositorio `proyecto1a`.

Comprobar la instalación de Java:

```bash
java -version
javac -version
```

Crear una carpeta para los archivos compilados:

```bash
mkdir -p compilado
```

Compilar el programa:

```bash
javac -encoding UTF-8 -d compilado problemas/problema-2/src/Financiero.java
```

Ejecutar el programa:

```bash
java -cp compilado com.mycompany.proyectointegrador.Financiero
```

## Instrucciones de uso

1. Ejecutar el programa desde la terminal.
2. Ingresar el precio base del equipo.
3. Ingresar 1 si el comprador es estudiante acreditado o 0 si no lo es.
4. Ingresar 1 si el equipo pertenece al catálogo educativo o 0 si no pertenece.
5. Consultar el dictamen fiscal y financiero.

## Datos de salida

- Precio base del equipo.
- Valores de las proposiciones p y q.
- Política fiscal aplicada.
- Monto del impuesto.
- Total final a pagar.

## Archivos de la solución

- `src/Financiero.java`: código fuente del programa.

## Conclusión

La implementación permite aplicar la lógica proposicional a un problema financiero, automatizando la selección de la política fiscal y el cálculo del impuesto correspondiente mediante Java.