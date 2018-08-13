package com.bocom.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bocom.bean.Dept;
import com.bocom.bean.Emp;
import com.bocom.bean.NoteBook;
import com.bocom.dao.DeptDao;
import com.bocom.dao.NoteBookDao;
import com.bocom.dao.mapper.DeptMapper;
import com.bocom.dao.mapper.EmpMapper;

public class TestCase {
	/**
	 * ApplicationContext实例
	 * 	不同的实现有不同的子实现类，如ClassPathXmlApplicationContext、FileSystemXmlApplicationContext、AnnotationConfigApplicationContext、
	 * WebApplicationContext等
	 */
	ApplicationContext ctx = null;
	
	/**
	 * 测试通过Spring获取SqlSessionBean，该处获得的为org.apache.ibatis.session.defaults.DefaultSqlSession
	 * 该类实现了SqlSessionBean接口
	 * 执行JDBC操作
	 * DefaultSqlSession的selectList(arg0)方法，可以通过完全限定名的方式定位配置文件中的SQL语句
	 * 即Namespace + operateName（命名空间 + 操作名）
	 */
	@Test
	public void testGetSession(){
		String cfg = "applicationContext-beans.xml";
		ctx = new ClassPathXmlApplicationContext(cfg);
		SqlSession session = ctx.getBean("sqlSession", SqlSession.class);
		System.out.println(session);
		List<NoteBook> list = session.selectList("CN_NOOTBOOK_MAPPING.findNotebooks");
//		List<NoteBook> list = session.selectList("findNotebooks");
		System.out.println("===================>	"+list);
		for(NoteBook book:list){
			System.out.println("===================>	"+book.getCnNotebookName());
		}
		session.close();
	}
	
	/**
	 * 测试模糊查询
	 */
	@Test
	public void test模糊查询(){
		String cfg = "applicationContext-beans.xml";
		ctx = new ClassPathXmlApplicationContext(cfg);
		SqlSession session = ctx.getBean("sqlSession",SqlSession.class);
		System.out.println(session);
		Map<String, Object> paraMap = new HashMap<String, Object>();
		paraMap.put("cnNotebookName","逗比");
		List<NoteBook> list = session.selectList("CN_NOOTBOOK_MAPPING.findNotebookListByName",paraMap);
		System.out.println("===================>	"+list);
		for(NoteBook book:list){
			System.out.println("===================>	cnNotebookName："+book.getCnNotebookName());
		}
		session.close();
	}
	
	/**
	 * 使用<bean/>标签实例化容器中注册的bean
	 * 配置文件中：
	 * 	<bean id="empMapper" class="org.mybatis.spring.mapper.MapperFactoryBean">  
	 *		<property name="mapperInterface" value="com.bocom.dao.mapper.EmpMapper"/>
	 *		<property name="sqlSessionFactory" ref="sqlSessionFactory"/>             
	 *	</bean>
	 * 注册了id="empMapper"的bean，Spring在初始化完成之后，会根据该配置将该bean实例化，获得EmpMapper接口的实例                  
	 */
	@Test
	public void testGetMapper(){
		String cfg = "applicationContext-beans.xml";
		ctx = new ClassPathXmlApplicationContext(cfg);
		EmpMapper mapper = ctx.getBean("empMapper", EmpMapper.class);
		List<Emp> list = mapper.queryEmpList();
		System.out.println("===================>	"+list);
		System.out.println("===================>	编号\tName");
		for(Emp emp:list){
			System.out.println("===================>	"+emp.getEmpno()+"\t"+emp.getEname());
		}
		
	}
	
	/**
	 * 配置MapperScannnerConfigurer扫描指定包下加了指定注解的Mapper接口，并生成对应的Mapper接口实例
	 * 
	 * 参见配置文件：
	 * 	<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
	 *		<property name="basePackage" value="com.bocom.dao.mapper"/>
	 *		<property name="annotationClass" value="com.bocom.annotation.MyBatisRepository"/>
	 *  </bean>
	 * 使用此功能之后，则无需再applicationContext-mapperScanConfigurer.xml中再配置如下代码：
	 * 	<bean id="deptMapper" class="org.mybatis.spring.mapper.MapperFactoryBean">
	 *		<property name="mapperInterface" value="com.bocom.dao.mapper.DeptMapper"/>
	 *		<property name="sqlSessionFactory" ref="sqlSessionFactory"/>
	 *	</bean>
	 * Spring会自动扫描加了@MyBatisRepository注解的接口，生成对应的Mapper接口实例
	 */
	@Test
	public void testScanAnnotationGetMapper(){
		String cfg = "applicationContext-mapperScanConfigurer.xml";
		ctx = new ClassPathXmlApplicationContext(cfg);
		DeptMapper mapper = ctx.getBean("deptMapper",DeptMapper.class);
		List<Dept> list = mapper.queryDeptList();
		System.out.println("===================>	"+list);
		for(Dept dept:list){
			System.out.println("===================>	"+dept);
		}
	}
	
	/**
	 * Spring通过自动注解扫描功能，将加了指定注解的对象注册到Spring容器中并激活（实例化）这些bean对象
	 * 配置文件中加上context标签：
	 * 	<context:component-scan base-package="com.bocom.dao"/>
	 * 扫描指定包下加了如下注解的bean，注册并初始化bean实例
	 * 常见的注解：@Component通用注解、@Name通用注解、@Repository持久层组件注解、@Service业务层组件注解、@Controller控制层组件注解
	 * 	-- @Repository
	 *	-- public class DeptDaoImpl implements DeptDao {
	 *	--		...
	 *	-- }
	 * 		DeptDaoImpl类上加了@Repository注解，容器会注册并生成该类的实例（配置文件中并没有显示注册该bean）
	 */
	@Test
	public void testContextComponentScan(){
		String cfg = "applicationContext-componentScan.xml";
		ctx = new ClassPathXmlApplicationContext(cfg);
		DeptDao dao = ctx.getBean("deptDaoImpl", DeptDao.class);
		List<Dept> list = dao.queryDeptList();
		System.out.println("===================>	"+list);
		for(Dept dept:list){
			System.out.println(dept);
		}
	}
	
	/**
	 * 接上例
	 * 测试Mybatis通过SqlSessionTemplate实例编程
	 * 	class SqlSessionTemplate实现了SqlSession接口，调用其selectList(arg0)方法
	 * 可以通过完全限定名的方式定位配置文件中的SQL语句
	 */
	@Test
	public void testTemplateFindNoteBooks(){
		String cfg = "applicationContext-componentScan.xml";
		ctx = new ClassPathXmlApplicationContext(cfg);
		NoteBookDao dao = ctx.getBean("noteBookDaoImpl", NoteBookDao.class);
		List<NoteBook> list = dao.queryNoteBookList();
		System.out.println("===================>	"+list);
		for(NoteBook noteBook:list){
			System.out.println("===================>	"+noteBook.getCnNotebookName());
		}
	}
}
