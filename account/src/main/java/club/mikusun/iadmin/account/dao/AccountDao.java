package club.mikusun.iadmin.account.dao;

import club.mikusun.iadmin.domain.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao extends JpaRepository<Account,Integer> {

    @Query("select a from Account a where a.account_str=:account")
    Account findAccountByAccount(@Param("account") String account);
}
