package com.ms.user.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Mauricio Silva
 */
@Data
@Entity
@Table(name = "USERS")
public class UserModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;
    private String name;
    private String email;
}
