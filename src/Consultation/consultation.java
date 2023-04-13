package Consultation;

public class consultation {
    public static void main(String[] args) {
        int a=10;
        int b=5;

        int max = a>b ? a : b;    //uslowie  ?   if  :  else

        //ili

        if(a>b){
            max = a;
        }else{
            max = b;
        }



        //1) napisatj metod substring, kotorij rabotaet kak metod substring java. Ispolsowatj stringBuilding

        String str= "Hello";
        str.substring(1,3);

        System.out.println(ourSubstring(str,1,3));
        //2) abc -> +3. napisatj metod , prinimajuschij slowo is angl mal bukw i schifrujuschij ego po metodu Cesarja
        // abcdefghi   tosche ispolsowatj stringbuilder
        // abc +3  def
        // xyz +3  abc
        String string = "abc";
        System.out.println(ceasar(string,3));//def

    }

   //1)
   public static String ourSubstring(String str,int start, int end) {
        if(start<0){return "Invalid Index";}
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=start; i<end && i<str.length(); i++){
            stringBuilder.append(str.charAt(i));
        }
        return new String(stringBuilder);
    }
    //2)
    public static String ceasar (String code, int move){
        StringBuilder codedString= new StringBuilder();

        int lastCharValue='z';//122
        int alphabetLength='z'-'a'+1;//z(122)-a(97) 25+1=26 bukw w alphawite angl
        System.out.println("alphabet Length "+alphabetLength);//26
        System.out.println("last char value "+lastCharValue);//122

        for(char character: code.toCharArray()){ //prewraschaet stroku w massiw simwolow

            int charNoRotation = character+move;
            System.out.println("char no rotation = "+charNoRotation);//100, 101, 102

            int charValue = charNoRotation<lastCharValue ? charNoRotation : charNoRotation-alphabetLength;//schtobi posle z po krugu poschla a
                            //code+move   < 122          ? true code+move : false      122-26  =97 (a)
            codedString.append((char) charValue);//casting 100 w char eto d
        }

        return new String(codedString);//def
    }




}
