package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* renamed from: androidx.core.view.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0807f {

    /* renamed from: b, reason: collision with root package name */
    public static final int f13490b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13491c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f13492d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13493e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f13494f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f13495g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f13496h = 1;

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.N
    private final g f13497a;

    @androidx.annotation.W(ConstraintLayout.b.a.f9573F)
    /* renamed from: androidx.core.view.f$a */
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        @InterfaceC0577u
        @androidx.annotation.N
        public static Pair<ContentInfo, ContentInfo> a(@androidx.annotation.N ContentInfo contentInfo, @androidx.annotation.N final Predicate<ClipData.Item> predicate) {
            ContentInfo contentInfo2;
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() == 1) {
                boolean test = predicate.test(clip.getItemAt(0));
                if (test) {
                    contentInfo2 = contentInfo;
                } else {
                    contentInfo2 = null;
                }
                if (test) {
                    contentInfo = null;
                }
                return Pair.create(contentInfo2, contentInfo);
            }
            Objects.requireNonNull(predicate);
            Pair<ClipData, ClipData> h4 = C0807f.h(clip, new androidx.core.util.A() { // from class: androidx.core.view.e
                @Override // androidx.core.util.A
                public final boolean test(Object obj) {
                    return predicate.test((ClipData.Item) obj);
                }
            });
            if (h4.first == null) {
                return Pair.create(null, contentInfo);
            }
            if (h4.second == null) {
                return Pair.create(contentInfo, null);
            }
            return Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) h4.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) h4.second).build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.f$d */
    /* loaded from: classes.dex */
    public interface d {
        @androidx.annotation.N
        C0807f a();

        void b(int i4);

        void c(@androidx.annotation.P Uri uri);

        void d(int i4);

        void e(@androidx.annotation.N ClipData clipData);

        void setExtras(@androidx.annotation.P Bundle bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.W(ConstraintLayout.b.a.f9573F)
    /* renamed from: androidx.core.view.f$f, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0108f implements g {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.N
        private final ContentInfo f13505a;

        C0108f(@androidx.annotation.N ContentInfo contentInfo) {
            this.f13505a = C0801d.a(androidx.core.util.u.l(contentInfo));
        }

        @Override // androidx.core.view.C0807f.g
        public int a() {
            int flags;
            flags = this.f13505a.getFlags();
            return flags;
        }

        @Override // androidx.core.view.C0807f.g
        @androidx.annotation.P
        public Uri b() {
            Uri linkUri;
            linkUri = this.f13505a.getLinkUri();
            return linkUri;
        }

        @Override // androidx.core.view.C0807f.g
        public int c() {
            int source;
            source = this.f13505a.getSource();
            return source;
        }

        @Override // androidx.core.view.C0807f.g
        @androidx.annotation.N
        public ClipData d() {
            ClipData clip;
            clip = this.f13505a.getClip();
            return clip;
        }

        @Override // androidx.core.view.C0807f.g
        @androidx.annotation.N
        public ContentInfo e() {
            return this.f13505a;
        }

        @Override // androidx.core.view.C0807f.g
        @androidx.annotation.P
        public Bundle getExtras() {
            Bundle extras;
            extras = this.f13505a.getExtras();
            return extras;
        }

        @androidx.annotation.N
        public String toString() {
            return "ContentInfoCompat{" + this.f13505a + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.f$g */
    /* loaded from: classes.dex */
    public interface g {
        int a();

        @androidx.annotation.P
        Uri b();

        int c();

        @androidx.annotation.N
        ClipData d();

        @androidx.annotation.P
        ContentInfo e();

        @androidx.annotation.P
        Bundle getExtras();
    }

    /* renamed from: androidx.core.view.f$h */
    /* loaded from: classes.dex */
    private static final class h implements g {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.N
        private final ClipData f13506a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13507b;

        /* renamed from: c, reason: collision with root package name */
        private final int f13508c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.P
        private final Uri f13509d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.P
        private final Bundle f13510e;

        h(e eVar) {
            this.f13506a = (ClipData) androidx.core.util.u.l(eVar.f13500a);
            this.f13507b = androidx.core.util.u.g(eVar.f13501b, 0, 5, "source");
            this.f13508c = androidx.core.util.u.k(eVar.f13502c, 1);
            this.f13509d = eVar.f13503d;
            this.f13510e = eVar.f13504e;
        }

        @Override // androidx.core.view.C0807f.g
        public int a() {
            return this.f13508c;
        }

        @Override // androidx.core.view.C0807f.g
        @androidx.annotation.P
        public Uri b() {
            return this.f13509d;
        }

        @Override // androidx.core.view.C0807f.g
        public int c() {
            return this.f13507b;
        }

        @Override // androidx.core.view.C0807f.g
        @androidx.annotation.N
        public ClipData d() {
            return this.f13506a;
        }

        @Override // androidx.core.view.C0807f.g
        @androidx.annotation.P
        public ContentInfo e() {
            return null;
        }

        @Override // androidx.core.view.C0807f.g
        @androidx.annotation.P
        public Bundle getExtras() {
            return this.f13510e;
        }

        @androidx.annotation.N
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f13506a.getDescription());
            sb.append(", source=");
            sb.append(C0807f.k(this.f13507b));
            sb.append(", flags=");
            sb.append(C0807f.b(this.f13508c));
            String str2 = "";
            if (this.f13509d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f13509d.toString().length() + ")";
            }
            sb.append(str);
            if (this.f13510e != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.view.f$i */
    /* loaded from: classes.dex */
    public @interface i {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.view.f$j */
    /* loaded from: classes.dex */
    public @interface j {
    }

    C0807f(@androidx.annotation.N g gVar) {
        this.f13497a = gVar;
    }

    @androidx.annotation.N
    static ClipData a(@androidx.annotation.N ClipDescription clipDescription, @androidx.annotation.N List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i4 = 1; i4 < list.size(); i4++) {
            clipData.addItem(list.get(i4));
        }
        return clipData;
    }

    @androidx.annotation.N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static String b(int i4) {
        if ((i4 & 1) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(i4);
    }

    @androidx.annotation.N
    static Pair<ClipData, ClipData> h(@androidx.annotation.N ClipData clipData, @androidx.annotation.N androidx.core.util.A<ClipData.Item> a4) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i4 = 0; i4 < clipData.getItemCount(); i4++) {
            ClipData.Item itemAt = clipData.getItemAt(i4);
            if (a4.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        if (arrayList == null) {
            return Pair.create(null, clipData);
        }
        if (arrayList2 == null) {
            return Pair.create(clipData, null);
        }
        return Pair.create(a(clipData.getDescription(), arrayList), a(clipData.getDescription(), arrayList2));
    }

    @androidx.annotation.N
    @androidx.annotation.W(ConstraintLayout.b.a.f9573F)
    public static Pair<ContentInfo, ContentInfo> i(@androidx.annotation.N ContentInfo contentInfo, @androidx.annotation.N Predicate<ClipData.Item> predicate) {
        return a.a(contentInfo, predicate);
    }

    @androidx.annotation.N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static String k(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                return String.valueOf(i4);
                            }
                            return "SOURCE_PROCESS_TEXT";
                        }
                        return "SOURCE_AUTOFILL";
                    }
                    return "SOURCE_DRAG_AND_DROP";
                }
                return "SOURCE_INPUT_METHOD";
            }
            return "SOURCE_CLIPBOARD";
        }
        return "SOURCE_APP";
    }

    @androidx.annotation.N
    @androidx.annotation.W(ConstraintLayout.b.a.f9573F)
    public static C0807f m(@androidx.annotation.N ContentInfo contentInfo) {
        return new C0807f(new C0108f(contentInfo));
    }

    @androidx.annotation.N
    public ClipData c() {
        return this.f13497a.d();
    }

    @androidx.annotation.P
    public Bundle d() {
        return this.f13497a.getExtras();
    }

    public int e() {
        return this.f13497a.a();
    }

    @androidx.annotation.P
    public Uri f() {
        return this.f13497a.b();
    }

    public int g() {
        return this.f13497a.c();
    }

    @androidx.annotation.N
    public Pair<C0807f, C0807f> j(@androidx.annotation.N androidx.core.util.A<ClipData.Item> a4) {
        C0807f c0807f;
        ClipData d4 = this.f13497a.d();
        C0807f c0807f2 = null;
        if (d4.getItemCount() == 1) {
            boolean test = a4.test(d4.getItemAt(0));
            if (test) {
                c0807f = this;
            } else {
                c0807f = null;
            }
            if (!test) {
                c0807f2 = this;
            }
            return Pair.create(c0807f, c0807f2);
        }
        Pair<ClipData, ClipData> h4 = h(d4, a4);
        if (h4.first == null) {
            return Pair.create(null, this);
        }
        if (h4.second == null) {
            return Pair.create(this, null);
        }
        return Pair.create(new b(this).b((ClipData) h4.first).a(), new b(this).b((ClipData) h4.second).a());
    }

    @androidx.annotation.N
    @androidx.annotation.W(ConstraintLayout.b.a.f9573F)
    public ContentInfo l() {
        ContentInfo e4 = this.f13497a.e();
        Objects.requireNonNull(e4);
        return C0801d.a(e4);
    }

    @androidx.annotation.N
    public String toString() {
        return this.f13497a.toString();
    }

    @androidx.annotation.W(ConstraintLayout.b.a.f9573F)
    /* renamed from: androidx.core.view.f$c */
    /* loaded from: classes.dex */
    private static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.N
        private final ContentInfo.Builder f13499a;

        c(@androidx.annotation.N ClipData clipData, int i4) {
            this.f13499a = C0831m.a(clipData, i4);
        }

        @Override // androidx.core.view.C0807f.d
        @androidx.annotation.N
        public C0807f a() {
            ContentInfo build;
            build = this.f13499a.build();
            return new C0807f(new C0108f(build));
        }

        @Override // androidx.core.view.C0807f.d
        public void b(int i4) {
            this.f13499a.setSource(i4);
        }

        @Override // androidx.core.view.C0807f.d
        public void c(@androidx.annotation.P Uri uri) {
            this.f13499a.setLinkUri(uri);
        }

        @Override // androidx.core.view.C0807f.d
        public void d(int i4) {
            this.f13499a.setFlags(i4);
        }

        @Override // androidx.core.view.C0807f.d
        public void e(@androidx.annotation.N ClipData clipData) {
            this.f13499a.setClip(clipData);
        }

        @Override // androidx.core.view.C0807f.d
        public void setExtras(@androidx.annotation.P Bundle bundle) {
            this.f13499a.setExtras(bundle);
        }

        c(@androidx.annotation.N C0807f c0807f) {
            C0837o.a();
            this.f13499a = C0834n.a(c0807f.l());
        }
    }

    /* renamed from: androidx.core.view.f$e */
    /* loaded from: classes.dex */
    private static final class e implements d {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.N
        ClipData f13500a;

        /* renamed from: b, reason: collision with root package name */
        int f13501b;

        /* renamed from: c, reason: collision with root package name */
        int f13502c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.P
        Uri f13503d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.P
        Bundle f13504e;

        e(@androidx.annotation.N ClipData clipData, int i4) {
            this.f13500a = clipData;
            this.f13501b = i4;
        }

        @Override // androidx.core.view.C0807f.d
        @androidx.annotation.N
        public C0807f a() {
            return new C0807f(new h(this));
        }

        @Override // androidx.core.view.C0807f.d
        public void b(int i4) {
            this.f13501b = i4;
        }

        @Override // androidx.core.view.C0807f.d
        public void c(@androidx.annotation.P Uri uri) {
            this.f13503d = uri;
        }

        @Override // androidx.core.view.C0807f.d
        public void d(int i4) {
            this.f13502c = i4;
        }

        @Override // androidx.core.view.C0807f.d
        public void e(@androidx.annotation.N ClipData clipData) {
            this.f13500a = clipData;
        }

        @Override // androidx.core.view.C0807f.d
        public void setExtras(@androidx.annotation.P Bundle bundle) {
            this.f13504e = bundle;
        }

        e(@androidx.annotation.N C0807f c0807f) {
            this.f13500a = c0807f.c();
            this.f13501b = c0807f.g();
            this.f13502c = c0807f.e();
            this.f13503d = c0807f.f();
            this.f13504e = c0807f.d();
        }
    }

    /* renamed from: androidx.core.view.f$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.N
        private final d f13498a;

        public b(@androidx.annotation.N C0807f c0807f) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f13498a = new c(c0807f);
            } else {
                this.f13498a = new e(c0807f);
            }
        }

        @androidx.annotation.N
        public C0807f a() {
            return this.f13498a.a();
        }

        @androidx.annotation.N
        public b b(@androidx.annotation.N ClipData clipData) {
            this.f13498a.e(clipData);
            return this;
        }

        @androidx.annotation.N
        public b c(@androidx.annotation.P Bundle bundle) {
            this.f13498a.setExtras(bundle);
            return this;
        }

        @androidx.annotation.N
        public b d(int i4) {
            this.f13498a.d(i4);
            return this;
        }

        @androidx.annotation.N
        public b e(@androidx.annotation.P Uri uri) {
            this.f13498a.c(uri);
            return this;
        }

        @androidx.annotation.N
        public b f(int i4) {
            this.f13498a.b(i4);
            return this;
        }

        public b(@androidx.annotation.N ClipData clipData, int i4) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f13498a = new c(clipData, i4);
            } else {
                this.f13498a = new e(clipData, i4);
            }
        }
    }
}
