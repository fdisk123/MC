package com.ben.mc.classprocessing;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ClassProcessingFactory<C> {

	public static final String Impl = "$MC_IMPL";

	public static final String FULL_NAME_BEAN = "$FULL_NAME_BEAN";
	public static final String NICK_NAME_BEAN = "$NICK_NAME_BEAN";

	public static final String SHORT_NAME_BEAN = "$SHORT_NAME_BEAN";

	public static final String REGISTER_CACHE = "REGISTER_CACHE";
	public static final String AUTO_LOAD_CACHE = "AUTO_LOAD_CACHE";
	public static final String NICK_NAME_CACHE = "NICK_NAME_CACHE";
	public static final String SHORT_NAME_CACHE = "SHORT_NAME_CACHE";
	public static final String CLASS_INFO_CACHE = "$CLASS_INFO_CACHE";

	Map<String, C> getCompleteClass(Set<String> clazzs, List<String> xmlAppendList) throws Throwable;

}
