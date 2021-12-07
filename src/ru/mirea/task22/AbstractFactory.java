package ru.mirea.task22;

interface Chair{
    void setName(String name);
    String getName();
}
public class AbstractFactory{
    public Chair getName(String chair_){
        Chair chair = null;
        if ("Victorian".equals(chair_)) {
            chair = new VictorianChair();
        } else if ("Multifunctional".equals(chair_)) {
            chair = new MultifunctionalChair();
        } else if ("Magic".equals(chair_)) {
            chair = new MagicChair();
        }
        return chair;
    }
}
class VictorianChair implements Chair{
    private String name ="Victorian";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class MultifunctionalChair implements Chair{
    private String name ="Multifunctional";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class MagicChair implements Chair{
    private String name ="Magic";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
