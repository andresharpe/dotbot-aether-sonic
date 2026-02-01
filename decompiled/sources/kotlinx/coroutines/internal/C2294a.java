package kotlinx.coroutines.internal;

import kotlin.collections.C2100o;

/* renamed from: kotlinx.coroutines.internal.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2294a<T> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private Object[] f54469a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    private int f54470b;

    /* renamed from: c, reason: collision with root package name */
    private int f54471c;

    private final void c() {
        Object[] objArr = this.f54469a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        C2100o.K0(objArr, objArr2, 0, this.f54470b, 0, 10, null);
        Object[] objArr3 = this.f54469a;
        int length2 = objArr3.length;
        int i4 = this.f54470b;
        C2100o.K0(objArr3, objArr2, length2 - i4, 0, i4, 4, null);
        this.f54469a = objArr2;
        this.f54470b = 0;
        this.f54471c = length;
    }

    public final void a(@l3.d T t3) {
        Object[] objArr = this.f54469a;
        int i4 = this.f54471c;
        objArr[i4] = t3;
        int length = (objArr.length - 1) & (i4 + 1);
        this.f54471c = length;
        if (length == this.f54470b) {
            c();
        }
    }

    public final void b() {
        this.f54470b = 0;
        this.f54471c = 0;
        this.f54469a = new Object[this.f54469a.length];
    }

    public final boolean d() {
        if (this.f54470b == this.f54471c) {
            return true;
        }
        return false;
    }

    @l3.e
    public final T e() {
        int i4 = this.f54470b;
        if (i4 == this.f54471c) {
            return null;
        }
        Object[] objArr = this.f54469a;
        T t3 = (T) objArr[i4];
        objArr[i4] = null;
        this.f54470b = (i4 + 1) & (objArr.length - 1);
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
