package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class CoffeeMakerTest1 {
    Inventory inventory= new Inventory();
    RecipeBook rb= new RecipeBook();
    CoffeeMaker cm= new CoffeeMaker();


    @Test
    public void testMakeCoffee() throws RecipeException {
        Recipe recipe1= new Recipe();
        recipe1.setPrice("3");
        cm.addRecipe(recipe1);

        assertEquals(2,cm.makeCoffee(0,5));

    }
    @Test
    public void noRecipesThenMakeCoffee(){

        assertEquals(3,cm.makeCoffee(1,3));
    }

   @Test
    public void notEnoughtMoney()throws RecipeException{
       Recipe recipe1= new Recipe();
       recipe1.setPrice("3");
       cm.addRecipe(recipe1);



       assertEquals(1,cm.makeCoffee(0,1));


   }
   /*
   This test fails and throws an InventoryException
   saying that "Units of sugar must be a positive integer" even though
   the units are positive, which proves that the method
   addSugar used inside addInventory in CoffeeMaker has a fault.
   */
   @Test
    public void testAddInventory() throws InventoryException {
           cm.addInventory("1","1","1","1");

   }

    /*
    This test shows that InventoryException
    is being thrown which is the correct behavior
    given that the inputs are incorrect.  
    */
   @Test
   public void testAddInventoryException() {
       Assertions.assertThrows(InventoryException.class, () ->{
           cm.addInventory("-1","hello","bye", "lol");
       });
   }




}