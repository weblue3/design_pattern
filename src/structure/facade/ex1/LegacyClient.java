package structure.facade.ex1;

public class LegacyClient {
    /**
     *
     * dbms를 바로 조회하기전에
     * 과거에 조회된 데이터인지를 캐시에서 먼저 조사를 하고
     * 캐시에 데이터가 있다면 이 캐시에 데이터를 가공하고 출력
     * 캐시에 데이터가 없다면 DBMS를 통해서 조회를 하고
     * 조회된 데이터를 가공하고 출력함과 동시에 캐시에 저장한다.
     */
    public static void main(String[] args) {
        //-- DB 데이터 생성
        DBMS dbms = new DBMS();
        dbms.put("홍길동", new Row("홍길동", "1890-02-14", "honggildong@naver.com"));
        dbms.put("임꺽정", new Row("임꺽정", "1820-11-02", "imgguckjong@naver.com"));
        dbms.put("주몽", new Row("주몽", "710-08-27", "jumong@naver.com"));

        //-- 캐시 생성
        Cache cache = new Cache();

        //-- 고객의 데이터 조회 요청
        String name = "홍길동";
        Row findRow = cache.get(name);

        //-- 캐시에 데이터가 없는 경우 DB 에서 조회
        if(findRow == null) {
            findRow = dbms.query(name);
            if(findRow != null){
                //-- 데이터가 있는 경우 캐시에 저장
                cache.put(findRow);
            }
        }

        if(findRow != null){
            Message message = new Message(findRow);

            System.out.println(message.makeName());
            System.out.println(message.makeBirthday());
            System.out.println(message.makeEmail());
        }else{
            System.out.println(name + "가 데이터베이스에 존재하지 않습니다.");
        }
    }
}
