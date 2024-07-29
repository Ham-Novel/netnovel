package com.ham.netnovel.reCommentLike;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReCommentLikeKey implements Serializable {

    private Long reCommentId;
    private Long memberId;


    @Override
    public boolean equals(Object o) {
        //파라미터로 받은 객체와 자신을 비교, 동일한 객체일경우 true 반환
        if (this==o) return true;
        //파라미터로 받은 객체가 null 이거나, 현재 클래스와 다른 클래스일경우 false 반환
        if (o==null || getClass() !=o.getClass()) return false;
        //타입 캐스팅
        ReCommentLikeKey that = (ReCommentLikeKey) o;
        //파라미터로 받은 객체와 현재 객체의 필드값 비교, 두 필드값이 모두 동일해야 true 반환
        return Objects.equals(reCommentId,that.reCommentId) && Objects.equals(memberId,that.memberId);
    }
    //equals()가 true를 반환할때, 객체들이 도일한 해시 코드 값을 반환하도록 보장하는 메서드
    @Override
    public int hashCode() {
        return Objects.hash(reCommentId, memberId);
    }
}
