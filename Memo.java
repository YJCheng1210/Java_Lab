import java.io.*;

public class Memo {
	public static void main(String[] args){
		FileWriter fw = null;
		FileWriter fw2 = null;
		FileWriter fw3 = null;
		FileReader fr = null;
		BufferedReader br =null;
		FileReader fr2 = null;
		BufferedReader br2 =null;
		FileReader fr3= null;
		String buffer = "";
		String tempString = "";
		String y = "-----";
		
		try {
			fr = new FileReader("UIUC.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("meno.txt",true);


			//這裡参行都有設true所以每執行一次文件內容就會多加入新的內容
			//因此要測試時每執行過 後刪除memo.txt才不會一直加入內容~~
			//因如不設true你的第一段文字會成亂碼

			fw2 = new FileWriter("meno.txt", true);
			fw3 = new FileWriter("meno.txt", true);
			
			while((buffer = br.readLine())!= null) {
				fw.write(y);
				fw2.write("\n" + new String(buffer)+ "\n");
				fw3.write(y);
			}
		} catch (Exception e){}

		finally {
			try {
				fw.close();
				fw2.close();
				fw3.close();
				fr.close();
				br.close();
			} catch (Exception e) {}
		}
		try {
			fr2 = new FileReader("meno.txt");
			br2= new BufferedReader(fr2);
			while ((tempString = br2.readLine()) != null) {
				System.out.println(tempString);
			}
		} catch(Exception ex){}
		finally {
			try{
				br2.close();
				fr2.close();
			} catch (Exception e){}
		}

		char[] buffer2 = new char[1]; // read a char once a time.
		
		try {
			int n=0;
			fr3 = new FileReader("meno.txt");
			
			while(fr3.read(buffer2) != -1) {
				n += buffer2.length;
			}
			System.out.println("There are " + n + " characters in the file.");
		} catch (Exception e){}

		finally {
			try {
				fr3.close();
			} catch(Exception e) {}
		}
	}
}
