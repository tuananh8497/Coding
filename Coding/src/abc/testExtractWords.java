package abc;
import java.util.*;
import java.io.*;
import java.text.*;
import java.nio.charset.StandardCharsets;

public class testExtractWords {

  public static void main(String[] args) {
    String f = readUTF8File ("French.txt");
    System.out.println(f);
    writeUTF8File("FrenchOut.txt", f);
    ArrayList words = extractWords(f, Locale.FRENCH);
    System.out.println(words);
    outputWordsToUTF8File("FrenchWords.txt", words);
  }

  public static String readUTF8File (String filePath) {
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

  public static ArrayList extractWords(String inputText, Locale currentLocale) {
    ArrayList wordList = new ArrayList();
    BreakIterator wordIterator = BreakIterator.getWordInstance(currentLocale);
    wordIterator.setText(inputText);
    int start = wordIterator.first();
    int end = wordIterator.next();
    while(end != BreakIterator.DONE) {
      String word = inputText.substring(start, end);
      word = word.toLowerCase();
      if(Character.isLetter(word.charAt(0)) && word.length() > 1) {
        wordList.add(word);
      }
      start = end;
      end = wordIterator.next();
    }
    return wordList;
  } 

  public static void writeUTF8File(String filePath, String content) {
    try
    {
      Writer writer =  new OutputStreamWriter(new FileOutputStream(filePath), StandardCharsets.UTF_8);
      PrintWriter printWriter = new PrintWriter(writer);{
      writer.write(content);
      }
      writer.close();
      printWriter.close();
    } 
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void outputWordsToUTF8File (String filePath, ArrayList wordList) {
    try{
      Writer writer = new OutputStreamWriter(new FileOutputStream(filePath), StandardCharsets.UTF_16);
      PrintWriter printWriter = new PrintWriter(writer);
            Collections.sort(wordList);  
            for (Object word:wordList){
              printWriter.println(word);
            }
      writer.close();
      printWriter.close();
    } 
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
