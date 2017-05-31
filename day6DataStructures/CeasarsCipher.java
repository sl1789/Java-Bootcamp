package day6DataStructures;

public class CeasarsCipher {
	
	public static String cipher(String message, int numOfShifts){
		int[] inter = new int[message.length()];
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<inter.length;i++){
			inter[i]=(int)message.charAt(i);
			if (inter[i]>=65&&inter[i]<=90){
				if(inter[i]+numOfShifts>90){
					inter[i]=(inter[i]+numOfShifts)%90+65;
				}else{
					inter[i]=inter[i]+numOfShifts;
				}
				sb.append((char)inter[i]);
			}else if(inter[i]>=97&&inter[i]<=122){
				if(inter[i]+numOfShifts>122){
					inter[i]=(inter[i]+numOfShifts)%122+97;
				}else{
					inter[i]=inter[i]+numOfShifts;
				}
				sb.append((char)inter[i]);
			}else{
				sb.append((char)inter[i]);
			}
		
		}
		String s =sb.toString();
		return s;
		
	}
	
	public static String decipher(String cipherText, int numOfShifts){
		int[] inter = new int[cipherText.length()];
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<inter.length;i++){
			inter[i]=(int)cipherText.charAt(i);
			if (inter[i]>=65&&inter[i]<=90){
				if(inter[i]-numOfShifts<65){
					inter[i]=(inter[i]-numOfShifts)+25;
				}else{
					inter[i]=inter[i]-numOfShifts;
				}
				sb.append((char)inter[i]);
			}else if(inter[i]>=97&&inter[i]<=122){
				if(inter[i]-numOfShifts<97){
					inter[i]=(inter[i]-numOfShifts)+25;
				}else{
					inter[i]=inter[i]-numOfShifts;
				}
				sb.append((char)inter[i]);
			}else{
				sb.append((char)inter[i]);
			}
		
		}
		String s =sb.toString();
		return s;
		
	}
	

}
