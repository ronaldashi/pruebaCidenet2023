# Prueba-Cidenet2023


# Instalaccion

### 1) instalar ORACLE DVeloper 12 con java 1.8.

### 2) instalar Eclipse.

### 3) Descargar gesto de base de datos Mysql

### 4) en la carpeta "BaseDatos" :

####  1. Ejecutar primero el archivo con nombre "createCursos.sql"
####  2. Ejecutar el archivo sql con nombre "insertCurso.sql"

### 5) abrir y cargar el proyecto nombre "EmpleadoFinal" en visual studio, en la terminar ejecutar el siguiente comando 

```bash
  mvn clean install -U
```

### "ojdbc14-10.2.0.4.0.zip" la cual contiene el .jar en caso de error!

### 6) luego ejecutar 

```bash
  mvn clean compile
```

### 7) ejecutar el comando 

```bash
  mvn clean package
````
 
### Esto genera un .war con nombre "EmpleadoWS.war" lo usaremos mas adelante para desplegar en el servidor weblogin

### 8) abrir JDveloper 12, para proceder a crear DataSource en el servidor de WebLogin
### 9) inicializar el server y luego abrir la consola selecionando la opcon Launch Administrative Console (o ir: http://localhost:7001/console/login/LoginForm.jsp)

### 10) loguiarse al serve y creamos el dataSource :

#### nombre de la bd es "pruebacidenet"
#### nombre del host es "localhost" 
#### puerto en mi caso es "3306"
#### usuario: "root" 
#### contraseña: "root"

### 11) luego buscamo nuestro archivo EmpleadoWS.war


### 12) abrimos otra ventana de visual studio para el cliente, el nombre del archivo es "Empleado-Cliente", y ejecutamos la clase con nombre "EmployeeSOAP11BindQSPortClient.java"
