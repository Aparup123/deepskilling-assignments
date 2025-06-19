// Interface for WordDocument
public interface WordDocumentInterface{
    String read();
    void write(String content);
    void append(String content);
    void boldText(String text);
    void underlineText(String text);
}
