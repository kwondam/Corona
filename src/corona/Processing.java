package corona;

import java.util.List;

public class Processing {
	public static String getPeriod(List<Date> date){
		for(int i=0; i<date.size(); i++) {
			if ((date[i].price-(date[i].price - date[i+30].price))/date[i].price<0.9) {
				return date[i].day;
			}
			else {
				return "기록하지 않습니다";
			}
		}
	}
}
