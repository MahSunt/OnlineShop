package HR;
import static java.lang.System.out;
import static HR.AMain.scanner;
public class Customer {
    //-----property----
    private static int[] indexProduct;
    protected static int[] countProduct;
    //----getter-----
    public int[] getIndexProducts() {
        return indexProduct;
    }
    public int[] getCountOfProduct() {
        return indexProduct;
    }
    //----method buyProduct-----
    public static void buyProduct(Product[] productArray) {
        if (productArray != null) {
            out.print("how many product for buy ? ");
            int numberNeedToBuy = scanner.nextInt();
            indexProduct = new int[numberNeedToBuy];
            countProduct = new int[numberNeedToBuy];

            for (int i = 0; i < numberNeedToBuy; i++) {

                out.print("Index Product" + " " + (i + 1) + ": ");
                int productIndex = scanner.nextInt();

                out.print("Count Product" + " " + (i + 1)+ ": ");
                int productCount = scanner.nextInt();

                if (productIndex >= 1 && productIndex <= productArray.length) {
                    indexProduct[i] = productIndex;
                    countProduct[i] = productCount;
                } else {
                    out.println("ایندکس کالای وارد شده ناموجود می باشد لطفا صرفا از ایندکس کالاهای موجود، نمایش داده شده در لیست محصولات انتخاب نمایید!");
                    i--;
                }
//                break;
            }
        } else
            out.println("Store Is Empty !!!");
    }
}


