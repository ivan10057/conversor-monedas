<h1 align =center>Conversor de Monedas💵 ➡️ 💰</h1> 

Un Conversor de Monedas desarrollado en Java que permite convertir diferentes monedas a dólares y viceversa. Este proyecto utiliza una API de tasas de cambio en tiempo real para obtener los valores actualizados de las monedas.

<h2>Características ✨</h2>
<ul> Conversión de las siguientes monedas:
<li>Dólar a Peso Colombiano y viceversa.</li>
<li>Dólar a Peso Argentino y viceversa.</li>
<li>Dólar a Real Brasileño y viceversa.</li>
<li>Dólar a Peso Mexicano y viceversa.</li>
<li>Dólar a Córdoba Nicaragüense y viceversa.</li>
<li>Actualización en tiempo real de las tasas de cambio utilizando la API Exchangerate API.</li>
</ul>
<h2>Requisitos 📋</h2>
Asegúrate de tener instalado:
<ul>
<li>Java 8 o superior.</li>
<li>Un entorno de desarrollo como IntelliJ IDEA, Eclipse, o VS Code con extensiones para Java.</li>
<li>Conexión a internet para consumir la API.</li>
</ul>

<h2>Uso 🖥️</h2>
Ejecuta el archivo Main para iniciar el programa.
En la consola, selecciona la conversión que deseas realizar ingresando el número correspondiente al menú.
Ingresa la cantidad de la moneda base y recibe el valor convertido en tiempo real.
Si deseas salir, selecciona la opción "Salir" en el menú.

<h2>API Utilizada </h2>
Este proyecto utiliza la Exchangerate API para obtener tasas de cambio actualizadas.

<h2>Estructura del Proyecto 📂</h2>
<ul>
<li>Main: Clase principal que contiene el menú interactivo.</li>
<li>ConsultarMoneda: Clase para realizar solicitudes HTTP a la API y obtener los datos en formato JSON.</li>
<li>ConvertirMoneda: Clase que maneja las operaciones de conversión.</li>
<li>Moneda: Clase que modela la estructura de los datos de la API.</li>
</ul>
