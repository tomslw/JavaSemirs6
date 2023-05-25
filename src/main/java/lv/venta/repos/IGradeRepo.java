package lv.venta.repos;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import lv.venta.models.Grade;

public interface IGradeRepo extends CrudRepository<Grade, Long> {

	ArrayList<Grade> findByStudentIdp(long id);

	ArrayList<Grade> findByCourseIdc(long id);

//	@Query(value = "SELECT AVG(Gvalue) FROM grade_table WHERE Idc =?1")
//	float myCalculateAVGGradeByCourseId(long id);
}
