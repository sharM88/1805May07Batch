package com.ex.designpatterns;

public class ToolFactory {
	
	public Tool getTool(String toolName) {
		switch(toolName) {
		
		case "hammer" : return new Hammer();
		
		default: return null;
		}
	}

}
