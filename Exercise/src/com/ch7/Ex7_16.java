package com.ch7;

interface Movable{}
class Car {}
class FireEngine extends Car implements Movable {}
class Ambulance extends Car {}

class Ex7_16 {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		if(fe instanceof FireEngine) {
			
		}
		if(fe instanceof Movable) {
			
		}
		if(fe instanceof Object) {
			
		}
		if(fe instanceof Car) {
			
		}
	}
}
