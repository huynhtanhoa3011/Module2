package OOP;

public class Fan {
    public int speed;
    public boolean onoff;
    public double radius;
    public String color;

    public Fan() {
        this.speed = 1;
        this.onoff = true;
        this.radius = 5d;
        this.color = "green";
    }
    public void setFanSpeed(int speed) {
        this.speed = speed;
    }
    public int getFanSpeed() {
        return this.speed;
    }

    public void setOnoff(boolean onoff) {
        this.onoff = onoff;
    }
    public boolean getonoff() {
        return this.onoff;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getradius () {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }

    public String fanInfo () {
        if(this.getonoff() == true) {
            return "Fan" + "\nColor: " + this.color + "\nSpeed: " + this.speed + "\nRadius: " + this.radius + "\nFan is on";
        }
        return "\n\nFan " + "\nColor: " + this.color + "\nRadius: " + this.radius + "\nFan is off";
    }

}
