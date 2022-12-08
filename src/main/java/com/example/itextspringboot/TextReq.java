package com.example.itextspringboot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by pat on 06-Dec-22 - 2:26 PM
 *
 * @author pat
 * @project itext-springboot
 */
@AllArgsConstructor
@NoArgsConstructor
@lombok.Data
@Builder
public class TextReq {
    private String src;
    private List<TextDto> listText;
}
