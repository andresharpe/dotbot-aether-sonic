package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.N;
import androidx.core.provider.g;
import androidx.core.provider.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final h.d f12755a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final Handler f12756b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0094a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ h.d f12757E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Typeface f12758F;

        RunnableC0094a(h.d dVar, Typeface typeface) {
            this.f12757E = dVar;
            this.f12758F = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12757E.b(this.f12758F);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ h.d f12760E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f12761F;

        b(h.d dVar, int i4) {
            this.f12760E = dVar;
            this.f12761F = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12760E.a(this.f12761F);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(@N h.d dVar, @N Handler handler) {
        this.f12755a = dVar;
        this.f12756b = handler;
    }

    private void a(int i4) {
        this.f12756b.post(new b(this.f12755a, i4));
    }

    private void c(@N Typeface typeface) {
        this.f12756b.post(new RunnableC0094a(this.f12755a, typeface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(@N g.e eVar) {
        if (eVar.a()) {
            c(eVar.f12786a);
        } else {
            a(eVar.f12787b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(@N h.d dVar) {
        this.f12755a = dVar;
        this.f12756b = androidx.core.provider.b.a();
    }
}
