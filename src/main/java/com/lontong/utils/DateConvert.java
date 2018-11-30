package com.lontong.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;





public class DateConvert implements Converter<String,Date>{

	@Override
	public Date convert(String arg0) {
		Date d=null;
		try {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			d=sdf.parse(arg0);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return d;
	}

}
