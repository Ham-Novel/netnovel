package com.ham.netnovel.member.service;

import com.ham.netnovel.member.Member;
import com.ham.netnovel.member.dto.ChangeNickNameDto;
import com.ham.netnovel.member.dto.MemberCreateDto;
import com.ham.netnovel.member.dto.MemberLoginDto;

import java.util.Optional;

public interface MemberService {


    /**
     * Member 엔티티를 조회하는 메서드, null체크는 해당 메서드를 사용하는 메서드에서 진행
     * @param providerId
     * @return
     */
   Optional<Member> getMember(String providerId);


    /**
     * 로그인시 인증정보를 위한 유저정보를 가져오는 메서드
     * @param providerId 인증 제공자(naver등)에서의 유저 ID값
     * @return
     */
    MemberLoginDto getMemberLoginInfo(String providerId);


    /**
     * 새로운 유저 정보를 DB에 저장하는 메서드
     * @param memberCreateDto provider(naver등), providerId, email, nickname, role, gender 포함
     */
    void createNewMember(MemberCreateDto memberCreateDto);


    /**
     * 유저의 닉네임을 변경하는 메서드
     * 닉네임은 2~20길이의 한글 또는 영문만 허용
     * @param changeNickNameDto providerId, 변경할 닉네임을 포함하는 DTO
     */
    void updateMemberNickName(ChangeNickNameDto changeNickNameDto);



}