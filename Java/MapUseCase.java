import java.util.Hashtable;
import java.util.HashMap;
import java.util.Map;

class ExecMap {
    public void execMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("India", 130);
        map.put("China", 140);
        map.put("USA", 100);
        map.put("UK", 90);

        System.out.println(map);
    }
}

class ExecHashTable {
    public void execHashTable() {
        Map<String, Integer> map = new Hashtable<>();
        map.put("KK", 10);
        map.put("SK", 20);

        System.out.println(map);
    }
}


public class MapUseCase {
    public static void main(String[] args) {
        ExecMap em = new ExecMap();
        em.execMap();
        ExecHashTable eh = new ExecHashTable();
        eh.execHashTable();
    }
}
