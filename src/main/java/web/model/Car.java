package web.model;

//@Entity
//@Table(name = "cars")
public class Car {
    String name;
    String number;
    Color carColor;

    public Car(String name, String number, Color color) {
        this.name = name;
        this.number = number;
        this.carColor = color;
    }
}

enum Color
{
    BLACK,
    WHITE,
    YELLOW
}
