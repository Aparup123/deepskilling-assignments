// Document abstract class for all type of document
public abstract class Document{
    String filename;
    String content="";
    Document(String filename){
        this.filename=filename;
    }
    void open(){
        System.out.println("Opening: "+filename);
    };
    void save(){
        System.out.println("Saving: "+filename);
    };
    void close(){
        System.out.println("Closing: "+filename);
    };
    
}