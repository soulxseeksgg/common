package com.iamdevelop.common;

import lombok.Data;

@Data
public class EmailRequest {
    private String to;
    private String content;
}
