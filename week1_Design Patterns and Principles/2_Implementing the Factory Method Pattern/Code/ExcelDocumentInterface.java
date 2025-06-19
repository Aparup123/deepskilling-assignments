// Interface for ExcelDocument
public interface ExcelDocumentInterface{
    String read();
    void write(String[] row);
    void append(String[] row);
    void addFormula(String cell, String formula);
}

