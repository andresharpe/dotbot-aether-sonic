package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.P;
import androidx.annotation.W;

@W(19)
/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f14126a = "DocumentFile";

    /* renamed from: b, reason: collision with root package name */
    private static final int f14127b = 512;

    private b() {
    }

    public static boolean a(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(g(context, uri))) {
            return true;
        }
        return false;
    }

    public static boolean b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String g4 = g(context, uri);
        int n4 = n(context, uri, "flags", 0);
        if (TextUtils.isEmpty(g4)) {
            return false;
        }
        if ((n4 & 4) != 0) {
            return true;
        }
        if ("vnd.android.document/directory".equals(g4) && (n4 & 8) != 0) {
            return true;
        }
        if (TextUtils.isEmpty(g4) || (n4 & 2) == 0) {
            return false;
        }
        return true;
    }

    private static void c(@P AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean d(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        boolean z3 = true;
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{"document_id"}, null, null, null);
            if (cursor.getCount() <= 0) {
                z3 = false;
            }
            return z3;
        } catch (Exception e4) {
            Log.w(f14126a, "Failed query: " + e4);
            return false;
        } finally {
            c(cursor);
        }
    }

    public static long e(Context context, Uri uri) {
        return o(context, uri, "flags", 0L);
    }

    @P
    public static String f(Context context, Uri uri) {
        return p(context, uri, "_display_name", null);
    }

    @P
    private static String g(Context context, Uri uri) {
        return p(context, uri, "mime_type", null);
    }

    @P
    public static String h(Context context, Uri uri) {
        String g4 = g(context, uri);
        if ("vnd.android.document/directory".equals(g4)) {
            return null;
        }
        return g4;
    }

    public static boolean i(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(g(context, uri));
    }

    public static boolean j(Context context, Uri uri) {
        String g4 = g(context, uri);
        if (!"vnd.android.document/directory".equals(g4) && !TextUtils.isEmpty(g4)) {
            return true;
        }
        return false;
    }

    public static boolean k(Context context, Uri uri) {
        if (!DocumentsContract.isDocumentUri(context, uri) || (e(context, uri) & 512) == 0) {
            return false;
        }
        return true;
    }

    public static long l(Context context, Uri uri) {
        return o(context, uri, "last_modified", 0L);
    }

    public static long m(Context context, Uri uri) {
        return o(context, uri, "_size", 0L);
    }

    private static int n(Context context, Uri uri, String str, int i4) {
        return (int) o(context, uri, str, i4);
    }

    private static long o(Context context, Uri uri, String str, long j4) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getLong(0);
            }
            return j4;
        } catch (Exception e4) {
            Log.w(f14126a, "Failed query: " + e4);
            return j4;
        } finally {
            c(cursor);
        }
    }

    @P
    private static String p(Context context, Uri uri, String str, @P String str2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getString(0);
            }
            return str2;
        } catch (Exception e4) {
            Log.w(f14126a, "Failed query: " + e4);
            return str2;
        } finally {
            c(cursor);
        }
    }
}
