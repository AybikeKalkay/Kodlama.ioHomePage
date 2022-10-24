package kodlama.ioHomePage.dataAccess.Tutor;

import kodlama.ioHomePage.entities.Tutor;

public interface TutorDao {
	void add (Tutor tutor);
	
	void delete (Tutor tutor);
	
	void update(Tutor tutor);

}
