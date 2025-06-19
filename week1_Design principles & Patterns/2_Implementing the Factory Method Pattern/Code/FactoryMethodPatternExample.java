// main class
public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        // Testing word document
        WordDocumentFactory w=new WordDocumentFactory();
        WordDocument wf=w.createDocument("data.docs");
        wf.open();
        wf.write("Hello world");
        System.out.println(wf.read());
        wf.boldText("world");
        System.out.println(wf.read());
        wf.close();
        System.out.println();

        // Testing excel document
        ExcelDocumentFactory e=new ExcelDocumentFactory();
        ExcelDocument ef=e.createDocument("list.xls");
        ef.open();
        ef.write(new String[]{"Roll", "Name", "Age"});
        ef.append(new String[]{"1002", "Aparup", "20"});
        ef.addFormula("A5", "=A4+A3");
        System.out.println(ef.read());
        ef.close();
        System.out.println();
        
        // Testing pdf document
        PdfDocumentFactory p=new PdfDocumentFactory();
        PdfDocument pf=p.createDocument("survey.pdf");
        pf.open();
        pf.write("This is a survey on github.");
        pf.append(" Github Copilot's code completion works on any file.");
        System.out.println(pf.read());
        pf.close();

    }
}
