package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;

class RecipeBookTest {
    public RecipeBook recipeBook = new RecipeBook();


    /*
    This test shows that getRecipes
    returns an array that is empty
     */

    @Test
    public void getRecipesTest() {
        Recipe[] book = recipeBook.getRecipes();

        assertNotNull(recipeBook.getRecipes());
        for(int i=0; i<book.length;i++){
            assertNull(book[i]);
        }
    }


    @Test
    public void addOneRecipeTest() throws RecipeException{

        Recipe recipe = new Recipe();
        recipe.setName("coffee");
        assertTrue(recipeBook.addRecipe(recipe));

    }
    /*
    This test shows that adding a two recipes
    that are the same is not possible
     */

    @Test
    public void addRecipesTest() throws RecipeException {
        Recipe[] book = recipeBook.getRecipes();

        Recipe recipe = new Recipe();
        recipe.setName("latte");


        Recipe recipe1 = new Recipe();
        recipe1.setName("latte");


        recipeBook.addRecipe(recipe1);

        assertFalse(recipeBook.addRecipe(recipe));

        assertEquals(null, book[1]);

    }


    /*
    This test shows that deleteRecipe
    method does in fact return the name of the deleted recipe.
     */
    @Test
    public void deleteRecipeTest() {
        Recipe[] book = recipeBook.getRecipes();

        Recipe recipe = new Recipe();
        recipe.setName("white latte");
        Recipe recipe2 = new Recipe();
        recipe2.setName("skinny latte");

        recipeBook.addRecipe(recipe);
        recipeBook.addRecipe(recipe2);

        assertEquals("white latte", recipeBook.deleteRecipe(0));
    }
    /*
    This test shows that deleting recipe does
    not result in nullifying the object
    but rather the deleted recipe got replaced
    by another recipe that has the value "" for name.
     */
    @Test
    public void nullDeleteRecipeTest(){
        Recipe[] book = recipeBook.getRecipes();

        Recipe recipe = new Recipe();
        recipe.setName("white latte");
        Recipe recipe2 = new Recipe();
        recipe2.setName("skinny latte");

        recipeBook.addRecipe(recipe);
        recipeBook.addRecipe(recipe2);
        recipeBook.deleteRecipe(0);

        assertEquals((Integer) null, book[0]);


    }
    /*
    This test shows that the
    delete recipe method does in fact
    return null when a recipe does not exist
     */
    @Test
    public void testDeleteNull(){
        assertEquals(null,recipeBook.deleteRecipe(3));

    }



    /*
    This test shows that when we fill
    the recipe book with recipes( the max is 4)
    and one of these recipes is deleted, addRecipe(recipe5)
    should return true but instead it
    return false. This is a fault, because new recipes wouldn't
    be able to take the place of deleted recipes.
     */

    @Test
    public void deleteAndAddTest(){
        Recipe recipe = new Recipe();
        Recipe recipe2 = new Recipe();
        Recipe recipe3 = new Recipe();
        Recipe recipe4 = new Recipe();
        recipe2.setName("skinny latte");
        recipe.setName("white latte");
        recipe3.setName("mocha latte");
        recipe4.setName("espresso");
        recipeBook.addRecipe(recipe);
        recipeBook.addRecipe(recipe2);
        recipeBook.addRecipe(recipe3);
        recipeBook.addRecipe(recipe4);
        recipeBook.deleteRecipe(2);
        Recipe recipe5 = new Recipe();
        recipe5.setName("americano");
        assertTrue(recipeBook.addRecipe(recipe5));
    }
    /*
    This test shows that when a recipe is edited
    the name of the recipe is returned and the new recipe
    details have been updated.
     */


    @Test
    public void editRecipeTest() throws RecipeException {
        Recipe[] book = recipeBook.getRecipes();

        Recipe recipe = new Recipe();
        recipe.setName("mocha");
        recipe.setAmtChocolate("200");
        recipeBook.addRecipe(recipe);

        Recipe newRecipe = new Recipe();
        newRecipe.setName("new milky mocha 2020");
        newRecipe.setAmtChocolate("50");
        newRecipe.setPrice("3");
        newRecipe.setAmtMilk("4");
        newRecipe.setAmtCoffee("2");
        newRecipe.setAmtSugar("3");


        assertEquals("mocha", recipeBook.editRecipe(0, newRecipe));
        assertEquals(50, book[0].getAmtChocolate());
        assertEquals(3, book[0].getPrice());
        assertEquals(4, book[0].getAmtMilk());
        assertEquals(2, book[0].getAmtCoffee());
        assertEquals(3, book[0].getAmtSugar());

    }

    /*
    This test shows that when editing the recipe, the name
    is set to "" in the recipebook array
    * */
    @Test
    public void editRecipeGetNameTest() throws RecipeException{
        Recipe[] book = recipeBook.getRecipes();
        Recipe recipe = new Recipe();

        recipe.setName("mocha");
        recipe.setAmtChocolate("200");
        recipeBook.addRecipe(recipe);
        Recipe newRecipe = new Recipe();
        newRecipe.setName("mocha");
        newRecipe.setAmtChocolate("50");

        recipeBook.editRecipe(0, newRecipe);
        assertEquals("mocha",book[0].getName());
    }

}