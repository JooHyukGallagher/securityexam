package org.edwith.webbe.securityexam.entity;

import lombok.*;

import javax.persistence.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
public class MemberRole {

    @Id @GeneratedValue
    private Long id;
    private String roleName;

    @ManyToOne
    @JoinColumn(name = "memberId")
    private Member member;

    @Builder
    public MemberRole(String roleName) {
        this.roleName = roleName;
    }

    public void addMember(Member member){
        this.member = member;
        member.getMemberRoles().add(this);
    }
}
