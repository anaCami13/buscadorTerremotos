# buscadorTerremotos
Proyecto final de Tópicos Avanzados  en Programación

 autor Ana camila Ojeda lópez 
 
 Descri del  proyecto :
 
 Desarrollo de una aplicación que muestre una lista de los terremotos más recientes en el
mundo desde la API de la organización USS Geological Survey (USGS).

Las características que deberá tener el Software serán las siguientes:

a) Una interfaz para establecer los parámetros de la búsqueda de información:
Las fechas deben de ser capturadas con un componente JDatePicker (Time: starttime,
endtime)
Para limitar el numero de resultados, debe ser capturado con un cuadro de texto (limit)
Utilizar el componente JSlider para establecer los rangos de la magnitud (maxmagnitude,
minmagnitude; 0 significa no utilizar esta opción)
Utilizar JRadioButton para seleccionar una opción para ordenar la información (orderby: time,
time-asc, magnitude, magnitude-asc y none para no ordenar)
Añadir un botón para iniciar la búsqueda de información
URL ejemplo de consulta para enviar una solicitud de datos:
https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02
Añadir un botón para cancelar la descarga de información.

b) Utilizar un SwingWorker para descargar los datos de la consulta y no se bloquee nuestra interfaz.
Genera un biblioteca de funciones para la descarga del archivo json.
Genera un biblioteca de funciones para cargar los datos del json en un modelo para mostrar
los datos en un componente JTree.
Crear un jar(exclusivo) para estas bibliotecas.

c) Una interfaz para mostrar los resultados:
Los resultados se deben de mostrar en un componente JTree para que la visualización de
datos sea de forma jerárquica.
La información se debe jerarquizar por fecha, magnitud y titulo.
Se deben de mostrar los siguientes datos de cada terremoto: place, magType, updated (fecha
de actualización, mostrar en formato de fecha) y url.

d) Una interfaz para mostrar los nodos seleccionados en el JTree
Siempre que se seleccione un nodo en el árbol, añade la ruta del nodo seleccionado en un
componente JList. Agregue un botón para que guarde los enlaces seleccionados del JList 
en una base de datos.
e) Usa un objeto JTabbedPane para organizar los componentes de la GUI en la ventana.

f) Empaqueta tu aplicación en un archivo jar.
Lista en tu manifiesto las APIs externas para no tener que llamarlas de forma explicita.
