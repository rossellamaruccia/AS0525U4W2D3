import Entities.Order;
import Entities.Product;

void main() {
    ArrayList<Product> products = new ArrayList<>();
    products.add(new Product("3332", "book", "book", 10.5));
    products.add(new Product("3332", "book", "book", 10.5));
    products.add(new Product("3332", "book", "book", 10.5));

    ArrayList<Order> orders = new ArrayList<>();
    LocalDate orderDate = new LocalDate(2021, 12, 3);
    LocalDate deliveryDate = new LocalDate(2023, 4,2);
    Product product = products.getFirst();
    Customer customer = new Customer();
    orders.add(new Order("dt3543","pending", orderDate, deliveryDate, product, customer));


    List<Product> priceFilter = products.stream().filter(product -> product.price < 100 && product.category = "Book").toList();
    List<Order> categoryFilter = products.stream().filter(Order.product _> product.category = "Baby").toList();

}
