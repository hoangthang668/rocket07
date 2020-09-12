-- bài 1: tạo store để ng dùng nhập vào tên phòng ban và in ra tất cả csc account thuộc phòng ban đó
DELIMITER $$
CREATE PROCEDURE prin( IN department_p VARCHAR(50))
BEGIN
	SELECT a.accountID,a.FullName
    FROM account a
	JOIN department d ON a.DepartmentID = d.DepartmentID
    WHERE DepartmentName = department_p;
END $$
DELIMITER ;
call prin('sale');
-- tạo store để đếm số lượng account trong mỗi group


DELIMITER $$
CREATE PROCEDURE COUNT_acc(IN groupX INT)
BEGIN
	SELECT AccountID, COUNT(accountID)
	FROM groupaccount
	WHERE GroupID = GroupX
	GROUP by GROUPID;
 END $$
 DELIMITER ;
CALL count_acc(5);
-- tạo store để thống kê mỗi type question có bn question đc tạo trong tháng
DELIMITER $$
CREATE PROCEDURE statistical()
BEGIN
	SELECT questionID,typeID, count(typeID)
    FROM question
    WHERE MONTH(createDAte) = MONTH(now());
	
 END $$
 DELIMITER ;
 CALL statistical();
-- bài 4,5: tạo store để tạo ra id của type qs có nhiều câu hỏi nhất
DELIMITER $$
CREATE PROCEDURE maxtype_qs()
BEGIN
	WITH maxType AS(
		SELECT count(typeID)
		FROM question
		GROUP BY typeID
		ORDER BY count(typeID) DESC
		LIMIT 1)
	SELECT tp.typeID,count(tp.typeID),tp.TypeName
	FROM question q
	JOIN typequestion tp
	 ON tp.typeID = q.typeID
	GROUP BY tp.typeID
		HAVING count(tp.typeID) = (SELECT * FROM maxType);
    END $$
    DELIMITER ;
    CALL maxtype_qs();
-- bài 6
DELIMITER $$
CREATE PROCEDURE like_gr(IN nhap VARCHAR(50))
BEGIN
SELECT groupName
FROM `group`
WHERE groupName LIKE nhap;
END $$
DELIMITER ;
CALL like_gr('VTI%')
-- bài 8

DROP PROCEDURE IF EXISTS maxcontent;
DELIMITER $$

CREATE PROCEDURE maxcontent(IN nhap VARCHAR(50))
BEGIN
	IF (nhap  = 'Essay'	) THEN 
							SELECT Content,(LENGTH(content))
                            FROM question
                            WHERE typeID=1;
   ELSEIF (nhap = 'multiple-choice') THEN
							SELECT Content,(LENGTH(content))
                            FROM question
                            WHERE typeID=2;
END IF;
END$$
DELIMITER ;						
CAll MAXCONTENT('ESSAY')    
     
-- bai 9     
DROP PROCEDURE IF EXISTS delete_exam;
DELIMITER $$
CREATE PROCEDURE delete_exam(IN nhap int)
BEGIN
	DELETE
    FROM exam
    WHERE examID= nhap;
END$$
DeLIMITER ;    
-- bai 10
DROP PROCEDURE IF EXISTS del3year;
DELIMITER $$
CREATE PROCEDURE del3year()
BEGIN
	-- WITH 3_year AS(
			-- SELECT examID
          --      FROM exam
            --    WHERE YEAR(CreateDate) <= '2017'
              --  )
	DELETE
    FROM exam
    WHERE examID = (SELECT examID
                FROM exam
                WHERE YEAR(CreateDate) <= '2017');
 END$$

 DELIMITER ;
  CALL  del3year();
 -- bai 11
 DROP PROCEDURE IF EXISTS delete_dep;
DELIMITER $$
CREATE PROCEDURE delete_dep(IN dep_name VARCHAR(50))
BEGIN
	DeleTe 
    FROM department
    WHERE departmentNAME = dep_name;
    UPDATE `ACCOUNT`
    SET DepartmentID = '11'
    WHERE DepartmentID = (select DepartmentID
						  FROM  department
                          WHERE DepartmentID = dep_name);
END$$
DELIMITER ;
CALL delete_dep('bảo vệ');