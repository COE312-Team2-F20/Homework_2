
import java.util.TimerTask;

class WatchHelper extends TimerTask {
	public static int i = 0;

	public void run() {
		System.out.println(++i + " minutes passed... ");
		if (i == 3) {
			synchronized (Watch.obj) {
				Watch.obj.notify();
			}
		}
	}
}
