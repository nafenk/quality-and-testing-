package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {
    @Test
    public void evaluateExpression() throws InventoryException {
        Inventory inventory= new Inventory();
        //Recipe mockRecipe = mock(Recipe.class);

        inventory.addSugar("-1");
        inventory.addChocolate("2");
        inventory.addCoffee("1");

        //TODO maybe we can test specific exceptions



       assertEquals(15,inventory.getSugar());

       assertEquals(17,inventory.getChocolate());

       assertEquals(16,inventory.getCoffee());

    }
    public void addSugar(){


    }


}