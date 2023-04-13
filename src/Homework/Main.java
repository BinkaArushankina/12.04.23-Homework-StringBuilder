package Homework;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws  IOException{
        //1)Переписать первую задачу из вчерашнего задания с использованием StringBuilder: Есть текстовый файл.
        // Написать метод, читающий файл и возвращающий строку, состоящую из строчек этого файла.
        System.out.println(text(new File("text.txt")));

        //2)Написать метод, возвращающий слова в строке в обратном порядке. Использовать StringBuilder.
        // Слова разделяются пробелом.
        String str="The weather today is great";
        System.out.println(reverseLetter(str));
        System.out.println(reverseWord(str));

        //3)* Есть строка, состоящая только из маленьких букв. Используя StringBuilder написать метод,
        // подсчитывающий количество повторений буквы и возвращающий новую строку такого вида:
        String string ="aaaabbccccd";
        System.out.println(repeat(string));

    }
    //1)Write a method to read a text file into a String using StringBuilder class
    public static String text(File file)throws IOException {
        StringBuilder text= new StringBuilder();
        try(BufferedReader br= new BufferedReader(new FileReader(file))){
            String line;
            while ((line=br.readLine()) != null){
                text.append(line).append(" ");
                //text.append(System.lineSeparator());
            }
        }
        return new String(text).trim();              //aa bbb cccc ddddd
    }

    //2)Write a method to reverse words in a String. Use StringBuilder
    public static String reverseLetter (String letters){
        StringBuilder sb= new StringBuilder(letters);
        sb.reverse();
        return new String(sb);                      //taerg si yadot rehtaew ehT
    }
    public static String reverseWord (String str){
        StringBuilder sb = new StringBuilder();
        String[] word= str.trim().split(" ");
        //Collections.reverse(Arrays.asList(word));  //bes pomoschi StringBuilder
        for(int i= word.length-1; i>=0; i-- ){
            if(!word[i].isEmpty()) {           //element sostojaschij is probelow to on ne sachodit w if
                sb.append(word[i]).append(" ");
            }
        }
        return new String(sb).trim();                      //great is today weather The
    }

    //3)Write a method to convert a string of lowercase letters into a string counting the number of these letters for each letter
    public static String repeat(String str){
        if(str.length() == 0)return "";
        StringBuilder sb= new StringBuilder();
        int counter=1;

        for(int i=1; i<str.length(); i++) {
            if (str.charAt(i-1) != str.charAt(i)) {//for natschinaem s 1.     0 index srawniwaem s 2 indexom
                if (counter>1){//snatschit bilo powtorenie
                    sb.append(counter).append(str.charAt(i-1));
                    counter = 1;
                }else{
                    sb.append(str.charAt(i-1));//esli w if ne saschol snatschit on odinotschnij, ego woswr. bes zifri
                }
            }else {
                counter++;
            }
        }
        if(counter==1){//poslednie bukowki odinakowie schtobi sapisalas nado eto
            sb.append(str.charAt(str.length()-1));
        }else{
            sb.append(counter).append(str.charAt(str.length()-1));
        }
        return sb.toString();                       //4a2b4cd
    }


}
