package androidx.core.content.pm;

import android.annotation.SuppressLint;
import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.core.app.t1;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class Q {

    /* renamed from: C, reason: collision with root package name */
    private static final String f12259C = "extraPersonCount";

    /* renamed from: D, reason: collision with root package name */
    private static final String f12260D = "extraPerson_";

    /* renamed from: E, reason: collision with root package name */
    private static final String f12261E = "extraLocusId";

    /* renamed from: F, reason: collision with root package name */
    private static final String f12262F = "extraLongLived";

    /* renamed from: G, reason: collision with root package name */
    private static final String f12263G = "extraSliceUri";

    /* renamed from: H, reason: collision with root package name */
    public static final int f12264H = 1;

    /* renamed from: A, reason: collision with root package name */
    int f12265A;

    /* renamed from: B, reason: collision with root package name */
    int f12266B;

    /* renamed from: a, reason: collision with root package name */
    Context f12267a;

    /* renamed from: b, reason: collision with root package name */
    String f12268b;

    /* renamed from: c, reason: collision with root package name */
    String f12269c;

    /* renamed from: d, reason: collision with root package name */
    Intent[] f12270d;

    /* renamed from: e, reason: collision with root package name */
    ComponentName f12271e;

    /* renamed from: f, reason: collision with root package name */
    CharSequence f12272f;

    /* renamed from: g, reason: collision with root package name */
    CharSequence f12273g;

    /* renamed from: h, reason: collision with root package name */
    CharSequence f12274h;

    /* renamed from: i, reason: collision with root package name */
    IconCompat f12275i;

    /* renamed from: j, reason: collision with root package name */
    boolean f12276j;

    /* renamed from: k, reason: collision with root package name */
    t1[] f12277k;

    /* renamed from: l, reason: collision with root package name */
    Set<String> f12278l;

    /* renamed from: m, reason: collision with root package name */
    @androidx.annotation.P
    androidx.core.content.E f12279m;

    /* renamed from: n, reason: collision with root package name */
    boolean f12280n;

    /* renamed from: o, reason: collision with root package name */
    int f12281o;

    /* renamed from: p, reason: collision with root package name */
    PersistableBundle f12282p;

    /* renamed from: q, reason: collision with root package name */
    Bundle f12283q;

    /* renamed from: r, reason: collision with root package name */
    long f12284r;

    /* renamed from: s, reason: collision with root package name */
    UserHandle f12285s;

    /* renamed from: t, reason: collision with root package name */
    boolean f12286t;

    /* renamed from: u, reason: collision with root package name */
    boolean f12287u;

    /* renamed from: v, reason: collision with root package name */
    boolean f12288v;

    /* renamed from: w, reason: collision with root package name */
    boolean f12289w;

    /* renamed from: x, reason: collision with root package name */
    boolean f12290x;

    /* renamed from: y, reason: collision with root package name */
    boolean f12291y = true;

    /* renamed from: z, reason: collision with root package name */
    boolean f12292z;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface b {
    }

    Q() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.W(22)
    private PersistableBundle b() {
        if (this.f12282p == null) {
            this.f12282p = new PersistableBundle();
        }
        t1[] t1VarArr = this.f12277k;
        if (t1VarArr != null && t1VarArr.length > 0) {
            this.f12282p.putInt(f12259C, t1VarArr.length);
            int i4 = 0;
            while (i4 < this.f12277k.length) {
                PersistableBundle persistableBundle = this.f12282p;
                StringBuilder sb = new StringBuilder();
                sb.append(f12260D);
                int i5 = i4 + 1;
                sb.append(i5);
                persistableBundle.putPersistableBundle(sb.toString(), this.f12277k[i4].n());
                i4 = i5;
            }
        }
        androidx.core.content.E e4 = this.f12279m;
        if (e4 != null) {
            this.f12282p.putString(f12261E, e4.a());
        }
        this.f12282p.putBoolean(f12262F, this.f12280n);
        return this.f12282p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.W(25)
    public static List<Q> c(@androidx.annotation.N Context context, @androidx.annotation.N List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ShortcutInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(context, C0691j.a(it.next())).c());
        }
        return arrayList;
    }

    @androidx.annotation.P
    @androidx.annotation.W(25)
    static androidx.core.content.E p(@androidx.annotation.N ShortcutInfo shortcutInfo) {
        PersistableBundle extras;
        LocusId locusId;
        LocusId locusId2;
        if (Build.VERSION.SDK_INT >= 29) {
            locusId = shortcutInfo.getLocusId();
            if (locusId != null) {
                locusId2 = shortcutInfo.getLocusId();
                return androidx.core.content.E.d(locusId2);
            }
            return null;
        }
        extras = shortcutInfo.getExtras();
        return q(extras);
    }

    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.W(25)
    private static androidx.core.content.E q(@androidx.annotation.P PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString(f12261E)) == null) {
            return null;
        }
        return new androidx.core.content.E(string);
    }

    @androidx.annotation.i0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.W(25)
    static boolean s(@androidx.annotation.P PersistableBundle persistableBundle) {
        if (persistableBundle != null && persistableBundle.containsKey(f12262F)) {
            return persistableBundle.getBoolean(f12262F);
        }
        return false;
    }

    @androidx.annotation.P
    @androidx.annotation.W(25)
    @androidx.annotation.i0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static t1[] u(@androidx.annotation.N PersistableBundle persistableBundle) {
        if (persistableBundle != null && persistableBundle.containsKey(f12259C)) {
            int i4 = persistableBundle.getInt(f12259C);
            t1[] t1VarArr = new t1[i4];
            int i5 = 0;
            while (i5 < i4) {
                StringBuilder sb = new StringBuilder();
                sb.append(f12260D);
                int i6 = i5 + 1;
                sb.append(i6);
                t1VarArr[i5] = t1.c(persistableBundle.getPersistableBundle(sb.toString()));
                i5 = i6;
            }
            return t1VarArr;
        }
        return null;
    }

    public boolean A() {
        return this.f12286t;
    }

    public boolean B() {
        return this.f12289w;
    }

    public boolean C() {
        return this.f12287u;
    }

    public boolean D() {
        return this.f12291y;
    }

    public boolean E(int i4) {
        if ((i4 & this.f12266B) != 0) {
            return true;
        }
        return false;
    }

    public boolean F() {
        return this.f12290x;
    }

    public boolean G() {
        return this.f12288v;
    }

    @androidx.annotation.W(25)
    public ShortcutInfo H() {
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder intents;
        ShortcutInfo build;
        C0695n.a();
        shortLabel = C0694m.a(this.f12267a, this.f12268b).setShortLabel(this.f12272f);
        intents = shortLabel.setIntents(this.f12270d);
        IconCompat iconCompat = this.f12275i;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.M(this.f12267a));
        }
        if (!TextUtils.isEmpty(this.f12273g)) {
            intents.setLongLabel(this.f12273g);
        }
        if (!TextUtils.isEmpty(this.f12274h)) {
            intents.setDisabledMessage(this.f12274h);
        }
        ComponentName componentName = this.f12271e;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f12278l;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f12281o);
        PersistableBundle persistableBundle = this.f12282p;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT < 29) {
            intents.setExtras(b());
        } else {
            t1[] t1VarArr = this.f12277k;
            if (t1VarArr != null && t1VarArr.length > 0) {
                int length = t1VarArr.length;
                Person[] personArr = new Person[length];
                for (int i4 = 0; i4 < length; i4++) {
                    personArr[i4] = this.f12277k[i4].k();
                }
                intents.setPersons(personArr);
            }
            androidx.core.content.E e4 = this.f12279m;
            if (e4 != null) {
                intents.setLocusId(e4.c());
            }
            intents.setLongLived(this.f12280n);
        }
        build = intents.build();
        return build;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Intent a(Intent intent) {
        intent.putExtra("android.intent.extra.shortcut.INTENT", this.f12270d[r0.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f12272f.toString());
        if (this.f12275i != null) {
            Drawable drawable = null;
            if (this.f12276j) {
                PackageManager packageManager = this.f12267a.getPackageManager();
                ComponentName componentName = this.f12271e;
                if (componentName != null) {
                    try {
                        drawable = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (drawable == null) {
                    drawable = this.f12267a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.f12275i.j(intent, drawable, this.f12267a);
        }
        return intent;
    }

    @androidx.annotation.P
    public ComponentName d() {
        return this.f12271e;
    }

    @androidx.annotation.P
    public Set<String> e() {
        return this.f12278l;
    }

    @androidx.annotation.P
    public CharSequence f() {
        return this.f12274h;
    }

    public int g() {
        return this.f12265A;
    }

    public int h() {
        return this.f12266B;
    }

    @androidx.annotation.P
    public PersistableBundle i() {
        return this.f12282p;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public IconCompat j() {
        return this.f12275i;
    }

    @androidx.annotation.N
    public String k() {
        return this.f12268b;
    }

    @androidx.annotation.N
    public Intent l() {
        return this.f12270d[r0.length - 1];
    }

    @androidx.annotation.N
    public Intent[] m() {
        Intent[] intentArr = this.f12270d;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    public long n() {
        return this.f12284r;
    }

    @androidx.annotation.P
    public androidx.core.content.E o() {
        return this.f12279m;
    }

    @androidx.annotation.P
    public CharSequence r() {
        return this.f12273g;
    }

    @androidx.annotation.N
    public String t() {
        return this.f12269c;
    }

    public int v() {
        return this.f12281o;
    }

    @androidx.annotation.N
    public CharSequence w() {
        return this.f12272f;
    }

    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Bundle x() {
        return this.f12283q;
    }

    @androidx.annotation.P
    public UserHandle y() {
        return this.f12285s;
    }

    public boolean z() {
        return this.f12292z;
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Q f12293a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f12294b;

        /* renamed from: c, reason: collision with root package name */
        private Set<String> f12295c;

        /* renamed from: d, reason: collision with root package name */
        private Map<String, Map<String, List<String>>> f12296d;

        /* renamed from: e, reason: collision with root package name */
        private Uri f12297e;

        public a(@androidx.annotation.N Context context, @androidx.annotation.N String str) {
            Q q4 = new Q();
            this.f12293a = q4;
            q4.f12267a = context;
            q4.f12268b = str;
        }

        @androidx.annotation.N
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public a a(@androidx.annotation.N String str) {
            if (this.f12295c == null) {
                this.f12295c = new HashSet();
            }
            this.f12295c.add(str);
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public a b(@androidx.annotation.N String str, @androidx.annotation.N String str2, @androidx.annotation.N List<String> list) {
            a(str);
            if (!list.isEmpty()) {
                if (this.f12296d == null) {
                    this.f12296d = new HashMap();
                }
                if (this.f12296d.get(str) == null) {
                    this.f12296d.put(str, new HashMap());
                }
                this.f12296d.get(str).put(str2, list);
            }
            return this;
        }

        @androidx.annotation.N
        public Q c() {
            String[] strArr;
            if (!TextUtils.isEmpty(this.f12293a.f12272f)) {
                Q q4 = this.f12293a;
                Intent[] intentArr = q4.f12270d;
                if (intentArr != null && intentArr.length != 0) {
                    if (this.f12294b) {
                        if (q4.f12279m == null) {
                            q4.f12279m = new androidx.core.content.E(q4.f12268b);
                        }
                        this.f12293a.f12280n = true;
                    }
                    if (this.f12295c != null) {
                        Q q5 = this.f12293a;
                        if (q5.f12278l == null) {
                            q5.f12278l = new HashSet();
                        }
                        this.f12293a.f12278l.addAll(this.f12295c);
                    }
                    if (this.f12296d != null) {
                        Q q6 = this.f12293a;
                        if (q6.f12282p == null) {
                            q6.f12282p = new PersistableBundle();
                        }
                        for (String str : this.f12296d.keySet()) {
                            Map<String, List<String>> map = this.f12296d.get(str);
                            this.f12293a.f12282p.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                            for (String str2 : map.keySet()) {
                                List<String> list = map.get(str2);
                                PersistableBundle persistableBundle = this.f12293a.f12282p;
                                String str3 = str + "/" + str2;
                                if (list == null) {
                                    strArr = new String[0];
                                } else {
                                    strArr = (String[]) list.toArray(new String[0]);
                                }
                                persistableBundle.putStringArray(str3, strArr);
                            }
                        }
                    }
                    if (this.f12297e != null) {
                        Q q7 = this.f12293a;
                        if (q7.f12282p == null) {
                            q7.f12282p = new PersistableBundle();
                        }
                        this.f12293a.f12282p.putString(Q.f12263G, androidx.core.net.e.a(this.f12297e));
                    }
                    return this.f12293a;
                }
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        @androidx.annotation.N
        public a d(@androidx.annotation.N ComponentName componentName) {
            this.f12293a.f12271e = componentName;
            return this;
        }

        @androidx.annotation.N
        public a e() {
            this.f12293a.f12276j = true;
            return this;
        }

        @androidx.annotation.N
        public a f(@androidx.annotation.N Set<String> set) {
            this.f12293a.f12278l = set;
            return this;
        }

        @androidx.annotation.N
        public a g(@androidx.annotation.N CharSequence charSequence) {
            this.f12293a.f12274h = charSequence;
            return this;
        }

        @androidx.annotation.N
        public a h(int i4) {
            this.f12293a.f12266B = i4;
            return this;
        }

        @androidx.annotation.N
        public a i(@androidx.annotation.N PersistableBundle persistableBundle) {
            this.f12293a.f12282p = persistableBundle;
            return this;
        }

        @androidx.annotation.N
        public a j(IconCompat iconCompat) {
            this.f12293a.f12275i = iconCompat;
            return this;
        }

        @androidx.annotation.N
        public a k(@androidx.annotation.N Intent intent) {
            return l(new Intent[]{intent});
        }

        @androidx.annotation.N
        public a l(@androidx.annotation.N Intent[] intentArr) {
            this.f12293a.f12270d = intentArr;
            return this;
        }

        @androidx.annotation.N
        public a m() {
            this.f12294b = true;
            return this;
        }

        @androidx.annotation.N
        public a n(@androidx.annotation.P androidx.core.content.E e4) {
            this.f12293a.f12279m = e4;
            return this;
        }

        @androidx.annotation.N
        public a o(@androidx.annotation.N CharSequence charSequence) {
            this.f12293a.f12273g = charSequence;
            return this;
        }

        @androidx.annotation.N
        @Deprecated
        public a p() {
            this.f12293a.f12280n = true;
            return this;
        }

        @androidx.annotation.N
        public a q(boolean z3) {
            this.f12293a.f12280n = z3;
            return this;
        }

        @androidx.annotation.N
        public a r(@androidx.annotation.N t1 t1Var) {
            return s(new t1[]{t1Var});
        }

        @androidx.annotation.N
        public a s(@androidx.annotation.N t1[] t1VarArr) {
            this.f12293a.f12277k = t1VarArr;
            return this;
        }

        @androidx.annotation.N
        public a t(int i4) {
            this.f12293a.f12281o = i4;
            return this;
        }

        @androidx.annotation.N
        public a u(@androidx.annotation.N CharSequence charSequence) {
            this.f12293a.f12272f = charSequence;
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public a v(@androidx.annotation.N Uri uri) {
            this.f12297e = uri;
            return this;
        }

        @androidx.annotation.N
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public a w(@androidx.annotation.N Bundle bundle) {
            this.f12293a.f12283q = (Bundle) androidx.core.util.u.l(bundle);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public a(@androidx.annotation.N Q q4) {
            Q q5 = new Q();
            this.f12293a = q5;
            q5.f12267a = q4.f12267a;
            q5.f12268b = q4.f12268b;
            q5.f12269c = q4.f12269c;
            Intent[] intentArr = q4.f12270d;
            q5.f12270d = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            q5.f12271e = q4.f12271e;
            q5.f12272f = q4.f12272f;
            q5.f12273g = q4.f12273g;
            q5.f12274h = q4.f12274h;
            q5.f12265A = q4.f12265A;
            q5.f12275i = q4.f12275i;
            q5.f12276j = q4.f12276j;
            q5.f12285s = q4.f12285s;
            q5.f12284r = q4.f12284r;
            q5.f12286t = q4.f12286t;
            q5.f12287u = q4.f12287u;
            q5.f12288v = q4.f12288v;
            q5.f12289w = q4.f12289w;
            q5.f12290x = q4.f12290x;
            q5.f12291y = q4.f12291y;
            q5.f12279m = q4.f12279m;
            q5.f12280n = q4.f12280n;
            q5.f12292z = q4.f12292z;
            q5.f12281o = q4.f12281o;
            t1[] t1VarArr = q4.f12277k;
            if (t1VarArr != null) {
                q5.f12277k = (t1[]) Arrays.copyOf(t1VarArr, t1VarArr.length);
            }
            if (q4.f12278l != null) {
                q5.f12278l = new HashSet(q4.f12278l);
            }
            PersistableBundle persistableBundle = q4.f12282p;
            if (persistableBundle != null) {
                q5.f12282p = persistableBundle;
            }
            q5.f12266B = q4.f12266B;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.W(25)
        public a(@androidx.annotation.N Context context, @androidx.annotation.N ShortcutInfo shortcutInfo) {
            String id;
            String str;
            Intent[] intents;
            ComponentName activity;
            CharSequence shortLabel;
            CharSequence longLabel;
            CharSequence disabledMessage;
            boolean isEnabled;
            Set<String> categories;
            PersistableBundle extras;
            UserHandle userHandle;
            long lastChangedTimestamp;
            boolean isDynamic;
            boolean isPinned;
            boolean isDeclaredInManifest;
            boolean isImmutable;
            boolean isEnabled2;
            boolean hasKeyFieldsOnly;
            int rank;
            PersistableBundle extras2;
            boolean isCached;
            int disabledReason;
            Q q4 = new Q();
            this.f12293a = q4;
            q4.f12267a = context;
            id = shortcutInfo.getId();
            q4.f12268b = id;
            str = shortcutInfo.getPackage();
            q4.f12269c = str;
            intents = shortcutInfo.getIntents();
            q4.f12270d = (Intent[]) Arrays.copyOf(intents, intents.length);
            activity = shortcutInfo.getActivity();
            q4.f12271e = activity;
            shortLabel = shortcutInfo.getShortLabel();
            q4.f12272f = shortLabel;
            longLabel = shortcutInfo.getLongLabel();
            q4.f12273g = longLabel;
            disabledMessage = shortcutInfo.getDisabledMessage();
            q4.f12274h = disabledMessage;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                disabledReason = shortcutInfo.getDisabledReason();
                q4.f12265A = disabledReason;
            } else {
                isEnabled = shortcutInfo.isEnabled();
                q4.f12265A = isEnabled ? 0 : 3;
            }
            categories = shortcutInfo.getCategories();
            q4.f12278l = categories;
            extras = shortcutInfo.getExtras();
            q4.f12277k = Q.u(extras);
            userHandle = shortcutInfo.getUserHandle();
            q4.f12285s = userHandle;
            lastChangedTimestamp = shortcutInfo.getLastChangedTimestamp();
            q4.f12284r = lastChangedTimestamp;
            if (i4 >= 30) {
                isCached = shortcutInfo.isCached();
                q4.f12286t = isCached;
            }
            isDynamic = shortcutInfo.isDynamic();
            q4.f12287u = isDynamic;
            isPinned = shortcutInfo.isPinned();
            q4.f12288v = isPinned;
            isDeclaredInManifest = shortcutInfo.isDeclaredInManifest();
            q4.f12289w = isDeclaredInManifest;
            isImmutable = shortcutInfo.isImmutable();
            q4.f12290x = isImmutable;
            isEnabled2 = shortcutInfo.isEnabled();
            q4.f12291y = isEnabled2;
            hasKeyFieldsOnly = shortcutInfo.hasKeyFieldsOnly();
            q4.f12292z = hasKeyFieldsOnly;
            q4.f12279m = Q.p(shortcutInfo);
            rank = shortcutInfo.getRank();
            q4.f12281o = rank;
            extras2 = shortcutInfo.getExtras();
            q4.f12282p = extras2;
        }
    }
}
