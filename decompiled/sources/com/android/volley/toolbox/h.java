package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class h {

    /* renamed from: e, reason: collision with root package name */
    protected static final Comparator<byte[]> f24586e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List<byte[]> f24587a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<byte[]> f24588b = new ArrayList(64);

    /* renamed from: c, reason: collision with root package name */
    private int f24589c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f24590d;

    /* loaded from: classes.dex */
    class a implements Comparator<byte[]> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public h(int i4) {
        this.f24590d = i4;
    }

    private synchronized void c() {
        while (this.f24589c > this.f24590d) {
            byte[] remove = this.f24587a.remove(0);
            this.f24588b.remove(remove);
            this.f24589c -= remove.length;
        }
    }

    public synchronized byte[] a(int i4) {
        for (int i5 = 0; i5 < this.f24588b.size(); i5++) {
            byte[] bArr = this.f24588b.get(i5);
            if (bArr.length >= i4) {
                this.f24589c -= bArr.length;
                this.f24588b.remove(i5);
                this.f24587a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i4];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f24590d) {
                this.f24587a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f24588b, bArr, f24586e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f24588b.add(binarySearch, bArr);
                this.f24589c += bArr.length;
                c();
            }
        }
    }
}
