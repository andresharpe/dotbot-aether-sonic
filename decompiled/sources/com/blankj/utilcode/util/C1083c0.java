package com.blankj.utilcode.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.util.Pair;
import android.view.MotionEvent;
import androidx.core.content.C0669d;
import com.blankj.utilcode.util.E0;
import com.blankj.utilcode.util.UtilsTransActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.blankj.utilcode.util.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1083c0 {

    /* renamed from: m, reason: collision with root package name */
    private static C1083c0 f24986m;

    /* renamed from: n, reason: collision with root package name */
    private static f f24987n;

    /* renamed from: o, reason: collision with root package name */
    private static f f24988o;

    /* renamed from: a, reason: collision with root package name */
    private String[] f24989a;

    /* renamed from: b, reason: collision with root package name */
    private c f24990b;

    /* renamed from: c, reason: collision with root package name */
    private d f24991c;

    /* renamed from: d, reason: collision with root package name */
    private g f24992d;

    /* renamed from: e, reason: collision with root package name */
    private f f24993e;

    /* renamed from: f, reason: collision with root package name */
    private b f24994f;

    /* renamed from: g, reason: collision with root package name */
    private h f24995g;

    /* renamed from: h, reason: collision with root package name */
    private Set<String> f24996h;

    /* renamed from: i, reason: collision with root package name */
    private List<String> f24997i;

    /* renamed from: j, reason: collision with root package name */
    private List<String> f24998j;

    /* renamed from: k, reason: collision with root package name */
    private List<String> f24999k;

    /* renamed from: l, reason: collision with root package name */
    private List<String> f25000l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.blankj.utilcode.util.c0$a */
    /* loaded from: classes.dex */
    public class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f25001a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UtilsTransActivity f25002b;

        a(Runnable runnable, UtilsTransActivity utilsTransActivity) {
            this.f25001a = runnable;
            this.f25002b = utilsTransActivity;
        }

        @Override // com.blankj.utilcode.util.C1083c0.d.a
        public void a(boolean z3) {
            if (z3) {
                C1083c0.this.f24999k = new ArrayList();
                C1083c0.this.f25000l = new ArrayList();
                this.f25001a.run();
                return;
            }
            this.f25002b.finish();
            C1083c0.this.J();
        }
    }

    /* renamed from: com.blankj.utilcode.util.c0$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(@androidx.annotation.N List<String> list);

        void b(@androidx.annotation.N List<String> list, @androidx.annotation.N List<String> list2);
    }

    /* renamed from: com.blankj.utilcode.util.c0$c */
    /* loaded from: classes.dex */
    public interface c {

        /* renamed from: com.blankj.utilcode.util.c0$c$a */
        /* loaded from: classes.dex */
        public interface a {
            void a(boolean z3);
        }

        void a(@androidx.annotation.N UtilsTransActivity utilsTransActivity, @androidx.annotation.N List<String> list, @androidx.annotation.N a aVar);
    }

    /* renamed from: com.blankj.utilcode.util.c0$d */
    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: com.blankj.utilcode.util.c0$d$a */
        /* loaded from: classes.dex */
        public interface a {
            void a(boolean z3);
        }

        void a(@androidx.annotation.N UtilsTransActivity utilsTransActivity, @androidx.annotation.N a aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(api = 23)
    /* renamed from: com.blankj.utilcode.util.c0$e */
    /* loaded from: classes.dex */
    public static final class e extends UtilsTransActivity.TransActivityDelegate {

        /* renamed from: E, reason: collision with root package name */
        private static final String f25004E = "TYPE";

        /* renamed from: F, reason: collision with root package name */
        private static final int f25005F = 1;

        /* renamed from: G, reason: collision with root package name */
        private static final int f25006G = 2;

        /* renamed from: H, reason: collision with root package name */
        private static final int f25007H = 3;

        /* renamed from: I, reason: collision with root package name */
        private static int f25008I = -1;

        /* renamed from: J, reason: collision with root package name */
        private static e f25009J = new e();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.blankj.utilcode.util.c0$e$a */
        /* loaded from: classes.dex */
        public class a implements E0.b<Intent> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f25010a;

            a(int i4) {
                this.f25010a = i4;
            }

            @Override // com.blankj.utilcode.util.E0.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void accept(Intent intent) {
                intent.putExtra(e.f25004E, this.f25010a);
            }
        }

        /* renamed from: com.blankj.utilcode.util.c0$e$b */
        /* loaded from: classes.dex */
        class b implements c.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UtilsTransActivity f25011a;

            b(UtilsTransActivity utilsTransActivity) {
                this.f25011a = utilsTransActivity;
            }

            @Override // com.blankj.utilcode.util.C1083c0.c.a
            public void a(boolean z3) {
                if (z3) {
                    e.this.n(this.f25011a);
                } else {
                    this.f25011a.finish();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.blankj.utilcode.util.c0$e$c */
        /* loaded from: classes.dex */
        public class c implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ UtilsTransActivity f25013E;

            c(UtilsTransActivity utilsTransActivity) {
                this.f25013E = utilsTransActivity;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f25013E.requestPermissions((String[]) C1083c0.f24986m.f24997i.toArray(new String[0]), 1);
            }
        }

        e() {
        }

        private void m(int i4) {
            if (i4 == 2) {
                if (C1083c0.f24987n == null) {
                    return;
                }
                if (C1083c0.B()) {
                    C1083c0.f24987n.a();
                } else {
                    C1083c0.f24987n.b();
                }
                f unused = C1083c0.f24987n = null;
                return;
            }
            if (i4 != 3 || C1083c0.f24988o == null) {
                return;
            }
            if (C1083c0.A()) {
                C1083c0.f24988o.a();
            } else {
                C1083c0.f24988o.b();
            }
            f unused2 = C1083c0.f24988o = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(UtilsTransActivity utilsTransActivity) {
            if (C1083c0.f24986m.M(utilsTransActivity, new c(utilsTransActivity))) {
                return;
            }
            utilsTransActivity.requestPermissions((String[]) C1083c0.f24986m.f24997i.toArray(new String[0]), 1);
        }

        public static void o(int i4) {
            UtilsTransActivity.H0(new a(i4), f25009J);
        }

        @Override // com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate
        public boolean a(@androidx.annotation.N UtilsTransActivity utilsTransActivity, MotionEvent motionEvent) {
            utilsTransActivity.finish();
            return true;
        }

        @Override // com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate
        public void b(@androidx.annotation.N UtilsTransActivity utilsTransActivity, int i4, int i5, Intent intent) {
            utilsTransActivity.finish();
        }

        @Override // com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate
        public void d(@androidx.annotation.N UtilsTransActivity utilsTransActivity, @androidx.annotation.P Bundle bundle) {
            utilsTransActivity.getWindow().addFlags(262160);
            int intExtra = utilsTransActivity.getIntent().getIntExtra(f25004E, -1);
            if (intExtra == 1) {
                if (C1083c0.f24986m == null) {
                    Log.e("PermissionUtils", "sInstance is null.");
                    utilsTransActivity.finish();
                    return;
                }
                if (C1083c0.f24986m.f24997i == null) {
                    Log.e("PermissionUtils", "mPermissionsRequest is null.");
                    utilsTransActivity.finish();
                    return;
                }
                if (C1083c0.f24986m.f24997i.size() <= 0) {
                    Log.e("PermissionUtils", "mPermissionsRequest's size is no more than 0.");
                    utilsTransActivity.finish();
                    return;
                }
                if (C1083c0.f24986m.f24995g != null) {
                    C1083c0.f24986m.f24995g.a(utilsTransActivity);
                }
                if (C1083c0.f24986m.f24990b != null) {
                    C1083c0.f24986m.f24990b.a(utilsTransActivity, C1083c0.f24986m.f24997i, new b(utilsTransActivity));
                    C1083c0.f24986m.f24990b = null;
                    return;
                } else {
                    n(utilsTransActivity);
                    return;
                }
            }
            if (intExtra == 2) {
                f25008I = 2;
                C1083c0.P(utilsTransActivity, 2);
            } else if (intExtra == 3) {
                f25008I = 3;
                C1083c0.N(utilsTransActivity, 3);
            } else {
                utilsTransActivity.finish();
                Log.e("PermissionUtils", "type is wrong.");
            }
        }

        @Override // com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate
        public void e(@androidx.annotation.N UtilsTransActivity utilsTransActivity) {
            int i4 = f25008I;
            if (i4 != -1) {
                m(i4);
                f25008I = -1;
            }
            super.e(utilsTransActivity);
        }

        @Override // com.blankj.utilcode.util.UtilsTransActivity.TransActivityDelegate
        public void g(@androidx.annotation.N UtilsTransActivity utilsTransActivity, int i4, @androidx.annotation.N String[] strArr, @androidx.annotation.N int[] iArr) {
            utilsTransActivity.finish();
            if (C1083c0.f24986m != null && C1083c0.f24986m.f24997i != null) {
                C1083c0.f24986m.D(utilsTransActivity);
            }
        }
    }

    /* renamed from: com.blankj.utilcode.util.c0$f */
    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b();
    }

    /* renamed from: com.blankj.utilcode.util.c0$g */
    /* loaded from: classes.dex */
    public interface g {
        void a(boolean z3, @androidx.annotation.N List<String> list, @androidx.annotation.N List<String> list2, @androidx.annotation.N List<String> list3);
    }

    /* renamed from: com.blankj.utilcode.util.c0$h */
    /* loaded from: classes.dex */
    public interface h {
        void a(@androidx.annotation.N Activity activity);
    }

    private C1083c0(String... strArr) {
        this.f24989a = strArr;
        f24986m = this;
    }

    @androidx.annotation.W(api = 23)
    public static boolean A() {
        return Settings.canDrawOverlays(E0.a());
    }

    @androidx.annotation.W(api = 23)
    public static boolean B() {
        return Settings.System.canWrite(E0.a());
    }

    public static void C() {
        Intent X3 = H0.X(E0.a().getPackageName(), true);
        if (!H0.x0(X3)) {
            return;
        }
        E0.a().startActivity(X3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(Activity activity) {
        w(activity);
        J();
    }

    public static C1083c0 E(String... strArr) {
        return new C1083c0(strArr);
    }

    public static C1083c0 F(String... strArr) {
        return E(strArr);
    }

    private void G(UtilsTransActivity utilsTransActivity, Runnable runnable) {
        w(utilsTransActivity);
        this.f24991c.a(utilsTransActivity, new a(runnable, utilsTransActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        g gVar = this.f24992d;
        if (gVar != null) {
            gVar.a(this.f24999k.isEmpty(), this.f24998j, this.f25000l, this.f24999k);
            this.f24992d = null;
        }
        if (this.f24993e != null) {
            if (this.f24999k.isEmpty()) {
                this.f24993e.a();
            } else {
                this.f24993e.b();
            }
            this.f24993e = null;
        }
        if (this.f24994f != null) {
            if (this.f24997i.size() == 0 || this.f24998j.size() > 0) {
                this.f24994f.a(this.f24998j);
            }
            if (!this.f24999k.isEmpty()) {
                this.f24994f.b(this.f25000l, this.f24999k);
            }
            this.f24994f = null;
        }
        this.f24991c = null;
        this.f24995g = null;
    }

    @androidx.annotation.W(api = 23)
    public static void K(f fVar) {
        if (A()) {
            if (fVar != null) {
                fVar.a();
            }
        } else {
            f24988o = fVar;
            e.o(3);
        }
    }

    @androidx.annotation.W(api = 23)
    public static void L(f fVar) {
        if (B()) {
            if (fVar != null) {
                fVar.a();
            }
        } else {
            f24987n = fVar;
            e.o(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.W(api = 23)
    public boolean M(UtilsTransActivity utilsTransActivity, Runnable runnable) {
        boolean z3 = false;
        if (this.f24991c != null) {
            Iterator<String> it = this.f24997i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (utilsTransActivity.shouldShowRequestPermissionRationale(it.next())) {
                    G(utilsTransActivity, runnable);
                    z3 = true;
                    break;
                }
            }
            this.f24991c = null;
        }
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    public static void N(Activity activity, int i4) {
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse("package:" + E0.a().getPackageName()));
        if (!H0.x0(intent)) {
            C();
        } else {
            activity.startActivityForResult(intent, i4);
        }
    }

    @androidx.annotation.W(api = 23)
    private void O() {
        e.o(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    public static void P(Activity activity, int i4) {
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(Uri.parse("package:" + E0.a().getPackageName()));
        if (!H0.x0(intent)) {
            C();
        } else {
            activity.startActivityForResult(intent, i4);
        }
    }

    public static List<String> u() {
        return v(E0.a().getPackageName());
    }

    public static List<String> v(String str) {
        try {
            String[] strArr = E0.a().getPackageManager().getPackageInfo(str, 4096).requestedPermissions;
            if (strArr == null) {
                return Collections.emptyList();
            }
            return Arrays.asList(strArr);
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return Collections.emptyList();
        }
    }

    private void w(Activity activity) {
        for (String str : this.f24997i) {
            if (y(str)) {
                this.f24998j.add(str);
            } else {
                this.f24999k.add(str);
                if (!activity.shouldShowRequestPermissionRationale(str)) {
                    this.f25000l.add(str);
                }
            }
        }
    }

    private static Pair<List<String>, List<String>> x(String... strArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<String> u3 = u();
        for (String str : strArr) {
            boolean z3 = false;
            for (String str2 : r0.c.a(str)) {
                if (u3.contains(str2)) {
                    arrayList.add(str2);
                    z3 = true;
                }
            }
            if (!z3) {
                arrayList2.add(str);
                Log.e("PermissionUtils", "U should add the permission of " + str + " in manifest.");
            }
        }
        return Pair.create(arrayList, arrayList2);
    }

    private static boolean y(String str) {
        if (C0669d.a(E0.a(), str) == 0) {
            return true;
        }
        return false;
    }

    public static boolean z(String... strArr) {
        Pair<List<String>, List<String>> x3 = x(strArr);
        if (!((List) x3.second).isEmpty()) {
            return false;
        }
        Iterator it = ((List) x3.first).iterator();
        while (it.hasNext()) {
            if (!y((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public C1083c0 H(d dVar) {
        this.f24991c = dVar;
        return this;
    }

    public void I() {
        String[] strArr = this.f24989a;
        if (strArr != null && strArr.length > 0) {
            this.f24996h = new LinkedHashSet();
            this.f24997i = new ArrayList();
            this.f24998j = new ArrayList();
            this.f24999k = new ArrayList();
            this.f25000l = new ArrayList();
            Pair<List<String>, List<String>> x3 = x(this.f24989a);
            this.f24996h.addAll((Collection) x3.first);
            this.f24999k.addAll((Collection) x3.second);
            for (String str : this.f24996h) {
                if (y(str)) {
                    this.f24998j.add(str);
                } else {
                    this.f24997i.add(str);
                }
            }
            if (this.f24997i.isEmpty()) {
                J();
                return;
            } else {
                O();
                return;
            }
        }
        Log.w("PermissionUtils", "No permissions to request.");
    }

    public C1083c0 Q(h hVar) {
        this.f24995g = hVar;
        return this;
    }

    public C1083c0 q(b bVar) {
        this.f24994f = bVar;
        return this;
    }

    public C1083c0 r(f fVar) {
        this.f24993e = fVar;
        return this;
    }

    public C1083c0 s(g gVar) {
        this.f24992d = gVar;
        return this;
    }

    public C1083c0 t(c cVar) {
        this.f24990b = cVar;
        return this;
    }
}
