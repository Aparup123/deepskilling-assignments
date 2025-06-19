// Concrete class for excel document factory
class ExcelDocumentFactory extends DocumentFactory{
    public ExcelDocument createDocument(String filename){
        return new ExcelDocument(filename);
    }
}