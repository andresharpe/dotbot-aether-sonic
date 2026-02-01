package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.annotation.B;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.collection.l;
import androidx.core.graphics.T;
import androidx.core.provider.h;
import androidx.core.util.InterfaceC0764e;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    static final androidx.collection.j<String, Typeface> f12772a = new androidx.collection.j<>(16);

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f12773b = i.a("fonts-androidx", 10, com.clj.fastble.a.f26980l);

    /* renamed from: c, reason: collision with root package name */
    static final Object f12774c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @B("LOCK")
    static final l<String, ArrayList<InterfaceC0764e<e>>> f12775d = new l<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Callable<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12776a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f12777b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f12778c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f12779d;

        a(String str, Context context, f fVar, int i4) {
            this.f12776a = str;
            this.f12777b = context;
            this.f12778c = fVar;
            this.f12779d = i4;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return g.c(this.f12776a, this.f12777b, this.f12778c, this.f12779d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements InterfaceC0764e<e> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.a f12780E;

        b(androidx.core.provider.a aVar) {
            this.f12780E = aVar;
        }

        @Override // androidx.core.util.InterfaceC0764e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f12780E.b(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Callable<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12781a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f12782b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f12783c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f12784d;

        c(String str, Context context, f fVar, int i4) {
            this.f12781a = str;
            this.f12782b = context;
            this.f12783c = fVar;
            this.f12784d = i4;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return g.c(this.f12781a, this.f12782b, this.f12783c, this.f12784d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements InterfaceC0764e<e> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ String f12785E;

        d(String str) {
            this.f12785E = str;
        }

        @Override // androidx.core.util.InterfaceC0764e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (g.f12774c) {
                try {
                    l<String, ArrayList<InterfaceC0764e<e>>> lVar = g.f12775d;
                    ArrayList<InterfaceC0764e<e>> arrayList = lVar.get(this.f12785E);
                    if (arrayList == null) {
                        return;
                    }
                    lVar.remove(this.f12785E);
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        arrayList.get(i4).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private g() {
    }

    private static String a(@N f fVar, int i4) {
        return fVar.d() + "-" + i4;
    }

    @SuppressLint({"WrongConstant"})
    private static int b(@N h.b bVar) {
        int i4 = 1;
        if (bVar.c() != 0) {
            if (bVar.c() != 1) {
                return -3;
            }
            return -2;
        }
        h.c[] b4 = bVar.b();
        if (b4 != null && b4.length != 0) {
            i4 = 0;
            for (h.c cVar : b4) {
                int b5 = cVar.b();
                if (b5 != 0) {
                    if (b5 < 0) {
                        return -3;
                    }
                    return b5;
                }
            }
        }
        return i4;
    }

    @N
    static e c(@N String str, @N Context context, @N f fVar, int i4) {
        androidx.collection.j<String, Typeface> jVar = f12772a;
        Typeface f4 = jVar.f(str);
        if (f4 != null) {
            return new e(f4);
        }
        try {
            h.b e4 = androidx.core.provider.e.e(context, fVar, null);
            int b4 = b(e4);
            if (b4 != 0) {
                return new e(b4);
            }
            Typeface d4 = T.d(context, null, e4.b(), i4);
            if (d4 != null) {
                jVar.j(str, d4);
                return new e(d4);
            }
            return new e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface d(@N Context context, @N f fVar, int i4, @P Executor executor, @N androidx.core.provider.a aVar) {
        String a4 = a(fVar, i4);
        Typeface f4 = f12772a.f(a4);
        if (f4 != null) {
            aVar.b(new e(f4));
            return f4;
        }
        b bVar = new b(aVar);
        synchronized (f12774c) {
            try {
                l<String, ArrayList<InterfaceC0764e<e>>> lVar = f12775d;
                ArrayList<InterfaceC0764e<e>> arrayList = lVar.get(a4);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList<InterfaceC0764e<e>> arrayList2 = new ArrayList<>();
                arrayList2.add(bVar);
                lVar.put(a4, arrayList2);
                c cVar = new c(a4, context, fVar, i4);
                if (executor == null) {
                    executor = f12773b;
                }
                i.c(executor, cVar, new d(a4));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface e(@N Context context, @N f fVar, @N androidx.core.provider.a aVar, int i4, int i5) {
        String a4 = a(fVar, i4);
        Typeface f4 = f12772a.f(a4);
        if (f4 != null) {
            aVar.b(new e(f4));
            return f4;
        }
        if (i5 == -1) {
            e c4 = c(a4, context, fVar, i4);
            aVar.b(c4);
            return c4.f12786a;
        }
        try {
            e eVar = (e) i.d(f12773b, new a(a4, context, fVar, i4), i5);
            aVar.b(eVar);
            return eVar.f12786a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f() {
        f12772a.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        final Typeface f12786a;

        /* renamed from: b, reason: collision with root package name */
        final int f12787b;

        e(int i4) {
            this.f12786a = null;
            this.f12787b = i4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        public boolean a() {
            if (this.f12787b == 0) {
                return true;
            }
            return false;
        }

        @SuppressLint({"WrongConstant"})
        e(@N Typeface typeface) {
            this.f12786a = typeface;
            this.f12787b = 0;
        }
    }
}
