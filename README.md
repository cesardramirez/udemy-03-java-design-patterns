# udemy-03-java-design-patterns
Udemy - Patrones de Diseño en Java

# 📚 Type of Patterns
- Creational
  - Factory Method. 
- Structural
- Behavior

# Design Patterns

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
