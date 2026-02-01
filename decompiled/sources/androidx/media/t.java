package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.media.u;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: f, reason: collision with root package name */
    public static final int f16255f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f16256g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f16257h = 2;

    /* renamed from: a, reason: collision with root package name */
    private final int f16258a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16259b;

    /* renamed from: c, reason: collision with root package name */
    private int f16260c;

    /* renamed from: d, reason: collision with root package name */
    private b f16261d;

    /* renamed from: e, reason: collision with root package name */
    private Object f16262e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements u.b {
        a() {
        }

        @Override // androidx.media.u.b
        public void a(int i4) {
            t.this.f(i4);
        }

        @Override // androidx.media.u.b
        public void b(int i4) {
            t.this.e(i4);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract void a(t tVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface c {
    }

    public t(int i4, int i5, int i6) {
        this.f16258a = i4;
        this.f16259b = i5;
        this.f16260c = i6;
    }

    public final int a() {
        return this.f16260c;
    }

    public final int b() {
        return this.f16259b;
    }

    public final int c() {
        return this.f16258a;
    }

    public Object d() {
        if (this.f16262e == null) {
            this.f16262e = u.a(this.f16258a, this.f16259b, this.f16260c, new a());
        }
        return this.f16262e;
    }

    public void e(int i4) {
    }

    public void f(int i4) {
    }

    public void g(b bVar) {
        this.f16261d = bVar;
    }

    public final void h(int i4) {
        this.f16260c = i4;
        Object d4 = d();
        if (d4 != null) {
            u.b(d4, i4);
        }
        b bVar = this.f16261d;
        if (bVar != null) {
            bVar.a(this);
        }
    }
}
