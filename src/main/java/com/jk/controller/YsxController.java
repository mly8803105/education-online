package com.jk.controller;

import com.jk.service.YsxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class YsxController {

    @Autowired
    private YsxService ysxService;
}
