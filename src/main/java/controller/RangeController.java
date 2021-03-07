package controller;

import service.ProductInRangeImpl;
import java.util.logging.Logger;

public final class RangeController {

    private static final Logger LOGGER = Logger.getLogger(RangeController.class.getName());

    private RangeController(){}

    public static void main(String[] args)
    {
        final long left = 5;
        final long right = 15;

        ProductInRangeImpl product = new ProductInRangeImpl();
        long result = product.getProduct(left, right);
        LOGGER.info(String.valueOf(result));
    }
}
