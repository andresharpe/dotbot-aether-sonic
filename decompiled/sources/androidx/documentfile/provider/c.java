package androidx.documentfile.provider;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.annotation.P;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
class c extends a {

    /* renamed from: c, reason: collision with root package name */
    private File f14128c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(@P a aVar, File file) {
        super(aVar);
        this.f14128c = file;
    }

    private static boolean w(File file) {
        File[] listFiles = file.listFiles();
        boolean z3 = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z3 &= w(file2);
                }
                if (!file2.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file2);
                    z3 = false;
                }
            }
        }
        return z3;
    }

    private static String x(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(lastIndexOf + 1).toLowerCase());
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // androidx.documentfile.provider.a
    public boolean a() {
        return this.f14128c.canRead();
    }

    @Override // androidx.documentfile.provider.a
    public boolean b() {
        return this.f14128c.canWrite();
    }

    @Override // androidx.documentfile.provider.a
    @P
    public a c(String str) {
        File file = new File(this.f14128c, str);
        if (!file.isDirectory() && !file.mkdir()) {
            return null;
        }
        return new c(this, file);
    }

    @Override // androidx.documentfile.provider.a
    @P
    public a d(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + "." + extensionFromMimeType;
        }
        File file = new File(this.f14128c, str2);
        try {
            file.createNewFile();
            return new c(this, file);
        } catch (IOException e4) {
            Log.w("DocumentFile", "Failed to createFile: " + e4);
            return null;
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean e() {
        w(this.f14128c);
        return this.f14128c.delete();
    }

    @Override // androidx.documentfile.provider.a
    public boolean f() {
        return this.f14128c.exists();
    }

    @Override // androidx.documentfile.provider.a
    public String k() {
        return this.f14128c.getName();
    }

    @Override // androidx.documentfile.provider.a
    @P
    public String m() {
        if (this.f14128c.isDirectory()) {
            return null;
        }
        return x(this.f14128c.getName());
    }

    @Override // androidx.documentfile.provider.a
    public Uri n() {
        return Uri.fromFile(this.f14128c);
    }

    @Override // androidx.documentfile.provider.a
    public boolean o() {
        return this.f14128c.isDirectory();
    }

    @Override // androidx.documentfile.provider.a
    public boolean q() {
        return this.f14128c.isFile();
    }

    @Override // androidx.documentfile.provider.a
    public boolean r() {
        return false;
    }

    @Override // androidx.documentfile.provider.a
    public long s() {
        return this.f14128c.lastModified();
    }

    @Override // androidx.documentfile.provider.a
    public long t() {
        return this.f14128c.length();
    }

    @Override // androidx.documentfile.provider.a
    public a[] u() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.f14128c.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                arrayList.add(new c(this, file));
            }
        }
        return (a[]) arrayList.toArray(new a[arrayList.size()]);
    }

    @Override // androidx.documentfile.provider.a
    public boolean v(String str) {
        File file = new File(this.f14128c.getParentFile(), str);
        if (this.f14128c.renameTo(file)) {
            this.f14128c = file;
            return true;
        }
        return false;
    }
}
