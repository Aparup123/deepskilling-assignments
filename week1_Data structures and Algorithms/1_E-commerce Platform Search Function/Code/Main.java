public class Main {
    public static void main(String[] args) throws Exception {
        ProductService productService=new ProductService();

        // Adding products 
        productService.addProduct("Apple", "food");
        productService.addProduct("Bread", "food");
        productService.addProduct("Pencil", "stationary");
        productService.addProduct("Axe", "tool");

        // Printing all products
        System.out.println("Product list: ");
        System.out.println(productService.getProducts());

        // Searching linearly
        System.out.println("\nLinear search: ");
        System.out.println(productService.linearSearchById(2));
        System.out.println(productService.linearSearchByName("Apple"));
        System.out.println(productService.linearSearchByCategory("tool"));
        
        // Applying binary search
        System.out.println("\nBinary search: ");
        System.out.println(productService.binarySearchById(4));
        System.out.println(productService.binarySearchByName("Apple"));
        System.out.println(productService.binarySearchByCategory("Stationary"));
        
    }
}
