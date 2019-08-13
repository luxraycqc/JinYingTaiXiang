package org.jinyingtaixiang.utils;

import java.util.UUID;

public class IDUtil {
	static final SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);

	public static long getId() {
		return idWorker.nextId();
	}

	public static String getOrderIdByUUId(final String machineId) {
		int hashCodeV = UUID.randomUUID().toString().hashCode();
		if (hashCodeV < 0) {// 有可能是负数
			hashCodeV = -hashCodeV;
		}
		// 0 代表前面补充0
		// 4 代表长度为4
		// d 代表参数为正数型
		final String orderId = machineId + String.format("%015d", hashCodeV);
		return orderId;
	}

}
