package zzyzzy.springboot.semiprojectv6.dao;

import zzyzzy.springboot.semiprojectv6.model.Member;

public interface MemberDAO {
    int selectLogin(Member m);
}
