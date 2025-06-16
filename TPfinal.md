# Proyecto Donaciones 
## Sistema de Gestión de Donaciones
Una organización sin fines de lucro, dedicada a la gestión de donaciones, quiere implementar un sistema para optimizar el registro y administración de donaciones. La misma desea contar con un registro de las personas y entidades dispuestas a realizar donaciones.
## Requerimientos Funcionales
El sistema permitirá el registro de donantes en cualquier momento del año.
Para cada donante, se registrarán sus datos personales, incluyendo nombre, apellido y DNI, así como su ubicación determinada por dirección, zona, barrio y coordenadas geográficas (latitud y longitud). Esto permitirá a la organización gestionar eficientemente las solicitudes de retiro de donaciones.
Además, la organización contará con un registro de voluntarios encargados de la recolección y distribución de donaciones. De cada colaborador se almacenarán datos como nombre, apellido y DNI, facilitando la asignación de tareas dentro del sistema.
Los donantes podrán notificar a la organización cuando tengan donaciones disponibles para su retiro. Para ello, el sistema permitirá la creación de pedidos de donación, los cuales incluirán información como la fecha de emisión, los bienes a donar (por ejemplo, alimentos, ropa, muebles, etc.), la necesidad de un vehículo de carga pesada para el traslado y cualquier observación relevante.
Para gestionar la recolección de donaciones, el sistema generará órdenes de retiro a partir de los pedidos recibidos. Estas órdenes especificarán qué personal realizará la recolección, la vivienda o entidad a visitar, la fecha y hora en que se genera la orden y su estado actual, el cual podrá ser PENDIENTE, EN_EJECUCIÓN o COMPLETADO.
Cada orden de retiro podrá involucrar una o más visitas, dependiendo de la cantidad de bienes donados y la logística de recolección. En cada visita se registrará la fecha y hora de realización, la cantidad y tipo de bienes recogidos, y cualquier observación relevante. Esto permitirá un control detallado del proceso de donación, del cual se podría tener la siguiente
información:

+-------------------------------------------------------------------------------------------------------+
| OrdenDeRetiro1 – Vivienda: 1. Voluntario: Juan Perez. (Estado: PENDIENTE):                            |
|   <sin visitas>                                                                                       |
|                                                                                                       |
| OrdenDeRetiro2 – Vivienda: 2. Voluntario: Juan Perez (Estado: EN_EJECUCION):                          |
|   Visita 1: Fecha: 20/03/2025 08:30 – Obs.: No se encontraba en el domicilio.                         |
|   Visita 2: Fecha: 25/03/2025 09:00 – Obs.: Se retiraron donaciones pero resta completar el traslado. |
|   Visita n: ...                                                                                       |
|                                                                                                       |
| OrdenDeRetiro3 – Vivienda: 3. Voluntario: Rodrigo González (Estado: CONCRETADA):                      |
|   Visita 1: Fecha: 15/03/2025 22:00 – Obs.: Se recolectaron todas las donaciones.                     |
|    Obs.: Se recolectaron todas las donaciones.                                                        |
+-------------------------------------------------------------------------------------------------------+


Finalmente, las donaciones serán clasificadas según su tipo, como alimentos no perecederos, ropa, mobiliario, productos de higiene, entre otros. Cada tipo de donación podrá contar con un sistema de categorización o puntaje que facilite su distribución posterior a quienes más lo necesiten.