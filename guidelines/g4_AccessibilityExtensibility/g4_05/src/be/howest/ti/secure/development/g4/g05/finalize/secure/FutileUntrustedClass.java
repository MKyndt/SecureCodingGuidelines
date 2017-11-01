package be.howest.ti.secure.development.g4.g05.finalize.secure;

import be.howest.ti.secure.development.g4.g05.finalize.insecure.UntrustedClass;

public class FutileUntrustedClass extends SecureTrustedClass {

    public FutileUntrustedClass() {
        System.out.println(String.format("Entered %s constructor", UntrustedClass.class));
    }

    protected void finalize() throws Throwable {
        System.out.println(String.format("Entered %s finalize() method. Let's try to get access to my parent's "
                + "\"unreachable method\"...", UntrustedClass.class));
        this.unreachableMethod();
    }
}
