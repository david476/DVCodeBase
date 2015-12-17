package dvcodebase.extract;

import java.util.ArrayList;

public class Group {
	
	ArrayList<Pixel> pixels;
	
	public void merge(Group g) {
		while(g.pixels.size() > 0) {
			this.pixels.add(g.pixels.get(0));
			g.pixels.remove(0);
		}
	}
	
	public void add(Pixel p) {
		p.group.remove(p);
		p.group = this;
		pixels.add(p);
	}
	
	public boolean remove(Pixel p) {
		for(int i = 0; i < pixels.size(); i++) {
			if(pixels.get(i)==p) {
				pixels.remove(i);
				return true;
			}
		}
		return false;
	}
}