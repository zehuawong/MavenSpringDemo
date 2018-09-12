package com.helloxmlspring;

/**
 * Created by wzh-zhua on 2018/9/11.
 */
public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setName");
    }

    public void sayHello(){
        System.out.println("Hello "+name);
    }
    public void init(){
        System.out.println("Bean is going through init.");
    }
    public void destroy(){     //todo 什么时候会回调销毁方法
        System.out.println("Bean will destroy now.");
    }

}
