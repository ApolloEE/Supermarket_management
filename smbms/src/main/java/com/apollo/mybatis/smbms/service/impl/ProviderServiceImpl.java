package com.apollo.mybatis.smbms.service.impl;


import com.apollo.mybatis.smbms.mapper.ProviderMapper;
import com.apollo.mybatis.smbms.mapper.impl.ProviderMapperImpl;
import com.apollo.mybatis.smbms.pojo.Provider;
import com.apollo.mybatis.smbms.service.ProviderService;

import java.util.List;

public class ProviderServiceImpl implements ProviderService {
    ProviderMapper providerMapper = new ProviderMapperImpl();
    @Override
    public boolean add(Provider provider) throws Exception {
        int i = providerMapper.add(provider);
        return i>0;
    }

    @Override
    public List<Provider> getProviderList(String proName, String proCode) throws Exception {
        List<Provider> providerList = providerMapper.getProviderList(proName, proCode);
        return providerList;
    }

    @Override
    public int deleteProviderById(String delId) throws Exception {
        int i = providerMapper.deleteProviderById(delId);
        if(i>0){
            return 0;
        }
        return -1;
    }

    @Override
    public Provider getProviderById(String id) throws Exception {
        Provider providerById = providerMapper.getProviderById(id);
        return providerById;
    }

    @Override
    public boolean modify(Provider provider) throws Exception {
        int i = providerMapper.modify(provider);
        return i>0;
    }
}
