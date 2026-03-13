# udemy-03-java-design-patterns
Udemy - Patrones de Diseño en Java

# 📚 Type of Patterns
- Creational
  - [Factory Method](#-factory-method).
  - [Abstract Factory](#-abstract-factory).
  - [Builder](#-builder).
  - [Prototype](#-prototype).
  - [Singleton](#-singleton).
- Structural
- Behavioral
  - Chain of Responsibility. 

# Design Patterns

---
## 🏭 Factory Method

![Factory Method UML](docs/img/01_UML_Factory_Method.png)

### 📖 Descripción
El patrón **Factory Method** define una interfaz para crear objetos, pero permite que las subclases decidan qué clase instanciar.

### 🎯 Problema que resuelve
- Evitar el uso directo de `new`.
- Desacoplar la creación de objetos.
- Facilitar extensión del código.

### 🧱 Estructura
| Rol | Descripción |
|-----|-------------|
| Product | Interfaz común |
| ConcreteProduct | Implementaciones concretas |
| Creator | Clase base con factory method |
| ConcreteCreator | Implementación concreta |

---
## 🏭 Abstract Factory

![Factory Method UML](docs/img/02_UML_Abstract_Factory.png)

### 📖 Descripción
El patrón **Abstract Factory** proporciona una interfaz para crear **familias de objetos relacionados o dependientes** sin especificar sus clases concretas.

Permite que el cliente trabaje únicamente con interfaces, desacoplando completamente la lógica de creación.

### 🎯 Problema que resuelve
- Evita dependencias directas con clases concretas.
- Garantiza consistencia entre productos de una misma familia.
- Facilita el cambio completo de configuración (por ejemplo, cambiar toda la familia VISA por MASTERCARD).

### 🧱 Estructura
| Rol | Responsabilidad |
|------|----------------|
| AbstractFactory | Declara métodos para crear productos abstractos |
| ConcreteFactory | Implementa la creación de productos concretos |
| AbstractProduct | Interfaz común de los productos |
| ConcreteProduct | Implementaciones específicas |
| Client | Usa solo interfaces |

---
## 🏗️ Builder

![Factory Method UML](docs/img/03_UML_Builder.png)

### 📖 Descripción
El patrón **Builder** separa la construcción de un objeto complejo de su representación, permitiendo crear diferentes representaciones usando el mismo proceso de construcción.

Es ideal cuando:
- El objeto tiene muchos atributos opcionales.
- Se quiere evitar constructores con demasiados parámetros.
- Se necesita controlar el proceso de creación paso a paso.

### 🎯 Problema que resuelve
- Evita constructores telescópicos (constructores sobrecargados que se van extendiendo).
- Mejora la legibilidad del código.
- Permite crear distintas configuraciones del mismo objeto.

### 🧱 Estructura
| Rol | Responsabilidad |
|------|----------------|
| Builder | Define los pasos de construcción |
| ConcreteBuilder | Implementa los pasos |
| Director (opcional) | Orquesta el proceso de construcción |
| Product | Objeto final complejo |

---
## 🧬 Prototype

![Factory Method UML](docs/img/04_UML_Prototype.png)

### 📖 Descripción
El patrón **Prototype** permite crear nuevos objetos **clonando una instancia existente**, en lugar de crear un objeto desde cero.

Esto es útil cuando la creación de objetos es **costosa o compleja**, y es más eficiente copiar una instancia ya configurada.

### 🎯 Problema que resuelve
- Evita la creación repetitiva de objetos complejos.
- Reduce el costo de inicialización.
- Permite crear copias de objetos en tiempo de ejecución.

### 🧱 Estructura
| Rol | Responsabilidad                                    |
|------|----------------------------------------------------|
| Prototype | Interfaz que define el método `clone()` o `copy()` |
| ConcretePrototype | Implementa la clonación                            |
| Client | Clona el objeto existente                          |

---
## 🔒 Singleton

![Factory Method UML](docs/img/05_UML_Singleton.png)

### 📖 Descripción

El patrón **Singleton** asegura que una clase tenga **solo una instancia** durante toda la ejecución de la aplicación y ofrece un punto global para acceder a ella.

Se utiliza comúnmente para objetos que deben ser **compartidos en toda la aplicación**, como configuraciones, conexiones o administradores de recursos.

### 🎯 Problema que resuelve

- Evita crear múltiples instancias innecesarias.
- Controla el acceso global a un objeto.
- Centraliza la gestión de recursos compartidos.

### 🧱 Estructura
| Rol | Responsabilidad |
|-----|----------------|
| Singleton | Clase que controla la creación de su única instancia |
| Instance | Instancia única accesible globalmente |
| Client | Obtiene la instancia mediante un método estático |