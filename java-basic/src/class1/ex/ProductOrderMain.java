package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder dubu = new ProductOrder();
        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder cola = new ProductOrder();
        cola.productName = "콜라";
        cola.price = 1500;
        cola.quantity = 2;

        ProductOrder[] productOrders = new ProductOrder[] {dubu, kimchi, cola};
        int sum = 0;
        for (ProductOrder productOrder : productOrders) {
            sum += productOrder.quantity * productOrder.price;
            System.out.println("상품명: " + productOrder.productName + ", 가격: "+productOrder.price + ", 수량:" + productOrder.quantity  );
        }
        System.out.println("총 결제 금액: "+ sum);
    }
}
