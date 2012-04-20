package com.test.rwmybatis;

public class AT {
    
    private class A{
        
        public A(){
            System.out.println("a");
        }
    }

    public AT(){
          new A();
    }
    
    public static void main(String[] args){
        
        new BT();
    }
}

class BT extends AT{
    
    private class A{
        public A(){
            System.out.println("b");
        }
    }
    
    public BT(){
        new A();
    }
    
}
