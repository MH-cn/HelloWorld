/**
 * 
 * 
 * 创建时间：2019年5月20日 上午11:50:06
 * @author：moshco zhu
 */
package top.moshco.mysuit.commons;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 公共定时任务
 * 
 * 创建时间：2019年5月20日 上午11:50:06
 * 
 * @author moshco zhu
 * 
 */
@Component
public class CommonsScheduledTask implements Serializable {

	// 日志对象
	private final static Logger logger = Logger.getLogger(CommonsScheduledTask.class);

	/**
	 * 注解详解
	 * 
	 * @Scheduled cron参数 * * * * * * ：分别对应，秒、分、时、日、月、年
	 * @Scheduled 0 0 10,14,16 * * ? ：每天上午10点，下午2点，4点 ，逗号之间连接起来算一个
	 * @Scheduled 0 0 12 * * ? ：每天中午12点触发
	 * @Scheduled 0 0/5 0 * * ? ：每5分钟执行一次
	 * @Scheduled 0 10,14,16 * * ? 每天上午10点，下午2点，4点
	 * @Scheduled 0/30 9-17 * * ? 朝九晚五工作时间内每半小时
	 * @Scheduled 0 12 ? * WED 表示每个星期三中午12点
	 * @Scheduled "0 0 12 * * ?" 每天中午12点触发
	 * @Scheduled "0 * 14 * * ?" 在每天下午2点到下午2:59期间的每1分钟触发
	 * @Scheduled "0 0/5 14 * * ?" 在每天下午2点到下午2:55期间的每5分钟触发
	 * @Scheduled "0 0/5 14,18 * * ?" 在每天下午2点到2:55期间和下午6点到6:55期间的每5分钟触发
	 * @Scheduled "0 0-5 14 * * ?" 在每天下午2点到下午2:05期间的每1分钟触发
	 * @Scheduled "0 10,44 14 ? 3 WED" 每年三月的星期三的下午2:10和2:44触发
	 * @Scheduled "0 15 10 ? * MON-FRI" 周一至周五的上午10:15触发
	 * @Scheduled "0 15 10 15 * ?" 每月15日上午10:15触发
	 * @Scheduled "0 15 10 L * ?" 每月最后一日的上午10:15触发
	 * @Scheduled "0 15 10 ? * 6L" 每月的最后一个星期五上午10:15触发
	 * @Scheduled "0 15 10 ? * 6L 2002-2005" 2002年至2005年的每月的最后一个星期五上午10:15触发
	 * @Scheduled "0 15 10 ? * 6#3" 每月的第三个星期五上午10:15触发
	 * @Scheduled "0 15 10 ? * *" 每天上午10:15触发
	 * @Scheduled "0 15 10 * * ?" 每天上午10:15触发
	 * @Scheduled "0 15 10 * * ? *" 每天上午10:15触发
	 * @Scheduled "0 15 10 * * ? 2005" 2005年的每天上午10:15触发
	 * 
	 * @Scheduled fixedRate 上一次 启动时间点之后X秒执行一次，单位毫秒
	 * @Scheduled(fixedRate = 6000) ：上一次开始执行时间点之后6秒再执行
	 * 
	 * @Scheduled fixedDelay 上一次结束时间点之后每X秒执行一次，单位毫秒
	 * @Scheduled(fixedDelay = 6000) ：上一次执行完毕时间点之后6秒再执行
	 * 
	 * @Scheduled initialDelay 第一次延迟X秒执行，之后按照fixedRate的规则每X秒执行，单位毫秒
	 * @Scheduled(initialDelay=1000, fixedRate=6000)：第一次延迟1秒后执行，之后按fixedRate的规则每6秒执行一次
	 * 
	 */

	/**
	 * 每一天会执行一次
	 * 
	 * 
	 * 开发时间：2019年5月20日 上午10:53:27
	 * 
	 * @author：moshco zhu
	 */
	@Scheduled(cron = "0 0 2 1/1 * ?")
	public void perDay() {

		logger.info("每天会执行一次......");

	}

}
