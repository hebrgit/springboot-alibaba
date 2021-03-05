package cloud.common.provider.response;


import cloud.common.provider.exception.ApplicationException;

/**
 * @ClassName ResponseDto
 * @Author hebo
 * @Date 2021/3/5 16:01
 **/
public class ResponseDto<T>  implements IResponse<T>{

    /**
     * 返回编码
     */
    private String code;

    /**
     * 信息
     */
    private String message ;


    private T body;


    public ResponseDto (final String code,final String message){
        this.body = null;
        this.message = message;
        this.code = code;
    }

    public ResponseDto (final String code,final String message,T body){
        this.body = body;
        this.message = message;
        this.code = code;
    }

    public ResponseDto (IResponse<T> response){
        this.body = response.getBody();
        this.message = response.getMessage();
        this.code = response.getCode();
    }

    public ResponseDto (IResponse<T> response,T body){
        this.body = body;
        this.message = response.getMessage();
        this.code = response.getCode();
    }

    public ResponseDto (ApplicationException a){
        this.body = null;
        this.message = a.getMessage();
        this.code = a.getCode();
    }
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public T getBody() {
        return body;
    }
}
