
public class BackPackCompanyIterator implements Container {

	String backPackTypes[] = { "Travel Backpack", "Cycling Backpack", "Climbing Backpack"  };

	@Override
	public Iterator getIterator() {

		return new BackpackIterator();
	}

	private class BackpackIterator implements Iterator {
		int i;

		
		@Override
		public Object next() {
			if (this.hasNext()) {
				return backPackTypes[i++];
			}
			return null;
		}
		
		@Override
		public boolean hasNext() {
			if (i < backPackTypes.length) {
				return true;
			}
			return false;
		}

		
	}

}
