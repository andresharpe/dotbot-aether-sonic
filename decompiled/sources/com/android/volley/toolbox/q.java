package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import androidx.annotation.K;
import androidx.annotation.P;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final com.android.volley.n f24628a;

    /* renamed from: c, reason: collision with root package name */
    private final f f24630c;

    /* renamed from: g, reason: collision with root package name */
    private Runnable f24634g;

    /* renamed from: b, reason: collision with root package name */
    private int f24629b = 100;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, e> f24631d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, e> f24632e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final Handler f24633f = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    class a implements h {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f24635E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ ImageView f24636F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f24637G;

        a(int i4, ImageView imageView, int i5) {
            this.f24635E = i4;
            this.f24636F = imageView;
            this.f24637G = i5;
        }

        @Override // com.android.volley.toolbox.q.h
        public void a(g gVar, boolean z3) {
            if (gVar.d() != null) {
                this.f24636F.setImageBitmap(gVar.d());
                return;
            }
            int i4 = this.f24637G;
            if (i4 != 0) {
                this.f24636F.setImageResource(i4);
            }
        }

        @Override // com.android.volley.p.a
        public void c(VolleyError volleyError) {
            int i4 = this.f24635E;
            if (i4 != 0) {
                this.f24636F.setImageResource(i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements p.b<Bitmap> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ String f24638E;

        b(String str) {
            this.f24638E = str;
        }

        @Override // com.android.volley.p.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(Bitmap bitmap) {
            q.this.n(this.f24638E, bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements p.a {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ String f24640E;

        c(String str) {
            this.f24640E = str;
        }

        @Override // com.android.volley.p.a
        public void c(VolleyError volleyError) {
            q.this.m(this.f24640E, volleyError);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (e eVar : q.this.f24632e.values()) {
                for (g gVar : eVar.f24646d) {
                    if (gVar.f24648b != null) {
                        if (eVar.e() == null) {
                            gVar.f24647a = eVar.f24644b;
                            gVar.f24648b.a(gVar, false);
                        } else {
                            gVar.f24648b.c(eVar.e());
                        }
                    }
                }
            }
            q.this.f24632e.clear();
            q.this.f24634g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final Request<?> f24643a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f24644b;

        /* renamed from: c, reason: collision with root package name */
        private VolleyError f24645c;

        /* renamed from: d, reason: collision with root package name */
        private final List<g> f24646d;

        public e(Request<?> request, g gVar) {
            ArrayList arrayList = new ArrayList();
            this.f24646d = arrayList;
            this.f24643a = request;
            arrayList.add(gVar);
        }

        public void d(g gVar) {
            this.f24646d.add(gVar);
        }

        public VolleyError e() {
            return this.f24645c;
        }

        public boolean f(g gVar) {
            this.f24646d.remove(gVar);
            if (this.f24646d.size() == 0) {
                this.f24643a.f();
                return true;
            }
            return false;
        }

        public void g(VolleyError volleyError) {
            this.f24645c = volleyError;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        @P
        Bitmap a(String str);

        void b(String str, Bitmap bitmap);
    }

    /* loaded from: classes.dex */
    public class g {

        /* renamed from: a, reason: collision with root package name */
        private Bitmap f24647a;

        /* renamed from: b, reason: collision with root package name */
        private final h f24648b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24649c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24650d;

        public g(Bitmap bitmap, String str, String str2, h hVar) {
            this.f24647a = bitmap;
            this.f24650d = str;
            this.f24649c = str2;
            this.f24648b = hVar;
        }

        @K
        public void c() {
            C.a();
            if (this.f24648b == null) {
                return;
            }
            e eVar = (e) q.this.f24631d.get(this.f24649c);
            if (eVar != null) {
                if (eVar.f(this)) {
                    q.this.f24631d.remove(this.f24649c);
                    return;
                }
                return;
            }
            e eVar2 = (e) q.this.f24632e.get(this.f24649c);
            if (eVar2 != null) {
                eVar2.f(this);
                if (eVar2.f24646d.size() == 0) {
                    q.this.f24632e.remove(this.f24649c);
                }
            }
        }

        public Bitmap d() {
            return this.f24647a;
        }

        public String e() {
            return this.f24650d;
        }
    }

    /* loaded from: classes.dex */
    public interface h extends p.a {
        void a(g gVar, boolean z3);
    }

    public q(com.android.volley.n nVar, f fVar) {
        this.f24628a = nVar;
        this.f24630c = fVar;
    }

    private void d(String str, e eVar) {
        this.f24632e.put(str, eVar);
        if (this.f24634g == null) {
            d dVar = new d();
            this.f24634g = dVar;
            this.f24633f.postDelayed(dVar, this.f24629b);
        }
    }

    private static String h(String str, int i4, int i5, ImageView.ScaleType scaleType) {
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("#W");
        sb.append(i4);
        sb.append("#H");
        sb.append(i5);
        sb.append("#S");
        sb.append(scaleType.ordinal());
        sb.append(str);
        return sb.toString();
    }

    public static h i(ImageView imageView, int i4, int i5) {
        return new a(i5, imageView, i4);
    }

    public g e(String str, h hVar) {
        return f(str, hVar, 0, 0);
    }

    public g f(String str, h hVar, int i4, int i5) {
        return g(str, hVar, i4, i5, ImageView.ScaleType.CENTER_INSIDE);
    }

    @K
    public g g(String str, h hVar, int i4, int i5, ImageView.ScaleType scaleType) {
        C.a();
        String h4 = h(str, i4, i5, scaleType);
        Bitmap a4 = this.f24630c.a(h4);
        if (a4 != null) {
            g gVar = new g(a4, str, null, null);
            hVar.a(gVar, true);
            return gVar;
        }
        g gVar2 = new g(null, str, h4, hVar);
        hVar.a(gVar2, true);
        e eVar = this.f24631d.get(h4);
        if (eVar == null) {
            eVar = this.f24632e.get(h4);
        }
        if (eVar != null) {
            eVar.d(gVar2);
            return gVar2;
        }
        Request<Bitmap> l4 = l(str, i4, i5, scaleType, h4);
        this.f24628a.a(l4);
        this.f24631d.put(h4, new e(l4, gVar2));
        return gVar2;
    }

    public boolean j(String str, int i4, int i5) {
        return k(str, i4, i5, ImageView.ScaleType.CENTER_INSIDE);
    }

    @K
    public boolean k(String str, int i4, int i5, ImageView.ScaleType scaleType) {
        C.a();
        if (this.f24630c.a(h(str, i4, i5, scaleType)) != null) {
            return true;
        }
        return false;
    }

    protected Request<Bitmap> l(String str, int i4, int i5, ImageView.ScaleType scaleType, String str2) {
        return new r(str, new b(str2), i4, i5, scaleType, Bitmap.Config.RGB_565, new c(str2));
    }

    protected void m(String str, VolleyError volleyError) {
        e remove = this.f24631d.remove(str);
        if (remove != null) {
            remove.g(volleyError);
            d(str, remove);
        }
    }

    protected void n(String str, Bitmap bitmap) {
        this.f24630c.b(str, bitmap);
        e remove = this.f24631d.remove(str);
        if (remove != null) {
            remove.f24644b = bitmap;
            d(str, remove);
        }
    }

    public void o(int i4) {
        this.f24629b = i4;
    }
}
