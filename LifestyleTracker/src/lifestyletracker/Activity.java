/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifestyletracker;

/**
 *
 * @author angeliparsaso
 */
public class Activity {

    private String n;
    private double c;

    public Activity(String activityName, double actCalorieValue) {
        this.n = activityName;
        this.c = actCalorieValue;
    }

    public String getActivityName() {
        return n;
    }

    public double getActCalorieValue() {
        return c;
    }

    public double updateCalories(double newCalorieValue) {
        return this.c = newCalorieValue;
    }

    @Override
    public String toString() {
        return "Activity{" + "activityName=" + n + ", actCalorieValue=" + c + '}';
    }
    
}

