package naveenSeleniumClass;

public class Stringsplit {

	public static void main(String[] args) {

		 String data = "15931593950382205972005873020585729295767920094768300288002957529";
		 int a = 0;
		 System.out.println(data.length());
		 
		 for (int i = 0; i<data.length();i++) {
			 char n = data.charAt(i);
			 a = a+(Character.getNumericValue(n));
			 
		 }
		 System.out.println(a);
		 if (data.length()>1) {
			 <body>
				<div class="item">
					<span class="title">Plambus</span>
					<div>
						<span class="price">10</span>
						<span class="instock">NO</span>
					</div>
				</div>
				<div class="item">
					<span class="title">Ploomper</span>
					<div>
						<span class="price">60</span>
						<span class="instock">YES</span>
					</div>
				</div>
				<div class="item">
					<span class="title">Blumpos</span>
					<div>
						<span class="price">40</span>
						<span class="instock">YES</span>
					</div>
				</div>
			</body>
			
			 
		 }
		 
	}

	public static int single() {
		return 0;

	}

}
