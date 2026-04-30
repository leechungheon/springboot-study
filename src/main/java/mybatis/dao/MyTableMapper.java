package mybatis.dao;

import com.example.springedu.domain.MyTableDTO;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MyTableMapper {

  @Select("select my_name, my_age from my_table")
  public List<MyTableDTO> list();

  @Insert("insert into my_table values (#{myName}, #{myAge})")
  public boolean insert(MyTableDTO visitor); // df
}
