package com.data.repository;

import com.data.entity.Account;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // có hoặc k
// bean lưu trong spring ioc container
public interface AccountRepository extends JpaRepository<Account, Integer> {

    // sv gõ 5 hàm và truyền vào 1 api controller, rồi chạy
    // chụp kq lên zlo, trong 10p
    List<Account> findByUsername(String username);

    List<Account> findByPassword(String password);

    List<Account> findByFullName(String fullName);

    List<Account> findByUsernameAndPassword(String username, String password);

    List<Account> findByUsernameOrFullName(String username, String fullName);

    // dùng HQL
    @Query(value = "FROM Account WHERE username = :username OR fullName = :fullName")
    List<Account> getData2(String username, String fullName); // tên hàm k quan trọng
}
