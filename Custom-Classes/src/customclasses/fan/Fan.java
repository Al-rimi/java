package customclasses.fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private boolean on;
    private int speed;
    private double radius;
    private String color;

    public Fan() {
        this.on = false;
        this.speed = SLOW;
        this.radius = 5;
        this.color = "blue";
    }

    public boolean isOn() {
        return on;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "\n Color: " + color + "\n Cadius: " + radius + 
               "\n Status: " + (on ? "on \n Speed: " + speed : "off");
    }
}