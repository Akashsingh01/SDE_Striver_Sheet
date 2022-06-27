import java.util.ArrayList;
import java.util.List;

/*Input Format: N = 5

        Result:
        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1

        Explanation: There are 5 rows in the output matrix.
        Each row corresponds to each one of the rows in the image shown above.*/
public class PascalTriangle {

        public static List<List<Integer>> generate(int numRows) {
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            List<Integer> row, pre = null;
            for (int i = 0; i < numRows; ++i) {
                row = new ArrayList<Integer>();
                for (int j = 0; j <= i; ++j)
                    if (j == 0 || j == i)
                        row.add(1);
                    else
                        row.add(pre.get(j - 1) + pre.get(j));
                pre = row;
                res.add(row);
            }
            return res;
        }

    public static void main(String[] args) {
       System.out.println( generate(8);

    }
}
