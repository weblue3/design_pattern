package structure.facade.ex1;

public class Facade {
    private DBMS dbms = new DBMS();
    private Cache cache = new Cache();

    public void insert() {
        dbms.put("홍길동", new Row("홍길동", "1890-02-14", "honggildong@naver.com"));
        dbms.put("임꺽정", new Row("임꺽정", "1820-11-02", "imgguckjong@naver.com"));
        dbms.put("주몽", new Row("주몽", "710-08-27", "jumong@naver.com"));
    }

    public void run(String name){

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
