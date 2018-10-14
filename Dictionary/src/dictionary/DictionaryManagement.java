/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author anhco
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DictionaryManagement {

    Dictionary list = new Dictionary();
    Scanner inp = new Scanner(System.in);

    public Dictionary insertFromCommandline() {

        String word_target = inp.nextLine();
        String word_explain = inp.nextLine();
        Word newword = new Word(word_target, word_explain);

        list.dictionary.add(newword);
        return list;
    }

    public void insertFromFile() {
        String filename = "dictionaries.txt";

        File file = new File(filename);
        if (file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(DictionaryManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        String word_target = inp.nextLine();
        String word_explain = inp.nextLine();
        try {
            try (FileWriter fw = new FileWriter(filename, true); PrintWriter pw = new PrintWriter(fw)) {
                pw.println(word_target + "\t\t" + word_explain);
            }
        } catch (IOException ex) {
            Logger.getLogger(DictionaryManagement.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
  /*  public void modifiFromFile() throws IOException
    {
         String filename = "dictionaries.txt";
        try {
            try (FileReader fr = new FileReader(filename); BufferedReader br = new BufferedReader(fr)) {
                String line;
                String tucantra = inp.nextLine();
                try {
                    while ((line = br.readLine()) != null) {
                       
                        if (true == line.substring(0, tucantra.length()).equalsIgnoreCase(tucantra)) {
                                String tucanthay=inp.nextLine();
                                String nghiacanthay=inp.nextLine();
                                if("".equals(tucanthay))
                                {
                                   try (FileWriter fw = new FileWriter(filename); PrintWriter pw = new PrintWriter(fw)) {
                                        pw.print(tucantra+"\t\t"+nghiacanthay);
                                    }
                                    
                                }
                                if("".equals(nghiacanthay))
                                {
                                    String resual = line.substring(tucantra.length() + 2);
                                  //  try (FileWriter fw = new FileWriter(filename); PrintWriter pw = new PrintWriter(fw)) {
                                 //       pw.print(tucanthay+"\t\t"+resual);
                                   // }
                                      line=tucanthay+"\t\t"+resual;
                                }
                                if(!"".equals(tucanthay)&&!"".equals(nghiacanthay))
                                {
                                    try (FileWriter fw = new FileWriter(filename); PrintWriter pw = new PrintWriter(fw)) {
                                       pw.write(tucanthay+"\t\t"+nghiacanthay);
                                    }
                                       
                                }
                            break;

                        }
                        
                    }
                } catch (IOException ex) {
                    Logger.getLogger(DictionaryManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DictionaryManagement.class.getName()).log(Level.SEVERE, null, ex);
        }

    }*/
     /*   public void deleteFromFile() throws IOException {
        String filename = "dictionaries.txt";

        File file = new File(filename);
        if (file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(DictionaryManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            try (FileReader fr = new FileReader(filename); BufferedReader br = new BufferedReader(fr)) {
                String line;
                String tucanxoa = inp.nextLine();
                try {
                            while ((line = br.readLine()) != null) {
                       
                        if (true == line.substring(0, tucanxoa.length()).equalsIgnoreCase(tucanxoa)) {
                            break;

                        }
                        
                    }
                } catch (IOException ex) {
                    Logger.getLogger(DictionaryManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DictionaryManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
       

    }*/

    public void dictionaryLookup() throws IOException {
        String filename = "dictionaries.txt";
        try {
            try (FileReader fr = new FileReader(filename); BufferedReader br = new BufferedReader(fr)) {
                String line;
                String tucantra = inp.nextLine();
                try {
                    while ((line = br.readLine()) != null) {
                       
                        if (true == line.substring(0, tucantra.length()).equalsIgnoreCase(tucantra)) {
                            String resual = line.substring(tucantra.length() + 2);
                            System.out.println(resual);
                            break;

                        }
                        
                    }
                } catch (IOException ex) {
                    Logger.getLogger(DictionaryManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DictionaryManagement.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
