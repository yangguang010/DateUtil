package test;

import java.util.Date;

import util.DateUtil;

public class DateUtilTest {

	public static void main(String[] args) {
		System.out.println(DateUtil.parseDateToStr(new Date(), DateUtil.DATE_TIME_FORMAT_YYYYMMDDHHMISS));

	}

}
