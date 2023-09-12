package com.apollo.mybatis.smbms.service.impl;

import com.apollo.mybatis.smbms.mapper.BillMapper;
import com.apollo.mybatis.smbms.mapper.impl.BillMapperImpl;
import com.apollo.mybatis.smbms.pojo.Bill;
import com.apollo.mybatis.smbms.service.BillService;

import java.util.List;

public class BillServiceImpl implements BillService {
    BillMapper billMapper = new BillMapperImpl();
    @Override
    public boolean add(Bill bill) throws Exception {
        int i = billMapper.add(bill);
        return i>0;
    }

    @Override
    public List<Bill> getBillList(Bill bill) throws Exception {
        List<Bill> billList = billMapper.getBillList(bill);
        return billList;
    }

    @Override
    public boolean deleteBillById(String delId) throws Exception {
        int i = billMapper.deleteBillById(delId);
        return i>0;
    }

    @Override
    public Bill getBillById(String id) throws Exception {
        Bill billById = billMapper.getBillById(id);
        return billById;
    }

    @Override
    public boolean modify(Bill bill) throws Exception {
        int i = billMapper.modify(bill);
        return i>0;
    }
}
