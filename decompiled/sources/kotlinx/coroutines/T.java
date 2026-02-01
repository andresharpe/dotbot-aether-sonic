package kotlinx.coroutines;

import kotlin.coroutines.f;
import kotlin.jvm.internal.C2197u;

/* loaded from: classes2.dex */
public final class T extends kotlin.coroutines.a {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    public static final a f52972G = new a(null);

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final String f52973F;

    /* loaded from: classes2.dex */
    public static final class a implements f.c<T> {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public T(@l3.d String str) {
        super(f52972G);
        this.f52973F = str;
    }

    public static /* synthetic */ T j1(T t3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = t3.f52973F;
        }
        return t3.i1(str);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof T) && kotlin.jvm.internal.F.g(this.f52973F, ((T) obj).f52973F);
    }

    @l3.d
    public final String h1() {
        return this.f52973F;
    }

    public int hashCode() {
        return this.f52973F.hashCode();
    }

    @l3.d
    public final T i1(@l3.d String str) {
        return new T(str);
    }

    @l3.d
    public final String k1() {
        return this.f52973F;
    }

    @l3.d
    public String toString() {
        return "CoroutineName(" + this.f52973F + ')';
    }
}
