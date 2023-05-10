package idusw.springboot3.service;

import idusw.springboot3.domain.Member;
import idusw.springboot3.domain.PageRequestDTO;
import idusw.springboot3.domain.PageResultDTO;
import idusw.springboot3.entity.MemberEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MemberService {
    int create(Member m);
    Member read(Member m);  // mno 값을 넘김
    List<Member> readList();
    int update(Member m);
    int delete(Member m);

    Member login(Member m);

    PageResultDTO<Member, MemberEntity> getList(PageRequestDTO requestDTO);

    default MemberEntity dtoToEntity(Member dto) { // dto객체를 entity 객체로 변환 : service -> repository
        MemberEntity entity = MemberEntity.builder()
                .seq(dto.getSeq())
                .email(dto.getEmail())
                .name(dto.getName())
                .pw(dto.getPw())
                .build();
        return entity;
    }

    default Member entityToDto(MemberEntity entity) { // entity 객체를 dto 객체로 변환 : service -> controller
        Member dto = Member.builder()
                .seq(entity.getSeq())
                .email(entity.getEmail())
                .name(entity.getName())
                .pw(entity.getPw())
                .regDate(entity.getRegDate())
                .modDate(entity.getModDate())
                .build();
        return dto;
    }
}