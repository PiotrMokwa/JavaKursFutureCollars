package Lesson11.Task2;
import Lesson11.Ingredients;
import Lesson11.Pizza;
import java.util.*;
import java.util.function.Predicate;
public abstract class MenuCheck {
    public static void displayVegan(Set<Pizza> menu) {
        Predicate<Pizza> predicate = value -> !value.getIsNotVegan();
        menu.stream()
                .filter(predicate)
                .forEach(value
                        -> System.out.print(value.getPizzaName() + ", "));
    }
    public static void hasAllergens(Set<Pizza> menu, Set<Ingredients> ingredientAllergen) {
        menu.stream()
                .filter((pizza) ->
                           pizza
                                   .getIngredients()
                                   .containsAll(ingredientAllergen))
                .forEach(value -> System.out.print(value.getPizzaName() +", "));
    }
   public static void isVeganPizzaWith(Set<Pizza> menu, List<Ingredients> forbidenIngredients) {
        menu.stream()
                .filter(pizza -> !pizza.getIsNotVegan())
                .filter(pizza->pizza
                        .getIngredients()
                        .containsAll(forbidenIngredients))
                .forEach(pizza -> System.out.print(pizza.getPizzaName() + ", "));
   }
   public static boolean hasAllPizzasMozarrela(Set<Pizza> menu){
        return menu.stream()
             .allMatch((pizza) -> pizza
                     .getIngredients()
                     .contains(Ingredients
                             .mozarella));
   }
   public static Pizza getTheMostCaloriesPizza(Set<Pizza> menu){
        Optional<Pizza> maxCalories = menu.stream()
                .max(Comparator.comparingInt(Pizza::getCalories));
       return maxCalories.orElse(null);
   }
   public static Pizza getTheLowesCaloriesPizza(Set<Pizza> menu){
        Optional<Pizza> minCalories = menu.stream()
                .min(Comparator.comparingInt(Pizza::getCalories));
        return minCalories.orElse(null);
   }
}
