package idusw.springboot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    /* Field DI
    @Autowired
    MemoService memoService;  // MemoService 인터페이스의 구현체를 필드 주입
    */
    @GetMapping
    public String goHome() {
        return "/main/index";
    }

    /*
    @GetMapping("/buttons")
    public String gobuttons() {
        return "/main/buttons";
    }

    @GetMapping("/cards")
    public String gocards() {
        return "/main/cards";
    }
    */

}

