import java.util.*;
public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        flipAndInvertImage(image);

        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col < image[row].length; col++) {
                System.out.print(image[row][col]);
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col <= (image[row].length-1) / 2; col++) {
                int temp = (image[row][col]) ^ 1;
                image[row][col] = (image[row][image[row].length-1-col]) ^ 1;
                image[row][image[row].length-1-col] = temp;
            }
        }
        return image;
    }
}