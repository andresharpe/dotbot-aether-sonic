package com.google.android.gms.common.data;

import K0.c;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C1244d;
import com.google.android.gms.common.internal.C1285y;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@c.a(creator = "DataHolderCreator", validate = true)
@I0.a
@KeepName
/* loaded from: classes.dex */
public final class DataHolder extends K0.a implements Closeable {

    @I0.a
    @N
    public static final Parcelable.Creator<DataHolder> CREATOR = new q();

    /* renamed from: O, reason: collision with root package name */
    private static final a f28513O = new n(new String[0], null);

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1000)
    final int f28514E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getColumns", id = 1)
    private final String[] f28515F;

    /* renamed from: G, reason: collision with root package name */
    Bundle f28516G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getWindows", id = 2)
    private final CursorWindow[] f28517H;

    /* renamed from: I, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getStatusCode", id = 3)
    private final int f28518I;

    /* renamed from: J, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(getter = "getMetadata", id = 4)
    private final Bundle f28519J;

    /* renamed from: K, reason: collision with root package name */
    int[] f28520K;

    /* renamed from: L, reason: collision with root package name */
    int f28521L;

    /* renamed from: M, reason: collision with root package name */
    boolean f28522M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f28523N;

    @I0.a
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f28524a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<HashMap<String, Object>> f28525b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        private final HashMap<Object, Integer> f28526c = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ a(String[] strArr, String str, o oVar) {
            this.f28524a = (String[]) C1285y.l(strArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @I0.a
        @N
        public DataHolder a(int i4) {
            return new DataHolder(this, i4);
        }

        @I0.a
        @N
        public DataHolder b(int i4, @N Bundle bundle) {
            return new DataHolder(this, i4, bundle);
        }

        @I0.a
        @N
        public a c(@N ContentValues contentValues) {
            C1244d.c(contentValues);
            HashMap<String, Object> hashMap = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return d(hashMap);
        }

        @N
        public a d(@N HashMap<String, Object> hashMap) {
            C1244d.c(hashMap);
            this.f28525b.add(hashMap);
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @I0.a
    @N
    public static a c0(@N String[] strArr) {
        return new a(strArr, null, 0 == true ? 1 : 0);
    }

    @I0.a
    @N
    public static DataHolder e0(int i4) {
        return new DataHolder(f28513O, i4, (Bundle) null);
    }

    private final void i1(String str, int i4) {
        String str2;
        Bundle bundle = this.f28516G;
        if (bundle != null && bundle.containsKey(str)) {
            if (!isClosed()) {
                if (i4 >= 0 && i4 < this.f28521L) {
                    return;
                } else {
                    throw new CursorIndexOutOfBoundsException(i4, this.f28521L);
                }
            }
            throw new IllegalArgumentException("Buffer is closed.");
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "No such column: ".concat(valueOf);
        } else {
            str2 = new String("No such column: ");
        }
        throw new IllegalArgumentException(str2);
    }

    private static CursorWindow[] j1(a aVar, int i4) {
        long j4;
        if (aVar.f28524a.length != 0) {
            ArrayList arrayList = aVar.f28525b;
            int size = arrayList.size();
            CursorWindow cursorWindow = new CursorWindow(false);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(cursorWindow);
            cursorWindow.setNumColumns(aVar.f28524a.length);
            int i5 = 0;
            boolean z3 = false;
            while (i5 < size) {
                try {
                    if (!cursorWindow.allocRow()) {
                        StringBuilder sb = new StringBuilder(72);
                        sb.append("Allocating additional cursor window for large data set (row ");
                        sb.append(i5);
                        sb.append(")");
                        Log.d("DataHolder", sb.toString());
                        cursorWindow = new CursorWindow(false);
                        cursorWindow.setStartPosition(i5);
                        cursorWindow.setNumColumns(aVar.f28524a.length);
                        arrayList2.add(cursorWindow);
                        if (!cursorWindow.allocRow()) {
                            Log.e("DataHolder", "Unable to allocate row to hold data.");
                            arrayList2.remove(cursorWindow);
                            return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                        }
                    }
                    Map map = (Map) arrayList.get(i5);
                    int i6 = 0;
                    boolean z4 = true;
                    while (true) {
                        if (i6 < aVar.f28524a.length) {
                            if (!z4) {
                                break;
                            }
                            String str = aVar.f28524a[i6];
                            Object obj = map.get(str);
                            if (obj == null) {
                                z4 = cursorWindow.putNull(i5, i6);
                            } else if (obj instanceof String) {
                                z4 = cursorWindow.putString((String) obj, i5, i6);
                            } else if (obj instanceof Long) {
                                z4 = cursorWindow.putLong(((Long) obj).longValue(), i5, i6);
                            } else if (obj instanceof Integer) {
                                z4 = cursorWindow.putLong(((Integer) obj).intValue(), i5, i6);
                            } else if (obj instanceof Boolean) {
                                if (true != ((Boolean) obj).booleanValue()) {
                                    j4 = 0;
                                } else {
                                    j4 = 1;
                                }
                                z4 = cursorWindow.putLong(j4, i5, i6);
                            } else if (obj instanceof byte[]) {
                                z4 = cursorWindow.putBlob((byte[]) obj, i5, i6);
                            } else if (obj instanceof Double) {
                                z4 = cursorWindow.putDouble(((Double) obj).doubleValue(), i5, i6);
                            } else if (obj instanceof Float) {
                                z4 = cursorWindow.putDouble(((Float) obj).floatValue(), i5, i6);
                            } else {
                                String obj2 = obj.toString();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + obj2.length());
                                sb2.append("Unsupported object for column ");
                                sb2.append(str);
                                sb2.append(": ");
                                sb2.append(obj2);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            i6++;
                        } else if (z4) {
                            z3 = false;
                        }
                    }
                    if (!z3) {
                        StringBuilder sb3 = new StringBuilder(74);
                        sb3.append("Couldn't populate window data for row ");
                        sb3.append(i5);
                        sb3.append(" - allocating new window.");
                        Log.d("DataHolder", sb3.toString());
                        cursorWindow.freeLastRow();
                        cursorWindow = new CursorWindow(false);
                        cursorWindow.setStartPosition(i5);
                        cursorWindow.setNumColumns(aVar.f28524a.length);
                        arrayList2.add(cursorWindow);
                        i5--;
                        z3 = true;
                        i5++;
                    } else {
                        throw new zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                    }
                } catch (RuntimeException e4) {
                    int size2 = arrayList2.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        ((CursorWindow) arrayList2.get(i7)).close();
                    }
                    throw e4;
                }
            }
            return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
        }
        return new CursorWindow[0];
    }

    @I0.a
    @N
    public String B0(@N String str, int i4, int i5) {
        i1(str, i4);
        return this.f28517H[i5].getString(i4, this.f28516G.getInt(str));
    }

    @I0.a
    public int E0(int i4) {
        boolean z3;
        int length;
        int i5 = 0;
        if (i4 >= 0 && i4 < this.f28521L) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.r(z3);
        while (true) {
            int[] iArr = this.f28520K;
            length = iArr.length;
            if (i5 >= length) {
                break;
            }
            if (i4 < iArr[i5]) {
                i5--;
                break;
            }
            i5++;
        }
        if (i5 == length) {
            return i5 - 1;
        }
        return i5;
    }

    @I0.a
    public boolean F0(@N String str) {
        return this.f28516G.containsKey(str);
    }

    @I0.a
    public boolean M0(@N String str, int i4, int i5) {
        i1(str, i4);
        return this.f28517H[i5].isNull(i4, this.f28516G.getInt(str));
    }

    public final double Y0(@N String str, int i4, int i5) {
        i1(str, i4);
        return this.f28517H[i5].getDouble(i4, this.f28516G.getInt(str));
    }

    public final float a1(@N String str, int i4, int i5) {
        i1(str, i4);
        return this.f28517H[i5].getFloat(i4, this.f28516G.getInt(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @I0.a
    public void close() {
        synchronized (this) {
            try {
                if (!this.f28522M) {
                    this.f28522M = true;
                    int i4 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f28517H;
                        if (i4 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i4].close();
                        i4++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @P
    @I0.a
    public Bundle e() {
        return this.f28519J;
    }

    public final void f1(@N String str, int i4, int i5, @N CharArrayBuffer charArrayBuffer) {
        i1(str, i4);
        this.f28517H[i5].copyStringToBuffer(i4, this.f28516G.getInt(str), charArrayBuffer);
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.f28523N && this.f28517H.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    @I0.a
    public int getCount() {
        return this.f28521L;
    }

    public final void h1() {
        this.f28516G = new Bundle();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String[] strArr = this.f28515F;
            if (i5 >= strArr.length) {
                break;
            }
            this.f28516G.putInt(strArr[i5], i5);
            i5++;
        }
        this.f28520K = new int[this.f28517H.length];
        int i6 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f28517H;
            if (i4 < cursorWindowArr.length) {
                this.f28520K[i4] = i6;
                i6 += this.f28517H[i4].getNumRows() - (i6 - cursorWindowArr[i4].getStartPosition());
                i4++;
            } else {
                this.f28521L = i6;
                return;
            }
        }
    }

    @I0.a
    public boolean i0(@N String str, int i4, int i5) {
        i1(str, i4);
        if (Long.valueOf(this.f28517H[i5].getLong(i4, this.f28516G.getInt(str))).longValue() == 1) {
            return true;
        }
        return false;
    }

    @I0.a
    public boolean isClosed() {
        boolean z3;
        synchronized (this) {
            z3 = this.f28522M;
        }
        return z3;
    }

    @I0.a
    @N
    public byte[] u0(@N String str, int i4, int i5) {
        i1(str, i4);
        return this.f28517H[i5].getBlob(i4, this.f28516G.getInt(str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.Z(parcel, 1, this.f28515F, false);
        K0.b.c0(parcel, 2, this.f28517H, i4, false);
        K0.b.F(parcel, 3, z0());
        K0.b.k(parcel, 4, e(), false);
        K0.b.F(parcel, 1000, this.f28514E);
        K0.b.b(parcel, a4);
        if ((i4 & 1) != 0) {
            close();
        }
    }

    @I0.a
    public int x0(@N String str, int i4, int i5) {
        i1(str, i4);
        return this.f28517H[i5].getInt(i4, this.f28516G.getInt(str));
    }

    @I0.a
    public long y0(@N String str, int i4, int i5) {
        i1(str, i4);
        return this.f28517H[i5].getLong(i4, this.f28516G.getInt(str));
    }

    @I0.a
    public int z0() {
        return this.f28518I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public DataHolder(@c.e(id = 1000) int i4, @c.e(id = 1) String[] strArr, @c.e(id = 2) CursorWindow[] cursorWindowArr, @c.e(id = 3) int i5, @c.e(id = 4) @P Bundle bundle) {
        this.f28522M = false;
        this.f28523N = true;
        this.f28514E = i4;
        this.f28515F = strArr;
        this.f28517H = cursorWindowArr;
        this.f28518I = i5;
        this.f28519J = bundle;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    @I0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DataHolder(@androidx.annotation.N android.database.Cursor r8, int r9, @androidx.annotation.P android.os.Bundle r10) {
        /*
            r7 = this;
            L0.a r0 = new L0.a
            r0.<init>(r8)
            java.lang.String[] r8 = r0.getColumnNames()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L2e
            android.database.CursorWindow r3 = r0.getWindow()     // Catch: java.lang.Throwable -> L2e
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L30
            int r6 = r3.getStartPosition()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L30
            r3.acquireReference()     // Catch: java.lang.Throwable -> L2e
            r0.a(r4)     // Catch: java.lang.Throwable -> L2e
            r1.add(r3)     // Catch: java.lang.Throwable -> L2e
            int r3 = r3.getNumRows()     // Catch: java.lang.Throwable -> L2e
            goto L31
        L2e:
            r8 = move-exception
            goto L78
        L30:
            r3 = r5
        L31:
            if (r3 >= r2) goto L65
            boolean r6 = r0.moveToPosition(r3)     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L65
            android.database.CursorWindow r6 = r0.getWindow()     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L46
            r6.acquireReference()     // Catch: java.lang.Throwable -> L2e
            r0.a(r4)     // Catch: java.lang.Throwable -> L2e
            goto L51
        L46:
            android.database.CursorWindow r6 = new android.database.CursorWindow     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L2e
            r6.setStartPosition(r3)     // Catch: java.lang.Throwable -> L2e
            r0.fillWindow(r3, r6)     // Catch: java.lang.Throwable -> L2e
        L51:
            int r3 = r6.getNumRows()     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L58
            goto L65
        L58:
            r1.add(r6)     // Catch: java.lang.Throwable -> L2e
            int r3 = r6.getStartPosition()     // Catch: java.lang.Throwable -> L2e
            int r6 = r6.getNumRows()     // Catch: java.lang.Throwable -> L2e
            int r3 = r3 + r6
            goto L31
        L65:
            r0.close()
            int r0 = r1.size()
            android.database.CursorWindow[] r0 = new android.database.CursorWindow[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            android.database.CursorWindow[] r0 = (android.database.CursorWindow[]) r0
            r7.<init>(r8, r0, r9, r10)
            return
        L78:
            r0.close()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.<init>(android.database.Cursor, int, android.os.Bundle):void");
    }

    private DataHolder(a aVar, int i4, @P Bundle bundle) {
        this(aVar.f28524a, j1(aVar, -1), i4, (Bundle) null);
    }

    @I0.a
    public DataHolder(@N String[] strArr, @N CursorWindow[] cursorWindowArr, int i4, @P Bundle bundle) {
        this.f28522M = false;
        this.f28523N = true;
        this.f28514E = 1;
        this.f28515F = (String[]) C1285y.l(strArr);
        this.f28517H = (CursorWindow[]) C1285y.l(cursorWindowArr);
        this.f28518I = i4;
        this.f28519J = bundle;
        h1();
    }
}
