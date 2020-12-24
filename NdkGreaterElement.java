import java.util.HashMap;
import java.util.Map;

public class NdkGreaterElement {
    public static void main(String[] args) {
        int k = 3;
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = { 1, 2, 3, 3, 2, 4, 5, 6, 1, 2, 1, 22, 3, 4, 5 };
        for (int i : arr) {
            if (!map.containsKey(i))
                map.put(i, 1);
            else {
                int prevCount = map.get(i);
                prevCount += 1;
                map.put(i, prevCount);
            }
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() >= k) {
                System.out.println(m.getKey());
            }
        }
    }
}
