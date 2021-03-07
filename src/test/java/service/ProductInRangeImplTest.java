package service;

import static org.junit.Assert.*;

public class ProductInRangeImplTest {

    @org.junit.Test
    public void getProduct() {
        ProductInRangeImpl product = new ProductInRangeImpl();

        assertEquals(product.getProduct(5, 15), 54486432000L);
        assertEquals(product.getProduct(0, 1), 0L);
        assertEquals(product.getProduct(2, 2), 2L);
        assertEquals(product.getProduct(1, 4), 24L);
    }
}