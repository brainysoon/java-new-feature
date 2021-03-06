package cn.school.thoughtworks.util;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static cn.school.thoughtworks.constant.GlobalConstants.NUMBER_SEPARATOR;

public class CountUtils {

    public static Map<String, Integer> countItemOf(List<String> itemList) {
        return itemList.stream().collect(Collectors.groupingBy(String::toString,
                Collectors.reducing(0, item -> 1, Integer::sum)));
    }

    public static Map<String, Integer> countItemWithNumberOf(List<String> itemList) {
        return itemList.stream().collect(Collectors.groupingBy(item -> item.split(NUMBER_SEPARATOR)[0],
                Collectors.reducing(0, item -> {
                    if (item.contains(NUMBER_SEPARATOR)) {
                        return Integer.parseInt(item.split(NUMBER_SEPARATOR)[1]);
                    }
                    return 1;
                }, Integer::sum)));
    }
}
