import java.util.ArrayList;
import java.util.Scanner;

public class Shop {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products= new ArrayList<>();
        int productType = 0;
        String name = "";
        double price = 0;
        double volume = 0;
        double contentOfAlcohol = 0;

        System.out.println("Hello to Shop price calculator!");
        while(true){
            System.out.println("Choose type of product (1-Simple product, 2-Medicine, 3-Alcohol, 4-Vine, 5-Entered " +
                    "product history, 0-to exit)");
            productType = Integer.parseInt(scanner.nextLine());
            if (productType == 0){
                break;
            } else if (productType == 1) {
                System.out.println("Simple product");
                System.out.println("Enter name:");
                name = scanner.nextLine();
                System.out.println("Enter price:");
                price = Double.parseDouble(scanner.nextLine());
                SimpleProduct myProduct = new SimpleProduct(name,price);
                products.add(myProduct);
            } else if (productType == 2) {
                System.out.println("Medicine");
                System.out.println("Enter name:");
                name = scanner.nextLine();
                System.out.println("Enter price:");
                price = Double.parseDouble(scanner.nextLine());
                MedicineProduct myProduct = new MedicineProduct(name,price);
                products.add(myProduct);
            } else if (productType == 3) {
                System.out.println("Alcohol");
                System.out.println("Enter name:");
                name = scanner.nextLine();
                System.out.println("Enter price:");
                price = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter content of alcohol in product:");
                contentOfAlcohol = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter volume:");
                volume = Double.parseDouble(scanner.nextLine());
                AlcoholProduct myProduct = new AlcoholProduct(name,price,contentOfAlcohol,volume);
                products.add(myProduct);
            } else if (productType == 4) {
                System.out.println("Vine");
                System.out.println("Enter name:");
                name = scanner.nextLine();
                System.out.println("Enter price:");
                price = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter content of alcohol in product:");
                contentOfAlcohol = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter volume:");
                volume = Double.parseDouble(scanner.nextLine());
                VineProduct myProduct =  new VineProduct(name,price,contentOfAlcohol,volume);
                products.add(myProduct);
            }else if (productType == 5) {
                for (Product product: products
                     ) {
                    System.out.println(product);
                }
                break;
            }
            System.out.println("Calculations are:");
            System.out.println(products.get(products.size()-1));
        }
    }
}
