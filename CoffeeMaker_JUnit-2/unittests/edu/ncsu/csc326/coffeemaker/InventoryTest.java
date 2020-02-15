package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {


    public Inventory inventory= new Inventory();


    @Test
    public void testSettersAndGetters(){
        inventory.setChocolate(16);
        inventory.setCoffee(17);
        inventory.setMilk(18);
        inventory.setSugar(19);

        assertEquals(16,inventory.getChocolate());
        assertEquals(17,inventory.getCoffee());
        assertEquals(18,inventory.getMilk());
        assertEquals(19,inventory.getSugar());

    }
    @Test
    public void testAddChocolate() throws InventoryException{
        inventory.addChocolate("1");
        assertEquals(16, inventory.getChocolate());
        inventory.setChocolate(15);
    }
    @Test
    public void testExcepAddChocolate(){
        Assertions.assertThrows(InventoryException.class, () ->{
            inventory.addChocolate("-1");
        });

    }
    @Test
    public void testExcepAddChocolate2(){
        Assertions.assertThrows(InventoryException.class, () ->{
            inventory.addChocolate("Hello");
        });

    }




    @Test
    public void testAddCoffee() throws InventoryException{
        inventory.addCoffee("2");
        assertEquals(17, inventory.getCoffee());
        inventory.setCoffee(15);
    }
    @Test
    public void testExcepAddCoffee(){
        Assertions.assertThrows(InventoryException.class, () ->{
            inventory.addCoffee("-1");
        });

    }
    @Test
    public void testExcepAddCoffee2(){
        Assertions.assertThrows(InventoryException.class, () ->{
            inventory.addCoffee("Hello");
        });

    }


    @Test
    public void testAddMilk() throws InventoryException {
        inventory.addMilk("3");
        assertEquals(18, inventory.getMilk());
        inventory.setMilk(15);
    }
    @Test
    public void testExcepAddMilk(){
        Assertions.assertThrows(InventoryException.class, () ->{
            inventory.addMilk("-1");
        });

    }
    @Test
    public void testExcepAddMilk2(){
        Assertions.assertThrows(InventoryException.class, () ->{
            inventory.addMilk("Hello");
        });

    }
    /*
    This test shows that addSugar
    does not result in the
    inventory having the correct amount
    of sugar added
     */


    @Test
    public void testAddSugar() throws InventoryException {
        inventory.addSugar("3");
        assertEquals(18, inventory.getSugar());
        inventory.setSugar(15);
    }

    /*
    This test shows that addSugar method
    does not throw an Inventory Expection
    where it should because logically
    you shouldn't be able to add negative amounts

     */
    @Test
    public void testExcepAddSugar(){
        Assertions.assertThrows(InventoryException.class, () ->{
            inventory.addSugar("-1");
        });

    }




    @Test
    public void testEnoughIngredients() throws RecipeException {
        Recipe recipe= new Recipe();
        recipe.setAmtCoffee("4");
        recipe.setAmtSugar("1");
        recipe.setAmtChocolate("2");
        recipe.setAmtMilk("2");

        assertTrue(inventory.enoughIngredients(recipe));


    }
    @Test
    public void testNotEnough() throws RecipeException{
        Recipe recipe= new Recipe();
        recipe.setAmtCoffee("16");
        recipe.setAmtSugar("16");
        recipe.setAmtChocolate("16");
        recipe.setAmtMilk("16");

        assertFalse(inventory.enoughIngredients(recipe));

    }
    /*
    This test fails because
    the useIngredients doesn't subtract the amount of coffee
    correctly
     */
    @Test
    public void testUseIngredients() throws RecipeException{
        Recipe recipe1= new Recipe();
        recipe1.setAmtCoffee("1");
        recipe1.setAmtSugar("1");
        recipe1.setAmtChocolate("1");
        recipe1.setAmtMilk("1");

        inventory.useIngredients(recipe1);

        assertEquals(14,inventory.getCoffee());
        assertEquals(14,inventory.getSugar());
        assertEquals(14,inventory.getChocolate());
        assertEquals(14,inventory.getMilk());

    }




}