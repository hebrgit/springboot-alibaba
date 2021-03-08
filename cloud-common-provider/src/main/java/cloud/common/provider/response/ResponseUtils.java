package cloud.common.provider.response;

import cloud.common.provider.exception.ApplicationException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.omg.CORBA.SystemException;


import java.io.Serializable;

/**
 * @ClassName ResponseUtils
 * @Author hebo
 * @Date 2021/3/5 16:16
 **/
@Data
@AllArgsConstructor
public class ResponseUtils implements Serializable {

    public static ResponseDto<?> wrapSuccess() {
        return new ResponseDto<>(BaseResponseEnum.SUCCESS);
    }

    public static ResponseDto<?> wrapSuccess(Object o) {
        return new ResponseDto<>(BaseResponseEnum.SUCCESS, o);
    }

    /**
     * @param code    error code
     * @param message error message
     * @return ResponseDto
     */
    public static ResponseDto wrapException(final String code, final String message) {

        return new ResponseDto(code, message);
    }

    /**
     * @param e ApplicationException
     * @return ResponseDto
     */
    public static ResponseDto wrapException(final ApplicationException e) {

        return new ResponseDto(e);
    }


    public static ResponseDto wrapException(final String code, final String message, final Object body) {

        return new ResponseDto(code, message, body);
    }
}
