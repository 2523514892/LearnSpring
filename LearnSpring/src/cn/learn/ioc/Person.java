package cn.learn.ioc;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private String name;
	private String[] arrs;
	private List<String> list;
	private Map<String,String> map;
	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public void setPropertites(Properties propertites) {
		this.propertites = propertites;
	}

	private Properties propertites;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void perSon(){
		System.out.println("pname......."+name);
		System.out.println("arrs..."+arrs);
		System.out.println("List...."+list);
		System.out.println("map....."+map);
		System.out.println("propertites...."+propertites);
	}
}
