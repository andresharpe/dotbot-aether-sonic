package androidx.core.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12763a = "tree";

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f12764a = 512;

        private a() {
        }
    }

    @W(19)
    /* loaded from: classes.dex */
    private static class b {
        private b() {
        }

        @InterfaceC0577u
        public static Uri a(String str, String str2) {
            return DocumentsContract.buildDocumentUri(str, str2);
        }

        @InterfaceC0577u
        static boolean b(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
            return DocumentsContract.deleteDocument(contentResolver, uri);
        }

        @InterfaceC0577u
        static String c(Uri uri) {
            return DocumentsContract.getDocumentId(uri);
        }

        @InterfaceC0577u
        static boolean d(Context context, @P Uri uri) {
            return DocumentsContract.isDocumentUri(context, uri);
        }
    }

    @W(21)
    /* renamed from: androidx.core.provider.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0095c {
        private C0095c() {
        }

        @InterfaceC0577u
        static Uri a(String str, String str2) {
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        @InterfaceC0577u
        static Uri b(Uri uri, String str) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        @InterfaceC0577u
        static Uri c(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        @InterfaceC0577u
        public static Uri d(String str, String str2) {
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        @InterfaceC0577u
        static Uri e(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        @InterfaceC0577u
        static String f(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }

        @InterfaceC0577u
        static Uri g(@N ContentResolver contentResolver, @N Uri uri, @N String str) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }
    }

    @W(24)
    /* loaded from: classes.dex */
    private static class d {
        private d() {
        }

        @InterfaceC0577u
        static boolean a(@N Uri uri) {
            return DocumentsContract.isTreeUri(uri);
        }

        @InterfaceC0577u
        static boolean b(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }

    private c() {
    }

    @P
    public static Uri a(@N String str, @P String str2) {
        return C0095c.a(str, str2);
    }

    @P
    public static Uri b(@N Uri uri, @N String str) {
        return C0095c.b(uri, str);
    }

    @P
    public static Uri c(@N String str, @N String str2) {
        return b.a(str, str2);
    }

    @P
    public static Uri d(@N Uri uri, @N String str) {
        return C0095c.c(uri, str);
    }

    @P
    public static Uri e(@N String str, @N String str2) {
        return C0095c.d(str, str2);
    }

    @P
    public static Uri f(@N ContentResolver contentResolver, @N Uri uri, @N String str, @N String str2) throws FileNotFoundException {
        return C0095c.e(contentResolver, uri, str, str2);
    }

    @P
    public static String g(@N Uri uri) {
        return b.c(uri);
    }

    @P
    public static String h(@N Uri uri) {
        return C0095c.f(uri);
    }

    public static boolean i(@N Context context, @P Uri uri) {
        return b.d(context, uri);
    }

    public static boolean j(@N Uri uri) {
        return d.a(uri);
    }

    public static boolean k(@N ContentResolver contentResolver, @N Uri uri, @N Uri uri2) throws FileNotFoundException {
        return d.b(contentResolver, uri, uri2);
    }

    @P
    public static Uri l(@N ContentResolver contentResolver, @N Uri uri, @N String str) throws FileNotFoundException {
        return C0095c.g(contentResolver, uri, str);
    }
}
