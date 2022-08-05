package gaozhi.online.peoplety.log.mapper;

import gaozhi.online.base.log.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

/**
 * @author http://gaozhi.online
 * @version 1.0
 * @description: TODO 日志
 * @date 2022/8/4 21:50
 */
@Mapper
public interface LogMapper {
    /**
    * @description: 插入
    * @param sysLog
     * @return int
    * @author http://gaozhi.online
    * @date: 2022/8/4 21:52
    */
    @Insert("insert into sys_log(type,ip,uri,time,execute_time,property) values(#{type},#{ip},#{uri},#{time},#{executeTime},#{property})")
    @SelectKey(keyProperty = "id", keyColumn = "id", before = false, resultType = Long.class, statement = "select last_insert_id()")
    int insert(SysLog sysLog);

    @Select("select id,type,ip,uri,time,execute_time executeTime,property from sys_log where time>=#{startTime} and time<=#{endTime}")
    List<SysLog> selectAll(long startTime, long endTime);
}
