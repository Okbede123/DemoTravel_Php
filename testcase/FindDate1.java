package baitaptest.baitap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FindDate1 {

    public static void main(String[] args) throws ParseException  {


        startTimeToEnd("20221228","20230122");
        setBonusTime("20221228",2);
    }

    public static void startTimeToEnd(String startDate, String endDate) throws ParseException {
        if(startDate.length() != 8 && endDate.length() != 8){
            throw new RuntimeException();
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        java.util.Date dateSet1 = dateFormat.parse(startDate);
        java.util.Date dateSet2 = dateFormat.parse(endDate);
        c1.setTime(dateSet1);
        c2.setTime(dateSet2);

        long day =  (c2.getTime().getTime() - c1.getTime().getTime()) /(24 * 3600 * 1000);

        System.out.println("tong so ngay tu " + dateFormat.format(c1.getTime()) + " den ngay " + dateFormat.format(c2.getTime()) + " la " + day + " ngày ");
    }

    public static void setBonusTime(String startDate, int monthBonus) throws ParseException{
        if(startDate.length() != 8){
            throw new RuntimeException();
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Calendar c1 = Calendar.getInstance();
        Date dateSet = dateFormat.parse(startDate);
        c1.setTime(dateSet);
        c1.add(Calendar.MONTH,monthBonus);
        System.out.println("tang them " + monthBonus + " thang " + "so ngay sau khi tang la " + dateFormat.format(c1.getTime()));
    }
}


