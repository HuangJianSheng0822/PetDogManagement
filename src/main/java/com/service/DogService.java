package com.service;

import com.mapper.DogMapper;
import com.pojo.Dog;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class DogService {
    @Autowired
    private DogMapper dogMapper;

    public List<Dog> getDogList(String page,String limit){
        return dogMapper.getDogList ("0","15");
    }


    public int addDog( Dog dog){
        return dogMapper.addDog (dog);
    };

    public int delDog(String dogId){
        return dogMapper.delDog (dogId);
    }
    public int updateDog(Dog dog){
        return dogMapper.updateDog (dog);
    }
}
