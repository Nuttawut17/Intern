import java.io.*;
public class copy {
     public static void maind(String[] args)
      {
         try
          {
             BufferedWriter wr = new Bufferedwriter(new FileWriter("test.txt"));
             BufferedReader rd = new BufferedReader(new FileReader("test1.txt"));
             string s;
             While ((s =re.readLine()) !null)
             {
                  wr.write(S+"\n");
             }
               wr.close();
               rd.close();
           }
            catch (Excption ex)
           {
               return;
           }
      }
 }
 
