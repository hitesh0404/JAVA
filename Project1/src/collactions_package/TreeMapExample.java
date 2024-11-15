package collactions_package;

import java.util.TreeMap;

public class TreeMapExample {

	public TreeMapExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	TreeMap<Integer,String> treeMap = new TreeMap<Integer, String>((i1,i2)->i2-i1);
	treeMap.put(101, "hello");
	treeMap.put(102, null);
	treeMap.put(10, "World");
	treeMap.put(102, "universe");
	System.out.println(treeMap);
	
	System.out.println(treeMap.higherEntry(101));
	System.out.println(treeMap.lowerKey(10));
	System.out.println(treeMap.ceilingKey(9));
	System.out.println(treeMap.floorKey(103));
	System.out.println(treeMap.ceilingEntry(9));
	System.out.println(treeMap.floorEntry(102));
	System.out.println(treeMap);
	System.out.println(treeMap.headMap(10,true));	
	System.out.println(treeMap.headMap(10));
	System.out.println(treeMap.tailMap(101,false));
	System.out.println(treeMap.tailMap(101));
	System.out.println(treeMap.subMap(102,10));
	System.out.println(treeMap.firstKey()+" "+treeMap.firstEntry());
	System.out.println(treeMap.lastKey()+" "+treeMap.lastEntry());
	System.out.println(treeMap.subMap(102,10).pollFirstEntry());	
	System.out.println(treeMap);
	}

}
