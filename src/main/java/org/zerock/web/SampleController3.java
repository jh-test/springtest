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
	public String doD(Model model){ //model은 data를 담을 객체를 의미

		//make sample date
		ProductVO product = new ProductVO("Sample Product", 10000);
		ProductVO product2 = new ProductVO("",0);
		
		System.out.println(product);
		System.out.println(product2);		
		
		logger.info("doD");
		
		model.addAttribute(/*"pro",*/product); //model.addAttribute("productVO", product);
		
		return "productDetail";
	}
}
