package hello.hellostudy.service;

import hello.hellostudy.domain.Member;
import hello.hellostudy.repository.MemberRepository;
import hello.hellostudy.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    /**
     회원 가입
     **/
    public long join(Member member){
        //같은 이름이 있는 중복 확인x
        ValidateDuplicateMember(member); //증복 회원 검증
        memberRepository.save(member);
        return member.getId();
    }

    private void ValidateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m ->{
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    /**
      전체 회원 조회
     **/
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }
    public Optional<Member> findOn (Long memberId){
        return memberRepository.findById(memberId);
    }
}
