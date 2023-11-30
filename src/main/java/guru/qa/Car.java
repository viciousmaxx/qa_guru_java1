package guru.qa;

public class Car {
    private final String type;
    private final String model;
    private String color;
    private int speed;

    public Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    void makeVzhzzhz () {
        System.out.printf("Car %s %s make vzzhhh! \n", color, model);
    }

    void changeColor (String newColor) {
        if (speed != 0) {
            System.out.println("You can't pain while car moving, plz stop!");
        } else {
            color = newColor;
            System.out.printf("Your new color is %s \n" , color);}
    }

    void goFaster (int adder) {
        speed += adder;
        System.out.printf("New speed is: %d \n", speed);
    }

    void stop() {
        speed = 0;
        makeVzhzzhz();
        System.out.println("You are stopped!");
    }
}
