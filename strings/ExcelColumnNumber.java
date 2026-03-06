package strings;
import java.util.*;
public class ExcelColumnNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the column number");
        int coulumnNumber=sc.nextInt();
        String result =convertToTitle(columnNumber);
        System.out.println("the column title is "+result);
        
    }
    static String convertToTitle(int columnNumber){
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            char ch = (char)('A' + (columnNumber % 26));
            sb.append(ch);
            columnNumber /= 26;
        }
        return sb.reverse().toString(); 
    }
}
