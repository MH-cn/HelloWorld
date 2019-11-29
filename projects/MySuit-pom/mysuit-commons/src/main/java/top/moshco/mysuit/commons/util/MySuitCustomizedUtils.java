/**
 * 
 * 
 * 创建时间：2019年5月22日 下午7:57:52
 * @author：moshco zhu
 */
package top.moshco.mysuit.commons.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.swing.UIManager;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import cn.moshco.hrt.StartUp;
import cn.moshco.hrt.frame.MessageAdapter;
import cn.moshco.hrt.frame.by_excel_doc.ExcelDocAnalysisContext;
import cn.moshco.hrt.frame.by_excel_doc.ExcelDocumentReverseGenerator;
import cn.moshco.hrt.frame.by_excel_doc.ExcelDocumentSettingBean;
import cn.moshco.hrt.frame.by_excel_doc.ExcelErrorMessage;
import cn.moshco.hrt.frame.by_excel_doc.ExecelDocumentSettingContainer;
import cn.moshco.hrt.utils.Utils;

/**
 * 我的套件 反向生成 定制工具
 * 
 * 
 * 创建时间：2019年11月18日 下午4:09:34
 * 
 * @author moshco zhu
 *
 */
public class MySuitCustomizedUtils implements Serializable {

	// 加载日志配置
	static {
		try {

			// BasicConfigurator.configure();
			// BasicConfigurator.resetConfiguration();

			// 读取日志属性配置
			Properties loggerProperties = new Properties();
			loggerProperties.load(StartUp.class.getResourceAsStream("/log4j.properties"));
			// 读取系统环境编码格式
			String encoding = System.getProperty("file.encoding");
			// 修改控制台的编码配置
			loggerProperties.setProperty("log4j.appender.console.encoding", encoding);
			// 加载属性配置
			PropertyConfigurator.configure(loggerProperties);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 日志对象
	protected final static Logger logger = Logger.getLogger(StartUp.class);

	static {
		try {

			logger.info("改变系统风格为：" + UIManager.getSystemLookAndFeelClassName());

			// 设置当前系统默认风格
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static {
		try {

			// 读取系统环境编码格式
			String encoding = System.getProperty("file.encoding");

			logger.info("改变控制台输出对象的编码格式为：" + encoding);

			// 控制台输出对象的编码格式
			OutputStream os = System.out;
			PrintStream ps = new PrintStream(os, true, encoding);
			System.setOut(ps);
			System.out.println("test:这是一段测试中文字符串。");

			logger.info("改变控制台错误对象的编码格式为：" + encoding);

			// 控制台错误对象的编码格式
			os = System.err;
			ps = new PrintStream(os, true, encoding);
			System.setErr(ps);
			System.err.println("test:这是一段测试中文字符串。");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 入口函数值
	 *
	 * 开发时间：2019年5月22日 下午7:57:52
	 * 
	 * @author：moshco zhu
	 * @param：args-传入的参数
	 * @return void
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			// 设置当前系统默认风格
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		String dbName = "mysuit";
		String dbUserName = "mysuit";
		String dbPassword = "mysuit12";
		String dbServerIp = "mysql.moshco.top";

		// Excel配置文件的路径
		String excelFilePath = "d:\\my_dev\\workspaces\\current_eclipse_201909\\MySuit-pom\\docs\\我的套件-数据库设计.xlsx";
		// 要分析的sheet名称
		String sheetName = "数据库设计";
		String outputRootFilePath = "d:\\my_dev\\workspaces\\current_eclipse_201909\\MySuit-pom";

		String outputSQLRootFilePath = "d:\\my_dev\\workspaces\\current_eclipse_201909\\MySuit-pom\\docs\\sql";

		// 数据库设计文档输入流
		FileInputStream fisExcelDod = null;
		try {

			// 数据库设计文档输入流
			fisExcelDod = new FileInputStream(excelFilePath);
			// 文档对象
			XSSFWorkbook book = new XSSFWorkbook(fisExcelDod);
			// 关闭文档资源
			fisExcelDod.close();
			fisExcelDod = null;

			// 读取指定的sheet
			XSSFSheet sheet = book.getSheet(sheetName);

			// 分析Excel文档
			ExcelDocAnalysisContext analysisContext = ExecelDocumentSettingContainer.analysisExcelDocument(sheet);

			// 无效的sheet
			if (analysisContext.getExcelDocumentConfigureBean() == null) {

				System.out.println("这是一个无效的sheet。");

				return;
			}

			// 数据库设计文档对象
			ExcelDocumentSettingBean configureBean = analysisContext.getExcelDocumentConfigureBean();

			// 错误信息列表
			List<ExcelErrorMessage> errorMessageList = analysisContext.getErrorMessageList();
			ExecelDocumentSettingContainer.outErrorMessage(errorMessageList);

			if (errorMessageList != null && errorMessageList.size() > 0) {
				return;
			}

			// 配置属性集合
			Map<String, String> configureAttributeMap = new HashMap<String, String>();
			// 项目类型
			configureAttributeMap.put("projectType", "dynamic_web"); // dynamic_web java
			// 项目模板
			configureAttributeMap.put("projectTemplate", "eclipse"); // eclipse myeclipse
			// 项目名称
			configureAttributeMap.put("projectName", "MySuit-commons"); // MySuit-commons
			// 开发人员
			configureAttributeMap.put("developer", "moshco zhu"); // moshco zhu
			// 开发时间
			String developTime = (new SimpleDateFormat("yyyy-MM-dd HH:mm")).format(new Date());
			configureAttributeMap.put("developTime", developTime);
			// 数据库类型
			configureAttributeMap.put("dataBaseType", "mysql");// mysql oracle
			// 数据库连接：服务器
			configureAttributeMap.put("dataBaseConnectionServer", dbServerIp);
			// 数据库连接：数据库
			configureAttributeMap.put("dataBaseConnectionDBName", dbName);
			// 数据库连接：帐号
			configureAttributeMap.put("dataBaseConnectionUserName", dbUserName);
			// 数据库连接：密码
			configureAttributeMap.put("dataBaseConnectionPassword", dbPassword);
			// 创建POJO
			configureAttributeMap.put("createPOJO", "true");// true false
			// 是否添加MongoDB的注解
			configureAttributeMap.put("addMongoDBAnn", "true");// true false
			// 创建resultMap
			configureAttributeMap.put("createResultMap", "true");// true false
			// 创建Dao类
			configureAttributeMap.put("createDaoClass", "true");// true false
			// 实体包名
			configureAttributeMap.put("entityBeanPackageName", "top.moshco.mysuit.commons.entity");

			// 是否是定制配置
			configureAttributeMap.put("customized", "true");

			// sql映射配置文件存储的路径（src以后）
			configureAttributeMap.put("sqlMapperXMLPackage", "main/resources/mappers");
			// Dao类所在的包
			configureAttributeMap.put("daoPackageName", "top.moshco.mysuit.commons.dao");
			// 源代码的路径
			configureAttributeMap.put("srcPath", "src/main/java");
			// Dao类名称
			configureAttributeMap.put("daoClassName", "MySuitBaseDao");
			// MyBatis SQL映射配置文件模版路径 hibernate mybatis
			configureAttributeMap.put("sqlMapperXMLTemplatePath",
					getTemplateRootPath("mybatis") + "/src/dao/DemoMapper.xml");
			// MyBatis SQL映射接口模版路径
			configureAttributeMap.put("sqlMapperClassTemplatePath",
					getTemplateRootPath("mybatis") + "/src/dao/DemoMapper.java");
			// 删除字段和表
			boolean dropTableColumn = true;

			// 项目输出的根路径
			File outputPathFile = new File(outputRootFilePath);

			// 消息的适配器
			MessageAdapter messageAdapter = new MessageAdapter(null, 0) {

				@Override
				public void showMessage(String message, boolean clear) {
					logger.info(message);
					System.out.println(message);
				}

				@Override
				public void showMessage(String message) {
					logger.info(message);
					System.out.println(message);
				}

			};

			// 创建反向生成器
			ExcelDocumentReverseGenerator generator = new ExcelDocumentReverseGenerator(configureBean);
			// 反向生成定制版MyBatis项目
			generator.exportCustomizedMyBatisProject(outputPathFile, configureAttributeMap, messageAdapter);
			// 反向生成定制版SQL
			generator.exportCustomizedSQL(new File(outputSQLRootFilePath), configureAttributeMap, messageAdapter);
			// 修改数据库表结构
			generator.modifyDBStructure(new File(outputSQLRootFilePath), configureAttributeMap, messageAdapter,
					dropTableColumn);

			messageAdapter.showMessage("完毕。");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fisExcelDod != null) {
					fisExcelDod.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	/**
	 * 读取模版的根路径
	 * 
	 * 
	 * 开发时间：2019年5月3日 下午1:18:12
	 * 
	 * @author：moshco zhu
	 * @param frameworkType
	 * @return
	 */
	protected static String getTemplateRootPath(String frameworkType) {
		// 模版项目的路径
		String templateProjectPath = Utils.getProjectRootPath();
		templateProjectPath = "E:\\my_workspaces\\all2\\HibernateReverseTools";
		if ("hibernate".equals(frameworkType)) {
			templateProjectPath += "/templates/HibernateDynamicWebTemplate";
		} else if ("mybatis".equals(frameworkType)) {
			templateProjectPath += "/templates/MyBatisDynamicWebTemplate";
		}
		try {
			templateProjectPath = URLDecoder.decode(templateProjectPath, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		if (templateProjectPath.startsWith("/")) {
			templateProjectPath = templateProjectPath.substring(1);
		}
		logger.info("模版代码所在路径：" + templateProjectPath);
		return templateProjectPath;
	}

}
