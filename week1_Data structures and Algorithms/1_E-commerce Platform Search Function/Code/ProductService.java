import java.util.ArrayList;
import java.util.List;

public class ProductService {
    // Separate list for storing products by their field e.g: id, name, category in sorted order
    private List<Product> productById=new ArrayList<>();
    private List<Product> productByName=new ArrayList<>();
    private List<Product> productByCategory=new ArrayList<>();

    // Method for generating product id
    private int generateId(){
        return productById.size()+1;
    }

    // Method for adding product to productById list
    private void addProductById(Product p){
        productById.add(p);
    }

    //Method for adding product to productByName list in sorted order
    private void addProductByName(Product p){
        if(productByName.size()==0){
            productByName.add(p);
            return;
        }
        String newProductName=p.getProductName();
        int i=0;
        while(i<productByName.size()){
            String currentProductName=productByName.get(i).getProductName();
            if(currentProductName.compareToIgnoreCase(newProductName)>=0){
                break;
            }
            i++;
        }
        
        int j=productByName.size();
        // Creating space for new product
        productByName.add(p);
        while(j>i){
            productByName.set(j,productByName.get(j-1));
            j--;
        }
        productByName.set(i, p);
    }

    // Method for adding product in productByCategory list in sorted order
    private void addProductByCategory(Product p){
        if(productByCategory.size()==0){
            productByCategory.add(p);
            return;
        }
        String newCategory=p.getCategory();
        int i=0;
        while(i<productByCategory.size()){
            String currentCategory=productByCategory.get(i).getCategory();
            if(currentCategory.compareToIgnoreCase(newCategory)>=0){
                break;
            }
            i++;
        }
        
        int j=productByCategory.size();
        // Creating space for new product
        productByCategory.add(p);
        while(j>i){
            productByCategory.set(j,productByCategory.get(j-1));
            j--;
        }
        productByCategory.set(i, p);
    }

    // Method for adding product to all the three lists.
    public void addProduct(String name, String category){
        int productId=generateId();
        Product p=new Product(productId, name, category);
        addProductById(p);
        addProductByName(p);
        addProductByCategory(p);
    }

    // For getting all the products
    public List<Product> getProducts(){
        return productById;
    }

    // Method for linearly searching product by its id
    public Product linearSearchById(int productId){
        for(Product p:productById){
            if(p.getProductId()==productId){
                return p;
            }
        }
        return null;
    }

    // Method for linearly searching product by their name
    public List<Product> linearSearchByName(String productName){
        List<Product> foundProducts=new ArrayList<>();
        for(Product p:productById){
            if(p.getProductName()==productName){
                foundProducts.add(p);
            }
        }
        return foundProducts;
    }

    // Method for linearly searching product by their category
    public List<Product> linearSearchByCategory(String productCategory){
        List<Product> foundProducts=new ArrayList<>();
        for(Product p:productById){
            if(p.getCategory()==productCategory){
                foundProducts.add(p);
            }
        }
        return foundProducts;
    }

    // Method for applying binary search on products by its id
    public Product binarySearchById(int productId){
        int s=0, e=productById.size()-1;
        while(s<=e){
            int mid=(s+e)/2;
            Product currentProduct=productById.get(mid);
            if(currentProduct.getProductId()==productId){
                return productById.get(mid);
            }else if(currentProduct.getProductId()<productId){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return null;
    }



    // Method for applying binary search on products by their name
    public Product binarySearchByName(String productName){
        int s=0, e=productByName.size()-1;
        while(s<=e){
            int mid=(s+e)/2;
            Product currentProduct=productByName.get(mid);
            if(currentProduct.getProductName()==productName){
                return productByName.get(mid);
            }else if(currentProduct.getProductName().compareToIgnoreCase(productName)<0){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return null;
    }


    // Method for applying binary search on products by their category
    public Product binarySearchByCategory(String category){
        int s=0, e=productByCategory.size()-1;
        while(s<=e){
            int mid=(s+e)/2;
            Product currentProduct=productByCategory.get(mid);
            if(currentProduct.getCategory().equalsIgnoreCase(category)){
                return productByCategory.get(mid);
            }else if(currentProduct.getCategory().compareToIgnoreCase(category)<0){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return null;
    }

}
