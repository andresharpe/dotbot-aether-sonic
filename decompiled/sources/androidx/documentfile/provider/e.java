package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import androidx.annotation.P;
import androidx.annotation.W;
import java.util.ArrayList;

@W(21)
/* loaded from: classes.dex */
class e extends a {

    /* renamed from: c, reason: collision with root package name */
    private Context f14131c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f14132d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(@P a aVar, Context context, Uri uri) {
        super(aVar);
        this.f14131c = context;
        this.f14132d = uri;
    }

    private static void w(@P AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused) {
            }
        }
    }

    @P
    private static Uri x(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean a() {
        return b.a(this.f14131c, this.f14132d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean b() {
        return b.b(this.f14131c, this.f14132d);
    }

    @Override // androidx.documentfile.provider.a
    @P
    public a c(String str) {
        Uri x3 = x(this.f14131c, this.f14132d, "vnd.android.document/directory", str);
        if (x3 != null) {
            return new e(this, this.f14131c, x3);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.a
    @P
    public a d(String str, String str2) {
        Uri x3 = x(this.f14131c, this.f14132d, str, str2);
        if (x3 != null) {
            return new e(this, this.f14131c, x3);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f14131c.getContentResolver(), this.f14132d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean f() {
        return b.d(this.f14131c, this.f14132d);
    }

    @Override // androidx.documentfile.provider.a
    @P
    public String k() {
        return b.f(this.f14131c, this.f14132d);
    }

    @Override // androidx.documentfile.provider.a
    @P
    public String m() {
        return b.h(this.f14131c, this.f14132d);
    }

    @Override // androidx.documentfile.provider.a
    public Uri n() {
        return this.f14132d;
    }

    @Override // androidx.documentfile.provider.a
    public boolean o() {
        return b.i(this.f14131c, this.f14132d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean q() {
        return b.j(this.f14131c, this.f14132d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean r() {
        return b.k(this.f14131c, this.f14132d);
    }

    @Override // androidx.documentfile.provider.a
    public long s() {
        return b.l(this.f14131c, this.f14132d);
    }

    @Override // androidx.documentfile.provider.a
    public long t() {
        return b.m(this.f14131c, this.f14132d);
    }

    @Override // androidx.documentfile.provider.a
    public a[] u() {
        ContentResolver contentResolver = this.f14131c.getContentResolver();
        Uri uri = this.f14132d;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursor.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f14132d, cursor.getString(0)));
                }
            } catch (Exception e4) {
                Log.w("DocumentFile", "Failed query: " + e4);
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            a[] aVarArr = new a[uriArr.length];
            for (int i4 = 0; i4 < uriArr.length; i4++) {
                aVarArr[i4] = new e(this, this.f14131c, uriArr[i4]);
            }
            return aVarArr;
        } finally {
            w(cursor);
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean v(String str) {
        try {
            Uri renameDocument = DocumentsContract.renameDocument(this.f14131c.getContentResolver(), this.f14132d, str);
            if (renameDocument != null) {
                this.f14132d = renameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
