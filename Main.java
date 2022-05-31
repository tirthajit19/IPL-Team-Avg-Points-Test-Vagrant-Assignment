import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException {
		iplTeam ob[]=new iplTeam[10];
		//Scanner in = new Scanner(System.in);
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		int temp=0,ptsavg=0,count=0;
		int result[]= new int[5]; // taking a result array to store the last 5 results.
		for(int i=0;i<10;i++) {
			System.out.println("Enter the name, points and the last 5 results of the "+(i+1)+" team");
			String name=in.readLine();
			int pts=Integer.parseInt(in.readLine());
			//Assuming Won=1 Loss=0
			result[0]=Integer.parseInt(in.readLine());
			result[1]=Integer.parseInt(in.readLine());
			result[2]=Integer.parseInt(in.readLine());
			result[3]=Integer.parseInt(in.readLine());
			result[4]=Integer.parseInt(in.readLine());
			
			ob[i]=new iplTeam(name, pts, result);
			
			for(int j=0;j<4;j++) {
				if(ob[i].result[j]==0 && ob[i].result[j+1]==0)
					temp=1;
			}
			if(temp==1) {
				ptsavg+=ob[i].pts;
				count++;
				temp=0;
			}
		}
		double avg = ptsavg/count;
		System.out.println("\nAverage points of the team having two consecutive losses = "+avg);
	}
}
