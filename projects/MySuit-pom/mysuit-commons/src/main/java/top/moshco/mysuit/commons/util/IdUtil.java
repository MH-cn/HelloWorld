package top.moshco.mysuit.commons.util;

import java.util.Random;
import java.util.UUID;

/**
 * ID生成的工具
 * 
 * 
 * 创建时间：2019年11月18日 下午2:26:54
 * @author moshco zhu
 *
 */
public class IdUtil {

	/**
	 * 小写uuid
	 */
	public static String genUUID() {
		return UUID.randomUUID().toString().replace("-", "").toLowerCase();
	}
	 /**
     * 图片名生成
     */
    public static String getImageName() {
        //取当前时间的长整形值包含毫秒
        long millis = System.currentTimeMillis();
        //long millis = System.nanoTime();
        //加上三位随机数
        Random random = new Random();
        int end3 = random.nextInt(999);
        //如果不足三位前面补0
        String str = millis + String.format("%03d", end3);
        
        return str;
    }
    
    /**
     * 商品id生成
     */
    public static long getItemId() {
        //取当前时间的长整形值包含毫秒
        long millis = System.currentTimeMillis();
        //long millis = System.nanoTime();
        //加上两位随机数
        Random random = new Random();
        int end2 = random.nextInt(99);
        //如果不足两位前面补0
        String str = millis + String.format("%02d", end2);
        long id = new Long(str);
        return id;
    }
    
    
    public static void main(String[] args) {
    	for(int i=0;i<13;i++) {
    		System.out.println(genUUID());
    	}
	}
}
