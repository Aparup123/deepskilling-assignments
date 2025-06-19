// Logger class
public class Logger{
        private static Logger instance=null;
        private String type="console";
        private int logCount=1;

        // Making constructor private preventing other classes to use it
        private Logger(){
            System.out.println("First instance of Logger is created.");
        }

        // Method for returning the only instance
        public static Logger getInstance(){
            if(instance==null){
                instance=new Logger();
            }
            return instance;
        }

        // Methods for testing 
        public void setType(String type){
            if((type!="console") && (type!="email")){
                throw new RuntimeException("Invalid log type!");
            }
            this.type=type;
        }

        public void log(String message){
            if(this.type=="console"){
                System.out.println("log "+logCount+": "+message);
            }
            if(this.type=="email"){
                System.out.println("log "+logCount+": sending mail: message: "+message);
            }
            this.logCount++;
        }
}
