package HR;
import java.util.Scanner;
import static java.lang.System.out;
import static HR.AdminStore.*;
import static HR.Customer.buyProduct;
import static HR.Supplier.showProduct;
public class AMain {
    static Scanner scanner = new Scanner((System.in));

    public static void main(String[] args) {

        Store store = new Store();

        while (true) {
            out.println("userType Store :  1-admin , 2-customer , 3-suplier \n ");
            out.print("Login Store \n userType : ");
            String userType = String.valueOf(scanner.next());

            if (userType.equals("admin")) {
                setProduct(store);
            } else {
                if (userType.equals("customer")) {
                    showProduct(store.getProductArray());

                    Customer customers = new Customer();
                    buyProduct(store.getProductArray());

                    store.calculation(customers.getIndexProducts(), customers.getCountOfProduct());
                } else {
                    out.println("Invalid user, EXIT !");
                }
                break;
            }
        }
    }
}