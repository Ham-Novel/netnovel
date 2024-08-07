package com.ham.netnovel.favoriteNovel;

import com.ham.netnovel.member.Member;
import com.ham.netnovel.novel.Novel;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class FavoriteNovel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto_increment 자동생성
    private Long id;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
    @ManyToOne
    @JoinColumn(name = "novel_id")
    private Novel novel;



}
