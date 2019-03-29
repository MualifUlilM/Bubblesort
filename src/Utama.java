import com.bubblesort.SortingArray;

import java.io.IOException;

public class Utama{
    public static void main(String[] args) throws IOException {
        SortingArray sa = new SortingArray();

        int i = 0;
        int j = 0;
        int x = sa.array.length;
        int y = 0;
        do {
            i = 0;
            System.out.println(y);

            do {
                sa.inputArray(i);
                i++;
            } while (i < sa.array.length);
            System.out.println("sorting");

            for (i = 0; i < x - 1; i++) {
                for (j = 0; j < x - i - 1; j++) {
                    sa.sorting(j);
                }
            }

            i = 0;

            do {
                sa.showArray(i);
                i++;
            } while (i < sa.array.length);
            y++;
        }while (y < 3);
    }

}