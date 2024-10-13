package HR;

public class Supplier {
    //-----method showProduct-----
    public static void showProduct(Product[] productArray) {
        System.out.println("List Product ");
        for (int i = 0; i < productArray.length; i++)
            System.out.print((i + 1) + " , " + productArray[i].getNameP() + " ---> " + productArray[i].getPriceP() + " $ " + "\n");
    }
}




