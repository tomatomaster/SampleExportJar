//===========================================
// ENCODE       : UTF-8
// CREATED_AT   : 2014/09/10
// CREATED_BY   : kosugeryou
// PACKAGE_NAME : jp.shinobi.admax.android.samplejar
//
// Copyright ©Samurai Factory Inc. All right reserved.
//===========================================

package jp.shinobi.admax.android.samplejar;

public class Greeting {

    private static final String TAG = Greeting.class.getSimpleName();
    private final Greeting self = this;

    public static String hello(String name) {
        return "Hello" + name + "!!!";
    }
}
