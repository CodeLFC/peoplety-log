package gaozhi.online.peoplety.log.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import gaozhi.online.peoplety.entity.SysLog;
import gaozhi.online.peoplety.log.service.SysLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
* @description: TODO
* @author http://gaozhi.online
* @date 2022/12/1 16:01
* @version 1.0
*/
@Validated
@RestController
@RequestMapping
@Slf4j
public class SysLogController {
    @Autowired
    private SysLogService sysLogService;

    @GetMapping("/get/logs")
    public Page<SysLog> getLogs(@NotNull Integer pageNum, @NotNull Integer pageSize) {
        return sysLogService.selectPage(pageNum,pageSize);
    }
    @PostMapping("/post/log")
    public boolean insertLog(@RequestBody SysLog sysLog) {
        return sysLogService.insert(sysLog);
    }
}
