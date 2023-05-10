package idusw.springboot3.service;

import idusw.springboot3.domain.Member;
import idusw.springboot3.domain.PageRequestDTO;
import idusw.springboot3.domain.PageResultDTO;
import idusw.springboot3.entity.MemberEntity;

import java.util.List;

public class ServiceImpl implements MemberService{

    @Override
    public int create(Member m) {
        return 0;
    }

    @Override
    public Member read(Member m) {
        return null;
    }

    @Override
    public List<Member> readList() {
        return null;
    }

    @Override
    public int update(Member m) {
        return 0;
    }

    @Override
    public int delete(Member m) {
        return 0;
    }

    @Override
    public Member login(Member m) {
        return null;
    }

    @Override
    public PageResultDTO<Member, MemberEntity> getList(PageRequestDTO requestDTO) {
        return null;
    }
}
