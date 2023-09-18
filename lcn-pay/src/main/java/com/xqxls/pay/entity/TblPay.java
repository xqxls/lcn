package com.xqxls.pay.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * tbl_pay
 * @author 
 */
@Data
public class TblPay implements Serializable {
    private Integer id;

    private String payName;

    private static final long serialVersionUID = 1L;
}