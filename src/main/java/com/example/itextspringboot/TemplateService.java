package com.example.itextspringboot;

import com.itextpdf.text.DocumentException;

import java.io.IOException;

/**
 * Created by pat on 06-Dec-22 - 2:19 PM
 *
 * @author pat
 * @project itext-springboot
 */
public interface TemplateService {
    void addT(TextReq textDtoList) throws IOException, DocumentException;
}
