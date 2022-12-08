package com.example.itextspringboot;

import com.itextpdf.text.DocumentException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by pat on 06-Dec-22 - 2:19 PM
 *
 * @author pat
 * @project itext-springboot
 */
@RestController
@RequestMapping("text")
@RequiredArgsConstructor
public class Controller {
    private final TemplateService templateService;

//    {
//        "src": "src/main/file/CIST-BM-Bien-ban-nghiem-thu.pdf",
//            "listText": [{
//        "text": "Phạm Anh Tuấn",
//                "positionX": 180,
//                "positionY": 480,
//                "width": 250,
//                "height": 100,
//                "page": 1
//    },
//        {
//            "text": "CTV",
//                "positionX": 180,
//                "positionY": 460,
//                "width": 250,
//                "height": 100,
//                "page": 1
//        }]
//    }

    @PostMapping("/add")
    public ResponseEntity<?> addText(@RequestBody TextReq textReq) throws DocumentException, IOException {
        templateService.addT(textReq);
        return ResponseEntity.ok("OK");
    }
}
