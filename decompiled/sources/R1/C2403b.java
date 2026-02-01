package r1;

/* renamed from: r1.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2403b implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f57434a;

    public C2403b(int i4) {
        this.f57434a = i4;
    }

    @Override // r1.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i4 = this.f57434a;
        if (length <= i4) {
            return stackTraceElementArr;
        }
        int i5 = i4 / 2;
        int i6 = i4 - i5;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i4];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i6);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i5, stackTraceElementArr2, i6, i5);
        return stackTraceElementArr2;
    }
}
