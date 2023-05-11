import org.junit.Test;

import java.io.File;
import java.util.*;

public class LocalRunTest {

    /**
     * 小样例测试用的方法
     */
    @Test
    public void littleExample() {
        System.out.println("简单测一下用。");
    }

    /**
     * 测算完成的题目中每一题之间的距离
     * 并求出最大的距离，指出最大距离在哪一段
     */
    @Test
    public void calculateLargestDistance() {
        // 打开文件夹
        File file = new File("src/main/resources");
        File[] files = file.listFiles();
        // 存入哈希表
        Set<String> problemNumbers = new HashSet<>();
        assert files != null;
        for (File f : files) {
            String filename = f.getName();
            // 去除面试题，保留Solution和.txt的文件名的题号
            if (filename.contains(".txt") && filename.contains("Solution") && !filename.contains("面试题")) {
                String substring = filename.substring(8, 12);
                problemNumbers.add(substring);
            }
        }
        // 存入数组排序
        List<Integer> arrayList = new ArrayList<>();
        for (String problemNumber : problemNumbers) {
            arrayList.add(Integer.parseInt(problemNumber));
        }
        arrayList.sort(Comparator.naturalOrder());
        // 打印每个区间，并记录最大距离
        int maxDistance = 1;
        int from = 0;
        int to = 0;
        for (int i = 1; i < arrayList.size(); ++i) {
            System.out.println("From:\t" + arrayList.get(i - 1) + "\tTo:\t" + arrayList.get(i) + "\tDistance:\t" + (arrayList.get(i) - arrayList.get(i - 1) - 1));
            if (arrayList.get(i) - arrayList.get(i - 1) > maxDistance) {
                maxDistance = arrayList.get(i) - arrayList.get(i - 1);
                from = arrayList.get(i - 1);
                to = arrayList.get(i);
            }
        }
        // 打印最大距离区间
        System.out.println("LargestDistance: " + maxDistance);
        System.out.println("From: " + from);
        System.out.println("To: " + to);
    }

}
