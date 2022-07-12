package com.mapper;

import com.pojo.Dog;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.List;

@Repository
public interface DogMapper {

    /**
     * 查询所有数据
     * @param page
     * @param limit
     * @return
     */
    @Select ("select * from dog")
    public List<Dog> getDogList( @Param ("page") String page,@Param ("limit") String limit );

    /**
     * 添加一条宠物狗信息
     * @param dog
     * @return
     */
    @Insert ("INSERT INTO `dog` (`dogId`, `dogName`, `dogAge`, `dogSex`, `dogDescription`, `dogPrice`, `nowHas`) " +
            "VALUES (#{dog.dogId}, #{dog.dogName}, #{dog.dogAge}, #{dog.dogSex}, #{dog.dogDescription}, #{dog.dogPrice}," +
            " '-1')")
    public int addDog(@Param ("dog") Dog dog);

    /**
     * 删除一条宠物狗
     * @param dogId
     * @return
     */
    @Delete ("DELETE FROM `dog` WHERE (`dogId`=#{dogId})")
    public int delDog(@Param ("dogId") String dogId);

    /**
     * 更新宠物狗信息
     * @param dog
     * @return
     */
    @Update ("UPDATE `dog` SET `dogName`=#{dog.dogName},`dogName`=#{dog.dogName}, `dogAge`=#{dog.dogAge}, `dogSex`=#{dog.dogSex}, `dogDescription`=#{dog.dogDescription}, " +
            "`dogPrice`=#{dog.dogPrice} " +
            "WHERE (`dogId`=#{dog.dogId})")
    public int updateDog(@Param ("dog") Dog dog);
}
