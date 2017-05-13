import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soluction {
	/**
	 * @param args
	 */
	public Soluction() {
	}

	public int Find(List<int[]> list) {
		int index = 21;
		int Addvalue = 0;
		float[] bili = new float[5];
		// 增加比例
		double[] svg = new double[20];
		int[] zengjiazeng = new int[5];

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < 5; j++) {
				// 计算平均值
				svg[i] += list.get(i)[j];
			}
			svg[i] = svg[i] / 5;
			if (svg[i] <= 59.90 && svg[i] >= 59.00) {
				index = i;
			}
		}
		if (index == 21) {
			System.out.println("meiyouzheyangde xuesheng ");
			return 0;
		} else {
			Addvalue = (int) ((60.00 - svg[index]) * 5 + 0.5);
			for (int i = 0; i < 5; i++) {
				bili[i] = ((float) Addvalue / (float) list.get(index)[i]);
			}
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 20; j++) {
					zengjiazeng[i] += (int) (list.get(j)[i] * bili[i] + 0.5);
				}
				System.out.println(i + "科目要增加的总分数" + zengjiazeng[i]);
			}
			int result = findMin(zengjiazeng);
			System.out.println("学生：" + (index + 1) + "处于59.0-59.9之间");
			System.out.println("他的平均分是:" + svg[index]);
			System.out.println("他要增加的分数是" + Addvalue);
			System.out.println("第" + (result + 1) + "科目，增加比例是" + bili[result]
					+ "。");
			return result + 1;
		}
	}

	public int findMin(int[] a) {
		int min = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= a[min]) {
				min = i;
			}
		}
		System.out.println("最小的是" + min);
		return min;
	}

	public static void main(String[] args) {
		int[] a = { 54, 57, 81, 55, 67 };
		int[] b = { 72, 55, 53, 83, 97 };
		int[] c = { 67, 46, 70, 90, 52 };
		int[] d = { 54, 45, 89, 45, 71 };
		int[] e = { 53, 81, 54, 55, 79 };
		int[] f = { 56, 46, 54, 99, 86 };
		int[] g = { 42, 57, 61, 53, 78 };
		int[] h = { 76, 65, 47, 54, 44 };
		int[] i = { 54, 90, 76, 88, 95 };
		int[] j = { 84, 74, 98, 69, 91 };
		int[] k = { 71, 53, 49, 58, 89 };
		int[] l = { 41, 78, 76, 44, 42 };
		int[] m = { 45, 46, 77, 41, 57 };
		int[] n = { 58, 84, 81, 60, 91 };
		int[] o = { 95, 73, 86, 81, 61 };
		int[] p = { 52, 93, 61, 49, 57 };
		int[] q = { 54, 59, 84, 63, 53 };
		int[] r = { 41, 52, 85, 62, 57 };
		int[] s = { 68, 45, 89, 63, 45 };
		int[] t = { 57, 58, 56, 81, 64 };
		List<int[]> list = new ArrayList<int[]>();
		// list.add(a);
		// list.add(b);
		// list.add(c);
		// list.add(d);
		// list.add(e);
		// list.add(f);
		// list.add(g);
		// list.add(h);
		// list.add(i);
		// list.add(j);
		// list.add(k);
		// list.add(l);
		// list.add(m);
		// list.add(n);
		// list.add(o);
		// list.add(p);
		// list.add(q);
		// list.add(r);
		// list.add(s);
		// list.add(t);
		for (int x = 0; x < 20; x++) {
			int[] ab = new int[5];
			Scanner sc = new Scanner(System.in);
			for (int y = 0; y < 5; y++) {
				ab[y] = sc.nextInt();
			}
			list.add(ab);
		}
		Soluction soluction = new Soluction();
		soluction.Find(list);
	}
}
