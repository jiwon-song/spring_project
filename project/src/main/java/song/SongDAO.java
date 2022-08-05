package song;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


@Repository
public class SongDAO {
	@Autowired @Qualifier("bteam") private SqlSession sql;

	public List<ClassVO> class_list() {
		return sql.selectList("song.mapper.classlist");
	}

	public List<StudentListVO> student_list(int class_id) {
		return sql.selectList("song.mapper.studentlist", class_id);
	}

	public StudentListVO stu_detail(String student_id) {
		return sql.selectOne("song.mapper.studetail", student_id);
	}

	public SongHomeworkVO stu_hw_detail(String student_id) {
		return sql.selectOne("song.mapper.stuhwdetail", student_id);
	}
	
	
}
