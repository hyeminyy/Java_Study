package hashmap;

import java.util.Hashtable;
import java.util.Iterator;

import java.util.Map;

public class Test03 {
	public static void main(String[] args) {
		Hashtable<String, String> dic = new Hashtable<String, String>();
		
		dic.put("고진감래", "고생 끝에 즐거움이 옴");
		dic.put("분골쇄신", "몸이 부서질정도로 노력을 다 함");
		dic.put("권토중래", "실패를 발판 삼아 재기함");
		dic.put("교학상자", "가르치고 배우면서 서로 성장함");
		//dic.put(null, null);
		//방법1
		Iterator<String> keys = dic.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("%s : %s",key, dic.get(key)));
		}
		System.out.println("--------------------------------------");
		//방법2
//		for(Map.entry<String,String> elem : dic.entrySet()) {
//			System.out.println("%s : %s", key, dic.get(key));
//		}
		
		//방법3
		for(String key : dic.keySet()) {
			System.out.println(String.format("%s : %s",key, dic.get(key)));
		}
		
	}
}
