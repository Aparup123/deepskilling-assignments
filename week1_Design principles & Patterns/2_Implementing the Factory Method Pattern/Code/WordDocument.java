// Concrete class for WordDocument
public class WordDocument extends Document implements WordDocumentInterface{
    WordDocument(String filename){
        super(filename);
    }

    @Override
    public void write(String content) {
        this.content="File Type: WORD DOCUMENT\n"+content;
        System.out.println("Content Written: "+filename);
    }

    @Override
    public String read(){
        return content;
    }

    @Override
    public void append(String content){
        this.content+=content;
    }

    @Override
    public void boldText(String text){
        if(content.indexOf(text)==-1){
            return;
        }
        content=content.replace(text, "<b>"+text+"</b>");
    }

    @Override
    public void underlineText(String text){
        if(content.indexOf(text)==-1){
            return;
        }
        content.replace(text, "<u>"+text+"</u>");
    }
    
}