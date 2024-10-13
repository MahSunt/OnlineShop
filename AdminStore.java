package HR;
import static java.lang.System.*;
import static HR.AMain.scanner;
public class AdminStore {
    //----method setProduct-----
    public static void setProduct(Store s) {
        out.print("Count Product For Set in Store ? ");
        int totalProduct = scanner.nextInt();

        Product[] productArray = new Product[totalProduct];

        for (int i = 0; i < productArray.length; i++) {
            productArray[i] = new Product();

            out.println("-Set Product" + " " + (i + 1));
            out.print("Name : ");
            productArray[i].setNameP(scanner.next());
            out.print("Price : ");
            productArray[i].setPriceP(scanner.nextInt());
        }
        s.setProductArray(productArray);
    }
}
