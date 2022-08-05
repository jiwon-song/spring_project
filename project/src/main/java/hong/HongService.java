package hong;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HongService {
	
	@Autowired private HongDAO dao;

	// 반목록 가져오기
	public List<ClassListVO> class_list(String teacher_id) {
		return dao.class_list(teacher_id);		
	}

	// 테스트 목록 가져오기
	public List<TestVO> test_list(int class_id, String teacher_id) {	
		return dao.test_list(class_id, teacher_id);
	}

	// 테스트 추가하기
	public void test_insert(TestVO vo) {
		dao.test_insert(vo);		
	}

	// 테스트 삭제하기
	public void test_delete(int test_id) {
		dao.test_delete(test_id);
		
	}

	public void test_update(TestVO vo) {
		dao.test_update(vo);
	}

	public List<TestDetailVO> test_detail(int test_id) {
		return dao.test_detail(test_id);
	}

	
	

}
