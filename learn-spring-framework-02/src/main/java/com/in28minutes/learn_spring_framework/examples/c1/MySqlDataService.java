package com.in28minutes.learn_spring_framework.examples.c1;

import org.springframework.stereotype.Repository;

//@Component
@Repository
class MySqlDataService implements DataService {
	public int[] retrieveData() {
		return new int[] {1, 2, 3, 4, 5};
	}
}
