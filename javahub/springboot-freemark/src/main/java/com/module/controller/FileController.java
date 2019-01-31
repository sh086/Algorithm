package com.module.controller;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@Slf4j
public class FileController {

    private static final String FILE_UPLOAD = "fileUpload";

    /**
     * 返回文件上传页面
     * */
    @GetMapping("/fileUpload")
    public String fileUpload(){
        return FILE_UPLOAD;
    }

    /**
     * 文件上传
     * */
    @PostMapping("/fileUpload")
    @ResponseBody
    public Map<String,Object> fileUpload(@RequestParam("file") MultipartFile fileName){
        log.info("上传文件名：{}",fileName.getOriginalFilename());
        try {
            String path = "E:/"+fileName.getOriginalFilename();
            fileName.transferTo(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        HashMap<String, Object> params = Maps.newHashMap();
        params.put("msg","上传成功");
        return params;
    }
}