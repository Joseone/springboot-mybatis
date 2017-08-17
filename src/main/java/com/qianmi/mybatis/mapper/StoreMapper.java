package com.qianmi.mybatis.mapper;

import com.qianmi.mybatis.pojo.StorePojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * description
 * <p>
 * <p>FileName: com.qianmi.mybatis.mapper.StoreMapper</p>
 * <p>Date: 2017-08-17 15:07.</p>
 *
 * @author <a href="mailto:lilonglong@qianmi.com">of2639-李龙龙</a>
 */
@Mapper
public interface StoreMapper {

    @Select("select * from tb_user_scene_rel where userid = #{adminId}")
    @Results({@Result(property = "adminId", column = "userid"),
              @Result(property = "ticketId", column = "ticket_id"),
              @Result(property = "storeName", column = "store_name")})
    public StorePojo getOne(String adminId);
}
