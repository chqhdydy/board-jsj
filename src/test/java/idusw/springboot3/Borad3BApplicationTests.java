package idusw.springboot3;

import idusw.springboot3.controller.MemberController;
import idusw.springboot3.domain.Member;
import idusw.springboot3.domain.Memo;
import idusw.springboot3.service.MemberService;
import idusw.springboot3.service.MemoService;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Borad3BApplicationTests {
    @Autowired
    MemberService memberService;

    @Autowired
    MemoService memoService;


    @Test
    void createMember() {
        Member member = Member.builder()
                .email("13@13.com")
                .name("13")
                .pw("13")
                .build();
        if(memberService.create(member) > 0 ) // 정상적으로 레코드의 변화가 발생하는 경우 영향받는 레코드 수를 반환
            System.out.println("등록 성공");
        else
            System.out.println("등록 실패");
    }
    @Test
    void readMember(){ // seq를 사용해야함
        Member member = Member.builder()
                .seq(1L)
                .build();
        Member result = null;
        if((result = memberService.read(member)) != null) // 정상적으로 레코드의 변화가 발생하는 경우 영향받는 레코드 수를 반환
            System.out.println("조회 성공!" + result.getEmail() + ":" + result.getName());
        else
            System.out.println("조회 실패");

    }

    @Test
    void readMemo(){ // seq를 사용해야함
        Memo m = new Memo();
        m.setMno(1L);
        if(memoService.read(m) != null) // 정상적으로 레코드의 변화가 발생하는 경우 영향받는 레코드 수를 반환
            System.out.println("조회 성공!" + m.getMemoText());
        else
            System.out.println("조회 실패");

    }

}
