import java.util.HashMap;
import java.util.Map;

// Concrete class for ExcelDocument
class ExcelDocument extends Document implements ExcelDocumentInterface{
    Map<String, String> formula=new HashMap<>();

    ExcelDocument(String filename){
        super(filename);
    }

    @Override
    public String read(){
        return content;
    }

    @Override
    public void write(String[] row) {
        String line=String.join(", ", row);
        this.content="File Type: EXCEL DOCUMENT\n"+content+line;
        System.out.println("Content Written: "+filename);
    }

    @Override
    public void append(String[] row){
        String line=String.join(", ", row);
        this.content+="\n"+line;
    }

    @Override
    public void addFormula(String cell, String formula){
        this.formula.put(cell, formula);
    }
  
}
