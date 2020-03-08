public class Ascensor {

	
	private int tpisos;
	private int tsotanos;
	private int pisoinicial;
	private int ts;
	
	public Ascensor () {
		
		tpisos =0;		
		tsotanos =0;
		pisoinicial=1;
		ts=0;
		
	}

	public int getTpisos() {
		return tpisos;
	}

	public void setTpisos(int tpisos) {
		this.tpisos = tpisos;
	}

	public int getTsotanos() {
		return tsotanos;
	}

	public void setTsotanos(int tsotanos) {
		this.tsotanos = tsotanos;
	}



	public int getPisoinicial() {
		return pisoinicial;
	}

	public void setPisoinicial(int pisoinicial) {
		this.pisoinicial = pisoinicial;
	}
	public void setTs(int ts) {
		this.ts = ts;
	}
	public int getTs() {
		return ts;
	}



}

