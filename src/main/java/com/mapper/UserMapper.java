package com.mapper;

import com.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     * 查询用户
     * @param adminId
     * @return
     */
    @Select ("select adminPwd from user where adminId = #{adminId}")
    public String getUser(String adminId);
}
