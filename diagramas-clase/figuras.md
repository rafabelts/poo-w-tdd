```plantuml
@startuml

class GeometricFigure {
    - color: String
    - filled: boolean
    - creationDate: Date
    + GeometricFigure()
    + GeometricFigure(color: String, filled: boolean)
    + getColor(): String
    + setColor(color: String): void
    + itsFilled(): boolean
    + setFill(filled: boolean): void
    + getCreationDate(): Date
    + toString(): String
}

note right of GeometricFigure
    Color del objeto (predeterminado: blanco)
    Indicar si el objeto está relleno de un color (valor predeterminado: falso)
    La fecha en la que se creó el objeto

    Crear un objeto geométrico
    Crear un objeto geométrico con el color especificado y el color de relleno
    Devuelve el color
    Establece un nuevo color
    Devuelve si está relleno
    Establece una nueva propiedad rellena
    Devuelve la fecha de creación
end note

class Circle {
    - radio: double
    + Circle(radio: double)
    + Circle(radio: double, color: String, filled: boolean)
    + getRadio(): double
    + setRadio(radio: double): void
    + getArea(): double
    + getPerimeter(): double
    + getDiameter(): double
    + toString(): String
}

class Rectangle {
    - base: double
    - height: double
    + Rectangle(base: double, height: double)
    + Rectangle(base: double, height: double, color: String, filled: boolean)
    + getBase(): double
    + setBase(base: double): void
    + getHeight(): double
    + setHeight(height: double): void
    + getArea(): double
    + getPerimeter(): double
    + toString(): String
}

class Triangle {
    - side1: double
    - side2: double
    - side3: double
    + Triangle(side1: double, side2: double, side3: double)
    + Triangle(side1: double, side2: double, side3: double, color: String, filled: boolean)
    + getSide1(): double
    + setSide1(side1: double): void
    + getSide2(): double
    + setSide2(side2: double): void
    + getSide3(): double
    + setSide3(side3: double): void 
    + getArea(): double
    + getPerimeter(): double
    + toString(): String
}

note left of Triangle 
    El valor por defecto de los side sera de 1.0
end note

GeometricFigure <|-- Circle
GeometricFigure <|-- Rectangle
GeometricFigure <|-- Triangle

@enduml
```


