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
