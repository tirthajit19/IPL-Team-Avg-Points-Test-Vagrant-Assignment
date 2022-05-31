public class iplTeam {
	String name;
	int pts;
	int result[]=new int[5];
	
	iplTeam(String name, int pts,int[] result) {
		this.name=name;
		this.pts=pts;
		for(int i=0; i<5;i++)
			this.result[i]=result[i];
	}
}
