package r1;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f57436a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57437b;

    /* renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f57438c;

    /* renamed from: d, reason: collision with root package name */
    public final e f57439d;

    public e(Throwable th, d dVar) {
        e eVar;
        this.f57436a = th.getLocalizedMessage();
        this.f57437b = th.getClass().getName();
        this.f57438c = dVar.a(th.getStackTrace());
        Throwable cause = th.getCause();
        if (cause != null) {
            eVar = new e(cause, dVar);
        } else {
            eVar = null;
        }
        this.f57439d = eVar;
    }
}
