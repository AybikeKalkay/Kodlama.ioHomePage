package kodlama.ioHomePage.dataAccess.Category;

import kodlama.ioHomePage.entities.Category;

public interface CategoryDao {
	void add (Category Category);
	
	void delete (Category category);
	
	void update(Category category);

}
