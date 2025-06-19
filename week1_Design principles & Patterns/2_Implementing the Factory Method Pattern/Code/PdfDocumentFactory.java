// Concrete class for pdf document factory
public class PdfDocumentFactory extends DocumentFactory{
    public PdfDocument createDocument(String filename){
        return new PdfDocument(filename);
    }
}
