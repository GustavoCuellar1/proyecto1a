# Problema 2: Dictamen fiscal y financiero

## Descripción

El problema consiste en desarrollar un programa que determine
el impuesto aplicado a la compra de un equipo, dependiendo
de si el comprador es un estudiante acreditado y si el equipo
pertenece al catálogo educativo.

Para resolver el problema se utilizan las operaciones de
lógica proposicional AND y XOR, las cuales permiten
determinar la política fiscal correspondiente.

## Objetivo

Implementar una solución en Java que permita aplicar
operaciones lógicas para determinar el porcentaje de
impuesto, calcular su importe y obtener el precio final
que debe pagar el comprador.

## Proposiciones lógicas

- p: El comprador es un estudiante acreditado.
- q: El equipo pertenece al catálogo educativo.

Cada proposición puede tener dos valores:

- 1: Verdadero.
- 0: Falso.

## Políticas fiscales

- Si ambas proposiciones son verdaderas (AND), se aplica
  una exención total de impuesto del 0%.
- Si solamente una proposición es verdadera (XOR), se
  aplica un impuesto reducido del 8%.
- Si ambas proposiciones son falsas, se aplica un
  impuesto general del 16%.

## Tabla de verdad

| p | q | AND | XOR | Impuesto |
|---|---|-----|-----|----------|
| 1 | 1 | 1   | 0   | 0%       |
| 1 | 0 | 0   | 1   | 8%       |
| 0 | 1 | 0   | 1   | 8%       |
| 0 | 0 | 0   | 0   | 16%      |

## Datos de entrada

- Precio base del equipo.
- Condición de estudiante acreditado.
- Pertenencia del equipo al catálogo educativo.

El programa valida que el precio ingresado sea numérico,
finito y mayor que cero.

## Solución

La solución fue desarrollada en Java mediante una interfaz
gráfica utilizando la biblioteca Swing.

El programa utiliza estructuras condicionales para
determinar la tasa de impuesto correspondiente.

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

- Precio base: $10,000.00
- Estudiante acreditado: Verdadero.
- Equipo educativo: Falso.

Como solamente una proposición es verdadera, se aplica
la operación XOR y una tasa de impuesto del 8%.

Cálculo:

    Impuesto = 10000 * 0.08
    Impuesto = 800.00

    Total = 10000 + 800
    Total = 10800.00

Resultado esperado:

- Política fiscal: Impuesto reducido del 8%.
- Monto del impuesto: $800.00
- Total final a pagar: $10,800.00

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
- Visual Studio Code o una terminal.
- Archivos fuente del proyecto.
- Recursos gráficos correspondientes.

## Compilación y ejecución

Abrir una terminal Git Bash desde la carpeta raíz
del repositorio proyecto1a.

Comprobar la instalación de Java:

```bash
java -version
javac -version
```

Crear una carpeta para los archivos compilados:

```bash
mkdir -p compilado
```

Compilar los archivos Java:

```bash
javac -encoding UTF-8 -d compilado problemas/problema-1/src/*.java problemas/problema-2/src/*.java
```

Copiar el recurso gráfico necesario:

```bash
cp -r problemas/problema-2/recursos/img compilado/
```

Ejecutar el programa:

```bash
java -cp compilado com.mycompany.proyectointehrador.Financiero
```

## Instrucciones de uso

1. Abrir el programa.
2. Ingresar el precio base del equipo.
3. Seleccionar las casillas correspondientes a las
   proposiciones p y q.
4. Presionar el botón Calcular.
5. Consultar el dictamen fiscal y financiero.
6. Presionar el botón Inicio para regresar al menú
   principal.

## Datos de salida

- Precio base del equipo.
- Valores de las proposiciones p y q.
- Política fiscal aplicada.
- Monto del impuesto.
- Total final a pagar.

## Archivos de la solución

- `src/Financiero.java`: código fuente comentado.
- `src/Financiero.form`: formulario de la interfaz gráfica.
- `recursos/img/itsoehLogo2.png`: recurso gráfico.

## Conclusión

La implementación permite aplicar la lógica proposicional
a un problema financiero, automatizando la selección de
la política fiscal y el cálculo del impuesto correspondiente
mediante una interfaz gráfica en Java.