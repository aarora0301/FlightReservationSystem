package com.aarshi.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {

  public Date convertToDate(String format, String date){
    Date formattedDate=null;
    try {
      formattedDate = new SimpleDateFormat(format).parse(date);
    }
    catch(ParseException ex){
      ex.getMessage();
    }
      return formattedDate;
  }

}
