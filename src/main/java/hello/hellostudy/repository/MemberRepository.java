package hello.hellostudy.repository;

import hello.hellostudy.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    //Optional => 없으면 null반환되는데 Optional으로 감싸서 반환
    List<Member> findAll();
}
