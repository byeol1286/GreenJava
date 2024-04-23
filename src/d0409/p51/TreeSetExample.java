package d0409.p51;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");

		System.out.println("[c-f ������ �ܾ� �˻�]");
		NavigableSet<String> rangeSet = treeSet.subSet("cherr", false, "f", true);
		for (String word : rangeSet) {
			System.out.println(word);
		}
	}
}
