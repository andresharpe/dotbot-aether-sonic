package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.annotation.j0;
import androidx.core.os.L;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.g;
import androidx.lifecycle.E;
import androidx.lifecycle.InterfaceC0910l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements androidx.startup.b<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private static final long f14298a = 500;

    /* renamed from: b, reason: collision with root package name */
    private static final String f14299b = "EmojiCompatInitializer";

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(19)
    /* loaded from: classes.dex */
    public static class a extends g.d {
        protected a(Context context) {
            super(new b(context));
            f(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(19)
    /* loaded from: classes.dex */
    public static class b implements g.i {

        /* renamed from: a, reason: collision with root package name */
        private final Context f14302a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends g.j {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g.j f14303a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f14304b;

            a(g.j jVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f14303a = jVar;
                this.f14304b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.g.j
            public void a(@P Throwable th) {
                try {
                    this.f14303a.a(th);
                } finally {
                    this.f14304b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.g.j
            public void b(@N q qVar) {
                try {
                    this.f14303a.b(qVar);
                } finally {
                    this.f14304b.shutdown();
                }
            }
        }

        b(Context context) {
            this.f14302a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.g.i
        public void a(@N final g.j jVar) {
            final ThreadPoolExecutor c4 = d.c(EmojiCompatInitializer.f14299b);
            c4.execute(new Runnable() { // from class: androidx.emoji2.text.h
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b.this.d(jVar, c4);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @j0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d(@N g.j jVar, @N ThreadPoolExecutor threadPoolExecutor) {
            try {
                m a4 = e.a(this.f14302a);
                if (a4 != null) {
                    a4.l(threadPoolExecutor);
                    a4.a().a(new a(jVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                jVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                L.b("EmojiCompat.EmojiCompatInitializer.run");
                if (g.n()) {
                    g.b().q();
                }
            } finally {
                L.d();
            }
        }
    }

    @Override // androidx.startup.b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean a(@N Context context) {
        g.m(new a(context));
        c(context);
        return Boolean.TRUE;
    }

    @W(19)
    void c(@N Context context) {
        final Lifecycle lifecycle = ((E) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new InterfaceC0910l() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC0910l
            public void b(@N E e4) {
                EmojiCompatInitializer.this.d();
                lifecycle.d(this);
            }
        });
    }

    @W(19)
    void d() {
        d.e().postDelayed(new c(), f14298a);
    }

    @Override // androidx.startup.b
    @N
    public List<Class<? extends androidx.startup.b<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
