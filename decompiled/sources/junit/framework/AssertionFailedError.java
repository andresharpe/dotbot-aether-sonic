package junit.framework;

/* loaded from: classes2.dex */
public class AssertionFailedError extends AssertionError {

    /* renamed from: E, reason: collision with root package name */
    private static final long f51490E = 1;

    public AssertionFailedError() {
    }

    private static String a(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    public AssertionFailedError(String str) {
        super(a(str));
    }
}
