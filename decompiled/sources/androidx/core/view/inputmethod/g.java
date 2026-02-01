package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final c f13541a;

    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @N
        private final Uri f13543a;

        /* renamed from: b, reason: collision with root package name */
        @N
        private final ClipDescription f13544b;

        /* renamed from: c, reason: collision with root package name */
        @P
        private final Uri f13545c;

        b(@N Uri uri, @N ClipDescription clipDescription, @P Uri uri2) {
            this.f13543a = uri;
            this.f13544b = clipDescription;
            this.f13545c = uri2;
        }

        @Override // androidx.core.view.inputmethod.g.c
        @N
        public ClipDescription a() {
            return this.f13544b;
        }

        @Override // androidx.core.view.inputmethod.g.c
        @P
        public Uri b() {
            return this.f13545c;
        }

        @Override // androidx.core.view.inputmethod.g.c
        @N
        public Uri c() {
            return this.f13543a;
        }

        @Override // androidx.core.view.inputmethod.g.c
        public void d() {
        }

        @Override // androidx.core.view.inputmethod.g.c
        @P
        public Object e() {
            return null;
        }

        @Override // androidx.core.view.inputmethod.g.c
        public void f() {
        }
    }

    /* loaded from: classes.dex */
    private interface c {
        @N
        ClipDescription a();

        @P
        Uri b();

        @N
        Uri c();

        void d();

        @P
        Object e();

        void f();
    }

    public g(@N Uri uri, @N ClipDescription clipDescription, @P Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f13541a = new a(uri, clipDescription, uri2);
        } else {
            this.f13541a = new b(uri, clipDescription, uri2);
        }
    }

    @P
    public static g g(@P Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 25) {
            return null;
        }
        return new g(new a(obj));
    }

    @N
    public Uri a() {
        return this.f13541a.c();
    }

    @N
    public ClipDescription b() {
        return this.f13541a.a();
    }

    @P
    public Uri c() {
        return this.f13541a.b();
    }

    public void d() {
        this.f13541a.f();
    }

    public void e() {
        this.f13541a.d();
    }

    @P
    public Object f() {
        return this.f13541a.e();
    }

    @W(25)
    /* loaded from: classes.dex */
    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @N
        final InputContentInfo f13542a;

        a(@N Object obj) {
            this.f13542a = (InputContentInfo) obj;
        }

        @Override // androidx.core.view.inputmethod.g.c
        @N
        public ClipDescription a() {
            return this.f13542a.getDescription();
        }

        @Override // androidx.core.view.inputmethod.g.c
        @P
        public Uri b() {
            return this.f13542a.getLinkUri();
        }

        @Override // androidx.core.view.inputmethod.g.c
        @N
        public Uri c() {
            return this.f13542a.getContentUri();
        }

        @Override // androidx.core.view.inputmethod.g.c
        public void d() {
            this.f13542a.requestPermission();
        }

        @Override // androidx.core.view.inputmethod.g.c
        @N
        public Object e() {
            return this.f13542a;
        }

        @Override // androidx.core.view.inputmethod.g.c
        public void f() {
            this.f13542a.releasePermission();
        }

        a(@N Uri uri, @N ClipDescription clipDescription, @P Uri uri2) {
            this.f13542a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private g(@N c cVar) {
        this.f13541a = cVar;
    }
}
