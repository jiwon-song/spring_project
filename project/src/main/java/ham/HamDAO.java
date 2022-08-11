package ham;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import hong.ClassListVO;

@Repository
public class HamDAO {
	@Autowired @Qualifier("bteam")private SqlSession sql;

	public List<HamHomeworkVO> homework_list(int class_id, String teacher_id) {
		if(class_id==0) {
			return sql.selectList("ham.mapper.homeworklistall", teacher_id);
		}else {
			return sql.selectList("ham.mapper.homeworklist", class_id);
		}
	}
	
	//과제 추가하기
	public void homework_insert(HamHomeworkVO vo) {
		sql.insert("ham.mapper.homeworkinsert", vo);
	}
	
	//과제 삭제하기
	public void homework_delete(int homework_id) {
		sql.delete("ham.mapper.homeworkdelete", homework_id);
	}

	public void homework_updeat(HamHomeworkVO vo) {
		sql.update("ham.mapper.homeworkupdate", vo);
		
	}

	public List<ClassListVO> class_list(String teacher_id) {
		return sql.selectList("ham.mapper.classlist", teacher_id);
	}

	public List<HomeworkDetailVO> homework_detail(int homework_id) {
		return sql.selectList("ham.mapper.hdlist", homework_id);
	}

	public HamHomeworkVO homework_id(int homework_id) {
		return sql.selectOne("ham.mapper.homeworkid", homework_id);
	}
	
	
}
