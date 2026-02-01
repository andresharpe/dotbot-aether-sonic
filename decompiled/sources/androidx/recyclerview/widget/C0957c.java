package androidx.recyclerview.widget;

import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.C0964j;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.recyclerview.widget.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0957c<T> {

    /* renamed from: a, reason: collision with root package name */
    @P
    private final Executor f17953a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final Executor f17954b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final C0964j.f<T> f17955c;

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: d, reason: collision with root package name */
        private static final Object f17956d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private static Executor f17957e;

        /* renamed from: a, reason: collision with root package name */
        @P
        private Executor f17958a;

        /* renamed from: b, reason: collision with root package name */
        private Executor f17959b;

        /* renamed from: c, reason: collision with root package name */
        private final C0964j.f<T> f17960c;

        public a(@N C0964j.f<T> fVar) {
            this.f17960c = fVar;
        }

        @N
        public C0957c<T> a() {
            if (this.f17959b == null) {
                synchronized (f17956d) {
                    try {
                        if (f17957e == null) {
                            f17957e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f17959b = f17957e;
            }
            return new C0957c<>(this.f17958a, this.f17959b, this.f17960c);
        }

        @N
        public a<T> b(Executor executor) {
            this.f17959b = executor;
            return this;
        }

        @N
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public a<T> c(Executor executor) {
            this.f17958a = executor;
            return this;
        }
    }

    C0957c(@P Executor executor, @N Executor executor2, @N C0964j.f<T> fVar) {
        this.f17953a = executor;
        this.f17954b = executor2;
        this.f17955c = fVar;
    }

    @N
    public Executor a() {
        return this.f17954b;
    }

    @N
    public C0964j.f<T> b() {
        return this.f17955c;
    }

    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Executor c() {
        return this.f17953a;
    }
}
