package androidx.core.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: h, reason: collision with root package name */
    public static final String f12105h = "android.remoteinput.results";

    /* renamed from: i, reason: collision with root package name */
    public static final String f12106i = "android.remoteinput.resultsData";

    /* renamed from: j, reason: collision with root package name */
    private static final String f12107j = "android.remoteinput.dataTypeResultsData";

    /* renamed from: k, reason: collision with root package name */
    private static final String f12108k = "android.remoteinput.resultsSource";

    /* renamed from: l, reason: collision with root package name */
    public static final int f12109l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f12110m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f12111n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f12112o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f12113p = 2;

    /* renamed from: a, reason: collision with root package name */
    private final String f12114a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f12115b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence[] f12116c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12117d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12118e;

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f12119f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<String> f12120g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static ClipData a(Intent intent) {
            return intent.getClipData();
        }

        @InterfaceC0577u
        static void b(Intent intent, ClipData clipData) {
            intent.setClipData(clipData);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(20)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @InterfaceC0577u
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(v1 v1Var) {
            Set<String> g4;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(v1Var.o()).setLabel(v1Var.n()).setChoices(v1Var.h()).setAllowFreeFormInput(v1Var.f()).addExtras(v1Var.m());
            if (Build.VERSION.SDK_INT >= 26 && (g4 = v1Var.g()) != null) {
                Iterator<String> it = g4.iterator();
                while (it.hasNext()) {
                    c.d(addExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                e.b(addExtras, v1Var.k());
            }
            return addExtras.build();
        }

        static v1 c(Object obj) {
            Set<String> b4;
            RemoteInput remoteInput = (RemoteInput) obj;
            f a4 = new f(remoteInput.getResultKey()).h(remoteInput.getLabel()).f(remoteInput.getChoices()).e(remoteInput.getAllowFreeFormInput()).a(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (b4 = c.b(remoteInput)) != null) {
                Iterator<String> it = b4.iterator();
                while (it.hasNext()) {
                    a4.d(it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                a4.g(e.a(remoteInput));
            }
            return a4.b();
        }

        @InterfaceC0577u
        static Bundle d(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(26)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @InterfaceC0577u
        static void a(v1 v1Var, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(v1.c(v1Var), intent, map);
        }

        @InterfaceC0577u
        static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        @InterfaceC0577u
        static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        @InterfaceC0577u
        static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z3) {
            return builder.setAllowDataType(str, z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(28)
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }

        @InterfaceC0577u
        static int a(Intent intent) {
            return RemoteInput.getResultsSource(intent);
        }

        @InterfaceC0577u
        static void b(Intent intent, int i4) {
            RemoteInput.setResultsSource(intent, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
    /* loaded from: classes.dex */
    public static class e {
        private e() {
        }

        @InterfaceC0577u
        static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        @InterfaceC0577u
        static RemoteInput.Builder b(RemoteInput.Builder builder, int i4) {
            return builder.setEditChoicesBeforeSending(i4);
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final String f12121a;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f12124d;

        /* renamed from: e, reason: collision with root package name */
        private CharSequence[] f12125e;

        /* renamed from: b, reason: collision with root package name */
        private final Set<String> f12122b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Bundle f12123c = new Bundle();

        /* renamed from: f, reason: collision with root package name */
        private boolean f12126f = true;

        /* renamed from: g, reason: collision with root package name */
        private int f12127g = 0;

        public f(@androidx.annotation.N String str) {
            if (str != null) {
                this.f12121a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        @androidx.annotation.N
        public f a(@androidx.annotation.N Bundle bundle) {
            if (bundle != null) {
                this.f12123c.putAll(bundle);
            }
            return this;
        }

        @androidx.annotation.N
        public v1 b() {
            return new v1(this.f12121a, this.f12124d, this.f12125e, this.f12126f, this.f12127g, this.f12123c, this.f12122b);
        }

        @androidx.annotation.N
        public Bundle c() {
            return this.f12123c;
        }

        @androidx.annotation.N
        public f d(@androidx.annotation.N String str, boolean z3) {
            if (z3) {
                this.f12122b.add(str);
            } else {
                this.f12122b.remove(str);
            }
            return this;
        }

        @androidx.annotation.N
        public f e(boolean z3) {
            this.f12126f = z3;
            return this;
        }

        @androidx.annotation.N
        public f f(@androidx.annotation.P CharSequence[] charSequenceArr) {
            this.f12125e = charSequenceArr;
            return this;
        }

        @androidx.annotation.N
        public f g(int i4) {
            this.f12127g = i4;
            return this;
        }

        @androidx.annotation.N
        public f h(@androidx.annotation.P CharSequence charSequence) {
            this.f12124d = charSequence;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface g {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface h {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v1(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z3, int i4, Bundle bundle, Set<String> set) {
        this.f12114a = str;
        this.f12115b = charSequence;
        this.f12116c = charSequenceArr;
        this.f12117d = z3;
        this.f12118e = i4;
        this.f12119f = bundle;
        this.f12120g = set;
        if (k() == 2 && !f()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static void a(@androidx.annotation.N v1 v1Var, @androidx.annotation.N Intent intent, @androidx.annotation.N Map<String, Uri> map) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.a(v1Var, intent, map);
            return;
        }
        Intent i4 = i(intent);
        if (i4 == null) {
            i4 = new Intent();
        }
        for (Map.Entry<String, Uri> entry : map.entrySet()) {
            String key = entry.getKey();
            Uri value = entry.getValue();
            if (key != null) {
                Bundle bundleExtra = i4.getBundleExtra(l(key));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(v1Var.o(), value.toString());
                i4.putExtra(l(key), bundleExtra);
            }
        }
        a.b(intent, ClipData.newIntent(f12105h, i4));
    }

    public static void b(@androidx.annotation.N v1[] v1VarArr, @androidx.annotation.N Intent intent, @androidx.annotation.N Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(d(v1VarArr), intent, bundle);
            return;
        }
        Bundle p4 = p(intent);
        int q4 = q(intent);
        if (p4 != null) {
            p4.putAll(bundle);
            bundle = p4;
        }
        for (v1 v1Var : v1VarArr) {
            Map<String, Uri> j4 = j(intent, v1Var.o());
            b.a(d(new v1[]{v1Var}), intent, bundle);
            if (j4 != null) {
                a(v1Var, intent, j4);
            }
        }
        s(intent, q4);
    }

    @androidx.annotation.W(20)
    static RemoteInput c(v1 v1Var) {
        return b.b(v1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(20)
    public static RemoteInput[] d(v1[] v1VarArr) {
        if (v1VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[v1VarArr.length];
        for (int i4 = 0; i4 < v1VarArr.length; i4++) {
            remoteInputArr[i4] = c(v1VarArr[i4]);
        }
        return remoteInputArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(20)
    public static v1 e(RemoteInput remoteInput) {
        return b.c(remoteInput);
    }

    @androidx.annotation.W(16)
    private static Intent i(Intent intent) {
        ClipData a4 = a.a(intent);
        if (a4 == null) {
            return null;
        }
        ClipDescription description = a4.getDescription();
        if (!description.hasMimeType("text/vnd.android.intent") || !description.getLabel().toString().contentEquals(f12105h)) {
            return null;
        }
        return a4.getItemAt(0).getIntent();
    }

    @androidx.annotation.P
    public static Map<String, Uri> j(@androidx.annotation.N Intent intent, @androidx.annotation.N String str) {
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            return c.c(intent, str);
        }
        Intent i4 = i(intent);
        if (i4 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : i4.getExtras().keySet()) {
            if (str2.startsWith(f12107j)) {
                String substring = str2.substring(39);
                if (!substring.isEmpty() && (string = i4.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    hashMap.put(substring, Uri.parse(string));
                }
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    private static String l(String str) {
        return f12107j + str;
    }

    @androidx.annotation.P
    public static Bundle p(@androidx.annotation.N Intent intent) {
        return b.d(intent);
    }

    public static int q(@androidx.annotation.N Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.a(intent);
        }
        Intent i4 = i(intent);
        if (i4 == null) {
            return 0;
        }
        return i4.getExtras().getInt(f12108k, 0);
    }

    public static void s(@androidx.annotation.N Intent intent, int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            d.b(intent, i4);
            return;
        }
        Intent i5 = i(intent);
        if (i5 == null) {
            i5 = new Intent();
        }
        i5.putExtra(f12108k, i4);
        a.b(intent, ClipData.newIntent(f12105h, i5));
    }

    public boolean f() {
        return this.f12117d;
    }

    @androidx.annotation.P
    public Set<String> g() {
        return this.f12120g;
    }

    @androidx.annotation.P
    public CharSequence[] h() {
        return this.f12116c;
    }

    public int k() {
        return this.f12118e;
    }

    @androidx.annotation.N
    public Bundle m() {
        return this.f12119f;
    }

    @androidx.annotation.P
    public CharSequence n() {
        return this.f12115b;
    }

    @androidx.annotation.N
    public String o() {
        return this.f12114a;
    }

    public boolean r() {
        if (!f() && ((h() == null || h().length == 0) && g() != null && !g().isEmpty())) {
            return true;
        }
        return false;
    }
}
