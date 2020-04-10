package org.edwith.webbe.securityexam.dao;

import org.edwith.webbe.securityexam.entity.MemberRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRoleRepository extends JpaRepository<MemberRole, Long> {
    @Query("select mr from MemberRole mr join fetch mr.member m where m.email = :email")
    List<MemberRole> getRolesByEmail(@Param("email") String email);
}
