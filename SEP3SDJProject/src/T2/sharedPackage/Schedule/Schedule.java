package T2.sharedPackage.Schedule;

import java.util.Date;
import java.util.Timer;

public class Schedule implements ISchedule {

	private Timer time;
	private Date date;
	
	public Schedule(Timer time, Date date) {
		super();
		this.time = time;
		this.date = date;
	}

	@Override
	public Timer getAllTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getAllDate() {
		// TODO Auto-generated method stub
		return null;
	}

}
