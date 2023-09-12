package com.apollo.mybatis.smbms.test;

import com.apollo.mybatis.smbms.mapper.BillMapper;
import com.apollo.mybatis.smbms.mapper.impl.BillMapperImpl;
import com.apollo.mybatis.smbms.pojo.Bill;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class TestBillApp {
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
        BillMapper billMapper = new BillMapperImpl();
        billMapper.add(bill);
    }

    @Test
    public void getBillList_test() throws Exception {
        Bill bill = new Bill();
        bill.setProductName("");
        bill.setIsPayment(2);
        bill.setProviderId(8);
        BillMapper billMapper = new BillMapperImpl();
        List<Bill> billList = billMapper.getBillList(bill);
        for (Bill bill1 : billList) {
            System.out.println("bill1 = " + bill1);
        }
    }

    @Test
    public void deleteBillById_test() throws Exception {
        BillMapper billMapper = new BillMapperImpl();
        billMapper.deleteBillById("19");
    }

    @Test
    public void getBillById_test() throws Exception {
        BillMapper billMapper = new BillMapperImpl();
        Bill bill = billMapper.getBillById("1");
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
        BillMapper billMapper = new BillMapperImpl();
        billMapper.modify(bill);
    }

    @Test
    public void getBillCountByProviderId_test() throws Exception {
        BillMapper billMapper = new BillMapperImpl();
        int billCountByProviderId = billMapper.getBillCountByProviderId("2");
        System.out.println(billCountByProviderId);
    }
}
