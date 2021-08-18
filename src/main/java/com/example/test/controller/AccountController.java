package com.example.test.controller;

import com.example.test.entity.Account;
import com.example.test.service.AccountService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户账号表(Account)表控制层
 *
 * @author makejava
 * @since 2021-06-17 12:27:41
 */
@RestController
@RequestMapping("account")
public class AccountController {
    /**
     * 服务对象
     */
    @Resource
    private AccountService accountService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Account selectOne(Integer id) {
        return this.accountService.queryById(id);
    }

}