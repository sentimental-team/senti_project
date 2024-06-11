package org.doit.senti.mapper;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.doit.senti.domain.user.ReviewVO;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewMapper {

	// 상품 아이디로 리뷰 목록 List
	public List<ReviewVO> getReviews(int pd_id) throws ClassNotFoundException, SQLException;
	
	// 상품 아이디로 리뷰 갯수
	public int reviewCount(int pd_id) throws ClassNotFoundException, SQLException;
	
	// 리뷰 작성
	public int reviewInsert(ReviewVO review) throws ClassNotFoundException, SQLException;
	
	// 리뷰 수정
	public int reviewUpdate(ReviewVO review)throws ClassNotFoundException, SQLException;
	
	// 리뷰 삭제
	public int reviewDelete(int pd_id)throws ClassNotFoundException, SQLException;
	
}
