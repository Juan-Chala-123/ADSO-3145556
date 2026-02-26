# Verbos HTTP

## GET

Es un método de solicitud HTTP utilizado para obtener datos del servidor.  Se envía a través de la URL, lo que hace que los parámetros sean visibles en la barra de direcciones del navegador y puedan ser guardados en el historial, marcadores o rastreados por motores de búsqueda.

## POST

El método POST introduce los parámetros en la solicitud HTTP para el servidor. Por ello, no quedan visibles para el usuario. Además, la capacidad del método POST es ilimitada. Por ejemplo, al rellenar formularios con nombres de usuario y contraseñas, el método POST ofrece mucha discreción. Los datos no se muestran en el caché ni tampoco en el historial de navegación.

## DELETE

Este método de petición permite eliminar un recurso específico.  También es idempotente; es decir puede ser ejecutado varias veces y tiene el mismo efecto similar al PUT y GET. Semánticamente se utiliza para eliminar de información existente, es semejante a un DELETE de datos a nivel de base de datos.

## PUT

Se utiliza para la actualización de información existente, es semejante a un UPDATE de datos a nivel de base de datos.