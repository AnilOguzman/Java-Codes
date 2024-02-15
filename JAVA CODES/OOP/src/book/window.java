package book;

import java.text.SimpleDateFormat;
import java.util.Date;

class window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today;
		SimpleDateFormat sdf;
		today = new Date( );
		sdf = new SimpleDateFormat("MM/dd/yy");
		System.out.println(sdf.format(today));
	}

}
