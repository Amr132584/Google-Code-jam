
package KickSstart.y2020.RoundA;
import java.util.*;


class solution{
    public static void main(String []args){
        Scanner s =new Scanner (System.in);
        int N=s.nextInt();

        for (int i =0;i <N;i++){
            int housesNum=s.nextInt();
            int B=s.nextInt();
            int [] houses=new int [housesNum];
            for (int j=0;j<housesNum;j++){
                houses[j]=s.nextInt();

            }
            int count = countIth( housesNum, B, houses);
            System.out.print("Case #"+(i+1)+": "+count);


        }


    }
    public static int countIth(int n,int b,int [] houses){
        Arrays.sort(houses);
        int total=0, count=0,i=0;
        while(total+houses[i]<= b && i<n){
            total+=houses[i];
            count++;
            i++;

        }
        return count;
    }


}