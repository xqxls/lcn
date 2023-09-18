package com.xqxls.order.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * tbl_order
 * @author 
 */
@Data
public class TblOrder implements Serializable {
    private Integer id;

    private String orderName;

    private static final long serialVersionUID = 1L;
}