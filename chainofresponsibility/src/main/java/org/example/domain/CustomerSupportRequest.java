package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CustomerSupportRequest {
    private String name;
    private String description;
    private int priority;
}
