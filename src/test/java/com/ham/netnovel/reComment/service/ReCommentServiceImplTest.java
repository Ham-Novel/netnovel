package com.ham.netnovel.reComment.service;

import com.ham.netnovel.member.dto.MemberCommentDto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;



@SpringBootTest
class ReCommentServiceImplTest {

    private final ReCommentService reCommentService;

    @Autowired
    ReCommentServiceImplTest(ReCommentService reCommentService) {
        this.reCommentService = reCommentService;
    }

    @Test
    void getReComment() {

    }

    @Test
    void createReComment() {
    }

    @Test
    void updateReComment() {
    }

    @Test
    void deleteReComment() {
    }


    //테스트성공
    @Test
    void getMemberReCommentList() {
                String providerId= "test";
        //댓글을 작성한적이 없는 유저 테스트
//        String providerId= "ttt";
        Pageable pageable = PageRequest.of(0, 10);

        List<MemberCommentDto> memberReCommentList = reCommentService.getMemberReCommentList(providerId,pageable);

        if (memberReCommentList.isEmpty()){
            System.out.println("비었음");
        }
        System.out.println("사이즈="+memberReCommentList.size());

        for (MemberCommentDto memberCommentDto : memberReCommentList) {
            System.out.println("대댓글");
            System.out.println(memberCommentDto.toString());

        }


    }
}