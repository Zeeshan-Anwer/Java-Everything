package com.training.Collection;
import java.util.Comparator;
public class PopulationComparator  implements Comparator<Country>{

	public int compare(Country c1,Country c2) {
		if(c1.Population==c2.Population)
			return 0;
		else if(c1.Population>c2.Population)
			return 1;
		else
			return -1;
	}


}
