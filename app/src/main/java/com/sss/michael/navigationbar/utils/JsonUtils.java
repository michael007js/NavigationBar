package com.sss.michael.navigationbar.utils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Michael by Administrator
 * @date 2022/12/29 11:31
 * @Description json操作类
 */
public class JsonUtils {

    /**
     * 将对象转成字符串
     */
    public static <T> String formatToJsonString(T t) {
        return new Gson().toJson(t);
    }

    /**
     * 将字符串转换成复杂列表
     */
    public static <T> T formatToObject(String json, Class<T> cls) {
        if (EmptyUtils.isEmpty(json)) {
            return null;
        }
        Gson gson = new Gson();
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        return gson.fromJson(jsonObject, cls);

    }

    /**
     * 将复杂列表转换成字符串（因为路由框架无法使用putParcelableArrayList方法）
     */
    public static <T> String formatToJsonString(List<T> list) {
        return new Gson().toJson(list);
    }

    /**
     * 将字符串转换成复杂列表（因为路由框架无法使用putParcelableArrayList方法）非基本数据类型
     */
    public static <T> List<T> formatToList(String json, Class<T> cls) {
        List<T> list = new ArrayList<>();
        Gson gson = new Gson();
        JsonArray jsonArray = JsonParser.parseString(json).getAsJsonArray();
        for (JsonElement jsonElement : jsonArray) {
            list.add(gson.fromJson(jsonElement, cls));
        }
        return list;
    }

    /**
     * 将字符串转换成复杂列表（因为路由框架无法使用putParcelableArrayList方法）基本数据类型
     */
    public static <T> List<T> formatToList2(String json, Class cls) {
        Type type = new ParameterizedTypeImpl(cls);
        List<T> list = new Gson().fromJson(json, type);
        return list == null ? new ArrayList<T>() : list;
    }

    public static class ParameterizedTypeImpl implements ParameterizedType {
        Class clazz;

        public ParameterizedTypeImpl(Class clz) {
            clazz = clz;
        }

        @Override
        public Type[] getActualTypeArguments() {
            return new Type[]{clazz};
        }

        @Override
        public Type getRawType() {
            return List.class;
        }

        @Override
        public Type getOwnerType() {
            return null;
        }
    }
}
