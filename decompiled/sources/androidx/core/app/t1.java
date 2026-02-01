package androidx.core.app;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class t1 {

    /* renamed from: g, reason: collision with root package name */
    private static final String f12079g = "name";

    /* renamed from: h, reason: collision with root package name */
    private static final String f12080h = "icon";

    /* renamed from: i, reason: collision with root package name */
    private static final String f12081i = "uri";

    /* renamed from: j, reason: collision with root package name */
    private static final String f12082j = "key";

    /* renamed from: k, reason: collision with root package name */
    private static final String f12083k = "isBot";

    /* renamed from: l, reason: collision with root package name */
    private static final String f12084l = "isImportant";

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.P
    CharSequence f12085a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.P
    IconCompat f12086b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.P
    String f12087c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.P
    String f12088d;

    /* renamed from: e, reason: collision with root package name */
    boolean f12089e;

    /* renamed from: f, reason: collision with root package name */
    boolean f12090f;

    @androidx.annotation.W(22)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static t1 a(PersistableBundle persistableBundle) {
            return new c().f(persistableBundle.getString("name")).g(persistableBundle.getString(t1.f12081i)).e(persistableBundle.getString(t1.f12082j)).b(persistableBundle.getBoolean(t1.f12083k)).d(persistableBundle.getBoolean(t1.f12084l)).a();
        }

        @InterfaceC0577u
        static PersistableBundle b(t1 t1Var) {
            String str;
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = t1Var.f12085a;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            persistableBundle.putString("name", str);
            persistableBundle.putString(t1.f12081i, t1Var.f12087c);
            persistableBundle.putString(t1.f12082j, t1Var.f12088d);
            persistableBundle.putBoolean(t1.f12083k, t1Var.f12089e);
            persistableBundle.putBoolean(t1.f12084l, t1Var.f12090f);
            return persistableBundle;
        }
    }

    @androidx.annotation.W(28)
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static t1 a(Person person) {
            IconCompat iconCompat;
            c f4 = new c().f(person.getName());
            if (person.getIcon() != null) {
                iconCompat = IconCompat.n(person.getIcon());
            } else {
                iconCompat = null;
            }
            return f4.c(iconCompat).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        @InterfaceC0577u
        static Person b(t1 t1Var) {
            Icon icon;
            Person.Builder name = new Person.Builder().setName(t1Var.f());
            if (t1Var.d() != null) {
                icon = t1Var.d().L();
            } else {
                icon = null;
            }
            return name.setIcon(icon).setUri(t1Var.g()).setKey(t1Var.e()).setBot(t1Var.h()).setImportant(t1Var.i()).build();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.P
        CharSequence f12091a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.P
        IconCompat f12092b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.P
        String f12093c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.P
        String f12094d;

        /* renamed from: e, reason: collision with root package name */
        boolean f12095e;

        /* renamed from: f, reason: collision with root package name */
        boolean f12096f;

        public c() {
        }

        @androidx.annotation.N
        public t1 a() {
            return new t1(this);
        }

        @androidx.annotation.N
        public c b(boolean z3) {
            this.f12095e = z3;
            return this;
        }

        @androidx.annotation.N
        public c c(@androidx.annotation.P IconCompat iconCompat) {
            this.f12092b = iconCompat;
            return this;
        }

        @androidx.annotation.N
        public c d(boolean z3) {
            this.f12096f = z3;
            return this;
        }

        @androidx.annotation.N
        public c e(@androidx.annotation.P String str) {
            this.f12094d = str;
            return this;
        }

        @androidx.annotation.N
        public c f(@androidx.annotation.P CharSequence charSequence) {
            this.f12091a = charSequence;
            return this;
        }

        @androidx.annotation.N
        public c g(@androidx.annotation.P String str) {
            this.f12093c = str;
            return this;
        }

        c(t1 t1Var) {
            this.f12091a = t1Var.f12085a;
            this.f12092b = t1Var.f12086b;
            this.f12093c = t1Var.f12087c;
            this.f12094d = t1Var.f12088d;
            this.f12095e = t1Var.f12089e;
            this.f12096f = t1Var.f12090f;
        }
    }

    t1(c cVar) {
        this.f12085a = cVar.f12091a;
        this.f12086b = cVar.f12092b;
        this.f12087c = cVar.f12093c;
        this.f12088d = cVar.f12094d;
        this.f12089e = cVar.f12095e;
        this.f12090f = cVar.f12096f;
    }

    @androidx.annotation.N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.W(28)
    public static t1 a(@androidx.annotation.N Person person) {
        return b.a(person);
    }

    @androidx.annotation.N
    public static t1 b(@androidx.annotation.N Bundle bundle) {
        IconCompat iconCompat;
        Bundle bundle2 = bundle.getBundle(f12080h);
        c f4 = new c().f(bundle.getCharSequence("name"));
        if (bundle2 != null) {
            iconCompat = IconCompat.l(bundle2);
        } else {
            iconCompat = null;
        }
        return f4.c(iconCompat).g(bundle.getString(f12081i)).e(bundle.getString(f12082j)).b(bundle.getBoolean(f12083k)).d(bundle.getBoolean(f12084l)).a();
    }

    @androidx.annotation.N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.W(22)
    public static t1 c(@androidx.annotation.N PersistableBundle persistableBundle) {
        return a.a(persistableBundle);
    }

    @androidx.annotation.P
    public IconCompat d() {
        return this.f12086b;
    }

    @androidx.annotation.P
    public String e() {
        return this.f12088d;
    }

    @androidx.annotation.P
    public CharSequence f() {
        return this.f12085a;
    }

    @androidx.annotation.P
    public String g() {
        return this.f12087c;
    }

    public boolean h() {
        return this.f12089e;
    }

    public boolean i() {
        return this.f12090f;
    }

    @androidx.annotation.N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public String j() {
        String str = this.f12087c;
        if (str != null) {
            return str;
        }
        if (this.f12085a != null) {
            return "name:" + ((Object) this.f12085a);
        }
        return "";
    }

    @androidx.annotation.N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.W(28)
    public Person k() {
        return b.b(this);
    }

    @androidx.annotation.N
    public c l() {
        return new c(this);
    }

    @androidx.annotation.N
    public Bundle m() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f12085a);
        IconCompat iconCompat = this.f12086b;
        if (iconCompat != null) {
            bundle = iconCompat.b();
        } else {
            bundle = null;
        }
        bundle2.putBundle(f12080h, bundle);
        bundle2.putString(f12081i, this.f12087c);
        bundle2.putString(f12082j, this.f12088d);
        bundle2.putBoolean(f12083k, this.f12089e);
        bundle2.putBoolean(f12084l, this.f12090f);
        return bundle2;
    }

    @androidx.annotation.N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.W(22)
    public PersistableBundle n() {
        return a.b(this);
    }
}
