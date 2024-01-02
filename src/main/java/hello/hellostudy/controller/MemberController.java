package hello.hellostudy.controller;

import hello.hellostudy.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller

public class MemberController {
    /* private final MemberService memberService = new MemberService();
       MemberService은 현재 별 기능이 없다 그래서 스프링 컨테이너에 등록을 하고 사용한다.
       메서드를 호출할때마다 새로운 객체를 생성하는 new는 새로운 인스턴스를 생성하기때문에 사용하는 시점마다
       메모리를 추가로 할당받는다. 따라서 new를 사                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     용하면 객체 생성에 비용이 많이 들 수 있다.
       이에 반해 DI(Dependency Injection)는 객체를 외부에서 생성해서 주입받는 방식이다.
       필요할 경우에만 객체를 생상하고 재사용 가능.

       따라서, DI를 사용하는 방법으로 객체를 생성하고  의존성을 주입받는 것이 보다 효율적인 방법이다.
     */
    private final MemberService memberService;

    @Autowired
     // 생성자 호출할때 Autowired라고 되어있으면 스프링이 스프링 컨테이너에 잇는 멤버 서비를 가져다가 연결 시켜둔다.
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }



}
