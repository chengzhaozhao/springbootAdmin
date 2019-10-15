package com.czz.admin.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-10-15 13:00
 */
@Entity
@Table(name = "user")
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 8417661498999272246L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;
    @Column
    private String phone;
}
