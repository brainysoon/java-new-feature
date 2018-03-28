package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.util.CountUtils;
import cn.school.thoughtworks.util.DecreaseUtils;

import java.util.List;
import java.util.Map;

public class PracticeC {

    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {

        Map<String, Integer> collection3 = CountUtils.countItemOf(collectionA);

        DecreaseUtils.decreaseCountByEveryThreeTimesOf(collection3, object);
        return collection3;
    }
}
