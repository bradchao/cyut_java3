package tw.edu.cyut.ice;

public class Cyut3 {

	public static void main(String[] args) {
		TWId id1 = new TWId();
		System.out.println(id1.getId());
		
		TWId id2 = new TWId(true);
		System.out.println(id2.getId());

		TWId id3 = new TWId(4);
		System.out.println(id3.getId());

		TWId id4 = new TWId(false, 1);
		System.out.println(id4.getId());

	}

}
