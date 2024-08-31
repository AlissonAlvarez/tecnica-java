
# Desafíos de Programación en Java

Este documento presenta dos desafíos de programación en Java que tienen como objetivo evaluar habilidades en el desarrollo de soluciones algorítmicas y en la gestión de notificaciones. A continuación, se proporciona una descripción detallada de cada desafío, sus objetivos y los enfoques recomendados para su implementación.

## Desafío 1: Verificación de Redacción de Nota

### Objetivo

Desarrollar una función en Java que determine si es posible escribir un informe utilizando recortes de una revista. La función debe comprobar si todas las letras necesarias para redactar un informe están disponibles en el texto completo de la revista en las cantidades requeridas.

### Descripción del Desafío

La función debe recibir dos cadenas de caracteres:

1.  **Nota**: El texto del informe que se desea escribir.
2.  **Revista**: El texto completo de la revista de la cual se pueden utilizar las letras.

La salida de la función debe ser un valor booleano:

-   `true` si es posible escribir la nota con las letras disponibles en la revista.
-   `false` en caso contrario.

1.  **Conteo de Caracteres**: Implementar un conteo de ocurrencias de cada letra en ambas cadenas.
2.  **Comparación**: Verificar que la revista contiene al menos el número necesario de cada letra para cubrir las necesidades de la nota.

### Complejidad del Algoritmo

-   **Tiempo**: O(n + m), donde `n` es la longitud de la nota y `m` es la longitud del texto de la revista.
-   **Espacio**: O(n + m), debido al almacenamiento de contadores de caracteres.

## Desafío 2: Notificación a Estudiantes

### Objetivo

Desarrollar un sistema en Java para enviar notificaciones por correo electrónico a estudiantes afectados por la cancelación de clases en una sede específica. El sistema debe gestionar la notificación a estudiantes matriculados en diferentes asignaturas, asegurando que cada estudiante reciba un único correo electrónico.

### Descripción del Desafío

Se proporcionan tres listas de estudiantes:

1.  **Lista A**: Estudiantes matriculados en Matemáticas.
2.  **Lista B**: Estudiantes matriculados en Francés.
3.  **Lista C**: Estudiantes matriculados en ambas asignaturas (Matemáticas y Francés).

El sistema debe:

1.  Enviar un mensaje a los estudiantes de Matemáticas.
2.  Enviar un mensaje a los estudiantes de Francés.
3.  Enviar un mensaje a los estudiantes matriculados en ambas asignaturas.

1.  **Selección de Notificación**: Permitir la selección del tipo de notificación mediante una interfaz gráfica.
2.  **Envío de Correos**: Simular el envío de correos electrónicos con el mensaje apropiado para cada grupo de estudiantes.

### Requisitos Técnicos

-   **Lenguaje de Programación**: Java
-   **Dependencias**: Utilización de bibliotecas estándar de Java y `javax.swing` para la interfaz gráfica.
-   **Entrada**: Datos de los estudiantes y selección del tipo de notificación.
-   **Salida**: Resultados simulados de envío de correos electrónicos en la consola.

## Instrucciones de Ejecución

1.  **Compilación**: Asegúrate de compilar las clases Java proporcionadas.
2.  **Ejecución**: Ejecuta las aplicaciones desde la línea de comandos o desde tu entorno de desarrollo integrado (IDE).