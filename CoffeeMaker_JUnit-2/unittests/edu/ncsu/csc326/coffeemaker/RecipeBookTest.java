package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;

class RecipeBookTest {
    public RecipeBook recipeBook = new RecipeBook();

    @Test
    public void getRecipesTest() {
        assertNotNull(recipeBook.getRecipes());
    }

    @Test
    public void deleteRecipeTest() {
        Recipe recipe = new Recipe();
        Recipe recipe2 = new Recipe();
        recipe2.setName("skinny latte");
        recipe.setName("white latte");
        recipeBook.addRecipe(recipe);
        recipeBook.addRecipe(recipe2);
        assertEquals("white latte", recipeBook.deleteRecipe(0));

    }

    @Test
    public void editRecipeTest() throws RecipeException {
        Recipe recipe = new Recipe();
        recipe.setName("mocha");
        recipe.setAmtChocolate("200");
        Recipe newRecipe = new Recipe();
        newRecipe.setName("new milky mocha 2020");
        newRecipe.setAmtChocolate("50");
        recipeBook.addRecipe(recipe);
        Recipe[] book = recipeBook.getRecipes();
        assertEquals("mocha", recipeBook.editRecipe(0, newRecipe));
        assertEquals(50, book[0].getAmtChocolate());
    }

    @Test
    public void addRecipeTest() throws RecipeException {
        RecipeBook rb = new RecipeBook();
        Recipe recipe = new Recipe();
        recipe.setName("latte");
        recipe.setPrice("1");
        recipe.setAmtSugar("1");
        recipe.setAmtMilk("1");
        recipe.setAmtCoffee("1");
        recipe.setAmtChocolate("1");

        Recipe recipe1 = new Recipe();
        recipe1.setName("latte");
        recipe1.setPrice("1");
        recipe1.setAmtSugar("1");
        recipe1.setAmtMilk("1");
        recipe1.setAmtCoffee("1");
        recipe1.setAmtChocolate("1");
        rb.addRecipe(recipe1);

        /*
        Recipe mockRecipe= mock(Recipe.class);
        when(mockRecipe.getName()).thenReturn("latte");
        when(mockRecipe.getPrice()).thenReturn(3);
        when(mockRecipe.getAmtMilk()).thenReturn(1);
        when(mockRecipe.getAmtCoffee()).thenReturn(1);
        when(mockRecipe.getAmtSugar()).thenReturn(1);
        when(mockRecipe.getAmtChocolate()).thenReturn(1);
*/
        assertFalse(rb.addRecipe(recipe));

    }
}