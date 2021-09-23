package ru.mirea.task5.opt1;

public abstract class Dish {
    private String material;
    private String color;
    public Dish(String material, String color) {
        this.material = material;
        this.color = color;
    }
    public String getMaterial(){
        return this.material;
    }
    public String getColor(){
        return this.color;
    }
}
class Cups extends Dish {
    private String type;
    private double diameter;
    public Cups(String material, String color, String type, double diameter){
        super(material, color);
        this.type = type;
        this.diameter = diameter;
    }
    public String toString(){
        return "Material: " + super.getMaterial() + ", Color: "+super.getColor()+", Type: "+this.type+", Diameter: "+this.diameter;
    }
}
class Plates extends Dish {
    private String type;
    private double weight;
    public Plates(String material, String color, String type, double weight){
        super(material, color);
        this.type = type;
        this.weight = weight;
    }
    public String toString(){
        return "Material: " + super.getMaterial() + ", Color: "+super.getColor()+", Type: "+this.type+", Weight: "+this.weight;
    }
}
