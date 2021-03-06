package pl.edu.wszib.order;

class Position {
    private final Integer number;
    private final Integer quantity;
    private final Product product;

    Position(final Integer number,
             final Integer quantity,
             final Product product) {
        this.number = number;
        this.quantity = quantity;
        this.product = product;
    }
}
