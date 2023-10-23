import java.util.*;
public class Indiancoin {
    public static void main(String args[]){
        //int array[]={1,2,5,10,20,50,100,500,2000};
        Integer array[]={1,2,5,10,20,50,100,500,2000};
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a value :");
        int ammount=sc.nextInt();
        //Arrays.sort(array);
        Arrays.sort(array,Comparator.reverseOrder());
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int count=0;
        //for(int i=array.length-1;i>=0;i--){
        for(int i=0;i<array.length;i++){
            if(ammount>=array[i]){
                while(ammount>=array[i]){
                    count++;
                    ammount-=array[i];
                    ans.add(array[i]);
                }
            }
        }
        System.out.println("total notes required is:"+count);
        System.out.print("the possible set of notes are:");
        for(int i=0;i<ans.size();i++){
            System.out.print( ans.get(i)+" ");

        }
        sc.close();   
     }
    
}
