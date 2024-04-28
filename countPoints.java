import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countPoints {
    public static void main(String args[]){
        String rings = "B0B6G0R6R0R6G9";
        System.out.println(countPoints(rings));
    }
    public static int countPoints(String rings){
        boolean[] red = new boolean[10];
        boolean[] blue = new boolean[10];
        boolean[] green = new boolean[10];
        int counter = 0;
        int i = 0;
        if(rings.length()<5) return 0;
        while(i < rings.length()){
            int j = i + 1;
            if(rings.charAt(i) == 'R')
                red[rings.charAt(j)-48] = true;
            else if(rings.charAt(i) == 'G')
                blue[rings.charAt(j)-48] = true;
            else if(rings.charAt(i) == 'B')
                green[rings.charAt(j)-48] = true;
            i+=2;
        }
        for (int j = 0; j < 10; j++) {
            if(red[j]&&blue[j]&&green[j])
                counter++;
        }
        return counter;
    }
}
