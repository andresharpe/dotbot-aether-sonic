package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public abstract class M<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f52286a;

    /* renamed from: b, reason: collision with root package name */
    private int f52287b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final T[] f52288c;

    public M(int i4) {
        this.f52286a = i4;
        this.f52288c = (T[]) new Object[i4];
    }

    private static /* synthetic */ void d() {
    }

    public final void a(@l3.d T spreadArgument) {
        F.p(spreadArgument, "spreadArgument");
        T[] tArr = this.f52288c;
        int i4 = this.f52287b;
        this.f52287b = i4 + 1;
        tArr[i4] = spreadArgument;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int b() {
        return this.f52287b;
    }

    protected abstract int c(@l3.d T t3);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(int i4) {
        this.f52287b = i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int f() {
        int i4;
        int i5 = 0;
        kotlin.collections.P it = new kotlin.ranges.l(0, this.f52286a - 1).iterator();
        while (it.hasNext()) {
            T t3 = this.f52288c[it.c()];
            if (t3 != null) {
                i4 = c(t3);
            } else {
                i4 = 1;
            }
            i5 += i4;
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.d
    public final T g(@l3.d T values, @l3.d T result) {
        F.p(values, "values");
        F.p(result, "result");
        kotlin.collections.P it = new kotlin.ranges.l(0, this.f52286a - 1).iterator();
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            int c4 = it.c();
            T t3 = this.f52288c[c4];
            if (t3 != null) {
                if (i4 < c4) {
                    int i6 = c4 - i4;
                    System.arraycopy(values, i4, result, i5, i6);
                    i5 += i6;
                }
                int c5 = c(t3);
                System.arraycopy(t3, 0, result, i5, c5);
                i5 += c5;
                i4 = c4 + 1;
            }
        }
        int i7 = this.f52286a;
        if (i4 < i7) {
            System.arraycopy(values, i4, result, i5, i7 - i4);
        }
        return result;
    }
}
