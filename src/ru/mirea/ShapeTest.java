package ru.mirea;

import java.util.Scanner;

public class ShapeTest {
    public void test(){
        Shape triangle = new Shape(3, "triangle", 10);
        System.out.println("Введите название фигуры");
        Scanner scanner = new Scanner(System.in);
        triangle.setName(scanner.nextLine());
        System.out.println(triangle);
        System.out.println(triangle.getSquare());
    }
}