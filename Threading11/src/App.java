
public class App {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		final Runner runner=new Runner();
		
		Thread t1=new Thread (new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					runner.firstThread();
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					runner.secondThread();
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		runner.finished();

	}

}
