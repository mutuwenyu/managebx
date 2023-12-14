package utils;

import lombok.Data;

@Data
public class JsonResult<T> {
    private String code;
    private String msg;
    private T data;


    public static <T> JsonResult<T> ok (T t,String code,String msg){
        JsonResult<T> result = new JsonResult<T>();
        result.setCode("200");
        result.setMsg("");
        result.setData(t);
        return result;
    }
}
