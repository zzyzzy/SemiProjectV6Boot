package zzyzzy.springboot.semiprojectv6boot.dao;

import zzyzzy.springboot.semiprojectv5.model.Member;

public interface MemberDAO {
    int selectLogin(Member m);
}
