package hello.hellostudy;

import hello.hellostudy.domain.Member;
import hello.hellostudy.repository.MemberRepository;
import hello.hellostudy.repository.MemoryMemberRepository;
import hello.hellostudy.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService();
    }


    @Bean
    public MemoryMemberRepository memoryMemberRepository(){
        return new MemoryMemberRepository();
    }

}

