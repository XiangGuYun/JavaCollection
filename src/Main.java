import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.text.RuleBasedCollator;
import java.util.*;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        /*
        数组和集合的相互转换
         */
        String[] fruits = {"苹果","香蕉","橘子","西瓜","柠檬"};
        //数组转集合
        List<String> fruitList = Arrays.asList(fruits);
        //集合转数组
        String[] arr = (String[]) fruitList.toArray();
        for (String f:arr
             ) {
            System.out.println(f);
        }

        /*
        集合比较
         */
        //比较最小值和最大值
        int[] nums = {1,3,4,9,4,2,1};
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        System.out.println("最小值是"+Collections.min(set));
        System.out.println("最大值是"+Collections.max(set));
        //比较字符串长短
        String[] arr2 = {"打算大奥所大所多","大大","大声道群奥大叔大婶大所大所"};
        Set<String> set2 = new TreeSet<>();
        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }
        System.out.println("长度最短的字符串是："+Collections.min(set2,
                Comparator.comparing(s -> s.length())));
        System.out.println("长度最长的字符串是："+Collections.max(set2,
                Comparator.comparing(s -> s.length())));

        /*
        遍历HashMap
         */
        Map<String,String> map = new HashMap<>();
        map.put("1", "1st");
        map.put("2", "2nd");
        map.put("3", "3rd");
        //遍历键
        Set<String> stringSet = map.keySet();
        for (String str:stringSet
             ) {
            System.out.println("map's key "+str);
        }
        //遍历值
        Iterator iterator = map.values().iterator();
        while (iterator.hasNext()){
            System.out.println("map's value "+iterator.next());
        }

        /*
        集合的遍历
         */
        //第一种：遍历器hasNext()和next()
        //第二种：foreach循环
        //第三种：fori循环

        /*
        集合的反转
         */
        Collections.reverse(fruitList);
        for (int i = 0; i < fruitList.size(); i++) {
            System.out.println("反转测试："+fruitList.get(i));
        }

        /*
        删除集合中的指定元素
         */
        //List不支持remove(Object obj)操作
        List<String> dltList = new ArrayList<>();
        dltList.add("666");
        dltList.add("dsdsd");
        dltList.add("难过");
//        dltList.remove("666");
//        for (int i = 0; i < dltList.size(); i++) {
//            System.out.println("测试："+dltList.get(i));
//        }
        dltList.remove(0);
        for (int i = 0; i < dltList.size(); i++) {
            System.out.println("测试："+dltList.get(i));
        }

        /*
        循环移动元素
         */
        List list = Arrays.asList("one Two three Four five six".split(" "));
        System.out.println("List :"+list);
        Collections.rotate(list, 3);
        System.out.println("rotate: " + list);

        /*
        HashTable的遍历
         */
        Hashtable ht = new Hashtable();
        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");
        Enumeration e = ht.elements();
        while(e.hasMoreElements()){
            System.out.println("table："+e.nextElement());
        }

        /*
        List元素的替换
         */
        List replaceList = Arrays.asList("one Two three Four five six one three Four".split(" "));
        Collections.replaceAll(replaceList,"one","@");
        System.out.println("replace："+replaceList);

        /*
        List的截取
         */
        List cutList = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println("List :"+cutList);
        List sublist = Arrays.asList("three Four".split(" "));
        System.out.println("子列表 :"+sublist);
        System.out.println("indexOfSubList: "
                + Collections.indexOfSubList(cutList, sublist));
        System.out.println("lastIndexOfSubList: "
                + Collections.lastIndexOfSubList(cutList, sublist));

        /*
        List的排序
         */
        List<Integer> listForSort = Arrays.asList(9,2,4,6,1,3,8,7);
        Collections.sort(listForSort);
        System.out.println("排序结果："+listForSort);//默认从小到大
        Collections.reverse(listForSort);
        System.out.println("排序结果："+listForSort);

        List<Character> listForSort1 = Arrays.asList('c','g','a');
        Collections.sort(listForSort1);
        System.out.println("排序结果："+listForSort1);//默认从小到大
        Collections.reverse(listForSort1);
        System.out.println("排序结果："+listForSort1);

        boolean result = Collections.disjoint(listForSort1, listForSort1);
        System.out.println(result+" "+listForSort1);
    }

}
