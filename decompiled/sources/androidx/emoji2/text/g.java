package androidx.emoji2.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.B;
import androidx.annotation.F;
import androidx.annotation.InterfaceC0561d;
import androidx.annotation.InterfaceC0567j;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.core.util.u;
import androidx.emoji2.text.e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@InterfaceC0561d
/* loaded from: classes.dex */
public class g {

    /* renamed from: A, reason: collision with root package name */
    public static final int f14438A = 2;

    /* renamed from: B, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    static final int f14439B = Integer.MAX_VALUE;

    /* renamed from: C, reason: collision with root package name */
    private static final Object f14440C = new Object();

    /* renamed from: D, reason: collision with root package name */
    private static final Object f14441D = new Object();

    /* renamed from: E, reason: collision with root package name */
    @P
    @B("INSTANCE_LOCK")
    private static volatile g f14442E = null;

    /* renamed from: F, reason: collision with root package name */
    @B("CONFIG_LOCK")
    private static volatile boolean f14443F = false;

    /* renamed from: G, reason: collision with root package name */
    private static final String f14444G = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";

    /* renamed from: n, reason: collision with root package name */
    public static final String f14445n = "android.support.text.emoji.emojiCompat_metadataVersion";

    /* renamed from: o, reason: collision with root package name */
    public static final String f14446o = "android.support.text.emoji.emojiCompat_replaceAll";

    /* renamed from: p, reason: collision with root package name */
    public static final int f14447p = 3;

    /* renamed from: q, reason: collision with root package name */
    public static final int f14448q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final int f14449r = 1;

    /* renamed from: s, reason: collision with root package name */
    public static final int f14450s = 2;

    /* renamed from: t, reason: collision with root package name */
    public static final int f14451t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final int f14452u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f14453v = 2;

    /* renamed from: w, reason: collision with root package name */
    public static final int f14454w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static final int f14455x = 1;

    /* renamed from: y, reason: collision with root package name */
    public static final int f14456y = 0;

    /* renamed from: z, reason: collision with root package name */
    public static final int f14457z = 1;

    /* renamed from: b, reason: collision with root package name */
    @B("mInitLock")
    @N
    private final Set<f> f14459b;

    /* renamed from: e, reason: collision with root package name */
    @N
    private final c f14462e;

    /* renamed from: f, reason: collision with root package name */
    @N
    final i f14463f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f14464g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f14465h;

    /* renamed from: i, reason: collision with root package name */
    @P
    final int[] f14466i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f14467j;

    /* renamed from: k, reason: collision with root package name */
    private final int f14468k;

    /* renamed from: l, reason: collision with root package name */
    private final int f14469l;

    /* renamed from: m, reason: collision with root package name */
    private final e f14470m;

    /* renamed from: a, reason: collision with root package name */
    @N
    private final ReadWriteLock f14458a = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    @B("mInitLock")
    private volatile int f14460c = 3;

    /* renamed from: d, reason: collision with root package name */
    @N
    private final Handler f14461d = new Handler(Looper.getMainLooper());

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface a {
    }

    @W(19)
    /* loaded from: classes.dex */
    private static final class b extends c {

        /* renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.k f14471b;

        /* renamed from: c, reason: collision with root package name */
        private volatile q f14472c;

        /* loaded from: classes.dex */
        class a extends j {
            a() {
            }

            @Override // androidx.emoji2.text.g.j
            public void a(@P Throwable th) {
                b.this.f14474a.s(th);
            }

            @Override // androidx.emoji2.text.g.j
            public void b(@N q qVar) {
                b.this.h(qVar);
            }
        }

        b(g gVar) {
            super(gVar);
        }

        @Override // androidx.emoji2.text.g.c
        String a() {
            String N3 = this.f14472c.g().N();
            if (N3 == null) {
                return "";
            }
            return N3;
        }

        @Override // androidx.emoji2.text.g.c
        public int b(CharSequence charSequence, int i4) {
            return this.f14471b.d(charSequence, i4);
        }

        @Override // androidx.emoji2.text.g.c
        boolean c(@N CharSequence charSequence) {
            if (this.f14471b.c(charSequence) == 1) {
                return true;
            }
            return false;
        }

        @Override // androidx.emoji2.text.g.c
        boolean d(@N CharSequence charSequence, int i4) {
            if (this.f14471b.d(charSequence, i4) == 1) {
                return true;
            }
            return false;
        }

        @Override // androidx.emoji2.text.g.c
        void e() {
            try {
                this.f14474a.f14463f.a(new a());
            } catch (Throwable th) {
                this.f14474a.s(th);
            }
        }

        @Override // androidx.emoji2.text.g.c
        CharSequence f(@N CharSequence charSequence, int i4, int i5, int i6, boolean z3) {
            return this.f14471b.j(charSequence, i4, i5, i6, z3);
        }

        @Override // androidx.emoji2.text.g.c
        void g(@N EditorInfo editorInfo) {
            editorInfo.extras.putInt(g.f14445n, this.f14472c.h());
            editorInfo.extras.putBoolean(g.f14446o, this.f14474a.f14464g);
        }

        void h(@N q qVar) {
            if (qVar == null) {
                this.f14474a.s(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f14472c = qVar;
            q qVar2 = this.f14472c;
            l lVar = new l();
            e eVar = this.f14474a.f14470m;
            g gVar = this.f14474a;
            this.f14471b = new androidx.emoji2.text.k(qVar2, lVar, eVar, gVar.f14465h, gVar.f14466i);
            this.f14474a.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final g f14474a;

        c(g gVar) {
            this.f14474a = gVar;
        }

        String a() {
            return "";
        }

        public int b(CharSequence charSequence, int i4) {
            return 0;
        }

        boolean c(@N CharSequence charSequence) {
            return false;
        }

        boolean d(@N CharSequence charSequence, int i4) {
            return false;
        }

        void e() {
            this.f14474a.t();
        }

        CharSequence f(@N CharSequence charSequence, @F(from = 0) int i4, @F(from = 0) int i5, @F(from = 0) int i6, boolean z3) {
            return charSequence;
        }

        void g(@N EditorInfo editorInfo) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        @N
        final i f14475a;

        /* renamed from: b, reason: collision with root package name */
        boolean f14476b;

        /* renamed from: c, reason: collision with root package name */
        boolean f14477c;

        /* renamed from: d, reason: collision with root package name */
        @P
        int[] f14478d;

        /* renamed from: e, reason: collision with root package name */
        @P
        Set<f> f14479e;

        /* renamed from: f, reason: collision with root package name */
        boolean f14480f;

        /* renamed from: g, reason: collision with root package name */
        int f14481g = -16711936;

        /* renamed from: h, reason: collision with root package name */
        int f14482h = 0;

        /* renamed from: i, reason: collision with root package name */
        @N
        e f14483i = new androidx.emoji2.text.f();

        /* JADX INFO: Access modifiers changed from: protected */
        public d(@N i iVar) {
            u.m(iVar, "metadataLoader cannot be null.");
            this.f14475a = iVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @N
        public final i a() {
            return this.f14475a;
        }

        @N
        public d b(@N f fVar) {
            u.m(fVar, "initCallback cannot be null");
            if (this.f14479e == null) {
                this.f14479e = new androidx.collection.c();
            }
            this.f14479e.add(fVar);
            return this;
        }

        @N
        public d c(@InterfaceC0569l int i4) {
            this.f14481g = i4;
            return this;
        }

        @N
        public d d(boolean z3) {
            this.f14480f = z3;
            return this;
        }

        @N
        public d e(@N e eVar) {
            u.m(eVar, "GlyphChecker cannot be null");
            this.f14483i = eVar;
            return this;
        }

        @N
        public d f(int i4) {
            this.f14482h = i4;
            return this;
        }

        @N
        public d g(boolean z3) {
            this.f14476b = z3;
            return this;
        }

        @N
        public d h(boolean z3) {
            return i(z3, null);
        }

        @N
        public d i(boolean z3, @P List<Integer> list) {
            this.f14477c = z3;
            if (z3 && list != null) {
                this.f14478d = new int[list.size()];
                Iterator<Integer> it = list.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    this.f14478d[i4] = it.next().intValue();
                    i4++;
                }
                Arrays.sort(this.f14478d);
            } else {
                this.f14478d = null;
            }
            return this;
        }

        @N
        public d j(@N f fVar) {
            u.m(fVar, "initCallback cannot be null");
            Set<f> set = this.f14479e;
            if (set != null) {
                set.remove(fVar);
            }
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a(@N CharSequence charSequence, @F(from = 0) int i4, @F(from = 0) int i5, @F(from = 0) int i6);
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public void a(@P Throwable th) {
        }

        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.g$g, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0128g implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        private final List<f> f14484E;

        /* renamed from: F, reason: collision with root package name */
        private final Throwable f14485F;

        /* renamed from: G, reason: collision with root package name */
        private final int f14486G;

        RunnableC0128g(@N f fVar, int i4) {
            this(Arrays.asList((f) u.m(fVar, "initCallback cannot be null")), i4, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f14484E.size();
            int i4 = 0;
            if (this.f14486G != 1) {
                while (i4 < size) {
                    this.f14484E.get(i4).a(this.f14485F);
                    i4++;
                }
            } else {
                while (i4 < size) {
                    this.f14484E.get(i4).b();
                    i4++;
                }
            }
        }

        RunnableC0128g(@N Collection<f> collection, int i4) {
            this(collection, i4, null);
        }

        RunnableC0128g(@N Collection<f> collection, int i4, @P Throwable th) {
            u.m(collection, "initCallbacks cannot be null");
            this.f14484E = new ArrayList(collection);
            this.f14486G = i4;
            this.f14485F = th;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface h {
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(@N j jVar);
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        public abstract void a(@P Throwable th);

        public abstract void b(@N q qVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface k {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @W(19)
    /* loaded from: classes.dex */
    public static class l {
        l() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public androidx.emoji2.text.l a(@N androidx.emoji2.text.j jVar) {
            return new s(jVar);
        }
    }

    private g(@N d dVar) {
        this.f14464g = dVar.f14476b;
        this.f14465h = dVar.f14477c;
        this.f14466i = dVar.f14478d;
        this.f14467j = dVar.f14480f;
        this.f14468k = dVar.f14481g;
        this.f14463f = dVar.f14475a;
        this.f14469l = dVar.f14482h;
        this.f14470m = dVar.f14483i;
        androidx.collection.c cVar = new androidx.collection.c();
        this.f14459b = cVar;
        Set<f> set = dVar.f14479e;
        if (set != null && !set.isEmpty()) {
            cVar.addAll(dVar.f14479e);
        }
        this.f14462e = new b(this);
        r();
    }

    @P
    @RestrictTo({RestrictTo.Scope.TESTS})
    public static g A(@P g gVar) {
        g gVar2;
        synchronized (f14440C) {
            f14442E = gVar;
            gVar2 = f14442E;
        }
        return gVar2;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public static void B(boolean z3) {
        synchronized (f14441D) {
            f14443F = z3;
        }
    }

    @N
    public static g b() {
        g gVar;
        boolean z3;
        synchronized (f14440C) {
            gVar = f14442E;
            if (gVar != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            u.o(z3, f14444G);
        }
        return gVar;
    }

    public static boolean g(@N InputConnection inputConnection, @N Editable editable, @F(from = 0) int i4, @F(from = 0) int i5, boolean z3) {
        return androidx.emoji2.text.k.e(inputConnection, editable, i4, i5, z3);
    }

    public static boolean h(@N Editable editable, int i4, @N KeyEvent keyEvent) {
        return androidx.emoji2.text.k.f(editable, i4, keyEvent);
    }

    @P
    public static g k(@N Context context) {
        return l(context, null);
    }

    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static g l(@N Context context, @P e.a aVar) {
        g gVar;
        if (f14443F) {
            return f14442E;
        }
        if (aVar == null) {
            aVar = new e.a(null);
        }
        d c4 = aVar.c(context);
        synchronized (f14441D) {
            try {
                if (!f14443F) {
                    if (c4 != null) {
                        m(c4);
                    }
                    f14443F = true;
                }
                gVar = f14442E;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @N
    public static g m(@N d dVar) {
        g gVar = f14442E;
        if (gVar == null) {
            synchronized (f14440C) {
                try {
                    gVar = f14442E;
                    if (gVar == null) {
                        gVar = new g(dVar);
                        f14442E = gVar;
                    }
                } finally {
                }
            }
        }
        return gVar;
    }

    public static boolean n() {
        if (f14442E != null) {
            return true;
        }
        return false;
    }

    private boolean p() {
        if (f() == 1) {
            return true;
        }
        return false;
    }

    private void r() {
        this.f14458a.writeLock().lock();
        try {
            if (this.f14469l == 0) {
                this.f14460c = 0;
            }
            this.f14458a.writeLock().unlock();
            if (f() == 0) {
                this.f14462e.e();
            }
        } catch (Throwable th) {
            this.f14458a.writeLock().unlock();
            throw th;
        }
    }

    @N
    public static g z(@N d dVar) {
        g gVar;
        synchronized (f14440C) {
            gVar = new g(dVar);
            f14442E = gVar;
        }
        return gVar;
    }

    public void C(@N f fVar) {
        u.m(fVar, "initCallback cannot be null");
        this.f14458a.writeLock().lock();
        try {
            this.f14459b.remove(fVar);
        } finally {
            this.f14458a.writeLock().unlock();
        }
    }

    public void D(@N EditorInfo editorInfo) {
        if (p() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f14462e.g(editorInfo);
        }
    }

    @N
    public String c() {
        u.o(p(), "Not initialized yet");
        return this.f14462e.a();
    }

    public int d(@N CharSequence charSequence, @F(from = 0) int i4) {
        u.o(p(), "Not initialized yet");
        u.m(charSequence, "sequence cannot be null");
        return this.f14462e.b(charSequence, i4);
    }

    @InterfaceC0569l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int e() {
        return this.f14468k;
    }

    public int f() {
        this.f14458a.readLock().lock();
        try {
            return this.f14460c;
        } finally {
            this.f14458a.readLock().unlock();
        }
    }

    @Deprecated
    public boolean i(@N CharSequence charSequence) {
        u.o(p(), "Not initialized yet");
        u.m(charSequence, "sequence cannot be null");
        return this.f14462e.c(charSequence);
    }

    @Deprecated
    public boolean j(@N CharSequence charSequence, @F(from = 0) int i4) {
        u.o(p(), "Not initialized yet");
        u.m(charSequence, "sequence cannot be null");
        return this.f14462e.d(charSequence, i4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean o() {
        return this.f14467j;
    }

    public void q() {
        boolean z3 = true;
        if (this.f14469l != 1) {
            z3 = false;
        }
        u.o(z3, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (p()) {
            return;
        }
        this.f14458a.writeLock().lock();
        try {
            if (this.f14460c == 0) {
                return;
            }
            this.f14460c = 0;
            this.f14458a.writeLock().unlock();
            this.f14462e.e();
        } finally {
            this.f14458a.writeLock().unlock();
        }
    }

    void s(@P Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f14458a.writeLock().lock();
        try {
            this.f14460c = 2;
            arrayList.addAll(this.f14459b);
            this.f14459b.clear();
            this.f14458a.writeLock().unlock();
            this.f14461d.post(new RunnableC0128g(arrayList, this.f14460c, th));
        } catch (Throwable th2) {
            this.f14458a.writeLock().unlock();
            throw th2;
        }
    }

    void t() {
        ArrayList arrayList = new ArrayList();
        this.f14458a.writeLock().lock();
        try {
            this.f14460c = 1;
            arrayList.addAll(this.f14459b);
            this.f14459b.clear();
            this.f14458a.writeLock().unlock();
            this.f14461d.post(new RunnableC0128g(arrayList, this.f14460c));
        } catch (Throwable th) {
            this.f14458a.writeLock().unlock();
            throw th;
        }
    }

    @P
    @InterfaceC0567j
    public CharSequence u(@P CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        return v(charSequence, 0, length);
    }

    @P
    @InterfaceC0567j
    public CharSequence v(@P CharSequence charSequence, @F(from = 0) int i4, @F(from = 0) int i5) {
        return w(charSequence, i4, i5, Integer.MAX_VALUE);
    }

    @P
    @InterfaceC0567j
    public CharSequence w(@P CharSequence charSequence, @F(from = 0) int i4, @F(from = 0) int i5, @F(from = 0) int i6) {
        return x(charSequence, i4, i5, i6, 0);
    }

    @P
    @InterfaceC0567j
    public CharSequence x(@P CharSequence charSequence, @F(from = 0) int i4, @F(from = 0) int i5, @F(from = 0) int i6, int i7) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        u.o(p(), "Not initialized yet");
        u.j(i4, "start cannot be negative");
        u.j(i5, "end cannot be negative");
        u.j(i6, "maxEmojiCount cannot be negative");
        boolean z7 = false;
        if (i4 <= i5) {
            z3 = true;
        } else {
            z3 = false;
        }
        u.b(z3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        if (i4 <= charSequence.length()) {
            z4 = true;
        } else {
            z4 = false;
        }
        u.b(z4, "start should be < than charSequence length");
        if (i5 <= charSequence.length()) {
            z5 = true;
        } else {
            z5 = false;
        }
        u.b(z5, "end should be < than charSequence length");
        if (charSequence.length() != 0 && i4 != i5) {
            if (i7 != 1) {
                if (i7 != 2) {
                    z7 = this.f14464g;
                }
                z6 = z7;
            } else {
                z6 = true;
            }
            return this.f14462e.f(charSequence, i4, i5, i6, z6);
        }
        return charSequence;
    }

    public void y(@N f fVar) {
        u.m(fVar, "initCallback cannot be null");
        this.f14458a.writeLock().lock();
        try {
            if (this.f14460c != 1 && this.f14460c != 2) {
                this.f14459b.add(fVar);
                this.f14458a.writeLock().unlock();
            }
            this.f14461d.post(new RunnableC0128g(fVar, this.f14460c));
            this.f14458a.writeLock().unlock();
        } catch (Throwable th) {
            this.f14458a.writeLock().unlock();
            throw th;
        }
    }
}
