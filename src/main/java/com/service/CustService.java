package com.service;

import com.mapper.CustMapper;
import com.mapper.DogMapper;
import com.pojo.Cust;
import com.pojo.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustService {
    @Autowired
    private CustMapper custMapper;
    public List<Cust> getCustList( String page, String limit){
        return custMapper.getCustList ("0","15");
    }
    public int addCust( Cust cust){
        return custMapper.addCust (cust);
    };
    public int delCust(String id){
        return custMapper.delCust (id);
    }
    public int updateCust(Cust cust){
        return custMapper.updateCust (cust);
    }
}
