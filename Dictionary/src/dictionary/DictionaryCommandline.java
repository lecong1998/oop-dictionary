/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author anhco
 */
public class DictionaryCommandline {

    Dictionary list = new Dictionary(); // đặt làm thuộc tính để sử dụng chung cho 2 phương thức
    DictionaryManagement addword = new DictionaryManagement();
    int i;

    @SuppressWarnings("empty-statement")
    public void showAllWords() throws FileNotFoundException, IOException {
        String filename = "dictionaries.txt";
        File file = new File(filename);
        if (file.exists()) {
            try (FileReader fr = new FileReader(filename)) {
                try (BufferedReader br = new BufferedReader(fr)) {
                    String line;
                    i = 1;
                    System.out.println("No\t\t\t|English\t|Vietnamese");
                    while ((line = br.readLine()) != null) {

                        System.out.println(i + "\t\t\t" + line);
                        i++;
                    }
                }
                ;
            }
        } else {
            System.out.println("No\t\t\t|English\t\t\t\t\t|Vietnamese");
            for (i = 0; i < list.dictionary.size(); i++) {
                System.out.println(i + 1 + "\t\t\t|" + list.dictionary.get(i).getWord_target() + "\t\t\t\t\t\t|" + list.dictionary.get(i).getWord_explain());
            }
        }
    }

    public void dictionaryBasic() throws IOException {

        Scanner inp = new Scanner(System.in);
        System.out.println("mời bạn nhập số từ cần thêm vào từ điển :");
        int n = inp.nextInt();
        // bản chất trong insert đã tồn tại 1 list . nên sử dụng vòng lặp để tạo 1 list từ đối tượng addword . rồi mới gán cho list của conmandline sau
        for (i = 0; i < n; i++) {
            System.out.println(i + 1 + ":");
            addword.insertFromCommandline();
        }
        list = addword.list;
        showAllWords();
    }

    public void dictionaryAdvanced() throws IOException {
        Scanner inp = new Scanner(System.in);
        System.out.println("mời bạn nhập số từ cần thêm vào từ điển :");
        int n = inp.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println(i + 1 + ":");
            addword.insertFromFile();
        }

        showAllWords();
        addword.dictionaryLookup();
       // addword.modifiFromFile();
       // showAllWords();

    }
}
