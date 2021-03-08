package cloud.common.provider.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hebo
 */

public interface IResponse<T> extends Serializable {


    /**
     * @return response code
     */
    String getCode();

    /**
     * @return response message
     */
    String getMessage();

    /**
     * @return response body
     */
    T getBody();

}
