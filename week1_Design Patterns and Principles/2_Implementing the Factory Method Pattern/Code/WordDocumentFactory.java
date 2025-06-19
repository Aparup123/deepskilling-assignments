// Concrete class for word document factory
public class WordDocumentFactory extends DocumentFactory{
    public WordDocument createDocument(String filename){
        return new WordDocument(filename);
    }
}
