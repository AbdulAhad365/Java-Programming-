import java.io.*;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

class Scratch {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("ok.txt"));
        bufferedWriter.write("ok"+"\n");
        bufferedWriter.write("welcome to my channel");
        bufferedWriter.close();
        // now from reading from the file

        BufferedReader reader=new BufferedReader(new FileReader("ok.txt"));
        String line;
        while((line= reader.readLine())!=null){
            System.out.println(line);
        }
        reader.close();
    }

}
