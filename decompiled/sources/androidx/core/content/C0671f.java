package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;
import androidx.annotation.i0;
import androidx.annotation.k0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0671f extends ContentProvider {

    /* renamed from: H, reason: collision with root package name */
    private static final String f12197H = "android.support.FILE_PROVIDER_PATHS";

    /* renamed from: I, reason: collision with root package name */
    private static final String f12198I = "root-path";

    /* renamed from: J, reason: collision with root package name */
    private static final String f12199J = "files-path";

    /* renamed from: K, reason: collision with root package name */
    private static final String f12200K = "cache-path";

    /* renamed from: L, reason: collision with root package name */
    private static final String f12201L = "external-path";

    /* renamed from: M, reason: collision with root package name */
    private static final String f12202M = "external-files-path";

    /* renamed from: N, reason: collision with root package name */
    private static final String f12203N = "external-cache-path";

    /* renamed from: O, reason: collision with root package name */
    private static final String f12204O = "external-media-path";

    /* renamed from: P, reason: collision with root package name */
    private static final String f12205P = "name";

    /* renamed from: Q, reason: collision with root package name */
    private static final String f12206Q = "path";

    /* renamed from: R, reason: collision with root package name */
    private static final String f12207R = "displayName";

    /* renamed from: E, reason: collision with root package name */
    private b f12210E;

    /* renamed from: F, reason: collision with root package name */
    private int f12211F;

    /* renamed from: G, reason: collision with root package name */
    private static final String[] f12196G = {"_display_name", "_size"};

    /* renamed from: S, reason: collision with root package name */
    private static final File f12208S = new File("/");

    /* renamed from: T, reason: collision with root package name */
    @androidx.annotation.B("sCache")
    private static final HashMap<String, b> f12209T = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(21)
    /* renamed from: androidx.core.content.f$a */
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.f$b */
    /* loaded from: classes.dex */
    public interface b {
        File a(Uri uri);

        Uri b(File file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.f$c */
    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final String f12212a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap<String, File> f12213b = new HashMap<>();

        c(String str) {
            this.f12212a = str;
        }

        @Override // androidx.core.content.C0671f.b
        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f12213b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            }
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }

        @Override // androidx.core.content.C0671f.b
        public Uri b(File file) {
            String substring;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f12213b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = entry.getValue().getPath();
                    if (path2.endsWith("/")) {
                        substring = canonicalPath.substring(path2.length());
                    } else {
                        substring = canonicalPath.substring(path2.length() + 1);
                    }
                    return new Uri.Builder().scheme(FirebaseAnalytics.b.f34769P).authority(this.f12212a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        void c(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f12213b.put(str, file.getCanonicalFile());
                    return;
                } catch (IOException e4) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e4);
                }
            }
            throw new IllegalArgumentException("Name must not be empty");
        }
    }

    public C0671f() {
        this.f12211F = 0;
    }

    private static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static Object[] b(Object[] objArr, int i4) {
        Object[] objArr2 = new Object[i4];
        System.arraycopy(objArr, 0, objArr2, 0, i4);
        return objArr2;
    }

    private static String[] c(String[] strArr, int i4) {
        String[] strArr2 = new String[i4];
        System.arraycopy(strArr, 0, strArr2, 0, i4);
        return strArr2;
    }

    @i0
    static XmlResourceParser d(Context context, String str, @androidx.annotation.P ProviderInfo providerInfo, int i4) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i4 != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt(f12197H, i4);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), f12197H);
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
    }

    private static b e(Context context, String str, int i4) {
        b bVar;
        HashMap<String, b> hashMap = f12209T;
        synchronized (hashMap) {
            try {
                bVar = hashMap.get(str);
                if (bVar == null) {
                    try {
                        try {
                            bVar = i(context, str, i4);
                            hashMap.put(str, bVar);
                        } catch (IOException e4) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e4);
                        }
                    } catch (XmlPullParserException e5) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static Uri f(@androidx.annotation.N Context context, @androidx.annotation.N String str, @androidx.annotation.N File file) {
        return e(context, str, 0).b(file);
    }

    @androidx.annotation.N
    @SuppressLint({"StreamFiles"})
    public static Uri g(@androidx.annotation.N Context context, @androidx.annotation.N String str, @androidx.annotation.N File file, @androidx.annotation.N String str2) {
        return f(context, str, file).buildUpon().appendQueryParameter(f12207R, str2).build();
    }

    private static int h(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                return 704643072;
            }
            if ("rw".equals(str)) {
                return 939524096;
            }
            if ("rwt".equals(str)) {
                return 1006632960;
            }
            throw new IllegalArgumentException("Invalid mode: " + str);
        }
        return 738197504;
    }

    private static b i(Context context, String str, int i4) throws IOException, XmlPullParserException {
        c cVar = new c(str);
        XmlResourceParser d4 = d(context, str, context.getPackageManager().resolveContentProvider(str, 128), i4);
        while (true) {
            int next = d4.next();
            if (next != 1) {
                if (next == 2) {
                    String name = d4.getName();
                    File file = null;
                    String attributeValue = d4.getAttributeValue(null, "name");
                    String attributeValue2 = d4.getAttributeValue(null, f12206Q);
                    if (f12198I.equals(name)) {
                        file = f12208S;
                    } else if (f12199J.equals(name)) {
                        file = context.getFilesDir();
                    } else if (f12200K.equals(name)) {
                        file = context.getCacheDir();
                    } else if (f12201L.equals(name)) {
                        file = Environment.getExternalStorageDirectory();
                    } else if (f12202M.equals(name)) {
                        File[] k4 = C0669d.k(context, null);
                        if (k4.length > 0) {
                            file = k4[0];
                        }
                    } else if (f12203N.equals(name)) {
                        File[] j4 = C0669d.j(context);
                        if (j4.length > 0) {
                            file = j4[0];
                        }
                    } else if (f12204O.equals(name)) {
                        File[] a4 = a.a(context);
                        if (a4.length > 0) {
                            file = a4[0];
                        }
                    }
                    if (file != null) {
                        cVar.c(attributeValue, a(file, attributeValue2));
                    }
                }
            } else {
                return cVar;
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@androidx.annotation.N Context context, @androidx.annotation.N ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                String str = providerInfo.authority.split(";")[0];
                HashMap<String, b> hashMap = f12209T;
                synchronized (hashMap) {
                    hashMap.remove(str);
                }
                this.f12210E = e(context, str, this.f12211F);
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    @Override // android.content.ContentProvider
    public int delete(@androidx.annotation.N Uri uri, @androidx.annotation.P String str, @androidx.annotation.P String[] strArr) {
        return this.f12210E.a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.P
    public String getType(@androidx.annotation.N Uri uri) {
        File a4 = this.f12210E.a(uri);
        int lastIndexOf = a4.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a4.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(@androidx.annotation.N Uri uri, @androidx.annotation.N ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@androidx.annotation.N Uri uri, @androidx.annotation.N String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.f12210E.a(uri), h(str));
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.N
    public Cursor query(@androidx.annotation.N Uri uri, @androidx.annotation.P String[] strArr, @androidx.annotation.P String str, @androidx.annotation.P String[] strArr2, @androidx.annotation.P String str2) {
        int i4;
        String str3;
        File a4 = this.f12210E.a(uri);
        String queryParameter = uri.getQueryParameter(f12207R);
        if (strArr == null) {
            strArr = f12196G;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i5 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i5] = "_display_name";
                i4 = i5 + 1;
                if (queryParameter == null) {
                    str3 = a4.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i5] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i5] = "_size";
                i4 = i5 + 1;
                objArr[i5] = Long.valueOf(a4.length());
            }
            i5 = i4;
        }
        String[] c4 = c(strArr3, i5);
        Object[] b4 = b(objArr, i5);
        MatrixCursor matrixCursor = new MatrixCursor(c4, 1);
        matrixCursor.addRow(b4);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@androidx.annotation.N Uri uri, @androidx.annotation.N ContentValues contentValues, @androidx.annotation.P String str, @androidx.annotation.P String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    protected C0671f(@k0 int i4) {
        this.f12211F = i4;
    }
}
