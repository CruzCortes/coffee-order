package edu.iu.habahram.coffeeorder.controllers;

import edu.iu.habahram.coffeeorder.model.OrderData;
import edu.iu.habahram.coffeeorder.model.Receipt;
import edu.iu.habahram.coffeeorder.repository.OrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import edu.iu.habahram.coffeeorder.model.Receipt;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/orders")
//@CrossOrigin(origins = "https://cruzcortes.github.io")
@CrossOrigin(origins = "*")
public class OrderController {
    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/prices")
    public ResponseEntity<Map<String, Double>> getPrices() {
        Map<String, Double> prices = new HashMap<>();
        prices.put("Dark Roast", 2.5);
        prices.put("Espresso", 2.0);
        prices.put("House Blend", 2.0);
        prices.put("Decaf", 1.5);
        prices.put("Milk", 0.5);
        prices.put("Mocha", 0.5);
        prices.put("Soy", 0.5);
        prices.put("Whip", 0.5);
        return new ResponseEntity<>(prices, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> add(@RequestBody OrderData order) {
        try {
            OrderRepository.Receipt receipt = orderRepository.add(order);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(receipt);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }
}
