package idusw.springboot3.domain;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


public class PageRequsetDTO {
    private int page; //요청하는 페이지
    private int size; // ㅔ이지당 게시물 수

    public PageRequsetDTO(){
        this.page = 1;
        this.size = 5;
    }
    public Pageable getPageable(Sort sort){
        return PageRequest.of(page - 1, size, sort);
    }
}
