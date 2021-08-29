package TemplateMethod;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        Meal meal = new HumbergerMeal();
        meal.doMeal();

        System.out.println();

        Meal meal1 = new TacoMeal();
        meal1.doMeal();
    }
}
