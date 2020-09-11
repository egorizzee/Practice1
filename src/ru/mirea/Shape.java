package ru.mirea;

public class Shape {
    private int numberOfShapes;
    private String name;
    private int lengthOfShape;

    public Shape(int numberOfShapes, String name, int lenghtOfShape) {
        this.numberOfShapes = numberOfShapes;
        this.name = name;
        this.lengthOfShape = lenghtOfShape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "numberOfShapes=" + numberOfShapes +
                ", name='" + name + '\'' +
                ", lenghtOfShape=" + lengthOfShape +
                '}';
    }

    public int getSquare(){
        return  numberOfShapes*lengthOfShape;
    }
}