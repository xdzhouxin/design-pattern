package com.xdzhouxin;

public abstract class AbstractTemplate {

        public void templateMethod() {
            primitiveOperation1();
            primitiveOperation2();
            primitiveOperation3();
        }

        public void primitiveOperation3() {
            System.out.println("AbstractTemplate.primitiveOperation3()");
        }

        protected abstract void primitiveOperation1();

        protected abstract void primitiveOperation2();
}
