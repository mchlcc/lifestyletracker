/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifestyletracker;
import java.util.Scanner;

/**
 *
 * @author angeliparsaso
 */
 public class Food {

    private String f;
    private double c;

    public Food(String f, double c) {
        this.f = f;
        this.c = c;
    }

    public String getFoodName() {
        return f;
    }

    public double getFoodCalories() {
        return c;
    }

    public double updateCalories(double newfoodCalories) {
        return this.c = newfoodCalories;
    }

    @Override
    public String toString() {
        return "Food{" + "foodName=" + f + ", foodCalories=" + c + '}';
    }
    
}
