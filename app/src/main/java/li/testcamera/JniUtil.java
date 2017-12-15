package li.testcamera;

/**
 * 创建时间: 2017/12/15
 * 创建人: Administrator
 * 功能描述:
 */

public class JniUtil {
    static {
        System.loadLibrary("JniTest");
    }
    public static native void testmain();
}
