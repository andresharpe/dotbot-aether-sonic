package com.bumptech.glide.load;

import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.util.l;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class e<T> {

    /* renamed from: e, reason: collision with root package name */
    private static final b<Object> f25848e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final T f25849a;

    /* renamed from: b, reason: collision with root package name */
    private final b<T> f25850b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25851c;

    /* renamed from: d, reason: collision with root package name */
    private volatile byte[] f25852d;

    /* loaded from: classes.dex */
    class a implements b<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.e.b
        public void a(@N byte[] bArr, @N Object obj, @N MessageDigest messageDigest) {
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void a(@N byte[] bArr, @N T t3, @N MessageDigest messageDigest);
    }

    private e(@N String str, @P T t3, @N b<T> bVar) {
        this.f25851c = l.b(str);
        this.f25849a = t3;
        this.f25850b = (b) l.d(bVar);
    }

    @N
    public static <T> e<T> a(@N String str, @N b<T> bVar) {
        return new e<>(str, null, bVar);
    }

    @N
    public static <T> e<T> b(@N String str, @P T t3, @N b<T> bVar) {
        return new e<>(str, t3, bVar);
    }

    @N
    private static <T> b<T> c() {
        return (b<T>) f25848e;
    }

    @N
    private byte[] e() {
        if (this.f25852d == null) {
            this.f25852d = this.f25851c.getBytes(c.f25784b);
        }
        return this.f25852d;
    }

    @N
    public static <T> e<T> f(@N String str) {
        return new e<>(str, null, c());
    }

    @N
    public static <T> e<T> g(@N String str, @N T t3) {
        return new e<>(str, t3, c());
    }

    @P
    public T d() {
        return this.f25849a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f25851c.equals(((e) obj).f25851c);
        }
        return false;
    }

    public void h(@N T t3, @N MessageDigest messageDigest) {
        this.f25850b.a(e(), t3, messageDigest);
    }

    public int hashCode() {
        return this.f25851c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f25851c + "'}";
    }
}
