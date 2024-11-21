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

<h2>Requisitos 📋</h2>
Asegúrate de tener instalado:

Java 8 o superior.
Un entorno de desarrollo como IntelliJ IDEA, Eclipse, o VS Code con extensiones para Java.
Conexión a internet para consumir la API.
Instalación 🚀
Clona este repositorio en tu máquina local:

bash
Copiar código
git clone https://github.com/tu-usuario/conversor-monedas.git
Abre el proyecto en tu IDE favorito.

Asegúrate de incluir las dependencias necesarias (por ejemplo, la librería Gson para manejar JSON). Si estás usando Maven, asegúrate de incluir la dependencia en tu archivo pom.xml:

xml
Copiar código
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.9</version>
</dependency>
Configura tu clave API para Exchangerate API en la clase correspondiente (como ConsultarMoneda).

Uso 🖥️
Ejecuta el archivo Main para iniciar el programa.

En la consola, selecciona la conversión que deseas realizar ingresando el número correspondiente al menú.

Ingresa la cantidad de la moneda base y recibe el valor convertido en tiempo real.

Si deseas salir, selecciona la opción "Salir" en el menú.

Ejemplo de Menú en Consola
plaintext
Copiar código
*******************************************************
Bienvenidos al conversor de monedas
Ingresa la conversión de moneda que deseas efectuar:
1. Dólar a Peso Colombiano
2. Peso Colombiano a Dólar
3. Dólar a Peso Argentino
4. Peso Argentino a Dólar
...
11. Salir
*******************************************************
API Utilizada 🌐
Este proyecto utiliza la Exchangerate API para obtener tasas de cambio actualizadas.

Estructura del Proyecto 📂
Main: Clase principal que contiene el menú interactivo.
ConsultarMoneda: Clase para realizar solicitudes HTTP a la API y obtener los datos en formato JSON.
ConvertirMoneda: Clase que maneja las operaciones de conversión.
Moneda: Clase que modela la estructura de los datos de la API.
Contribuciones 🤝
¡Las contribuciones son bienvenidas! Si encuentras algún problema o tienes una idea para mejorar el proyecto:

Haz un fork de este repositorio.
Crea una nueva rama para tu funcionalidad o corrección de errores (git checkout -b feature/nueva-funcionalidad).
Realiza tus cambios y haz un commit (git commit -m "Agrega nueva funcionalidad").
Sube tus cambios al repositorio (git push origin feature/nueva-funcionalidad).
Abre un pull request.
Licencia 📄
Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más información.
