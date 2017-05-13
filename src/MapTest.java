import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer, List<int[]>> bigsb = new HashMap<Integer, List<int[]>>();
		List<int[]> aa = new ArrayList<int[]>();
		int[] test = { 1, 2, 3, 4 };
		aa.add(test);
		bigsb.put(3, aa);
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				List<int[]> sbint = bigsb.get(10);
				if (sbint == null) {
					sbint = new ArrayList<int[]>();
					bigsb.put(j, sbint);
				}
				sbint.add(test);
			}
			System.out.println(j + "   " + bigsb.get(j).get(0)[3]);
		}

	}
}
