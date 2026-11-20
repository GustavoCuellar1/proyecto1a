# Casos de prueba - Problema 2

## Objetivo
Verificar el funcionamiento del programa Financiero.java, incluyendo la validación del precio, las operaciones lógicas AND y XOR y el cálculo de impuestos.

## Casos de prueba

| Caso | Entrada | Resultado esperado |
|---|---|---|
| 1 | Precio: 1000, p: verdadero, q: verdadero | Impuesto 0% |
| 2 | Precio: 1000, p: verdadero, q: falso | Impuesto 8% |
| 3 | Precio: 1000, p: falso, q: verdadero | Impuesto 8% |
| 4 | Precio: 1000, p: falso, q: falso | Impuesto 16% |
| 5 | Precio: 0 | Mensaje de error |
| 6 | Precio: -100 | Mensaje de error |
| 7 | Precio: texto | Mensaje de precio inválido |
| 8 | Campo de precio vacío | Mensaje de precio inválido |
| 9 | Precio: 1500, p: verdadero, q: verdadero | Total a pagar: 1500 |
| 10 | Precio: 1500, p: falso, q: falso | Impuesto: 240, total: 1740 |

## Verificaciones realizadas

- Validación de precios numéricos y positivos.
- Comprobación de la operación lógica AND.
- Comprobación de la operación lógica XOR.
- Verificación de las tasas de impuestos del 0%, 8% y 16%.
- Comprobación del cálculo del impuesto.
- Comprobación del total final a pagar.
- Verificación del funcionamiento del botón Inicio.

## Conclusión

Los casos de prueba permiten verificar las condiciones lógicas, la validación de datos y los cálculos financieros implementados en el programa Java.
