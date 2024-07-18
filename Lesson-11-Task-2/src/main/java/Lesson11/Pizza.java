package Lesson11;
import java.util.Arrays;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Pizza {
    private boolean isNotVegan;
    private final Set<Ingredients> ingredientsList;
    private final int calories;
    private final String name;
        public Pizza(Ingredients[] listOfIngredients, int calories, String name ){
        this.ingredientsList= Arrays.stream(listOfIngredients).collect(Collectors.toSet());
        this.calories = calories;
        this.name = name;
        isVegan();
        }
        private void isVegan(){
            Predicate<Ingredients> predicate = Ingredients.salami::equals;
            this.isNotVegan = this.ingredientsList.stream().anyMatch(predicate);
        }
        public boolean getIsNotVegan(){
            return this.isNotVegan;
        }
        public int getCalories(){
            return this.calories;
        }
        public Set<Ingredients> getIngredients(){
            return this.ingredientsList;
        }
        public String getPizzaName(){
            return this.name;
        }
}
