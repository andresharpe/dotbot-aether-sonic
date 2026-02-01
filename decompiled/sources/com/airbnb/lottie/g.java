package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.V;
import androidx.annotation.j0;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    private Map<String, List<Layer>> f21432c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, k> f21433d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, com.airbnb.lottie.model.b> f21434e;

    /* renamed from: f, reason: collision with root package name */
    private List<com.airbnb.lottie.model.g> f21435f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.collection.m<com.airbnb.lottie.model.c> f21436g;

    /* renamed from: h, reason: collision with root package name */
    private androidx.collection.h<Layer> f21437h;

    /* renamed from: i, reason: collision with root package name */
    private List<Layer> f21438i;

    /* renamed from: j, reason: collision with root package name */
    private Rect f21439j;

    /* renamed from: k, reason: collision with root package name */
    private float f21440k;

    /* renamed from: l, reason: collision with root package name */
    private float f21441l;

    /* renamed from: m, reason: collision with root package name */
    private float f21442m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21443n;

    /* renamed from: a, reason: collision with root package name */
    private final s f21430a = new s();

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<String> f21431b = new HashSet<>();

    /* renamed from: o, reason: collision with root package name */
    private int f21444o = 0;

    @Deprecated
    /* loaded from: classes.dex */
    public static class b {

        /* loaded from: classes.dex */
        private static final class a implements l<g>, com.airbnb.lottie.b {

            /* renamed from: a, reason: collision with root package name */
            private final r f21445a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f21446b;

            @Override // com.airbnb.lottie.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResult(g gVar) {
                if (this.f21446b) {
                    return;
                }
                this.f21445a.a(gVar);
            }

            @Override // com.airbnb.lottie.b
            public void cancel() {
                this.f21446b = true;
            }

            private a(r rVar) {
                this.f21446b = false;
                this.f21445a = rVar;
            }
        }

        private b() {
        }

        @Deprecated
        public static com.airbnb.lottie.b a(Context context, String str, r rVar) {
            a aVar = new a(rVar);
            h.e(context, str).f(aVar);
            return aVar;
        }

        @P
        @j0
        @Deprecated
        public static g b(Context context, String str) {
            return h.g(context, str).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b c(InputStream inputStream, r rVar) {
            a aVar = new a(rVar);
            h.j(inputStream, null).f(aVar);
            return aVar;
        }

        @P
        @j0
        @Deprecated
        public static g d(InputStream inputStream) {
            return h.k(inputStream, null).b();
        }

        @P
        @j0
        @Deprecated
        public static g e(InputStream inputStream, boolean z3) {
            if (z3) {
                com.airbnb.lottie.utils.f.e("Lottie now auto-closes input stream!");
            }
            return h.k(inputStream, null).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b f(JsonReader jsonReader, r rVar) {
            a aVar = new a(rVar);
            h.m(jsonReader, null).f(aVar);
            return aVar;
        }

        @Deprecated
        public static com.airbnb.lottie.b g(String str, r rVar) {
            a aVar = new a(rVar);
            h.p(str, null).f(aVar);
            return aVar;
        }

        @P
        @j0
        @Deprecated
        public static g h(Resources resources, JSONObject jSONObject) {
            return h.r(jSONObject, null).b();
        }

        @P
        @j0
        @Deprecated
        public static g i(JsonReader jsonReader) {
            return h.n(jsonReader, null).b();
        }

        @P
        @j0
        @Deprecated
        public static g j(String str) {
            return h.q(str, null).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b k(Context context, @V int i4, r rVar) {
            a aVar = new a(rVar);
            h.s(context, i4).f(aVar);
            return aVar;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void a(String str) {
        com.airbnb.lottie.utils.f.e(str);
        this.f21431b.add(str);
    }

    public Rect b() {
        return this.f21439j;
    }

    public androidx.collection.m<com.airbnb.lottie.model.c> c() {
        return this.f21436g;
    }

    public float d() {
        return (e() / this.f21442m) * 1000.0f;
    }

    public float e() {
        return this.f21441l - this.f21440k;
    }

    public float f() {
        return this.f21441l;
    }

    public Map<String, com.airbnb.lottie.model.b> g() {
        return this.f21434e;
    }

    public float h(float f4) {
        return com.airbnb.lottie.utils.i.k(this.f21440k, this.f21441l, f4);
    }

    public float i() {
        return this.f21442m;
    }

    public Map<String, k> j() {
        return this.f21433d;
    }

    public List<Layer> k() {
        return this.f21438i;
    }

    @P
    public com.airbnb.lottie.model.g l(String str) {
        int size = this.f21435f.size();
        for (int i4 = 0; i4 < size; i4++) {
            com.airbnb.lottie.model.g gVar = this.f21435f.get(i4);
            if (gVar.a(str)) {
                return gVar;
            }
        }
        return null;
    }

    public List<com.airbnb.lottie.model.g> m() {
        return this.f21435f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int n() {
        return this.f21444o;
    }

    public s o() {
        return this.f21430a;
    }

    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<Layer> p(String str) {
        return this.f21432c.get(str);
    }

    public float q(float f4) {
        float f5 = this.f21440k;
        return (f4 - f5) / (this.f21441l - f5);
    }

    public float r() {
        return this.f21440k;
    }

    public ArrayList<String> s() {
        HashSet<String> hashSet = this.f21431b;
        return new ArrayList<>(Arrays.asList((String[]) hashSet.toArray(new String[hashSet.size()])));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean t() {
        return this.f21443n;
    }

    @N
    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<Layer> it = this.f21438i.iterator();
        while (it.hasNext()) {
            sb.append(it.next().y("\t"));
        }
        return sb.toString();
    }

    public boolean u() {
        return !this.f21433d.isEmpty();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void v(int i4) {
        this.f21444o += i4;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void w(Rect rect, float f4, float f5, float f6, List<Layer> list, androidx.collection.h<Layer> hVar, Map<String, List<Layer>> map, Map<String, k> map2, androidx.collection.m<com.airbnb.lottie.model.c> mVar, Map<String, com.airbnb.lottie.model.b> map3, List<com.airbnb.lottie.model.g> list2) {
        this.f21439j = rect;
        this.f21440k = f4;
        this.f21441l = f5;
        this.f21442m = f6;
        this.f21438i = list;
        this.f21437h = hVar;
        this.f21432c = map;
        this.f21433d = map2;
        this.f21436g = mVar;
        this.f21434e = map3;
        this.f21435f = list2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Layer x(long j4) {
        return this.f21437h.i(j4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void y(boolean z3) {
        this.f21443n = z3;
    }

    public void z(boolean z3) {
        this.f21430a.g(z3);
    }
}
