import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lists {


	List<String> strList = null;
	Set<String> strSet = null;
	Map<Integer, String> strIntMap = null; 
	//constructor
	public Lists() {
		
		strList = new ArrayList<String>(20);
		strSet = new HashSet<String>(20);
		strIntMap = new HashMap<Integer, String>();
		init();
	}
	
	private void init() {
		
		strList.add("Hello");
		strList.add("Hello");
		strList.add("World");
		
		strSet.add("Hello");
		strSet.add("Hello");
		strSet.add("World");
		
		strIntMap.put(10, "Hello");
		strIntMap.put(10, "new Hello");
		strIntMap.put(20, "World");
		strIntMap.put(30, "extra");
	}
	
	public String getListElem(int index) {
		
		if( index >= strList.size()) return null;
		
		return strList.get(index);
	}
	
	public boolean isListPresent(String val) {
		
		if ( val == null) return false;
		return strList.contains(val);
	}
	
	
	public boolean remove(String val) {
		if ( val == null) return false;
		return strList.remove(val);
	}
	//set
	
	public String getSetElem(int index) {
		if( index >= strSet.size()) return null;

		Iterator<String> it = strSet.iterator();
		int x = 0;
		while (it.hasNext()) {
			if( x++ == index) 
				return it.next();
			
			it.next();
			
		}
		
		return null;
	}
	
	public boolean removeSet(String val) {
		
		if( val == null) return false;
		
		return strSet.remove(val);
	}
	
	public boolean isSetPresent(String val) {
		if( val == null) return false;
		
		return strSet.contains(val);
	}
	
	// map
	
	public Set<Integer> getMapKeys(){
		return strIntMap.keySet();
	}
	
	
	public Collection<String> getMapValues(){
		return strIntMap.values();
	}
	
	public String loopPrint() {
		StringBuilder sb = new StringBuilder();
		
		Set<Integer> keys = getMapKeys();
		Iterator  it = keys.iterator();
		
		while(it.hasNext()) {
			Integer key =(Integer) it.next();
			String  val = strIntMap.get(key);
			sb.append(key + " --->" + val + "\n");
		//	Map.Entry entry = (Map.Entry) it.next();
		//	sb.append(entry.getKey() + " -->"+ entry.getValue()+ "\n");
		}
		return sb.toString();
		
	}
	
	public String getMapValue(Integer key) {
		 if(key == null || !strIntMap.containsKey(key))
			return null;
			return strIntMap.get(key);
	}
	
	public boolean removeGetMapKey(Integer key) {
		if (key == null) return false;
		
		return strIntMap.remove(key) != null ;
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("List: " + strList.toString() + "\n");
		sb.append("set: " + strSet.toString() + "\n");
		
		sb.append("map: " + strIntMap.toString() + "\n");
		
		return sb.toString();
	}
	
	
	

	public static void main(String[] args) {
		
		
		
		Lists l = new Lists();
		System.out.println(l.toString());
		//LIST
		System.out.println(" elem 2:" + l.getListElem(2));
		System.out.println("is \"Hello\"  present: " + l.isListPresent("Hello") );
		System.out.println("is \"Hello\"  present: " + l.isListPresent("Hello") );
		System.out.println("\n\n");
		System.out.println("remove \"Hello\"  present: " + l.isListPresent("Hello") );
		System.out.println("is \"Hello\"  present: " + l.isListPresent("Hello") );
		
		System.out.println("\n\n");
		System.out.println(l.toString());
		
		System.out.println("\n\n");
		
		//SET
		System.out.println("elem 1: "+ l.getListElem(1));
		System.out.println("is \"Hello\" present: " + l.remove("Hello"));
		System.out.println("remove \"Hello\": " + l.removeSet("Hello"));
		System.out.println("remove \"Hello\": " + l.removeSet("Hello"));
		System.out.println(l.toString());
		
		System.out.println("\n\n");
		
		//MAp
		System.out.println("set of keys: "+ l.getMapKeys());
		System.out.println("Collectio of values: "+ l.getMapValues());
		System.out.println("Element of loop: "+ l.loopPrint());
		System.out.println("20 : "+ l.getMapValue(20));
		
		System.out.println("\n\n");
		System.out.println(l.toString());
		System.out.println("remove of 20: "+ l.removeGetMapKey(20));
		System.out.println("remove of 20: "+ l.removeGetMapKey(20));
		System.out.println(l.toString());
		
	}

}
