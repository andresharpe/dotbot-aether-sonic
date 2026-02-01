package com.google.android.gms.analytics;

import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.app.C0;
import com.google.android.gms.internal.gtm.zzfc;
import com.google.android.gms.internal.gtm.zzfu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@com.google.android.gms.common.util.D
/* loaded from: classes.dex */
public class f {

    @Deprecated
    @com.google.android.gms.common.util.D
    /* loaded from: classes.dex */
    public static class a extends d<a> {
        public a() {
            f("&t", "screenview");
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ a a(@P com.google.android.gms.analytics.ecommerce.a aVar, @P String str) {
            super.a(aVar, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ a b(@P com.google.android.gms.analytics.ecommerce.a aVar) {
            super.b(aVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ a c(@P com.google.android.gms.analytics.ecommerce.c cVar) {
            super.c(cVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ a h(@N String str) {
            super.h(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ a i(int i4, @N String str) {
            super.i(i4, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ a j(int i4, float f4) {
            super.j(i4, f4);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ a l() {
            super.l();
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ a m(boolean z3) {
            super.m(z3);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ a n(@N com.google.android.gms.analytics.ecommerce.b bVar) {
            super.n(bVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ a o(@N String str) {
            super.o(str);
            return this;
        }
    }

    @com.google.android.gms.common.util.D
    /* loaded from: classes.dex */
    public static class c extends d<c> {
        public c() {
            f("&t", "exception");
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ c a(@P com.google.android.gms.analytics.ecommerce.a aVar, @P String str) {
            super.a(aVar, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ c b(@P com.google.android.gms.analytics.ecommerce.a aVar) {
            super.b(aVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ c c(@P com.google.android.gms.analytics.ecommerce.c cVar) {
            super.c(cVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ c h(@N String str) {
            super.h(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ c i(int i4, @N String str) {
            super.i(i4, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ c j(int i4, float f4) {
            super.j(i4, f4);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ c l() {
            super.l();
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ c m(boolean z3) {
            super.m(z3);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ c n(@N com.google.android.gms.analytics.ecommerce.b bVar) {
            super.n(bVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ c o(@N String str) {
            super.o(str);
            return this;
        }

        @N
        public c q(@N String str) {
            f("&exd", str);
            return this;
        }

        @N
        public c r(boolean z3) {
            f("&exf", zzfu.zzc(z3));
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @com.google.android.gms.common.util.D
    /* loaded from: classes.dex */
    public static class d<T extends d> {

        /* renamed from: b, reason: collision with root package name */
        com.google.android.gms.analytics.ecommerce.b f27785b;

        /* renamed from: a, reason: collision with root package name */
        private Map f27784a = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        Map f27786c = new HashMap();

        /* renamed from: d, reason: collision with root package name */
        List f27787d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        List f27788e = new ArrayList();

        protected d() {
        }

        private final d p(String str, String str2) {
            if (str2 != null) {
                this.f27784a.put(str, str2);
            }
            return this;
        }

        @N
        public T a(@P com.google.android.gms.analytics.ecommerce.a aVar, @P String str) {
            if (aVar == null) {
                zzfc.zze("product should be non-null");
                return this;
            }
            if (str == null) {
                str = "";
            }
            if (!this.f27786c.containsKey(str)) {
                this.f27786c.put(str, new ArrayList());
            }
            ((List) this.f27786c.get(str)).add(aVar);
            return this;
        }

        @N
        public T b(@P com.google.android.gms.analytics.ecommerce.a aVar) {
            if (aVar == null) {
                zzfc.zze("product should be non-null");
                return this;
            }
            this.f27788e.add(aVar);
            return this;
        }

        @N
        public T c(@P com.google.android.gms.analytics.ecommerce.c cVar) {
            if (cVar == null) {
                zzfc.zze("promotion should be non-null");
                return this;
            }
            this.f27787d.add(cVar);
            return this;
        }

        @N
        public Map<String, String> d() {
            HashMap hashMap = new HashMap(this.f27784a);
            com.google.android.gms.analytics.ecommerce.b bVar = this.f27785b;
            if (bVar != null) {
                hashMap.putAll(bVar.k());
            }
            Iterator it = this.f27787d.iterator();
            int i4 = 1;
            while (it.hasNext()) {
                hashMap.putAll(((com.google.android.gms.analytics.ecommerce.c) it.next()).e(m.l(i4)));
                i4++;
            }
            Iterator it2 = this.f27788e.iterator();
            int i5 = 1;
            while (it2.hasNext()) {
                hashMap.putAll(((com.google.android.gms.analytics.ecommerce.a) it2.next()).l(m.j(i5)));
                i5++;
            }
            int i6 = 1;
            for (Map.Entry entry : this.f27786c.entrySet()) {
                List list = (List) entry.getValue();
                String g4 = m.g(i6);
                Iterator it3 = list.iterator();
                int i7 = 1;
                while (it3.hasNext()) {
                    hashMap.putAll(((com.google.android.gms.analytics.ecommerce.a) it3.next()).l(g4.concat(m.i(i7))));
                    i7++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    hashMap.put(g4.concat("nm"), (String) entry.getKey());
                }
                i6++;
            }
            return hashMap;
        }

        @P
        @com.google.android.gms.common.util.D
        protected String e(@N String str) {
            return (String) this.f27784a.get(str);
        }

        @N
        public final T f(@P String str, @P String str2) {
            if (str != null) {
                this.f27784a.put(str, str2);
            } else {
                zzfc.zze("HitBuilder.set() called with a null paramName.");
            }
            return this;
        }

        @N
        public final T g(@P Map<String, String> map) {
            if (map == null) {
                return this;
            }
            this.f27784a.putAll(new HashMap(map));
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            if (r15.contains("=") == false) goto L28;
         */
        @androidx.annotation.N
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public T h(@androidx.annotation.N java.lang.String r15) {
            /*
                Method dump skipped, instructions count: 299
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.f.d.h(java.lang.String):com.google.android.gms.analytics.f$d");
        }

        @N
        public T i(int i4, @N String str) {
            f(m.a(i4), str);
            return this;
        }

        @N
        public T j(int i4, float f4) {
            f(m.d(i4), Float.toString(f4));
            return this;
        }

        @N
        protected T k(@N String str) {
            f("&t", str);
            return this;
        }

        @N
        public T l() {
            f("&sc", "start");
            return this;
        }

        @N
        public T m(boolean z3) {
            f("&ni", zzfu.zzc(z3));
            return this;
        }

        @N
        public T n(@N com.google.android.gms.analytics.ecommerce.b bVar) {
            this.f27785b = bVar;
            return this;
        }

        @N
        public T o(@N String str) {
            this.f27784a.put("&promoa", str);
            return this;
        }
    }

    @Deprecated
    @com.google.android.gms.common.util.D
    /* loaded from: classes.dex */
    public static class e extends d<e> {
        public e() {
            f("&t", "item");
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ e a(@P com.google.android.gms.analytics.ecommerce.a aVar, @P String str) {
            super.a(aVar, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ e b(@P com.google.android.gms.analytics.ecommerce.a aVar) {
            super.b(aVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ e c(@P com.google.android.gms.analytics.ecommerce.c cVar) {
            super.c(cVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ e h(@N String str) {
            super.h(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ e i(int i4, @N String str) {
            super.i(i4, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ e j(int i4, float f4) {
            super.j(i4, f4);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ e l() {
            super.l();
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ e m(boolean z3) {
            super.m(z3);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ e n(@N com.google.android.gms.analytics.ecommerce.b bVar) {
            super.n(bVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ e o(@N String str) {
            super.o(str);
            return this;
        }

        @N
        public e q(@N String str) {
            f("&iv", str);
            return this;
        }

        @N
        public e r(@N String str) {
            f("&cu", str);
            return this;
        }

        @N
        public e s(@N String str) {
            f("&in", str);
            return this;
        }

        @N
        public e t(double d4) {
            f("&ip", Double.toString(d4));
            return this;
        }

        @N
        public e u(long j4) {
            f("&iq", Long.toString(j4));
            return this;
        }

        @N
        public e v(@N String str) {
            f("&ic", str);
            return this;
        }

        @N
        public e w(@N String str) {
            f("&ti", str);
            return this;
        }
    }

    @com.google.android.gms.common.util.D
    /* renamed from: com.google.android.gms.analytics.f$f, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0260f extends d<C0260f> {
        public C0260f() {
            f("&t", "screenview");
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ C0260f a(@P com.google.android.gms.analytics.ecommerce.a aVar, @P String str) {
            super.a(aVar, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ C0260f b(@P com.google.android.gms.analytics.ecommerce.a aVar) {
            super.b(aVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ C0260f c(@P com.google.android.gms.analytics.ecommerce.c cVar) {
            super.c(cVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ C0260f h(@N String str) {
            super.h(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ C0260f i(int i4, @N String str) {
            super.i(i4, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ C0260f j(int i4, float f4) {
            super.j(i4, f4);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ C0260f l() {
            super.l();
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ C0260f m(boolean z3) {
            super.m(z3);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ C0260f n(@N com.google.android.gms.analytics.ecommerce.b bVar) {
            super.n(bVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ C0260f o(@N String str) {
            super.o(str);
            return this;
        }
    }

    @com.google.android.gms.common.util.D
    /* loaded from: classes.dex */
    public static class g extends d<g> {
        public g() {
            f("&t", C0.f11621y0);
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ g a(@P com.google.android.gms.analytics.ecommerce.a aVar, @P String str) {
            super.a(aVar, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ g b(@P com.google.android.gms.analytics.ecommerce.a aVar) {
            super.b(aVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ g c(@P com.google.android.gms.analytics.ecommerce.c cVar) {
            super.c(cVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ g h(@N String str) {
            super.h(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ g i(int i4, @N String str) {
            super.i(i4, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ g j(int i4, float f4) {
            super.j(i4, f4);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ g l() {
            super.l();
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ g m(boolean z3) {
            super.m(z3);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ g n(@N com.google.android.gms.analytics.ecommerce.b bVar) {
            super.n(bVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ g o(@N String str) {
            super.o(str);
            return this;
        }

        @N
        public g q(@N String str) {
            f("&sa", str);
            return this;
        }

        @N
        public g r(@N String str) {
            f("&sn", str);
            return this;
        }

        @N
        public g s(@N String str) {
            f("&st", str);
            return this;
        }
    }

    @Deprecated
    @com.google.android.gms.common.util.D
    /* loaded from: classes.dex */
    public static class i extends d<i> {
        public i() {
            f("&t", "transaction");
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ i a(@P com.google.android.gms.analytics.ecommerce.a aVar, @P String str) {
            super.a(aVar, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ i b(@P com.google.android.gms.analytics.ecommerce.a aVar) {
            super.b(aVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ i c(@P com.google.android.gms.analytics.ecommerce.c cVar) {
            super.c(cVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ i h(@N String str) {
            super.h(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ i i(int i4, @N String str) {
            super.i(i4, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ i j(int i4, float f4) {
            super.j(i4, f4);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ i l() {
            super.l();
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ i m(boolean z3) {
            super.m(z3);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ i n(@N com.google.android.gms.analytics.ecommerce.b bVar) {
            super.n(bVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ i o(@N String str) {
            super.o(str);
            return this;
        }

        @N
        public i q(@N String str) {
            f("&ta", str);
            return this;
        }

        @N
        public i r(@N String str) {
            f("&cu", str);
            return this;
        }

        @N
        public i s(double d4) {
            f("&tr", Double.toString(d4));
            return this;
        }

        @N
        public i t(double d4) {
            f("&ts", Double.toString(d4));
            return this;
        }

        @N
        public i u(double d4) {
            f("&tt", Double.toString(d4));
            return this;
        }

        @N
        public i v(@N String str) {
            f("&ti", str);
            return this;
        }
    }

    @com.google.android.gms.common.util.D
    /* loaded from: classes.dex */
    public static class b extends d<b> {
        public b() {
            f("&t", "event");
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ b a(@P com.google.android.gms.analytics.ecommerce.a aVar, @P String str) {
            super.a(aVar, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ b b(@P com.google.android.gms.analytics.ecommerce.a aVar) {
            super.b(aVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ b c(@P com.google.android.gms.analytics.ecommerce.c cVar) {
            super.c(cVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ b h(@N String str) {
            super.h(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ b i(int i4, @N String str) {
            super.i(i4, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ b j(int i4, float f4) {
            super.j(i4, f4);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ b l() {
            super.l();
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ b m(boolean z3) {
            super.m(z3);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ b n(@N com.google.android.gms.analytics.ecommerce.b bVar) {
            super.n(bVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ b o(@N String str) {
            super.o(str);
            return this;
        }

        @N
        public b q(@N String str) {
            f("&ea", str);
            return this;
        }

        @N
        public b r(@N String str) {
            f("&ec", str);
            return this;
        }

        @N
        public b s(@N String str) {
            f("&el", str);
            return this;
        }

        @N
        public b t(long j4) {
            f("&ev", Long.toString(j4));
            return this;
        }

        public b(@N String str, @N String str2) {
            this();
            r(str);
            q(str2);
        }
    }

    @com.google.android.gms.common.util.D
    /* loaded from: classes.dex */
    public static class h extends d<h> {
        public h() {
            f("&t", "timing");
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ h a(@P com.google.android.gms.analytics.ecommerce.a aVar, @P String str) {
            super.a(aVar, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ h b(@P com.google.android.gms.analytics.ecommerce.a aVar) {
            super.b(aVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ h c(@P com.google.android.gms.analytics.ecommerce.c cVar) {
            super.c(cVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ h h(@N String str) {
            super.h(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ h i(int i4, @N String str) {
            super.i(i4, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ h j(int i4, float f4) {
            super.j(i4, f4);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ h l() {
            super.l();
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ h m(boolean z3) {
            super.m(z3);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ h n(@N com.google.android.gms.analytics.ecommerce.b bVar) {
            super.n(bVar);
            return this;
        }

        @Override // com.google.android.gms.analytics.f.d
        @N
        public final /* bridge */ /* synthetic */ h o(@N String str) {
            super.o(str);
            return this;
        }

        @N
        public h q(@N String str) {
            f("&utc", str);
            return this;
        }

        @N
        public h r(@N String str) {
            f("&utl", str);
            return this;
        }

        @N
        public h s(long j4) {
            f("&utt", Long.toString(j4));
            return this;
        }

        @N
        public h t(@N String str) {
            f("&utv", str);
            return this;
        }

        public h(@N String str, @N String str2, long j4) {
            this();
            t(str2);
            s(j4);
            q(str);
        }
    }
}
