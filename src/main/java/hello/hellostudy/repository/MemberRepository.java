package hello.hellostudy.repository;

import hello.hellostudy.domain.Member;

import java.util.List;
import java.util.Optional;


public interface MemberRepository {
    Member save(Member member);//"Member"객체를 저장하는 역할 "Member" 객체를 인자로 받고, 저장된 멤버를 반환.
    Optional<Member> findById(Long id);//주어진 id에 해당하는 멤버를 찾아서 반환.
    /*'Long'형식의 id를 인자로 받고, 해당 id에 해당하는 멤버를 'Optional'으로 감싸서 반환한다.
    'Optional'은 값이 없을수도 있음을 나타내는 java클래스로 "null"대신 사용. 이를 통해 null예외를 방지
    */
    Optional<Member> findByName(String name);
    //Optional => 없으면 null반환되는데 Optional으로 감싸서 반환
    List<Member> findAll();
}
