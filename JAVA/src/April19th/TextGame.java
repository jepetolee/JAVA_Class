package April19th;
import javax.management.monitor.MonitorSettingException;
import java.util.Scanner;

class Sprite {
	int x=3, y=3;
	void move(char c){};
}

class logic extends Sprite {
	void move(char c){ 
		if( c == 'h' ) --x;
		else if( c == 'j' ) --y;
		else if( c == 'k' ) ++y;
		else if( c == 'l' ) ++x;
	}
}

class Gold extends Sprite {
	public Gold() {
		x = 3;
		y = 6;
	}
}

class Monster extends Sprite {
	public Monster() {
		x = y = 7;
	}
	void move(char c){ 
		x += (Math.random()-0.5)>0? 1: -1;
		y += (Math.random()-0.5)>0? 1: -1;
	}
}
public class TextGame {

    public static void main() {
    	char[][] map = { 
    			{ '#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#' }, 
    			{ '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' }, 
    			{ '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' }, 
    			{ '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' }, 
    			{ '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' }, 
    			{ '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' }, 
    			{ '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' }, 
    			{ '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' }, 
    			{ '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' }, 
    			{ '#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#' }, 
    	};
        Scanner sc = new Scanner(System.in);
        logic mine;
        Monster monster;
        Gold gold;
        mine = new logic();
        monster = new Monster();
        gold = new Gold();
        while (true) {
            for(int y=0;y<map.length;y++) {
                for(int x=0;x<map[y].length;x++) {
                	if( y == monster.y && x == monster.x&& 0<monster.x && monster.x<21&& 0<monster.y && monster.y<21)
                    	System.out.print('M');
                	else if( y == mine.y && x == mine.x )
                    	System.out.print('@');
                	else if( y == gold.y && x == gold.x )	
                    	System.out.print('G');
                	else
                		System.out.print(map[y][x]);
                }
            	System.out.println();
            }
        	System.out.print("left(h), up(j), down(k), right(l): ");
        	char c = sc.next().charAt(0);    
            mine.move(c);
            monster.move(c);
        }
    }
}
