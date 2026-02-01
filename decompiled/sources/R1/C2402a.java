package r1;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2402a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f57431a;

    /* renamed from: b, reason: collision with root package name */
    private final d[] f57432b;

    /* renamed from: c, reason: collision with root package name */
    private final C2403b f57433c;

    public C2402a(int i4, d... dVarArr) {
        this.f57431a = i4;
        this.f57432b = dVarArr;
        this.f57433c = new C2403b(i4);
    }

    @Override // r1.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f57431a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.f57432b) {
            if (stackTraceElementArr2.length <= this.f57431a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f57431a) {
            return this.f57433c.a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
