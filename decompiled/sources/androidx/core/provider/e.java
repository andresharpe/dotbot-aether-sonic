package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.annotation.i0;
import androidx.core.provider.h;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<byte[]> f12765a = new Comparator() { // from class: androidx.core.provider.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int g4;
            g4 = e.g((byte[]) obj, (byte[]) obj2);
            return g4;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    private e() {
    }

    private static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!Arrays.equals(list.get(i4), list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> d(f fVar, Resources resources) {
        if (fVar.b() != null) {
            return fVar.b();
        }
        return androidx.core.content.res.f.c(resources, fVar.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public static h.b e(@N Context context, @N f fVar, @P CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo f4 = f(context.getPackageManager(), fVar, context.getResources());
        if (f4 == null) {
            return h.b.a(1, null);
        }
        return h.b.a(0, h(context, fVar, f4.authority, cancellationSignal));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    @i0
    public static ProviderInfo f(@N PackageManager packageManager, @N f fVar, @P Resources resources) throws PackageManager.NameNotFoundException {
        String f4 = fVar.f();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(f4, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(fVar.g())) {
                List<byte[]> b4 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(b4, f12765a);
                List<List<byte[]>> d4 = d(fVar, resources);
                for (int i4 = 0; i4 < d4.size(); i4++) {
                    ArrayList arrayList = new ArrayList(d4.get(i4));
                    Collections.sort(arrayList, f12765a);
                    if (c(b4, arrayList)) {
                        return resolveContentProvider;
                    }
                }
                return null;
            }
            throw new PackageManager.NameNotFoundException("Found content provider " + f4 + ", but package was not " + fVar.g());
        }
        throw new PackageManager.NameNotFoundException("No package found for authority: " + f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i4 = 0; i4 < bArr.length; i4++) {
            byte b4 = bArr[i4];
            byte b5 = bArr2[i4];
            if (b4 != b5) {
                return b4 - b5;
            }
        }
        return 0;
    }

    @i0
    @N
    static h.c[] h(Context context, f fVar, String str, CancellationSignal cancellationSignal) {
        int i4;
        int i5;
        Uri withAppendedId;
        int i6;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme(FirebaseAnalytics.b.f34769P).authority(str).build();
        Uri build2 = new Uri.Builder().scheme(FirebaseAnalytics.b.f34769P).authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            Cursor a4 = a.a(context.getContentResolver(), build, new String[]{"_id", h.a.f12791a, h.a.f12792b, h.a.f12793c, h.a.f12794d, h.a.f12795e, h.a.f12796f}, "query = ?", new String[]{fVar.h()}, null, cancellationSignal);
            if (a4 != null) {
                try {
                    if (a4.getCount() > 0) {
                        int columnIndex = a4.getColumnIndex(h.a.f12796f);
                        arrayList = new ArrayList();
                        int columnIndex2 = a4.getColumnIndex("_id");
                        int columnIndex3 = a4.getColumnIndex(h.a.f12791a);
                        int columnIndex4 = a4.getColumnIndex(h.a.f12792b);
                        int columnIndex5 = a4.getColumnIndex(h.a.f12794d);
                        int columnIndex6 = a4.getColumnIndex(h.a.f12795e);
                        while (a4.moveToNext()) {
                            if (columnIndex != -1) {
                                i4 = a4.getInt(columnIndex);
                            } else {
                                i4 = 0;
                            }
                            if (columnIndex4 != -1) {
                                i5 = a4.getInt(columnIndex4);
                            } else {
                                i5 = 0;
                            }
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, a4.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, a4.getLong(columnIndex3));
                            }
                            if (columnIndex5 != -1) {
                                i6 = a4.getInt(columnIndex5);
                            } else {
                                i6 = 400;
                            }
                            if (columnIndex6 != -1 && a4.getInt(columnIndex6) == 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            arrayList.add(h.c.a(withAppendedId, i5, i6, z3, i4));
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = a4;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (a4 != null) {
                a4.close();
            }
            return (h.c[]) arrayList.toArray(new h.c[0]);
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
