package structure.facade.ex1;

import java.util.HashMap;

// DBMS에서 조회된 데이터를 임시로 담아두는 클래스 (속도 향상)
public class Cache {
    private HashMap<String, Row> cache = new HashMap<>();

    public void put(Row row){
        cache.put(row.getName(), row);
    }

    public Row get(String name){
        return cache.get(name);
    }
}
