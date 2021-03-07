package service;

import java.util.stream.LongStream;

public class ProductInRangeImpl implements ProductInRange{
    /**
     * getProduct
     * @param left
     * @param right
     * @return Returns product of numbers lying between left left and right borders
     */
    @Override
    public long getProduct(long left, long right) {
        ProductInRange product = (long l, long r) -> LongStream.rangeClosed(l, r)
                .reduce(1, (long x, long y) -> x * y);
        return product.getProduct(left, right);
    }
}
