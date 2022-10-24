package kodlama.ioHomePage.dataAccess.Category;

import kodlama.ioHomePage.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category Category) {
		System.out.println("Added to database with JDBC");
		
	}

	@Override
	public void delete(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		
	}

}
