package spring.hebr.springboot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Payment
 * @Author hebo
 * @Date 2021/3/5 16:00
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {


    /**
     * 主键id
     */
    private long id;

    /**
     * 流水号
     */
    private String serial;
}
