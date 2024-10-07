package abc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;

@RestController
@RequestMapping("/inventory")
public class InventoryService {

    private static final Logger logger = LoggerFactory.getLogger(InventoryService.class);

    @GetMapping("/products")
    public String[] getProducts() {
        String[] products = {"Chair", "Table", "Sofa"};
        logger.info("Returning products: \nProduct 1: P1\nProduct 2: P2\nProduct 3: P3");
        return products;
    }

    @GetMapping("/stores")
    public String[] getStores() {
        String[] stores = {"S1", "S2", "S3"};
        try {
            FileInputStream fis = new FileInputStream("file.txt");
        } catch (Exception e) {
            logger.info("Exception occurred: " + e.getMessage(), e);
        }
        return stores;
    }
}
