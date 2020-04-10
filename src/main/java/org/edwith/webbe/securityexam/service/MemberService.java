package org.edwith.webbe.securityexam.service;

import lombok.RequiredArgsConstructor;
import org.edwith.webbe.securityexam.dao.MemberRepository;
import org.edwith.webbe.securityexam.dao.MemberRoleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;
    private final MemberRoleRepository memberRoleRepository;

//    @Override
//    @Transactional
//    public UserEntity getUser(String loginUserId){
//
//    }
}
