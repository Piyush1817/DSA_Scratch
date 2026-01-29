package arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class MultiAL {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
                 int row = sc.nextInt();
                 int col = sc.nextInt();    
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
                 for(int i=0;i<3;i++){
                    mainList.add(new ArrayList<Integer>());
                 }
                 for(int i=0;i<row;i++){
                    for(int j=0;j<col;j++){
                        mainList.get(i).add(sc.nextInt());
                    }
                    System.out.println();
                
                }

                System.out.println(mainList);
    }
}
