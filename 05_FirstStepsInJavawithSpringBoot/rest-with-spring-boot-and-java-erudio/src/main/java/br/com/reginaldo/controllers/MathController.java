package br.com.reginaldo.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.reginaldo.bussiness.MathBusiness;

@RestController
public class MathController {

	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception{
		
		return MathBusiness.sum(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sub(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception{
		
		return MathBusiness.sub(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/mul/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mul(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception{
		
		return MathBusiness.mul(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception{
		
		return MathBusiness.div(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/med/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double med(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception{
		
		return MathBusiness.med(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/sqrt/{numberOne}", method = RequestMethod.GET)
	public Double squareRoot(@PathVariable(value = "numberOne") String numberOne) throws Exception{
		
		return MathBusiness.sqrt(numberOne);
	}

	
}
