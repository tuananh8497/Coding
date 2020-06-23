package abc;

import java.util.*;
import java.text.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class testReadFileUTF8File {

  public static void main(String[] args) {

    String s = new String(readUTF8File("French.txt"));
    System.out.println(s);
    writeUTF8File("FrenchOut.txt", s);
  }

  public static String readUTF8File(String filePath) {
    StringBuilder fileContent = new StringBuilder();
    try {
      Reader reader = new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8);
      BufferedReader bufferedReader = new BufferedReader(reader);
      String s;
      while ((s = bufferedReader.readLine()) != null) {
        fileContent.append(s + "\n");
      }
      bufferedReader.close();
      reader.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return fileContent.toString();
  }

  public static void writeUTF8File(String filePath, String content) {
    try {
      Writer writer =
          new OutputStreamWriter(new FileOutputStream(filePath), StandardCharsets.UTF_8);
      PrintWriter printWriter = new PrintWriter(writer);

      // write your code here to write the newly read content to file
      printWriter.write(content);
      writer.close();
      printWriter.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
