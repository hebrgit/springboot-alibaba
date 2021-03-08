package cloud.common.provider.exception;

import cloud.common.provider.response.BaseResponseEnum;
import lombok.Data;

/**
 * @ClassName ApplicationException
 * @Author hebo
 * @Date 2021/3/5 16:49
 **/
@Data
public class ApplicationException extends RuntimeException {


    private String code;

    private String message;

    public ApplicationException() {
        code = BaseResponseEnum.SYSTEM_EXCEPTION.getCode();
        message = BaseResponseEnum.SYSTEM_EXCEPTION.getMessage();
    }
}
