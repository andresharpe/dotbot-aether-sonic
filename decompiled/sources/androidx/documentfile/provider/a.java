package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.N;
import androidx.annotation.P;
import java.io.File;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    static final String f14124b = "DocumentFile";

    /* renamed from: a, reason: collision with root package name */
    @P
    private final a f14125a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(@P a aVar) {
        this.f14125a = aVar;
    }

    @N
    public static a h(@N File file) {
        return new c(null, file);
    }

    @P
    public static a i(@N Context context, @N Uri uri) {
        return new d(null, context, uri);
    }

    @P
    public static a j(@N Context context, @N Uri uri) {
        return new e(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    public static boolean p(@N Context context, @P Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public abstract boolean a();

    public abstract boolean b();

    @P
    public abstract a c(@N String str);

    @P
    public abstract a d(@N String str, @N String str2);

    public abstract boolean e();

    public abstract boolean f();

    @P
    public a g(@N String str) {
        for (a aVar : u()) {
            if (str.equals(aVar.k())) {
                return aVar;
            }
        }
        return null;
    }

    @P
    public abstract String k();

    @P
    public a l() {
        return this.f14125a;
    }

    @P
    public abstract String m();

    @N
    public abstract Uri n();

    public abstract boolean o();

    public abstract boolean q();

    public abstract boolean r();

    public abstract long s();

    public abstract long t();

    @N
    public abstract a[] u();

    public abstract boolean v(@N String str);
}
