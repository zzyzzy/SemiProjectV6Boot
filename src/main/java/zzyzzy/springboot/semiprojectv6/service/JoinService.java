package zzyzzy.springboot.semiprojectv6.service;

import zzyzzy.springboot.semiprojectv6.model.Member;

public interface JoinService {

    String findZipcode(String dong);

    boolean newMember(Member m);

    int checkUserid(String uid);

    boolean loginMember(Member m);

}
