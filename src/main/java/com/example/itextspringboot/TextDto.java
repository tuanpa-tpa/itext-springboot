package com.example.itextspringboot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by pat on 06-Dec-22 - 2:20 PM
 *
 * @author pat
 * @project itext-springboot
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TextDto {
    private String text;
    private Float positionX;
    private Float positionY;
    private Integer width;
    private Integer height;
    private Integer page;
}
