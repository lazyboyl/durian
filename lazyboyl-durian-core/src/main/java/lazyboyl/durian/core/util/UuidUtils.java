package lazyboyl.durian.core.util;

import java.util.UUID;

/**
 * UUID唯一主键生成工具类
 * @author caixx
 */
public class UuidUtils {

    /**
     * 获取主键uuid
     * @return uuid
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 获取随机的UUID字符串
     * @return uuid
     */
    public static String getRandomUuid() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().toLowerCase();
    }



}
