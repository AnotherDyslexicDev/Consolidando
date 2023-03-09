<h1><img src="https://github.com/AnotherDyslexicDev/Consolidando/blob/main/img/cat.png" width="100" height="100"/>Invasion a la Cámara Secreta. </h1>
---------------------------------------------------------------------------------------------------------------------------------
<h2>Dependencias</h2>

<i>Este código requiere que <Strong>Java</strong> esté instalado en la máquina del usuario para poder ejecutarse.</i>

<h2>Uso</h2>

<i>Para ejecutar el juego, el usuario puede <strong>compilar y ejecutar el archivo Main.java en un IDE de Java o desde la línea de comandos.</strong> 
Una vez que el juego está en funcionamiento, se presenta al usuario un menú para iniciar un nuevo juego, ver las puntuaciones más altas o 
salir del juego. Si el usuario inicia un nuevo juego, puede elegir lanzar un huevo, ver el tablero de juego o terminar el juego. 
El juego termina cuando se golpean todos los vehículos o cuando el usuario elige terminar el juego.</i>


<h2>Contexto, historia y Descripción general del juego</h2>
<i>Hace unos meses, la “Cámara Secreta” de Oscurilandia decidió implementar un nuevo sistema de votación para sus leyes, dado el aumento en 
la cantidad de representantes. Esto generó vicios en el proceso, ya que muchos representantes, a fin de evitar aprobar una ley que no fuera de su gusto, 
se restaban de la votación, aumentando la cantidad en el universo de votos y dificultando con ello obtener el margen de aprobación necesario. 
Esto generó molestia en los ciudadanos de “Oscurilandia”, y están considerando seriamente invadir la “Cámara Secreta”, gracias a la ayuda de un 
grupo de superhéroes anónimos autodenominados “FirstLine”.<br> En razón a la contingencia actual, los representantes han llamado a su grupo de acción, 
la élite de seguridad PKS, para restaurar el orden.<br> Este grupo cuenta con</i> <strong>tres tipos de vehículos</strong> <i>para realizar operaciones:<br><br>

<strong>Kromis:</strong> Tienen un largo de tres metros cada una, y son utilizadas para transportar efectivos de la PKS.<br>
En el tablero se definen bajo la letra K y ocupan 3 espacios del tablero de manera vertical.<br>
Impactar en una Kromi asigna <strong>3 puntos</strong>, si las 3 celdas donde se encuentra la Kromi han sido atacadas por un huevo cada una, 
asigna <strong>10 puntos</strong> extra.<br>

<strong>Caguanos:</strong> Cada uno mide dos metros de largo, y su misión es lanzar confetis y dulces a quienes protestan.<br>
En el tablero se definen bajo la letra C y ocupan 2 espacios del tablero de manera horizontal.<br>
Impactar en un Caguano asigna <strong>2 puntos</strong>, si las 2 celdas donde se encuentra el Caguano han sido atacadas por un huevo cada una,
asigna <strong>7 puntos</strong> extra.<br>

<strong>Trupallas:</strong> Corresponden a efectivos cibernéticos con tecnología de punta, cada uno ocupando en total un metro cuadrado de 
espacio, preparados para hacer entrar en razón a los manifestantes con la fuerza de sus ideas.<br>
En el tablero se definen bajo la letra T y ocupan solo 1 espacio del tablero.<br>
Impactar una Trupalla asigna <Strong>1 punto</strong>, este tipo de vehículo no genera puntaje extra.</i>


<i>Al iniciar el juego se despliegan <Strong>3 opciones. </strong><br><br>
<strong>1.</strong> Inicia juego: Crea el tablero 15x15 con los vehículos en posiciones aleatorias.<br>
En el tablero se crearán <strong>3 Kromis</strong>, <strong>5 Caguanos</strong> y <strong>10 Trupallas</strong>. <br>Para que se despliegue el tablero de manera visual 
primero debemos lanzar un huevo ingresando nuevamente la opcion 1 LANZAR HUEVO e ingresando las coordenadas donde queremos que vaya dirigido.
Primero elegimos la columna del 1 al 15 y luego la fila del 1 al 15. Luego de el lanzamiento se mostrará el tablero con las coordenadas del huevo lanzado
con la letra H.<br><br>
<strong>2. </strong> Mejores puntajes.  <sub> en construcción</sub><br><br>
<strong>3.</strong>Salir del juego.<br><br>

Al lanzar un huevo se mostrará el tablero y la posición del huevo con la letra H, tal como se muestra en la siguiente imagen.<br><br>
<img src="https://github.com/AnotherDyslexicDev/Consolidando/blob/main/img/1.png" width="300" height="300"/><br>

Esta vez el huevo ha fallado y nos indica esto, además de decir que hemos recibido 0 puntos.<br><br><br><br><br><br>
En este ejemplo usando las coordenadas de columna 5 y fila 8 hemos acertado en una Kromi, otorgándonos 3 puntos.
<img src="https://github.com/AnotherDyslexicDev/Consolidando/blob/main/img/58.png" width="300" height="300"/> <br><br>

<h2>Fin del juego</h2>
*Si se llega a obtener 122 puntos el juego habrá terminado ya que no quedarán más carros dentro del tablero. <br><br>
*Si uno quiere rendirse antes y revelar el tablero con la posición de los vehículos, basta con presionar la <strong>opción 2 MOSTRAR SOLUCION</strong> y el 
juego terminará.<br>
<h3>Ejemplo:</h3></i> <br>
<img src="https://github.com/AnotherDyslexicDev/Consolidando/blob/main/img/solucion.png" width="300" height="300"/><br><br><br><br>

<h2>Autores:</h2>
<i>Este código fue escrito por:<br> Mauricio Gutiérrez, David Morales y Carlos Carrasco.<br><br>

Historial de versiones

Java<br><br>
03.2023: Versión inicial del código.</i>


