package gaozhi.online.peoplety.log.controller;

import com.github.pagehelper.PageInfo;
import gaozhi.online.base.log.SysLog;
import gaozhi.online.peoplety.log.exception.LogException;
import gaozhi.online.peoplety.log.exception.LogExceptionEnum;
import gaozhi.online.peoplety.log.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * @author http://gaozhi.online
 * @version 1.0
 * @description: TODO 日志服务
 * @date 2022/8/5 12:01
 */
@Validated
@RestController
@RequestMapping("/sys_log")
public class SysLogController {
    @Autowired
    private SysLogService sysLogService;

    /**
     * @param sysLog
     * @return gaozhi.online.base.log.SysLog
     * @description: 写入日志
     * @author http://gaozhi.online
     * @date: 2022/8/5 12:30
     */
    @PostMapping("/post/log")
    public SysLog writeLog(@RequestBody SysLog sysLog) {
        int res = sysLogService.insert(sysLog);
        if (res < 0) {
            throw new LogException(LogExceptionEnum.WRITE_ERROR);
        }
        return sysLog;
    }

    /**
     * @param startTime
     * @param endTime
     * @param pageNum
     * @param pageSize
     * @return com.github.pagehelper.PageInfo<gaozhi.online.base.log.SysLog>
     * @description: 根据开始结束时间获取日志
     * @author http://gaozhi.online
     * @date: 2022/8/5 12:30
     */
    @GetMapping("/get/logs")
    public PageInfo<SysLog> getLogByTime(@NotNull Long startTime, @NotNull Long endTime, @NotNull Integer pageNum, @NotNull Integer pageSize) {
        return sysLogService.selectAll(startTime, endTime, pageNum, pageSize);
    }
}
