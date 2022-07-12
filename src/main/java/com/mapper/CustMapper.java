package com.mapper;

import com.pojo.Cust;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustMapper {
    /**
     * 查看订单列表
     * @param page
     * @param limit
     * @return
     */
    @Select("select * from cust")
    public List<Cust> getCustList( @Param("page") String page, @Param ("limit") String limit );

    /**
     * 添加订单
     * @param cust
     * @return
     */
    @Insert("INSERT INTO `cust` (`id`, `dogId`, `custName`, `custNum`, `custAddress`, `custPrice`) " +
            "VALUES (#{cust.id}, #{cust.dogId}, #{cust.custName}, #{cust.custNum}, #{cust.custAddress}, #{cust.custPrice})")
    public int addCust(@Param ("cust") Cust cust);

    /**
     * 删除订单
     * @param id
     * @return
     */
    @Delete("DELETE FROM `cust` WHERE (`id`=#{id})")
    public int delCust(@Param ("id") String id);

    /**
     * 更新
     * @param cust
     * @return
     */
    @Update("UPDATE `cust` SET `dogId`=#{cust.dogId}, `custName`=#{cust.custName},`custNum`=#{cust.custNum}, " +
            "`custAddress`=#{cust.custAddress}, " +
            "`custPrice`=#{cust.custPrice}, " +
            "WHERE (`id`=#{cust.id})")
    public int updateCust(@Param ("cust") Cust cust);
}
