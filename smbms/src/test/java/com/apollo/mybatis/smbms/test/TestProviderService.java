package com.apollo.mybatis.smbms.test;

import com.apollo.mybatis.smbms.pojo.Provider;
import com.apollo.mybatis.smbms.service.ProviderService;
import com.apollo.mybatis.smbms.service.impl.ProviderServiceImpl;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class TestProviderService {
    ProviderService providerService = new ProviderServiceImpl();

    @Test
    public void add_test() throws Exception {
        Provider provider = new Provider();
        provider.setProCode("AP_xxxxxx");
        provider.setProName("陈晓百货");
        provider.setProDesc("短期合作伙伴");
        provider.setProContact("陈晓");
        provider.setProPhone("13013240128");
        provider.setProAddress("雄安");
        provider.setProFax("0718_20202020");
        provider.setCreatedBy(1);
        provider.setCreationDate(new Date());
        System.out.println(providerService.add(provider));
    }

    @Test
    public void getProviderList_test() throws Exception {
        List<Provider> providerList = providerService.getProviderList("公司", "1");
        for (Provider provider : providerList) {
            System.out.println("provider = " + provider);
        }
    }

    @Test
    public void deleteProviderById_test() throws Exception {
        System.out.println(providerService.deleteProviderById("17"));
    }

    @Test
    public void getProviderById_test() throws Exception {
        Provider providerById = providerService.getProviderById("1");
        System.out.println(providerById);
    }

    @Test
    public void modify_test() throws Exception {
        Provider provider = new Provider();
        provider.setId(27);
        provider.setProCode("AP_xxxxxx");
        provider.setProName("陈晓百货x");
        provider.setProDesc("xxx");
        provider.setProContact("陈晓");
        provider.setProPhone("130130003300");
        provider.setProAddress("雄安");
        provider.setProFax("0718_20202020");
        provider.setCreatedBy(1);
        provider.setCreationDate(new Date());
        provider.setModifyBy(1);
        provider.setModifyDate(new Date());
        System.out.println(providerService.modify(provider));
    }
}
