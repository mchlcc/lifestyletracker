 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lifestyletracker;

/**
 *
 * @author angeliparsaso
 */
public class TrackerConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=====================");
        System.out.println("======  MENU  =======");
        System.out.println("= 1. Add Food =======");
        System.out.println("= 2. Add Calories ===");
        System.out.println("= 3. Add Activity ===");
        System.out.println("= 4. Add Calorie ====");
        System.out.println("= 5. Add Food =======");
        System.out.println("=====================");
        
        
        
        
        
        
        Food food1 = new Food("Omelette", 154);
        Activity activity1 = new Activity("Jogging",400);
        
        System.out.println(food1);
        System.out.println(food1.getFoodName());
        System.out.println(food1.getFoodCalories());
        System.out.println(activity1);
        System.out.println(activity1.getActivityName());
        System.out.println(activity1.getActCalorieValue());
        food1.updateCalories(100);
        System.out.println(food1);
        activity1.updateCalories(150);
        System.out.println(activity1);
        
        
    }
    
}
