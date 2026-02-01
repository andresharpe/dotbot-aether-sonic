package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.core.content.C0669d;

/* loaded from: classes.dex */
public class n {

    /* renamed from: o, reason: collision with root package name */
    public static final String f16945o = "_has_set_default_values";

    /* renamed from: p, reason: collision with root package name */
    private static final int f16946p = 0;

    /* renamed from: q, reason: collision with root package name */
    private static final int f16947q = 1;

    /* renamed from: a, reason: collision with root package name */
    private final Context f16948a;

    /* renamed from: c, reason: collision with root package name */
    @P
    private SharedPreferences f16950c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private g f16951d;

    /* renamed from: e, reason: collision with root package name */
    @P
    private SharedPreferences.Editor f16952e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16953f;

    /* renamed from: g, reason: collision with root package name */
    private String f16954g;

    /* renamed from: h, reason: collision with root package name */
    private int f16955h;

    /* renamed from: j, reason: collision with root package name */
    private PreferenceScreen f16957j;

    /* renamed from: k, reason: collision with root package name */
    private d f16958k;

    /* renamed from: l, reason: collision with root package name */
    private c f16959l;

    /* renamed from: m, reason: collision with root package name */
    private a f16960m;

    /* renamed from: n, reason: collision with root package name */
    private b f16961n;

    /* renamed from: b, reason: collision with root package name */
    private long f16949b = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f16956i = 0;

    /* loaded from: classes.dex */
    public interface a {
        void onDisplayPreferenceDialog(@N Preference preference);
    }

    /* loaded from: classes.dex */
    public interface b {
        void onNavigateToScreen(@N PreferenceScreen preferenceScreen);
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean onPreferenceTreeClick(@N Preference preference);
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public abstract boolean a(@N Preference preference, @N Preference preference2);

        public abstract boolean b(@N Preference preference, @N Preference preference2);
    }

    /* loaded from: classes.dex */
    public static class e extends d {
        @Override // androidx.preference.n.d
        public boolean a(@N Preference preference, @N Preference preference2) {
            if (preference.getClass() != preference2.getClass()) {
                return false;
            }
            if ((preference == preference2 && preference.l1()) || !TextUtils.equals(preference.M(), preference2.M()) || !TextUtils.equals(preference.K(), preference2.K())) {
                return false;
            }
            Drawable r4 = preference.r();
            Drawable r5 = preference2.r();
            if ((r4 != r5 && (r4 == null || !r4.equals(r5))) || preference.Q() != preference2.Q() || preference.T() != preference2.T()) {
                return false;
            }
            if ((preference instanceof TwoStatePreference) && ((TwoStatePreference) preference).p1() != ((TwoStatePreference) preference2).p1()) {
                return false;
            }
            if ((preference instanceof DropDownPreference) && preference != preference2) {
                return false;
            }
            return true;
        }

        @Override // androidx.preference.n.d
        public boolean b(@N Preference preference, @N Preference preference2) {
            if (preference.s() == preference2.s()) {
                return true;
            }
            return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public n(@N Context context) {
        this.f16948a = context;
        E(f(context));
    }

    public static SharedPreferences d(@N Context context) {
        return context.getSharedPreferences(f(context), e());
    }

    private static int e() {
        return 0;
    }

    private static String f(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public static void u(@N Context context, int i4, boolean z3) {
        v(context, f(context), e(), i4, z3);
    }

    public static void v(@N Context context, String str, int i4, int i5, boolean z3) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f16945o, 0);
        if (z3 || !sharedPreferences.getBoolean(f16945o, false)) {
            n nVar = new n(context);
            nVar.E(str);
            nVar.D(i4);
            nVar.r(context, i5, null);
            sharedPreferences.edit().putBoolean(f16945o, true).apply();
        }
    }

    private void w(boolean z3) {
        SharedPreferences.Editor editor;
        if (!z3 && (editor = this.f16952e) != null) {
            editor.apply();
        }
        this.f16953f = z3;
    }

    public void A(@P d dVar) {
        this.f16958k = dVar;
    }

    public void B(@P g gVar) {
        this.f16951d = gVar;
    }

    public boolean C(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.f16957j;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.g0();
            }
            this.f16957j = preferenceScreen;
            return true;
        }
        return false;
    }

    public void D(int i4) {
        this.f16955h = i4;
        this.f16950c = null;
    }

    public void E(String str) {
        this.f16954g = str;
        this.f16950c = null;
    }

    public void F() {
        this.f16956i = 0;
        this.f16950c = null;
    }

    public void G() {
        this.f16956i = 1;
        this.f16950c = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean H() {
        return !this.f16953f;
    }

    public void I(@N Preference preference) {
        a aVar = this.f16960m;
        if (aVar != null) {
            aVar.onDisplayPreferenceDialog(preference);
        }
    }

    @N
    public PreferenceScreen a(@N Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.b0(this);
        return preferenceScreen;
    }

    @P
    public <T extends Preference> T b(@N CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f16957j;
        if (preferenceScreen == null) {
            return null;
        }
        return (T) preferenceScreen.o1(charSequence);
    }

    @N
    public Context c() {
        return this.f16948a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public SharedPreferences.Editor g() {
        if (this.f16951d != null) {
            return null;
        }
        if (this.f16953f) {
            if (this.f16952e == null) {
                this.f16952e = o().edit();
            }
            return this.f16952e;
        }
        return o().edit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long h() {
        long j4;
        synchronized (this) {
            j4 = this.f16949b;
            this.f16949b = 1 + j4;
        }
        return j4;
    }

    @P
    public a i() {
        return this.f16960m;
    }

    @P
    public b j() {
        return this.f16961n;
    }

    @P
    public c k() {
        return this.f16959l;
    }

    @P
    public d l() {
        return this.f16958k;
    }

    @P
    public g m() {
        return this.f16951d;
    }

    public PreferenceScreen n() {
        return this.f16957j;
    }

    @P
    public SharedPreferences o() {
        Context b4;
        if (m() != null) {
            return null;
        }
        if (this.f16950c == null) {
            if (this.f16956i != 1) {
                b4 = this.f16948a;
            } else {
                b4 = C0669d.b(this.f16948a);
            }
            this.f16950c = b4.getSharedPreferences(this.f16954g, this.f16955h);
        }
        return this.f16950c;
    }

    public int p() {
        return this.f16955h;
    }

    public String q() {
        return this.f16954g;
    }

    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PreferenceScreen r(@N Context context, int i4, @P PreferenceScreen preferenceScreen) {
        w(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new m(context, this).e(i4, preferenceScreen);
        preferenceScreen2.b0(this);
        w(false);
        return preferenceScreen2;
    }

    public boolean s() {
        if (this.f16956i == 0) {
            return true;
        }
        return false;
    }

    public boolean t() {
        if (this.f16956i == 1) {
            return true;
        }
        return false;
    }

    public void x(@P a aVar) {
        this.f16960m = aVar;
    }

    public void y(@P b bVar) {
        this.f16961n = bVar;
    }

    public void z(@P c cVar) {
        this.f16959l = cVar;
    }
}
