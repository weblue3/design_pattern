package structure.facade.ex1;

import java.util.HashMap;

public class DBMS {

    private HashMap<String, Row> db = new HashMap<>();

    public void put(String name, Row row){
        db.put(name, row);
    }

    //-- 데이터베이스에 쿼리를 날려 결과를 받아오는 메소드
    public Row query(String name){
        try {
            Thread.sleep(500);  //-- DB 조회 시간을 비유하여 0.5초 대기로 구현
        }catch (InterruptedException e){}

        return db.get(name.toLowerCase());
    }
}
