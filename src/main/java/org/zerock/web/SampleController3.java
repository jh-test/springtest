package org.zerock.web;

import org.slf4j.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.zerock.domain.ProductVO;

@Controller
public class SampleController3 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);
	
	@RequestMapping("/doD")
	public String doD(Model model){

		//make sample date
		ProductVO product = new ProductVO("Sample Product", 10000);
		
		logger.info("doD");
		
		model.addAttribute(product);
		
		return "productDetail";
	}
}
