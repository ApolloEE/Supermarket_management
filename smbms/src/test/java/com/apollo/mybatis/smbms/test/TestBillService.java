package com.apollo.mybatis.smbms.test;

import com.apollo.mybatis.smbms.pojo.Bill;
import com.apollo.mybatis.smbms.service.BillService;
import com.apollo.mybatis.smbms.service.impl.BillServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class TestBillService {
    BillService billService = new BillServiceImpl();

    @Test
    public void add_test() throws Exception {
        Bill bill = new Bill();
        bill.setBillCode("BILL2020_22_22");
        bill.setProductName("笔记本电脑");
        bill.setProductDesc("程序员专用");
        bill.setProductUnit("个");
        bill.setProductCount(new BigDecimal("100"));
        bill.setTotalPrice(new BigDecimal("25000"));
        bill.setIsPayment(2);
        bill.setProviderId(8);
        bill.setCreationDate(new Date());
        System.out.println(billService.add(bill));
    }

    @Test
    public void getBillList_test() throws Exception {
        Bill bill = new Bill();
        bill.setProductName("");
        bill.setIsPayment(2);
        bill.setProviderId(8);
        List<Bill> billList = billService.getBillList(bill);
        for (Bill bill1 : billList) {
            System.out.println("bill1 = " + bill1);
        }
    }

    @Test
    public void deleteBillById_test() throws Exception {
        System.out.println(billService.deleteBillById("21"));
    }

    @Test
    public void getBillById_test() throws Exception {
        Bill bill = billService.getBillById("1");
        System.out.println(bill);
    }

    @Test
    public void modify_test() throws Exception {
        Bill bill = new Bill();
        bill.setId(20);
        bill.setBillCode("BILL2020_22_22");
        bill.setProductName("笔记本电脑");
        bill.setProductDesc("程序员专用");
        bill.setProductUnit("个");
        bill.setProductCount(new BigDecimal("100"));
        bill.setTotalPrice(new BigDecimal("25000"));
        bill.setIsPayment(2);
        bill.setProviderId(8);
        bill.setCreationDate(new Date());
        bill.setModifyBy(1);
        bill.setModifyDate(new Date());
        System.out.println(billService.modify(bill));
    }
}
