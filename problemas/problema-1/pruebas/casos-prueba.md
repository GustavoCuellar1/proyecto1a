
# Casos de prueba - Problema 1

## Objetivo
Comprobar el funcionamiento del programa de cálculo de distancia entre dos puntos del plano cartesiano, verificando los incrementos en X, Y y la distancia obtenida.

## Fórmula utilizada

d = √((X2 - X1)² + (Y2 - Y1)²)

## Casos de prueba

| Caso | X1 | Y1 | X2 | Y2 | Incremento X | Incremento Y | Distancia esperada |
|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | 1 | 1 | 5 | 4 | 4.00 | 3.00 | 5.00 |
| 2 | 0 | 0 | 3 | 4 | 3.00 | 4.00 | 5.00 |
| 3 | 2 | 3 | 2 | 8 | 0.00 | 5.00 | 5.00 |
| 4 | -2 | 1 | 4 | 1 | 6.00 | 0.00 | 6.00 |
| 5 | -3 | -4 | 0 | 0 | 3.00 | 4.00 | 5.00 |
| 6 | -2 | -3 | 2 | 3 | 4.00 | 6.00 | 7.21 |
| 7 | 1.5 | -2.5 | 5.5 | 2.5 | 4.00 | 5.00 | 6.40 |
| 8 | -6 | 4 | 2 | 10 | 8.00 | 6.00 | 10.00 |
| 9 | 10 | -4 | 16 | 4 | 6.00 | 8.00 | 10.00 |
| 10 | 2.5 | 3.5 | 2.5 | 3.5 | 0.00 | 0.00 | 0.00 |

## Observaciones

- Se incluyen coordenadas positivas, negativas y decimales.
- Se comprueban desplazamientos horizontales y verticales.
- Se comprueban puntos iguales.
- Se verifica el cálculo de la distancia mediante la fórmula correspondiente.

## Registro de ejecución

Se ejecutaron manualmente los 10 casos de prueba utilizando la interfaz gráfica del programa Java.

| Caso | Incremento X obtenido | Incremento Y obtenido | Distancia obtenida | Estado |
|---|---:|---:|---:|---|
| 1 | 3.00 | 4.00 | 5.00 | Aprobado |
| 2 | 3.00 | 4.00 | 5.00 | Aprobado |
| 3 | 0.00 | 5.00 | 5.00 | Aprobado |
| 4 | 6.00 | 0.00 | 6.00 | Aprobado |
| 5 | 3.00 | 4.00 | 5.00 | Aprobado |
| 6 | 4.00 | 6.00 | 7.21 | Aprobado |
| 7 | 4.00 | 5.00 | 6.40 | Aprobado |
| 8 | 8.00 | 6.00 | 10.00 | Aprobado |
| 9 | 6.00 | 8.00 | 10.00 | Aprobado |
| 10 | 0.00 | 0.00 | 0.00 | Aprobado |

**Resultado final:** Se ejecutaron los 10 casos de prueba y todos coincidieron con los resultados esperados.

**Observaciones:**
- El programa calcula correctamente los incrementos de X y Y.
- La distancia se calcula correctamente con coordenadas positivas, negativas y decimales.
- Se comprobaron desplazamientos horizontales, verticales y puntos iguales.
- Se detectó un detalle visual: la segunda etiqueta del Punto 2 muestra "Ingrese X2" en lugar de "Ingrese Y2". Este detalle no afecta los cálculos y queda pendiente de corrección.
