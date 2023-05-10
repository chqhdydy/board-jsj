package idusw.springboot3.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Builder
@AllArgsConstructor
@Data
public class PageRequestDTO {
    private int page; //요청하는 페이지
    private int size; // ㅔ이지당 게시물 수

    public PageRequestDTO(){
        this.page = 1;
        this.size = 5;
    }
    public Pageable getPageable(Sort sort){
        return PageRequest.of(page - 1, size, sort);
        //내부적인 구조를 위해서 0부터 읽을 수 있게  -1을 해줌 (0부터 읽음)
    }
}
