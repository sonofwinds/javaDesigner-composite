package test;

import service.Component2;
import service.impl.Composite2;
import service.impl.Leaf2;

public class Client2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		    Component2 root = new Composite2("服装");
	        Component2 c1 = new Composite2("男装");
	        Component2 c2 = new Composite2("女装");
	        
	        Component2 Leaf1 = new Leaf2("衬衫");
	        Component2 Leaf2 = new Leaf2("夹克");
	        Component2 Leaf3 = new Leaf2("裙子");
	        Component2 Leaf4 = new Leaf2("套装");
	        
	        root.addChild(c1);
	        root.addChild(c2);
	        c1.addChild(Leaf1);
	        c1.addChild(Leaf2);
	        c2.addChild(Leaf3);
	        c2.addChild(Leaf4);
	        
	        root.printStruct("");
	    }
	}
