package HR;

public class Store {
    //-----property----
    private static Product[] productArray;
    //----setter------
    public void setProductArray(Product[] productArray) {
        Store.productArray = productArray;
    }
    //----getter-----
    public Product[] getProductArray() {
        return productArray;
    }
    //-----method calculation-----
    public void calculation(int[] indexOfProduct, int[] countProduct) {
        int totalPrice = 0;
        for (int i = 0; i < productArray.length; i++) {

            if (indexOfProduct[i] - 1 == i) {
                totalPrice += productArray[i].getPriceP() * countProduct[i];
            }
        }
        showCart(countProduct, indexOfProduct);
        System.out.println("TotalPrice : " + totalPrice + " $ ");
    }
    //-----method showCart-----
    void showCart(int[] indexOfCount, int[] indexOfProduct) {

        for (int i = 1; i < productArray.length; i++) {
            System.out.println("ShowCart ");
            if (i == indexOfProduct[i]) {
                System.out.println("  " + productArray[i - 1] + "*" + indexOfCount[i - 1]);
            }
        }
    }
}