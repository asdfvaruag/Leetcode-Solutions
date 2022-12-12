import java.util.HashMap;
import java.util.PriorityQueue;

public class Sort_Characters_By_Frequency_451 {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while (pq.size() > 0) {
            char ch = pq.remove();
            for (int i = 0; i < map.get(ch); i++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Sort_Characters_By_Frequency_451 obj = new Sort_Characters_By_Frequency_451();
        String s = "Aabb";
        System.out.println(obj.frequencySort(s));
    }
}
