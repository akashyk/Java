package all.collection.stuff;

import java.util.*;

public class NamesBuilder {

	public void printSampleNamesArr() {

		ArrayList<Name> namesList = new ArrayList<Name>();
		namesList.add(new Name("Akash", "Yellappa"));
		namesList.add(new Name("Sunil", "Gavaskar"));
		namesList.add(new Name("Kapil", "Dev"));
		namesList.add(new Name("Sachin", "Tendulkar"));
		
		Collections.sort(namesList);

		for (Iterator<Name> i = namesList.iterator(); i.hasNext();) {
			Name item = i.next();
			System.out.print(item.getfName().hashCode() + "\t ");
			System.out.print(item.getfName() + "\t\t ");
			System.out.print(item.getlName().hashCode() + "\t ");
			System.out.print(item.getlName() + "\n");
		}
	}
}
