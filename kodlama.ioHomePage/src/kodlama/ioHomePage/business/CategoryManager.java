package kodlama.ioHomePage.business;

import kodlama.ioHomePage.core.logging.category.LoggerCategory;
import kodlama.ioHomePage.dataAccess.Category.CategoryDao;
import kodlama.ioHomePage.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private LoggerCategory[] loggers1;
	
	Category[] categories = new Category {"Programlama", "Diğer", "Tümü"};	
	

	public CategoryManager(CategoryDao categoryDao, LoggerCategory[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers1 = loggers;
	}


	public void add(Category category) throws Exception {
		for (LoggerCategory logger : loggers1) {
			if(category.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Kategori ismi tekrar edemez.");
			}
			categoryDao.add(category);
		}
		
		for (LoggerCategory loggerCategory : loggers1) {
			loggerCategory.logCategory(category.getCategoryName());
		}
	
}
}
