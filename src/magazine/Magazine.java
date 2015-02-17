package magazine;

public class Magazine extends Goods{

	TypeOfProducts type;
	protected String issueNumber;
	
	public Magazine() {
		
	}

	public TypeOfProducts getType() {
		return type;
	}

	public void setType(TypeOfProducts type) {
		this.type = type;
	}

	public String getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(String issueNumber) {
		this.issueNumber = issueNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product) {
			Product p = (Product) obj;
			if (name != null && name.equals(p.name) && type != null
					&& type.equals(p.type)) {
				return true;
			}
		}
		return false;
	}
	
}
