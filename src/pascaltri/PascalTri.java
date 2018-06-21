package pascaltri;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Owori Juma
 */
public class PascalTri {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(getRowResult(4));
    }

    public static List<Integer> getRowResult(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<>();

        if (rowIndex < 0) {
            return result;
        }

        result.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = result.size() - 2; j >= 0; j--) {
                result.set(j + 1, result.get(j) + result.get(j + 1));
            }
            result.add(1);
        }
        return result;
    }

}
