public class passByVal {
	public static void main(String[] args) {
		int sId = 25;
		passByVal val = new passByVal();
		System.out.println(sId);
		val.passTheValueMethod(sId);
		System.out.println("The sId are" + sId);
	}

	private void passTheValueMethod(int sId) {
		// TODO Auto-generated method stub
		sId = 10;
		System.out.println("The sId are" + sId);
	}
}
