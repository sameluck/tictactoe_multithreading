public class Worker extends Thread{

	private int id;
	private Data data;

	public Worker(int id, Data d){
		this.id = id;
		data = d;
		this.start();
	}

	@Override
	public void run(){
		super.run();
		for (int i=0;i<5;i++){
			while(data.getState()!=id){}
			if(id==1) data.Tic();
			if(id==2) data.Tak();
			if(id==3) data.Toe();
		}
	}

}
