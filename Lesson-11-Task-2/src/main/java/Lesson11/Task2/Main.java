package Lesson11.Task2;
import Lesson11.Ingredients;
import Lesson11.Pizza;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        Set<Pizza> menu = Arrays.stream(menu()).collect(Collectors.toSet());
        System.out.print("Vegan menu: ");
        MenuCheck.displayVegan(menu);
        Ingredients allergen = Ingredients.celery;
        System.out.println();
        System.out.print("Pizza with allergen "
                + allergen
                + ": ");
        Set<Ingredients> forbidenIngredientSeler = Set.of(Ingredients.celery);
        MenuCheck.hasAllergens(menu, forbidenIngredientSeler);
        System.out.println();
        List<Ingredients> forbidenIngredients = List.of(Ingredients.tomatto, Ingredients.pepper);
        System.out.print("Pizza vegan with  "
                + forbidenIngredients.get(0)
                + ", "
                + forbidenIngredients.get(1)
                + " :");
        MenuCheck.isVeganPizzaWith(menu, forbidenIngredients);
        System.out.println();
        System.out.print("Has all pizzas mozarella: ");
        System.out.println(MenuCheck.hasAllPizzasMozarrela(menu));
        System.out.print("Pizza with max callories: ");
        Pizza maxCaloriesPizza = MenuCheck.getTheMostCaloriesPizza(menu);
        System.out.println(maxCaloriesPizza.getPizzaName()
                + " has max. calories. It is "
                + maxCaloriesPizza.getCalories()
                + " calories");
        System.out.print("Pizza with min callories: ");
        Pizza minCaloriesPizza = MenuCheck.getTheLowesCaloriesPizza(menu);
        System.out.println(minCaloriesPizza.getPizzaName()
                + " has min. calories. It is "
                + minCaloriesPizza.getCalories()
                + " calories");
    }
    public static Pizza[] menu() {
        Ingredients[] pizzaCapricciosaIngredients = {Ingredients.mozarella, Ingredients.tomatto, Ingredients.pepper, Ingredients.onion};
        Ingredients[] pizzaMargaritaIngredients = {Ingredients.mozarella, Ingredients.tomatto, Ingredients.champignons, Ingredients.pepper,};
        Ingredients[] pizzaHawaiIngredients = {Ingredients.mozarella, Ingredients.tomatto, Ingredients.champignons, Ingredients.celery};
        Ingredients[] pizzaNeapolitanaIngredients = {Ingredients.mozarella, Ingredients.tomatto, Ingredients.champignons, Ingredients.salami};
        Ingredients[] pizzaMarokoIngredients = {Ingredients.mozarella, Ingredients.salami, Ingredients.celery, Ingredients.salami};
        Ingredients[] pizzaSalamiIngredients = {Ingredients.mozarella, Ingredients.salami};
        Ingredients[] pizzaWarsawiIngredients = {Ingredients.mozarella, Ingredients.salami, Ingredients.onion};
        Ingredients[] pizzaTurkyIngredients = {Ingredients.mozarella, Ingredients.salami};
        Ingredients[] pizzaSycylianaIngredients = {Ingredients.mozarella, Ingredients.salami};
        Ingredients[] pizzaCapreseIngredients = {Ingredients.mozarella, Ingredients.salami};
        Ingredients[] pizzaBiancasaIngredients = {Ingredients.mozarella};
            Pizza pizzaCapricciosa = new Pizza(pizzaCapricciosaIngredients, 11100, "Pizza Capricious");
            Pizza pizzaMargarita = new Pizza(pizzaMargaritaIngredients, 550, "Pizza Margarita");
            Pizza pizzaHawai = new Pizza(pizzaHawaiIngredients, 300, "Pizza Hawaii");
            Pizza pizzaNeapolitana = new Pizza(pizzaNeapolitanaIngredients, 1000, "Pizza Neapolitan");
            Pizza pizzaMaroko = new Pizza(pizzaMarokoIngredients, 2300, "Pizza Maroko");
            Pizza pizzaSalami = new Pizza(pizzaSalamiIngredients, 5200, "Pizza Salami");
            Pizza pizzaWarsaw = new Pizza(pizzaWarsawiIngredients, 503, "Pizza Warsaw");
            Pizza pizzaTurky = new Pizza(pizzaTurkyIngredients, 5020, "Pizza Turkey");
            Pizza pizzaSycyliana = new Pizza(pizzaSycylianaIngredients, 5002, "Pizza Sycyliana");
            Pizza pizzaCaprese = new Pizza(pizzaCapreseIngredients, 5030, "Pizza Caprese");
            Pizza pizzaBianca = new Pizza(pizzaBiancasaIngredients, 5300, "Pizza Bianca");
    return new Pizza[]{
                pizzaCapricciosa, pizzaMargarita, pizzaHawai,
                pizzaNeapolitana, pizzaMaroko, pizzaSalami,
                pizzaWarsaw, pizzaTurky, pizzaSycyliana,
                pizzaCaprese, pizzaBianca
            };
    }
}
