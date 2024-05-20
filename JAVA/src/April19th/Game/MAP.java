package April19th.Game;

import java.util.ArrayList;

public class MAP {
    ArrayList<java.lang.Character>[] MapFeautre = new ArrayList[22];
    int iValue1,iValue2;
    public MAP(){
        for(int rownumber=0; rownumber<22;rownumber++){
            this.MapFeautre[rownumber]= new ArrayList<java.lang.Character>();
        }
        for(int iteration=0; iteration<22;iteration++){
            this.MapFeautre[iteration].add(21,'#');
            this.MapFeautre[iteration].add(0,'#');
            this.MapFeautre[0].add(iteration,'#');
            this.MapFeautre[21].add(iteration,'#');
        }
        this.MapFeautre[5].add(15,'G');
        double dValue1 = Math.random(),dValue2 = Math.random();
        this.iValue1 = (int)(dValue1 * 400);
        this.iValue2 = (int)(dValue2 * 400);
        this.MapFeautre[this.iValue1/20+1].add(this.iValue1%20+1,'C');
        this.MapFeautre[this.iValue2/20+1].add(this.iValue2%20+1,'M');
    }
    public void MonsterMove(int x, int y){
        if(this.iValue2/20+1+x < 21&&this.iValue2/20+1+x >0){
            this.MapFeautre[this.iValue2/20+1].add(this.iValue2%20+1,' ');
            this.MapFeautre[this.iValue2/20+1+x].add(this.iValue2%20+1,'C');
            this.iValue2 += 20*x ;
        }
        if(this.iValue2%20+1+y < 21&&this.iValue2%20+1+y >0){
            this.MapFeautre[this.iValue2/20+1].add(this.iValue2%20+1,' ');
            this.MapFeautre[this.iValue2/20+1].add(this.iValue2%20+1+y,'C');
            this.iValue2 += y ;
        }

    }
    public void PlayerMove(int x, int y){
        if(this.iValue1/20+1+x < 21&&this.iValue1/20+1+x >0){
            this.MapFeautre[this.iValue1/20+1].add(this.iValue1%20+1,' ');
            this.MapFeautre[this.iValue1/20+1+x].add(this.iValue1%20+1,'C');
            this.iValue1 += 20*x ;
        }
        if(this.iValue1%20+1+y < 21&&this.iValue1%20+1+y >0){
            this.MapFeautre[this.iValue1/20+1].add(this.iValue1%20+1,' ');
            this.MapFeautre[this.iValue1/20+1].add(this.iValue1%20+1+y,'C');
            this.iValue1 += y ;
        }
    }
    public void PrintMap(){
        for(int rownumber=0; rownumber<22;rownumber++){
            for(int columnnumber=0; columnnumber<22;columnnumber++){
                System.out.print(this.MapFeautre[rownumber].get(columnnumber));
            }
            System.out.println("");
        }
    }



}
