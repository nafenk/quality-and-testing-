package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    Recipe recipe = new Recipe();
    @Test
    public void testGetters() throws RecipeException {

        assertEquals("",recipe.getName());
        assertEquals(0,recipe.getAmtMilk());
        assertEquals(0,recipe.getAmtSugar());
        assertEquals(0,recipe.getAmtCoffee());
        assertEquals(0,recipe.getAmtMilk());

    }


    @Test
    public void testSetAmtChocolate() throws RecipeException {

        recipe.setAmtChocolate("5");

        assertEquals(5, recipe.getAmtChocolate());

        recipe.setAmtChocolate("0");


    }


    @Test
    public void testExcepSetAmtChocolate(){
        Assertions.assertThrows(RecipeException.class, () ->{
            recipe.setAmtSugar("Hello");
        });
    }
    @Test
    public void testExcepSetAmtChocolate2(){
        Assertions.assertThrows(RecipeException.class, () ->{
            recipe.setAmtSugar("-1");
        });
    }


    @Test
    public void testSetAmtCoffee() throws RecipeException {

        recipe.setAmtCoffee("8");

        assertEquals(8, recipe.getAmtCoffee());

        recipe.setAmtCoffee("0");


    }

    @Test
    public void testExcepSetAmtCoffee(){
        Assertions.assertThrows(RecipeException.class, () ->{
            recipe.setAmtCoffee("bye");
        });

    }
    @Test
    public void testExcepSetAmtCoffee2(){
        Assertions.assertThrows(RecipeException.class, () ->{
            recipe.setAmtCoffee("-1");
        });

    }


    @Test
    public void testSetAmtMilk() throws RecipeException {

        recipe.setAmtMilk("8");

        assertEquals(8, recipe.getAmtMilk());

        recipe.setAmtMilk("0");


    }
    @Test
    public void testExcepSetAmtMilk(){
        Assertions.assertThrows(RecipeException.class, () ->{
            recipe.setAmtMilk("bye");
        });

    }
    @Test
    public void testExcepSetAmtMilk2(){
        Assertions.assertThrows(RecipeException.class, () ->{
            recipe.setAmtMilk("-1");
        });

    }

    @Test
    public void testSetAmtSugar() throws RecipeException {

        recipe.setAmtSugar("8");

        assertEquals(8, recipe.getAmtSugar());

        recipe.setAmtSugar("0");


    }
    @Test
    public void testExcepSetAmtSugar(){
        Assertions.assertThrows(RecipeException.class, () ->{
            recipe.setAmtSugar("-1");
        });

    }
    @Test
    public void testExcepSetAmtSugar2(){
        Assertions.assertThrows(RecipeException.class, () ->{
            recipe.setAmtSugar("hello");
        });

    }

    @Test
    public void testSetPrice() throws RecipeException {
        recipe.setPrice("5");
        assertEquals(5, recipe.getPrice());
    }
    @Test
    public void testExcepSetPrice(){
        Assertions.assertThrows(RecipeException.class, () ->{
            recipe.setPrice("-1");
        });

    }
    @Test
    public void testExcepSetPrice2(){
        Assertions.assertThrows(RecipeException.class, () ->{
            recipe.setPrice("hello");
        });

    }
}