# Biblioteca Reactiva (_Spring boot, webflux, Router Function Mongo DB_)

_Simulación del funcionamiento de una biblioteca utilizando spring boot y Mongo DB._

## Ejecución del proyecto ⌨️
_`Mongo db: localhost:27017`_
_`Spring boot: localhost:8080

### Dependecias necesarias para la ejecución del proyecto  📦

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-mongodb-reactive</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-webflux</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.projectreactor</groupId>
            <artifactId>reactor-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>

        <!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core -->
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-core</artifactId>
            <version>2.13.2</version>
        </dependency>
    </dependencies>

### Organización de carpetas
`config`
* **WebfluxConfig**

`aplication`
* **mappers**
* **useCase**
* **useCaseImp**
* **JsonReader**

`domain`
* **collection**
* **dto**
* **repository**
* **utils**
* **valueObject**

`infrastructure`
* **command_router**
* **query_router**

### Data
_Se crea un archivo Data.json que contiene una collección de 85 elementos. La data simula una colección de libros, revistas, DVD, rondas infantiles disponibles en una biblioteca_

### JsonReader
_Se crea una clase llamada JsonReader que permite convertir el Data.json en objetos, los cuales se utilizan para ejecutar los tests_

### Endpoints 📌

_Resource command controllers_
`PUT, POST, DELETE`
* [returnResource](http://www) - devolver recurso
* [borrowResource](https://) - prestar recurso
* [deleteAll](https://) - Borrar data
* [deleteResource](https://) - borrar recurso por Id
* [updateResource](https://) - actualizar recurso
* [saveResource](https://) - crear y guardar recurso
* [fillData](https://) - llenar data

_Resource query controllers_
`GET`
* [findByName](http://www) - filtrar por nombre
* [findByAuthor](https://) - filtrar por autor
* [recommendByThema&Type](https://) - recomendar recurso por temática y tipo de recurso
* [recommendByThematicArea](https://) - recomendar por temática
* [recommendByTypeOfResource](https://) - recomendar por tipo de recurso
* [findByAvailability](https://) - consultar disponibilidad de recurso
* [findById](https://) - buscar por id
* [listResource](https://) - lista de recursos

### pruebas manuales con insomnia y postman


## Autora ✒️
* **Lina Maria Guerrero** - *Biblioteca funcional* - [LMFront-end](https://github.com/LMFront-end)