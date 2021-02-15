import org.junit.Test;

import java.sql.SQLOutput;
import java.util.Locale;

public class Practice {
    static int maxNum;
    int max1;
    int max2;

    /**
     * missingChar("kitten", 1) → "ktten"
     * missingChar("kitten", 0) → "itten"
     * missingChar("kitten", 4) → "kittn"
     */
    public static void main(String[] args) {

        Practice P1 = new Practice();
//        P1.missingChar("romashka", 5);
//        System.out.println(P1.mixStart("pix snack"));
//
//        System.out.println(P1.intMax(9, 5, 6));
//        System.out.println(P1.max1020(10, 2));
//        System.out.println(P1.lastDigit(3,113));
//        System.out.println(P1.frontBack("balzhima"));
//        System.out.println(P1.notString("good"));
//        System.out.println(P1.backAround("cat"));
//        P1.practice("Happrererererwwwdy", 22, true);
//        P1.switchProblem();
//        System.out.println(P1.stringE("heelle"));
//        System.out.println(P1.stringTimes("re", 2));
//        System.out.println(P1.stringBits("balzhima"));
//        System.out.println(P1.last2("xaxxaxaxx"));
//        System.out.println(P1.doubleX("dasadx"));
//        System.out.println(P1.stringMatch("abc", "axc"));
//        String statement =" There could be any value statement";
//        String [] newStrin= statement.split(" ");
//        String ste= newStrin[newStrin.length-1];
//        System.out.println(ste+" length  "+ ste.length());

//
//        System.out.println(P1.stringSplosion("abc"));
//        int[] arr = {1,2,3};
//        System.out.println(P1.array123(arr));
//        System.out.println(P1.threeWords("haPpY new year"));
//        System.out.println(P1.countXX("xxxx"));
        int[] arr = {6,6,2};
//        System.out.println(P1.noTriples(arr));
////
////        System.out.println(P1.stringYak("yak123yak"));
////        System.out.println(P1.abbreviation("balzhima damdinva"));
////        System.out.println(P1.normalSent("once upOn a tIme in the UNIVerse"));
////        System.out.println(P1.reverse("happy holiday"));
        System.out.println(P1.array667(arr));
        System.out.println(P1.stringX("xabxxxcdx"));
    }
    public int array667(int[] nums){
        int count =0;
        for (int i=0; i<=nums.length-2; i++){
            if(nums[i]==6 && (nums[i+1]==6 || nums[i+1]==7)){
                count++;
            }
        }
        return count;
    }
    public String stringX(String str){
        String[] arr= str.split("");
        String updatedString = "";
        for (int i=1; i<=arr.length-2; i++){
            if(!arr[i].equals("x")){
                updatedString += arr[i];
            }

            }return arr[0]+updatedString+arr[arr.length-1];
        }


    public boolean arrayFront9(int[] nums){
        for(int i=0; i<=nums.length-1; i++){
            if(nums[i] ==9 && i<4) return true;
        }return false;
    }

    public String reverse(String str){
        String reveMess ="";
        String[] arr = str.split("");
        for (int i=0; i<= arr.length-1;i++){
            reveMess=arr[i]+reveMess;
        }return reveMess;
    }

    public String normalSent(String line){
        String lineAfter = "";
        String [] arr =  line.split(" ");
        for (int i=0; i<=arr.length-1;i++){
            String after = arr[i].substring(0,1).toUpperCase();
            String after2 = arr[i].substring(1).toLowerCase();
            lineAfter= lineAfter+ after+after2+" ";
        }
        return lineAfter;
    }

    public String abbreviation(String msg){
        String abr = "";
        String[] arrAbr = msg.split(" ");
        for (int i=0; i<=arrAbr.length-1; i++){
            String newAbr = arrAbr[i].substring(0,1).toUpperCase();
            abr+=newAbr;
        }return abr;
    }

    public String stringYak(String str){
        String newW = "";
        for (int i=0; i<str.length()-2; i++){
            if(str.substring(i,i+3).equals("yak")){
                newW= str.replace("yak", "");
            }
        } return newW;
    }

    public boolean noTriples(int[] nums){
        for(int i=0; i<nums.length-2; i++){
            if(nums[i] == nums[i+1] && nums[i] ==nums[i+2]){
                return false;
            }
        }return true;
    }

    public int countXX(String str){
        int count=0;
        for (int i=0; i<str.length()-1;i++){
            if(str.substring(i,i+2).equals("xx")){
            count++;}
        }return count;

    }

    public String threeWords(String str){
        String wordNew = "";
        String[] allThree = str.split(" ");
        for (int i=0; i<=allThree.length-1; i++){
           String word =  allThree[i].substring(0,1).toUpperCase()+allThree[i].substring(1).toLowerCase();
           wordNew+=word+" ";

        }
        return wordNew;
    }
    public boolean array123(int[] nums){
        for (int i=0; i<nums.length; i++){
            if (nums[i]==1 && nums[i+1] ==2 && nums[i+2]==3){
                return true;
            }
        }return false;
    }



    public String stringSplosion(String str){
        String wordNew = "";
        for (int i=0; i<str.length()-1; i++){
            wordNew = wordNew +str.substring(0,i+1);
        }
        return wordNew + str;
    }


    public int  stringMatch(String a, String b){
        int count=0;
       int len = Math.min(a.length(),b.length());
        for (int i=0; i<len-1; i++){
           String  aSub = a.substring(i, i+2);
           String bSub = b.substring(i, i+2);
               if(aSub.equals(bSub)){
                   count++;

           }
        }return count;
    }


    public String stringBits(String str){
        String newStr = "";
        for (int i=0; i<=str.length()-1; i+=2){
            newStr=newStr+str.substring(i,i+1);
        }return newStr;
    }

    public int last2(String str){
        String last2  = str.substring(str.length()-2);
        int count = 0;
        for(int i=0; i<str.length()-2; i++){
          String sub = str.substring(i,i+2);
          if (sub.equals(last2)){
              count++;
          }
        }
        return count;
    }

    public boolean doubleX(String str){
        for(int i=0; i<str.length()-1; i++){
           String name = str.substring(i,i+2);
            if(name.equals("xx")){
                return true;
            }
        }return false;
    }



    public String stringTimes(String str, int n){
        String newWord = "";
        for(int i=0; i<n; i++){
            newWord=str+newWord;

        }return newWord;

    }


    public String missingChar(String word, int n) {
        String secPartOfWord = word.substring(n + 1);
        String firstPartOfWord = word.substring(0, n);
        String connect = firstPartOfWord + secPartOfWord;
        System.out.println(connect);
        return connect;

    }

    public boolean mixStart(String str) {
        String newWord = str.substring(1, 3);

        if (newWord.equalsIgnoreCase("ix")) {
            return true;
        }
        return false;
    }

    public int intMax(int a, int b, int c) {

        if (a < b && c < b) {
            maxNum = b;
        } else if (b < a && c < a) {
            maxNum = a;
        } else if (b < c && a < c) {
            maxNum = c;
        }
        return maxNum;
    }


    public int max1020(int a, int b) {
        if (a > b) {
            if (a >= 10 && a <= 20) {
                return a;
            }
        } else if (b >= 10 && b <= 20) {
            return b;
        }

        return 0;
    }
    public boolean lastDigit(int a, int b){
        if(a%10 ==b%10){
            return true;
        }  return false;
    }

   public String frontBack(String str){
        String firstPart = str.substring(0,1);
        String secPart = str.substring(2);
        char firstLetter = firstPart.charAt(0);
       char secondLetter = secPart.charAt(secPart.length()-1);
      String newFirstWord = firstPart.replace(firstLetter, secondLetter);
      String newSecWord = secPart.replace(secondLetter,firstLetter);
      String newWord = newFirstWord+newSecWord;

       return newWord;
   }

   public String notString(String str){
       String firstThree = str.substring(0,3);
        if(str.length()>=3 && firstThree.equals("not")){
            return str;
        } return "not "+str;
   }

   public String backAround(String str){
        char lastLetter = str.charAt(str.length()-1);
        String newWord = lastLetter+str+lastLetter;
        return newWord;
   }

   public void practice(String str, int num, boolean result){
        if(str.length()>10 && num>5){
            System.out.println(str.replace("p","b").toUpperCase());
        }else result = false;
       System.out.println(result);
   }

   public void switchProblem(){
        String monthName = "jun";
        switch (monthName){
            case "dec":
                System.out.println("winter");
                break;
            case "jan":
                System.out.println("winter");
                break;
            case "feb":
                System.out.println("winter");
                break;
            case "jun":
                System.out.println("summer");
                break;
        }
   }

   public boolean stringE(String str){

       int count =0;
       for(int k=0; k<str.length(); k++){
       if (str.charAt(k)=='e') {
            count++;
       } }

       return (count<=3 && count>=1);
   }




}
