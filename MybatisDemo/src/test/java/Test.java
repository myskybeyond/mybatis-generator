import com.mybatis.db.DbUtil;
import org.apache.ibatis.session.SqlSessionFactory;

public class Test {
    @org.junit.Test
    public void testDb(){
       SqlSessionFactory dbf = DbUtil.getSqlSessionFactory();
       System.out.println(dbf);
    }
}
