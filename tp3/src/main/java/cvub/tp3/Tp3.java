/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cvub.tp3;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author utaab
 */
public class Tp3 {

    public static void main(String[] args) throws IOException {
        Pgm baboon = Pgm.Lecture("C:\\Users\\utaab\\Downloads\\ImagesTestPGM\\ImagesTestPGM\\baboon.pgm");
        ArrayList<ArrayList<Integer>> image = baboon.getImage();
        for (ArrayList<Integer> row : image) {
            System.out.println(row);
            System.out.println(row.size());
        }
        System.out.println(image.size());
        
        baboon.Ecriture("C:\\Users\\utaab\\Downloads\\ImagesTestPGM\\ImagesTestPGM\\baboon2.pgm");
    }
}
