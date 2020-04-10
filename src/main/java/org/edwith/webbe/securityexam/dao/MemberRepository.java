package org.edwith.webbe.securityexam.dao;

import org.edwith.webbe.securityexam.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member getMemberByEmail(String email);
}
