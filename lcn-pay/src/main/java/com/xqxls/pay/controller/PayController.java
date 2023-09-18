package com.xqxls.pay.controller;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.xqxls.pay.dao.TblPayDao;
import com.xqxls.pay.entity.TblPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {


    @Autowired
    private TblPayDao tblPayDao;

    @PostMapping("/add-pay")
    @Transactional(rollbackFor = Exception.class)
    @LcnTransaction
    public String addPay(@RequestBody TblPay bean){
        tblPayDao.insert(bean);
        return "新增支付成功";

    }
}
