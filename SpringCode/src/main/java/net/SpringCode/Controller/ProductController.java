package net.SpringCode.Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.SpringCode.Model.Product;

@RestController
public class ProductController {

    private ArrayList<Product> product = new ArrayList<>();

    @GetMapping("/product")
    public ArrayList getAllProduct() {
        Product pro1 = new Product(1, "Bottle", "Mad in India");
        this.product.add(0, pro1);
        Product pro2 = new Product(2, "Mobile", "Mad in China");
        this.product.add(0, pro2);
        return this.product;
        // return "Hello World";
    }
}
