package structure.facade.ex1;

public class FacadeClient {

    /**
     * 카테고리 : 구조 관련 디자인 패턴
     * 참고 사이트 : https://inpa.tistory.com/entry/GOF-%F0%9F%92%A0-%ED%8D%BC%EC%82%AC%EB%93%9CFacade-%ED%8C%A8%ED%84%B4-%EC%A0%9C%EB%8C%80%EB%A1%9C-%EB%B0%B0%EC%9B%8C%EB%B3%B4%EC%9E%90
     * https://thalals.tistory.com/416
     * 1. 퍼사드 패턴의 핵심은 인터페이스(API)를 적게 구성하는 것
     * - 복잡한 서브 시스템의 의존성을 최소화하기 위한 목적을 가지는 패턴
     * 2. 퍼사드 패턴은 하위 시스템 클래스를 캡슐화 하는 것이 아니고, 서브 시스템들을 사용할 간단한 인터페이스를 제공하는 것이다.
     * 사용자가 서브 시스템 내부의 클래스를 직접 사용하는 것을 제한할 수 없다. 그래서 추상화에 가깝다.
     * 대부분의 경우 퍼사드 객체는 하나만 있어도 충분하기 때문에 퍼사드 클래스를 싱글톤으로 구성해주면 좋다.
     */
    public static void main(String[] args) {
        //-- DBMS, Cache, Message, Row 를 사용자가 알 필요가 없음
        //-- 퍼사드 객체 생성
        Facade facade = new Facade();
        //-- db 값 insert
        facade.insert();

        //-- 퍼사드로 데이터베이스 & 캐싱 & 메시징 로직을 한번에 조회
        facade.run("홍길동");
    }
}
