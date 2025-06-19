// Concrete class for PdfDocument
public class PdfDocument extends Document implements PdfDocumentInterface{
    PdfDocument(String filename){
        super(filename);
    }

    @Override
    public void write(String content) {
        this.content="File Type: PDF DOCUMENT\n"+content;
        System.out.println("Content Written: "+filename);
    }

    @Override
    public void append(String content){
        this.content+=content;
    }

    @Override
    public String read(){
        return content;
    }

    @Override
    public void encryptFile(String key) {
        System.out.println("Encrypting file: "+filename+" with key: "+key);
    }

}