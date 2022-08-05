package gaozhi.online.peoplety.log.exception;

import gaozhi.online.base.exception.BusinessRuntimeException;
import gaozhi.online.base.result.Result;

/**
 * @author http://gaozhi.online
 * @version 1.0
 * @description: TODO
 * @date 2022/8/5 12:06
 */
public class LogException extends BusinessRuntimeException {
    public LogException(Result.ResultEnum exception) {
        super(exception);
    }

    public LogException(Result.ResultEnum exception, String msg) {
        super(exception, msg);
    }
}
