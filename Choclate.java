import java .util.*;
public class Choclate {
    public static void main(String args[]){
        //int n=4,m=6;
        Integer costVer []={2,1,3,1,4};
        Integer costHor []={4,1,2};
        int h=0;int v=0;
        int hp=1;
        int vp=1;
        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());
        int cost=0;
        while(v<costVer.length && h<costHor.length){
            if(costVer[v]>=costHor[h]){
                cost=cost+hp*costVer[v];
                v++;
                vp++;
            }
            else{
                cost=cost+vp*costHor[h];
                h++;
                hp++;
            }
        }
        while(v<costVer.length){
            cost=cost+hp*costVer[v];
            v++;
            vp++;
        }
        while(h<costHor.length){
            cost=cost+vp*costHor[h];
            h++;
            hp++;
        }
        System.out.println("minimum cost required is:"+cost);
    }
    
}
