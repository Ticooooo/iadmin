package club.mikusun.iadmin.provide.account.service.impl;


import club.mikusun.iadmin.cache.server.RedisServer;
import club.mikusun.iadmin.db.depencies.jpa.service.impl.BaseServiceImpl;
import club.mikusun.iadmin.domain.account.Account_Token;
import club.mikusun.iadmin.provide.account.dao.TokenDao;

import club.mikusun.iadmin.provide.account.service.AccountService;
import club.mikusun.iadmin.provide.account.service.TokenService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TokenServiceImpl extends BaseServiceImpl<Account_Token , Integer>
        implements TokenService {
    @Getter
    private TokenDao dao;

    @Autowired
    private AccountService accountService;

    @Autowired
    private RedisServer redisServer;

    public TokenServiceImpl(TokenDao dao) {
        super(dao);
        this.dao = dao;
    }


    @Override
    public Account_Token findOneByToken(String token) {
        return this.getDao().findOneByToken(token);
    }

}
