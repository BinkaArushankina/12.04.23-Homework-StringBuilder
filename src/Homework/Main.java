package Homework;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
    public static String text(File file )throws IOException {
        StringBuilder text= new StringBuilder();
        try(BufferedReader br= new BufferedReader(new FileReader(file))){
            String line;
            while ((line=br.readLine()) != null){
                text.append(line);
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
        String[] word= str.split(" ");

        for(int i= word.length-1; i>=0; i-- ){
            sb.append(word[i]).append(" ");
        }
        return new String(sb);                      //great is today weather The
    }

    //3)Write a method to convert a string of lowercase letters into a string counting the number of these letters for each letter
    public static String repeat(String str){
        StringBuilder sb= new StringBuilder();

        for(int i=0; i<str.length(); i++) {

        }
        return new String(sb);
    }


}
