package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문개수를 입력하세요:");
        int n = sc.nextInt();
        sc.nextLine();
        ProductOrder[] productOrders = new ProductOrder[n];
        for(int i = 0 ; i < n ; i++) {
            System.out.print("상품명 : ");
            String productName = sc.nextLine();
            System.out.print("가격 : ");
            int price = sc.nextInt();
            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine();
            productOrders[i] = createOrder(productName, price, quantity);
        }

        printOrder(productOrders);
        System.out.println("총 결제 금액: "+getTotalAmount(productOrders));
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrder(ProductOrder[] productOrder){
        for (ProductOrder order : productOrder) {
            System.out.println("상품명: "+order.productName+", 가격:"+order.price+", 수량: "+order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] productOrder){
        int totalAmount = 0;
        for (ProductOrder order : productOrder) {
            totalAmount += order.price*order.quantity;
        }
        return totalAmount;
    }
}
