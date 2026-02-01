package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.P;
import androidx.annotation.W;

@W(19)
/* loaded from: classes.dex */
class d extends a {

    /* renamed from: c, reason: collision with root package name */
    private Context f14129c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f14130d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(@P a aVar, Context context, Uri uri) {
        super(aVar);
        this.f14129c = context;
        this.f14130d = uri;
    }

    @Override // androidx.documentfile.provider.a
    public boolean a() {
        return b.a(this.f14129c, this.f14130d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean b() {
        return b.b(this.f14129c, this.f14130d);
    }

    @Override // androidx.documentfile.provider.a
    public a c(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.a
    public a d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f14129c.getContentResolver(), this.f14130d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean f() {
        return b.d(this.f14129c, this.f14130d);
    }

    @Override // androidx.documentfile.provider.a
    @P
    public String k() {
        return b.f(this.f14129c, this.f14130d);
    }

    @Override // androidx.documentfile.provider.a
    @P
    public String m() {
        return b.h(this.f14129c, this.f14130d);
    }

    @Override // androidx.documentfile.provider.a
    public Uri n() {
        return this.f14130d;
    }

    @Override // androidx.documentfile.provider.a
    public boolean o() {
        return b.i(this.f14129c, this.f14130d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean q() {
        return b.j(this.f14129c, this.f14130d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean r() {
        return b.k(this.f14129c, this.f14130d);
    }

    @Override // androidx.documentfile.provider.a
    public long s() {
        return b.l(this.f14129c, this.f14130d);
    }

    @Override // androidx.documentfile.provider.a
    public long t() {
        return b.m(this.f14129c, this.f14130d);
    }

    @Override // androidx.documentfile.provider.a
    public a[] u() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.a
    public boolean v(String str) {
        throw new UnsupportedOperationException();
    }
}
