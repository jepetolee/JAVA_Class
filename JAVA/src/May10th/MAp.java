package May10th;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;
public class MAp {
   static public void main(String[] args){
           HashSet<Integer> set = new HashSet<Integer>();
           while (set.size() < 6) {
                   int RandomNumber = (int) (Math.random() * 44) + 1;
                   if(!set.contains(RandomNumber)){
                           set.add(RandomNumber);
                   }
           }
           System.out.println(set);

   }
}
