package javaPractice;

public class RemoveJunk {

	public static void main(String[] args) {

		String str = "###@@%^&nitin^&*&^^^agrawal@@@@!!!selenium";
		//RegExp[A-Za-z0-9]
		str = str.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str);
	}

}
