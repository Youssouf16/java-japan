package question1;

public class SentenceGenerator {
	public static void main(String[] args) {
		
		String[] subject= {"I","You"};
		String[] verb= {"play","love"};
		String[] object= {"football","hockey"};
	  for(int i=0;i<2;i++) {
		   for(int j=0;j<2;j++) {
			   for(int k=0;k<2;k++) {
				  System.out.println(subject[i]+" "+  verb[j]+ " " +object[k]);
			  }
		  }
	 }
	 
	}
}
