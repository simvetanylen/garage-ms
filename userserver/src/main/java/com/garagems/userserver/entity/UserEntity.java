package com.garagems.userserver.entity;

import com.garagems.userserver.constant.UserType;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="useraccount")
@Data
public class UserEntity {

    private static final String SEQUENCE = "useraccount_id_seq";

    @Id
    @SequenceGenerator(name = SEQUENCE, sequenceName = SEQUENCE)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE)
    @Column(name="user_id")
    private Long id;

    @Column(name="user_login")
    @Length(min=3)
    @NotNull
    private String login;

    @Column(name="user_type")
    @NotNull
    @Enumerated(EnumType.STRING)
    private UserType type;

    @Column(name="user_password")
    @Length(min=3)
    @NotNull
    private String password;
}
