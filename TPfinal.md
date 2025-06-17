# Proyecto Donaciones 
## Sistema de Gestion de Donaciones
Una organizacion sin fines de lucro, dedicada a la gestion de donaciones, quiere implementar un sistema para optimizar el registro y administracion de donaciones. La misma desea contar con un registro de las personas y entidades dispuestas a realizar donaciones.
## Requerimientos Funcionales
El sistema permitira el registro de donantes en cualquier momento del año.
Para cada donante, se registraran sus datos personales, incluyendo nombre, apellido y DNI, asi como su ubicacion determinada por direccion, zona, barrio y coordenadas geograficas (latitud y longitud). Esto permitira a la organizacion gestionar eficientemente las solicitudes de retiro de donaciones.
Ademas, la organizacion contara con un registro de voluntarios encargados de la recoleccion y distribucion de donaciones. De cada colaborador se almacenaran datos como nombre, apellido y DNI, facilitando la asignacion de tareas dentro del sistema.
Los donantes podran notificar a la organizacion cuando tengan donaciones disponibles para su retiro. Para ello, el sistema permitira la creacion de pedidos de donacion, los cuales incluiran informacion como la fecha de emision, los bienes a donar (por ejemplo, alimentos, ropa, muebles, etc.), la necesidad de un vehiculo de carga pesada para el traslado y cualquier observacion relevante.
Para gestionar la recoleccion de donaciones, el sistema generara ordenes de retiro a partir de los pedidos recibidos. Estas ordenes especificaran que personal realizara la recoleccion, la vivienda o entidad a visitar, la fecha y hora en que se genera la orden y su estado actual, el cual podra ser PENDIENTE, EN_EJECUCIoN o COMPLETADO.
Cada orden de retiro podra involucrar una o mas visitas, dependiendo de la cantidad de bienes donados y la logistica de recoleccion. En cada visita se registrara la fecha y hora de realizacion, la cantidad y tipo de bienes recogidos, y cualquier observacion relevante. Esto permitira un control detallado del proceso de donacion, del cual se podria tener la siguiente
informacion:

+-------------------------------------------------------------------------------------------------------+
| OrdenDeRetiro1 – Vivienda: 1. Voluntario: Juan Perez. (Estado: PENDIENTE):                            |
|   <sin visitas>                                                                                       |
|                                                                                                       |
| OrdenDeRetiro2 – Vivienda: 2. Voluntario: Juan Perez (Estado: EN_EJECUCION):                          |
|   Visita 1: Fecha: 20/03/2025 08:30 – Obs.: No se encontraba en el domicilio.                         |
|   Visita 2: Fecha: 25/03/2025 09:00 – Obs.: Se retiraron donaciones pero resta completar el traslado. |
|   Visita n: ...                                                                                       |
|                                                                                                       |
| OrdenDeRetiro3 – Vivienda: 3. Voluntario: Rodrigo Gonzalez (Estado: CONCRETADA):                      |
|   Visita 1: Fecha: 15/03/2025 22:00 – Obs.: Se recolectaron todas las donaciones.                     |
|    Obs.: Se recolectaron todas las donaciones.                                                        |
+-------------------------------------------------------------------------------------------------------+


Finalmente, las donaciones seran clasificadas segun su tipo, como alimentos no perecederos, ropa, mobiliario, productos de higiene, entre otros. Cada tipo de donacion podra contar con un sistema de categorizacion o puntaje que facilite su distribucion posterior a quienes mas lo necesiten.