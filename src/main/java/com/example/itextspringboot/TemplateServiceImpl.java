package com.example.itextspringboot;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.*;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by pat on 06-Dec-22 - 2:26 PM
 *
 * @author pat
 * @project itext-springboot
 */
@Service
public class TemplateServiceImpl implements TemplateService {
    public static File fontFile = new File("src/main/font/vuTimes.ttf");

    @Override
    public void addT(TextReq req) throws IOException, DocumentException {
        PdfReader reader = new PdfReader(req.getSrc());
        PdfStamper stamper = new PdfStamper(reader, new FileOutputStream("src/main/file/CIST.pdf"));
        PdfContentByte cb;
        ColumnText ct;
        Font f;
        Paragraph pz;
        BaseFont baseFont = BaseFont.createFont(
                fontFile.getAbsolutePath(),
                BaseFont.IDENTITY_H,
                BaseFont.EMBEDDED);
        f = new Font(baseFont, 10);

        for (int i = 0; i < req.getListText().size(); i++) {
            TextDto textDto = req.getListText().get(i);
            cb = stamper.getOverContent(textDto.getPage());
            ct = new ColumnText(cb);
            ct.setSimpleColumn(new Rectangle(textDto.getPositionX(), textDto.getPositionY(), textDto.getWidth(), textDto.getHeight()));
            pz = new Paragraph(textDto.getText(), f);
            ct.addElement(pz);
            ct.go();
        }
//        ct = new ColumnText(cb);
//        ct.setSimpleColumn(new Rectangle(180, 480, 250, 100));
//        pz = new Paragraph ("Phạm Anh Tuấn", f);
//        ct.addElement(pz);
//        ct.go();
//
//
//        ct = new ColumnText(cb);
//        ct.setSimpleColumn(new Rectangle(180, 460, 250, 100));
//        pz = new Paragraph("Công tác viên", f);
//        ct.addElement(pz);
//        ct.go();
//
//
//        ct = new ColumnText(cb);
//        ct.setSimpleColumn(new Rectangle(180, 440, 250, 100));
//        pz = new Paragraph("038201016166", f);
//        ct.addElement(pz);
//        ct.go();
        stamper.close();
        reader.close();
    }
}
