package gaozhi.online.peoplety.log.exception;

import gaozhi.online.base.result.Result;

/**
* @description: TODO 日志业务异常枚举
* @author http://gaozhi.online
* @date 2022/8/5 12:06
* @version 1.0
*/
public enum  LogExceptionEnum  implements Result.ResultEnum {
    /**
    * @description:  日志写入失败
    * @author http://gaozhi.online
    * @date: 2022/8/5 12:19
    */
    WRITE_ERROR(3001,"日志写入失败"),
    ;
    private final int  code;
    private final String message;

    LogExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
