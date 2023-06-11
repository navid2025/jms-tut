package com.navid.jmstut.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HelloMessage implements Serializable {

    public static final long serialVersionUID = 42L;
    private UUID id;
    private String message;
}
