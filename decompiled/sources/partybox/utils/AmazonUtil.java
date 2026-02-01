package partybox.utils;

/* loaded from: classes2.dex */
public class AmazonUtil {
    static {
        try {
            System.loadLibrary("amazonjniutil");
        } catch (Error unused) {
        }
    }

    public static String a(int i4) {
        try {
            return getDecryptString(i4);
        } catch (Error unused) {
            return null;
        }
    }

    private static native String getDecryptString(int i4);
}
