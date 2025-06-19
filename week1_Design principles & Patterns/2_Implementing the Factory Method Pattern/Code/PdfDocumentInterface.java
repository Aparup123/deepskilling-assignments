// Interface for PdfDocument
public interface PdfDocumentInterface{
    String read();
    void write(String content);
    void append(String content);
    void encryptFile(String key);
}
