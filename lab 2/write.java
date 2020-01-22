import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.nio.file.FileSystemNotFoundException;

public class write implements Serializable {

    private static final long serialVersionUID = 1L;

    public write(){

    }

   /* public void writefile(){
        PrintWriter printwriter = null;

        try{//Note that we are able to append to the file because of the "true" parameter
            printwriter = new PrintWriter(new FileOutputStream("essentials_stock.txt", true));
        }catch(FileNotFoundException fnfe) {
            fnfe.getMessage();
        }
        printwriter.print("item" + "  " + "Quantity" + "Price(cedis)");
        printwriter.println();

        printwriter.close();

        try{//Note that we are able to append to the file because of the "true" parameter
            printwriter = new PrintWriter(new FileOutputStream("backup_essentials_stock.txt", true));
        }catch(FileNotFoundException fnfe) {
            fnfe.getMessage();
        }
        printwriter.print("item" + "  " + "Quantity" + "  " + " Price(cedis)");
        printwriter.println();

        printwriter.close();

    }
    public void writetofile() throws FileNotFoundException {

        PrintWriter printWriter = null;

        try{
            //we can append the file due to the 'true' perimeter
            printWriter = new PrintWriter(new FileOutputStream("essentials_stock.txt", true));

        }catch(FileNotFoundException fnfe){
            fnfe.getMessage();
        }
        //gets the value and prints them in text file
        printWriter.print(getItem())
    }*/








}
