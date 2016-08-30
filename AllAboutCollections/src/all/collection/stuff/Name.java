package all.collection.stuff;

public class Name implements Comparable<Name> {

	private String fName;
	private String lName;

	public Name(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Name)) {
			return false;
		}

		Name n = (Name) o;

		return n.fName.equals(fName) && n.lName.equals(lName);
	}

	@Override
	public int compareTo(Name n) {
		int cmp = lName.compareTo(n.lName);
		return (cmp != 0 ? cmp : fName.compareTo(n.fName));
	}
}
