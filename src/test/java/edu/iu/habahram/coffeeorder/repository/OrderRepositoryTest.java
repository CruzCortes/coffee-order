package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.OrderData;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepositoryTest {

    @Test
    void addDarkRoast() throws Exception {
        OrderRepository repository = new OrderRepository();
        edu.iu.habahram.coffeeorder.model.OrderData order = new edu.iu.habahram.coffeeorder.model.OrderData("Dark Roast", Collections.emptyList());
        OrderRepository.Receipt receipt = repository.add(order);
        assertEquals("Dark roast", receipt.description());
        assertEquals(1.99, receipt.cost(), 0.001); // Add a small delta for comparison
    }

    @Test
    void addEspresso() throws Exception {
        OrderRepository repository = new OrderRepository();
        edu.iu.habahram.coffeeorder.model.OrderData order = new edu.iu.habahram.coffeeorder.model.OrderData("Espresso", Collections.emptyList());
        OrderRepository.Receipt receipt = repository.add(order);
        assertEquals("Espresso", receipt.description());
        assertEquals(1.34, receipt.cost(), 0.001);
    }

    @Test
    void addHouseBlend() throws Exception {
        OrderRepository repository = new OrderRepository();
        edu.iu.habahram.coffeeorder.model.OrderData order = new edu.iu.habahram.coffeeorder.model.OrderData("House Blend", Collections.emptyList());
        OrderRepository.Receipt receipt = repository.add(order);
        assertEquals("House blend", receipt.description());
        assertEquals(1.65, receipt.cost(), 0.001);
    }

    @Test
    void addDecaf() throws Exception {
        OrderRepository repository = new OrderRepository();
        edu.iu.habahram.coffeeorder.model.OrderData order = new edu.iu.habahram.coffeeorder.model.OrderData("Decaf", Collections.emptyList());
        OrderRepository.Receipt receipt = repository.add(order);
        assertEquals("Decaf", receipt.description());
        assertEquals(1.28, receipt.cost(), 0.001);
    }

    @Test
    void addDarkRoastWithMilk() throws Exception {
        OrderRepository repository = new OrderRepository();
        edu.iu.habahram.coffeeorder.model.OrderData order = new edu.iu.habahram.coffeeorder.model.OrderData("Dark Roast", List.of("Milk"));
        OrderRepository.Receipt receipt = repository.add(order);
        assertEquals("Dark roast, Milk", receipt.description());
        assertEquals(2.39, receipt.cost(), 0.001);
    }

    @Test
    void addDarkRoastWithMocha() throws Exception {
        OrderRepository repository = new OrderRepository();
        edu.iu.habahram.coffeeorder.model.OrderData order = new edu.iu.habahram.coffeeorder.model.OrderData("Dark Roast", List.of("Mocha"));
        OrderRepository.Receipt receipt = repository.add(order);
        assertEquals("Dark roast, Mocha", receipt.description());
        assertEquals(2.29, receipt.cost(), 0.001);
    }

    @Test
    void addDarkRoastWithSoy() throws Exception {
        OrderRepository repository = new OrderRepository();
        edu.iu.habahram.coffeeorder.model.OrderData order = new edu.iu.habahram.coffeeorder.model.OrderData("Dark Roast", List.of("Soy"));
        OrderRepository.Receipt receipt = repository.add(order);
        assertEquals("Dark roast, Soy", receipt.description());
        assertEquals(2.26, receipt.cost(), 0.001);
    }

    @Test
    void addDarkRoastWithWhip() throws Exception {
        OrderRepository repository = new OrderRepository();
        edu.iu.habahram.coffeeorder.model.OrderData order = new edu.iu.habahram.coffeeorder.model.OrderData("Dark Roast", List.of("Whip"));
        OrderRepository.Receipt receipt = repository.add(order);
        assertEquals("Dark roast, Whip", receipt.description());
        assertEquals(2.24, receipt.cost(), 0.001);
    }

    @Test
    void addEspressoWithAllCondiments() throws Exception {
        OrderRepository repository = new OrderRepository();
        edu.iu.habahram.coffeeorder.model.OrderData order = new edu.iu.habahram.coffeeorder.model.OrderData("Espresso", List.of("Milk", "Mocha", "Soy", "Whip"));
        OrderRepository.Receipt receipt = repository.add(order);
        assertEquals("Espresso, Milk, Mocha, Soy, Whip", receipt.description());
        assertEquals(2.56, receipt.cost(), 0.001);
    }

    @Test
    void addHouseBlendWithMilkAndMocha() throws Exception {
        OrderRepository repository = new OrderRepository();
        edu.iu.habahram.coffeeorder.model.OrderData order = new edu.iu.habahram.coffeeorder.model.OrderData("House Blend", List.of("Milk", "Mocha"));
        OrderRepository.Receipt receipt = repository.add(order);
        assertEquals("House blend, Milk, Mocha", receipt.description());
        assertEquals(2.35, receipt.cost(), 0.001);
    }

    @Test
    void addEspressoWithMilk() throws Exception {
        OrderRepository repository = new OrderRepository();
        edu.iu.habahram.coffeeorder.model.OrderData order = new edu.iu.habahram.coffeeorder.model.OrderData("Espresso", List.of("Milk"));
        OrderRepository.Receipt receipt = repository.add(order);
        assertEquals("Espresso, Milk", receipt.description());
        assertEquals(1.74, receipt.cost(), 0.001);
    }

    @Test
    void addHouseBlendWithSoy() throws Exception {
        OrderRepository repository = new OrderRepository();
        edu.iu.habahram.coffeeorder.model.OrderData order = new edu.iu.habahram.coffeeorder.model.OrderData("House Blend", List.of("Soy"));
        OrderRepository.Receipt receipt = repository.add(order);
        assertEquals("House blend, Soy", receipt.description());
        assertEquals(1.92, receipt.cost(), 0.001);
    }

    @Test
    void addDecafWithWhip() throws Exception {
        OrderRepository repository = new OrderRepository();
        edu.iu.habahram.coffeeorder.model.OrderData order = new edu.iu.habahram.coffeeorder.model.OrderData("Decaf", List.of("Whip"));
        OrderRepository.Receipt receipt = repository.add(order);
        assertEquals("Decaf, Whip", receipt.description());
        assertEquals(1.53, receipt.cost(), 0.001);
    }

    @Test
    void addEspressoWithMochaAndWhip() throws Exception {
        OrderRepository repository = new OrderRepository();
        edu.iu.habahram.coffeeorder.model.OrderData order = new edu.iu.habahram.coffeeorder.model.OrderData("Espresso", List.of("Mocha", "Whip"));
        OrderRepository.Receipt receipt = repository.add(order);
        assertEquals("Espresso, Mocha, Whip", receipt.description());
        assertEquals(1.89, receipt.cost(), 0.001);
    }

    @Test
    void addHouseBlendWithAllCondiments() throws Exception {
        OrderRepository repository = new OrderRepository();
        edu.iu.habahram.coffeeorder.model.OrderData order = new edu.iu.habahram.coffeeorder.model.OrderData("House Blend", List.of("Milk", "Mocha", "Soy", "Whip"));
        OrderRepository.Receipt receipt = repository.add(order);
        assertEquals("House blend, Milk, Mocha, Soy, Whip", receipt.description());
        assertEquals(2.87, receipt.cost(), 0.001);
    }

    @Test
    void addDecafWithMilkAndSoy() throws Exception {
        OrderRepository repository = new OrderRepository();
        edu.iu.habahram.coffeeorder.model.OrderData order = new edu.iu.habahram.coffeeorder.model.OrderData("Decaf", List.of("Milk", "Soy"));
        OrderRepository.Receipt receipt = repository.add(order);
        assertEquals("Decaf, Milk, Soy", receipt.description());
        assertEquals(1.95, receipt.cost(), 0.001);
    }







    public record OrderData(String beverage, java.util.List<String> condiments) {
    }
}
