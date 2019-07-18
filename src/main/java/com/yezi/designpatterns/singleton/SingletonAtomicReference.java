package com.yezi.designpatterns.singleton;

import java.util.concurrent.atomic.AtomicReference;

public class SingletonAtomicReference {

    private static final AtomicReference<SingletonAtomicReference>  atomicReference
            = new AtomicReference<SingletonAtomicReference>();
    private SingletonAtomicReference(){

    }
    public static final SingletonAtomicReference getInstance(){
        for (;;){
            SingletonAtomicReference singletonAtomicReference = atomicReference.get();
            if(singletonAtomicReference !=null){
                return  singletonAtomicReference;
            }
            singletonAtomicReference =new SingletonAtomicReference();
            if(atomicReference.compareAndSet(null,singletonAtomicReference)){
                return  singletonAtomicReference;
            }
        }
    }

    public static void main(String[] args) {
        SingletonAtomicReference singletonAtomicReference1 = SingletonAtomicReference.getInstance();
        SingletonAtomicReference singletonAtomicReference2 = SingletonAtomicReference.getInstance();
        System.out.println(singletonAtomicReference1==singletonAtomicReference2);
    }
}
