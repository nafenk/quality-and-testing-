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
        Throwable exception = assertThrows(RecipeException.class, ()->recipe.setAmtChocolate("hello"));
        Throwable exception2 = assertThrows(RecipeException.class, ()->recipe.setAmtChocolate("-2"));

        assertEquals("Units of chocolate must be a positive integer", exception.getMessage());
        assertEquals("Units of chocolate must be a positive integer", exception2.getMessage());

    }


    @Test
    public void testSetAmtCoffee() throws RecipeException {

        recipe.setAmtCoffee("8");

        assertEquals(8, recipe.getAmtCoffee());

        recipe.setAmtCoffee("0");


    }

   @Test
    public void testExcepSetAmtCoffee(){

        Throwable exception = assertThrows(RecipeException.class, ()->recipe.setAmtCoffee("hello"));
        Throwable exception2 = assertThrows(RecipeException.class, ()->recipe.setAmtCoffee("-4"));


        assertEquals("Units of coffee must be a positive integer", exception.getMessage());
        assertEquals("Units of coffee must be a positive integer", exception2.getMessage());
    }

    @Test
    public void testSetAmtMilk() throws RecipeException {

        recipe.setAmtMilk("8");

        assertEquals(8, recipe.getAmtMilk());

        recipe.setAmtMilk("0");


    }
    
   
    
=======
        Throwable exception = assertThrows(RecipeException.class, ()->recipe.setAmtMilk("hello"));
        Throwable exception2 = assertThrows(RecipeException.class, ()->recipe.setAmtMilk("-4"));

        assertEquals("Units of milk must be a positive integer", exception.getMessage());
        assertEquals("Units of milk must be a positive integer", exception2.getMessage());

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
        Throwable exception = assertThrows(RecipeException.class, ()->recipe.setAmtSugar("hello"));
        Throwable exception2 = assertThrows(RecipeException.class, ()->recipe.setAmtSugar("-4"));


        assertEquals("Units of sugar must be a positive integer", exception.getMessage());
        assertEquals("Units of sugar must be a positive integer", exception2.getMessage());
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

