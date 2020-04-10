package org.edwith.webbe.securityexam.dao;

import org.aspectj.lang.annotation.Before;
import org.assertj.core.api.Assertions;
import org.edwith.webbe.securityexam.entity.Member;
import org.edwith.webbe.securityexam.entity.MemberRole;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    MemberRoleRepository memberRoleRepository;

    @BeforeEach
    public void before(){
        Member member1 = Member.builder()
                .name("강경미")
                .email("carami@example.com")
                .password("$2a$10$G/ADAGLU3vKBd62E6GbrgetQpEKu2ukKgiDR5TWHYwrem0cSv6Z8m")
                .build();
        Member member2 = Member.builder()
                .name("이정주")
                .email("toto@example.com")
                .password("$2a$10$G/ADAGLU3vKBd62E6GbrgetQpEKu2ukKgiDR5TWHYwrem0cSv6Z8m")
                .build();

        memberRepository.save(member1);
        memberRepository.save(member2);

        MemberRole memberRole1 = MemberRole.builder()
                .roleName("ROLE_USER")
                .build();
        MemberRole memberRole2 = MemberRole.builder()
                .roleName("ROLE_ADMIN")
                .build();
        MemberRole memberRole3 = MemberRole.builder()
                .roleName("ROLE_USER")
                .build();

        memberRole1.addMember(member1);
        memberRole2.addMember(member1);
        memberRole3.addMember(member2);

        memberRoleRepository.save(memberRole1);
        memberRoleRepository.save(memberRole2);
        memberRoleRepository.save(memberRole3);
    }

    @Test
    public void getUser() throws Exception {
        Member member = memberRepository.getMemberByEmail("carami@example.com");
        assertThat(member).isNotNull();
        assertThat(member.getName()).isEqualTo("강경미");
    }
}