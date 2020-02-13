package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
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



        //recipe.setAmtChocolate("5");
        /*
        recipe.setAmtCoffee("5");
        recipe.setAmtMilk("5");
        recipe.setAmtSugar("5");

         */



       // assertEquals(5, recipe.getAmtChocolate());
        /*
        assertEquals(5, recipe.getAmtCoffee());
        assertEquals(5, recipe.getAmtSugar());
        assertEquals(5, recipe.getAmtMilk());

         */

    }


    @Test
    public void testSetAmtChocolate() throws RecipeException {

        recipe.setAmtChocolate("5");

        assertEquals(5, recipe.getAmtChocolate());

        recipe.setAmtChocolate("0");


    }
    @Test
    public void testExcepSetAmtChocolate(){
        try{
            recipe.setAmtChocolate("hello");
            fail("should fail");
        }catch (NumberFormatException | RecipeException e){

        }

    }

    @Test
    public void testSetAmtCoffee() throws RecipeException {

        recipe.setAmtCoffee("8");

        assertEquals(8, recipe.getAmtCoffee());

        recipe.setAmtCoffee("0");


    }

    @Test
    public void testExcepSetAmtCoffee(){
        try{
            recipe.setAmtCoffee("hello");
            fail("should fail");
        }catch (NumberFormatException | RecipeException e){

        }

    }
    @Test
    public void testSetAmtMilk() throws RecipeException {

        recipe.setAmtMilk("8");

        assertEquals(8, recipe.getAmtMilk());

        recipe.setAmtMilk("0");


    }
    @Test
    public void testExcepSetAmtMilk(){
        try{
            recipe.setAmtMilk("hello");
            fail("should fail");
        }catch (NumberFormatException | RecipeException e){

        }

    }
    @Test
    public void testSetAmtSugar() throws RecipeException {

        recipe.setAmtSugar("8");

        assertEquals(8, recipe.getAmtSugar());

        recipe.setAmtSugar("0");


    }
    @Test
    public void testExcepSetAmtSugar(){
        try{
            recipe.setAmtSugar("1");
            fail("should fail");
        }catch (NumberFormatException | RecipeException e){

        }

    }
    @Test
    public void testSetPrice() throws RecipeException {
        recipe.setPrice("5");
        assertEquals(5, recipe.getPrice());
    }






}