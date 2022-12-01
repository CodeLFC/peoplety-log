package gaozhi.online.peoplety.log.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import gaozhi.online.peoplety.entity.SysLog;
import gaozhi.online.peoplety.log.mapper.SysLogMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @description: TODO 系统日志服务
* @author http://gaozhi.online
* @date 2022/12/1 15:57
* @version 1.0
*/
@Service
public class SysLogService {
    @Resource
    private SysLogMapper sysLogMapper;
    /**
    * @description:  查看日志
    * @param pageNum
     * @param pageSize
     * @return com.baomidou.mybatisplus.extension.plugins.pagination.Page<gaozhi.online.peoplety.entity.SysLog>
    * @author http://gaozhi.online
    * @date: 2022/12/1 16:00
    */
    public Page<SysLog> selectPage(int pageNum,int pageSize){
       return sysLogMapper.selectPage(new Page<>(pageNum,pageSize),new LambdaQueryWrapper<SysLog>().orderByDesc(true,SysLog::getTime));
    }
    /**
    * @description:  插入日志
    * @param sysLog
     * @return gaozhi.online.peoplety.entity.SysLog
    * @author http://gaozhi.online
    * @date: 2022/12/1 21:23
    */
    public boolean insert(SysLog sysLog) {
        return sysLogMapper.insert(sysLog)>0;
    }
}
